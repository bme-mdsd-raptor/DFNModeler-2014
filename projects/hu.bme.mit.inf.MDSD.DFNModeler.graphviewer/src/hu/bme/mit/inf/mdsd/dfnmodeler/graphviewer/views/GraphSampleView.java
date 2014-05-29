package hu.bme.mit.inf.mdsd.dfnmodeler.graphviewer.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.IContainer;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphContainer;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.*;

import DFN.Channel;
import DFN.DataFlowNetwork;
import DFN.InMapping;
import DFN.Mapping;
import DFN.NamedElement;
import DFN.Node;
import DFN.OutMapping;
import DFN.Port;
import DFN.State;
import DFN.StringTokenLiteral;
import DFN.Token;
import DFN.Transition;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class GraphSampleView extends ViewPart{

	public static final String ID = "de.vogella.zest.first.view";
	private Graph graph=null;
	private int layout = 1;

	public void createPartControl(Composite parent) {
		if (graph==null) {
			graph=new Graph(parent, SWT.NONE);
		}
		refresh();
	}

	public void refresh() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			//Checking the selection
			ISelection selection = window.getSelectionService().getSelection();
			if (window.getSelectionService().getSelection() instanceof IStructuredSelection) {
				// Getting the selection
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				// Getting the single selected element
				if (structuredSelection.size() == 1) {
					Object firstElement = structuredSelection.getFirstElement();
					
					if(firstElement instanceof XMIResourceImpl) {
						XMIResourceImpl impl = (XMIResourceImpl)firstElement;
						firstElement=impl.getContents().get(0);
					} else if (firstElement instanceof StringTokenLiteral) {
						firstElement=((StringTokenLiteral)firstElement).getStringtoken().getNetwork();
					}
					
					
					if(firstElement instanceof NamedElement) {
						DataFlowNetwork dataModel=getParent(firstElement);
						
						// Check if it is the right element
						if (dataModel!=null) {
							// Let's generate the project with the template
							// variables for Markers
							IMarker[] problems = null;
							IMarker[] errors = null;
							ArrayList<IMarker> errorslist = new ArrayList<IMarker>();
							// We get every marker for that element, including
							// children
							int depth = IResource.DEPTH_INFINITE;
							// get the URI and IResource of the selected
							// EResource
							URI eUri = dataModel.eResource().getURI();
							if (eUri.isPlatformResource()) {
								String platformString = eUri
										.toPlatformString(true);
								IResource res = ResourcesPlugin.getWorkspace()
										.getRoot().findMember(platformString);
								try {
									// get the markers for that resource
									problems = (res.findMarkers(
											IMarker.PROBLEM, true, depth));
									for (IMarker marker : problems) {
										// select only the error markers
										int severity = (Integer) marker
												.getAttribute(IMarker.SEVERITY);
										if (severity == IMarker.SEVERITY_ERROR) {
											errorslist.add(marker);
										}
									}
									errors = (IMarker[]) errorslist
											.toArray(new IMarker[errorslist
													.size()]);
								} catch (CoreException e) {
									showErrorMessage("Error During Marker Selection");
								}
							}
							// If there are no error markers we generate the
							// code
							if (errors.length == 0) {
								recreateGraph(dataModel);
							} else {
								showErrorMessage("The DFN model has errors in it. Please fix them before attempting graph generation.");
							}
							recreateGraph(dataModel);
						}
					}
				}
			}
		}
		graph.getParent().setSize(1000, 500);
		graph.redraw();
		graph.getParent().layout();
	}

	private void recreateGraph(DataFlowNetwork dataModel) {
		// Let's generate the project with the template
		Composite parent = graph.getParent();
		graph.dispose();
		graph=new Graph(parent, SWT.NONE);
		LayoutAlgorithm[] layoutset = new LayoutAlgorithm[2];
		layoutset[0]=new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		layoutset[1]=new HorizontalShift(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		graph.setLayoutAlgorithm(new CompositeLayoutAlgorithm(layoutset), true);
		GraphContainer gdfn = new GraphContainer(graph, SWT.NONE, dataModel.getName());
		gdfn.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		List<GraphContainer> gnodes = new ArrayList<>();
		for (Node node : dataModel.getNodes()) {
			gnodes.add(addNode(graph, node));
		}
		for (Channel channel : dataModel.getChannels()) {
			System.out.println("start channel: "+channel.getSource().getName()+"-->"+channel.getTarget().getName());
			GraphContainer sourceNode = null;
			GraphContainer targetNode = null;
			for (GraphContainer gnode : gnodes) {
				if (gnode.getText().equals(channel.getSource().getEndpoint().getName()))
					sourceNode=gnode;
				if (gnode.getText().equals(channel.getTarget().getEndpoint().getName()))
					targetNode=gnode;
			}
			if (sourceNode!=null && targetNode!=null)
				(new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, sourceNode, targetNode)).setText(channel.getToken().getName());
			else if (sourceNode!=null && gdfn.getText().equals(channel.getTarget().getEndpoint().getName()))
				(new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, sourceNode, gdfn)).setText(channel.getToken().getName());
			else if (targetNode!=null && gdfn.getText().equals(channel.getSource().getEndpoint().getName()))
				(new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, gdfn, targetNode)).setText(channel.getToken().getName());
			else
				System.out.println("not finished channel");
		}
		gdfn.open(true);
		
		// Selection listener on graphConnect or GraphNode is not supported
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=236528
		graph.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
