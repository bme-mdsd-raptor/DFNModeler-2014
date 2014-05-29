package hu.bme.mit.inf.MDSD.DFNModeler.compilecommandhandler;

import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates.AppSourceGenerator;
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates.DFNControllerSourceGenerator;
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates.IntTokenSourceGenerator;
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates.NodeSourceGenerator;
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates.StringTokenSourceGenerator;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import DFN.Application;
import DFN.Channel;
import DFN.DataFlowNetwork;
import DFN.IntToken;
import DFN.Mapping;
import DFN.NamedElement;
import DFN.Node;
import DFN.Port;
import DFN.State;
import DFN.StringToken;
import DFN.StringTokenLiteral;
import DFN.Token;
import DFN.Transition;

public class SourceGenerateCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Getting the active window
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			// Checking the selection
			ISelection selection = window.getSelectionService().getSelection();
			if (window.getSelectionService().getSelection() instanceof IStructuredSelection) {
				// Getting the selection
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				// Getting the single selected element
				if (structuredSelection.size() == 1) {
					Object firstElement = structuredSelection.getFirstElement();

					if (firstElement instanceof XMIResourceImpl) {
						XMIResourceImpl impl = (XMIResourceImpl) firstElement;
						firstElement = impl.getContents().get(0);
					} else if (firstElement instanceof StringTokenLiteral) {
						firstElement = ((StringTokenLiteral) firstElement)
								.getStringtoken().getNetwork();
					}

					if (firstElement instanceof NamedElement) {
						DataFlowNetwork dataModel = getParent(firstElement);
						// Check if it is the right element
						if (dataModel != null) {

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
								generateSources(dataModel, dataModel.getName());
							} else {
								showErrorMessage("The DFN model has errors in it. Please fix them before attempting code generation");
							}

						}
					} else
						showErrorMessage("The selected element (or its parents) isn't the instance of "
								+ DataFlowNetwork.class.getCanonicalName()
								+ "\n(Got: "
								+ firstElement.getClass().getCanonicalName()
								+ ")");
				} else
					showErrorMessage("Select exactly one element!");
			}
		} else
			showErrorMessage("There isn't any active window!");

		return null;
	}

	private void generateSources(DataFlowNetwork dataModel, String projectName) {
		DFNControllerSourceGenerator dfngenerator = new DFNControllerSourceGenerator(
				dataModel, projectName);
		dfngenerator.generateSources();

		for (DataFlowNetwork element : dataModel.getOwnedDFNs()) {
			generateSources(element, projectName);
		}

		for (Application element : dataModel.getApps()) {
			AppSourceGenerator appGenerator = new AppSourceGenerator(element,
					projectName);
			appGenerator.generateSources();

		}

		for (Node element : dataModel.getNodes()) {
			NodeSourceGenerator nodeGenerator = new NodeSourceGenerator(
					element, projectName);
			nodeGenerator.generateSources();
		}

		for (Token element : dataModel.getTokens()) {
			if (element instanceof IntToken) {
				IntTokenSourceGenerator intTokenGenerator = new IntTokenSourceGenerator(
						element, projectName);
				intTokenGenerator.generateSources();
			} else if (element instanceof StringToken) {
				StringTokenSourceGenerator stringTokenGenerator = new StringTokenSourceGenerator(
						element, projectName);
				stringTokenGenerator.generateSources();
			}

		}

	}

	private DataFlowNetwork getParent(Object firstElement) {
		// DataFlowNetwork
		if (firstElement instanceof DataFlowNetwork) {
			return ((DataFlowNetwork) firstElement);
		}
		// Node
		if (firstElement instanceof Node) {
			return ((Node) firstElement).getNetwork();
		}
		// State
		if (firstElement instanceof State) {
			return ((State) firstElement).getNode().getNetwork();
		}
		// Token
		if (firstElement instanceof Token) {
			return ((Token) firstElement).getNetwork();
		}
		// Port
		if (firstElement instanceof Port) {
			if (((Port) firstElement).getEndpoint() instanceof Node) {
				return ((Node) ((Port) firstElement).getEndpoint())
						.getNetwork();
			} else {
				return ((DataFlowNetwork) ((Port) firstElement).getEndpoint());
			}
		}
		// Channel
		if (firstElement instanceof Channel) {
			return ((Channel) firstElement).getNetwork();
		}
		// Transition
		if (firstElement instanceof Transition) {
			return ((Transition) firstElement).getNode().getNetwork();
		}
		// Mapping
		if (firstElement instanceof Mapping) {
			return ((Mapping) firstElement).getNode().getNetwork();
		}

		return null;
	}

	/**
	 * Static method that shows an error message to the user
	 * 
	 * @param errorMessage
	 */
	public static void showErrorMessage(String errorMessage) {
		MessageDialog messageDialog = new MessageDialog(null,
				"Error during code generation", null, errorMessage,
				MessageDialog.ERROR, new String[] { "Ok" }, 0);
		messageDialog.open();
	}
}
