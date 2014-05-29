package hu.bme.mit.inf.mdsd.dfnmodeler.commandhelper;

import hu.bme.mit.inf.mdsd.dfnmodeler.graphviewer.views.GraphSampleView;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class RefreshHelper extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IViewPart findView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("hu.bme.mit.inf.mdsd.dfnmodeler.graphviewer.views.GraphSampleView");
		if (findView==null) {
			try {
				findView=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("hu.bme.mit.inf.mdsd.dfnmodeler.graphviewer.views.GraphSampleView");
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(findView instanceof GraphSampleView) {
			((GraphSampleView)findView).refresh();
			findView.setFocus();
		}
		return null;
	}

}