//									System.out.println(e);
			}

		});
	}
	
	private DataFlowNetwork getParent(Object firstElement) {
		// DataFlowNetwork
		if(firstElement instanceof DataFlowNetwork)
		{
			return ((DataFlowNetwork)firstElement);
		}
		// Node
		if(firstElement instanceof Node)
		{
			return ((Node)firstElement).getNetwork();
		}
		// State
		if(firstElement instanceof State)
		{
			return ((State)firstElement).getNode().getNetwork();
		}
		// Token
		if(firstElement instanceof Token)
		{
			return ((Token)firstElement).getNetwork();
		}
		// Port
		if(firstElement instanceof Port)
		{
			if (((Port)firstElement).getEndpoint() instanceof Node)
			{
				return ((Node)((Port)firstElement).getEndpoint()).getNetwork();
			}
			else
			{
				return ((DataFlowNetwork)((Port)firstElement).getEndpoint());
			}
		}
		// Channel
		if(firstElement instanceof Channel)
		{
			return ((Channel)firstElement).getNetwork();
		}
		// Transition
		if(firstElement instanceof Transition)
		{
			return ((Transition)firstElement).getNode().getNetwork();
		}
		// Mapping
		if(firstElement instanceof Mapping)
		{
			return ((Mapping)firstElement).getNode().getNetwork();
		}
		
		return null;
	}
	
	private GraphContainer addNode(IContainer gdfn, Node node) {
//		System.out.println("start node: "+node.getName());
		GraphContainer gnode = new GraphContainer(gdfn, SWT.NONE, node.getName());
		gnode.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		List<GraphNode> stateList = new ArrayList<>();
		for (State state : node.getStates()) {
//			System.out.println("\tstart state: "+state.getName());
			GraphNode gstate=new GraphNode(gnode, SWT.NONE, state.getName());
			stateList.add(gstate);
		}
		for (Transition transition : node.getTransitions()) {
//			System.out.println("\tstart transition: "+transition.getSourcestate().getName()+"-->"+transition.getTargetstate().getName());
			GraphNode sourceState=null;
			GraphNode targetState=null;
			for (GraphNode gstate : stateList) {
				if(gstate.getText().equals(transition.getSourcestate().getName()))
					sourceState=gstate;
				if (gstate.getText().equals(transition.getTargetstate().getName()))
					targetState=gstate;
			}
			if (sourceState!=null && targetState!=null) {
				new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, sourceState, targetState);/*.setText(params(transition))*/;
			}
			else
				System.out.println("not finished transition");
		}
		gnode.open(true);
		System.out.println("finished node");
		return gnode;
	}

	@SuppressWarnings("unused")
	private String params(Transition transition) {
		StringBuilder params = new StringBuilder();
		int size = transition.getIn().size();
		int i=1;
		if (size<1)
			params.append("-");
		for (InMapping map : transition.getIn()) {
			params.append(map.getName());
			if(i!=size)
				params.append(" && ");
		}
		params.append(" / ");
		size = transition.getOut().size();
		i=1;
		if (size<1)
			params.append("-");
		for (OutMapping map : transition.getOut()) {
			params.append(map.getName());
			if(i!=size)
				params.append(" && ");
		}
		return params.toString();
	}

	public void setLayoutManager() {
		switch (layout) {
		case 1:
			graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout++;
			break;
		case 2:
			graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout = 1;
			break;

		}

	}

	/**
	 * Static method that shows an error message to the user
	 * @param errorMessage
	 */
	public static void showErrorMessage(String errorMessage) {
		MessageDialog messageDialog = new MessageDialog(
			null,
			"Error during code generation",
			null,
			errorMessage,
			MessageDialog.ERROR,
			new String[]{"Ok"}, 0);
		messageDialog.open();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}