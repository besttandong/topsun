/**
 * 
 */
package com.topsun.posclient.application;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Sash;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.LayoutPart;
import org.eclipse.ui.internal.PerspectiveHelper;
import org.eclipse.ui.internal.ViewSashContainer;
import org.eclipse.ui.internal.ViewStack;
import org.eclipse.ui.internal.WorkbenchPage;

/**
 * 
 * 锁定两个视图中的SASH。固定视图位置
 *
 * @author Carrod.yu (mailto:haha.opensource@gmail.com)
 */
@SuppressWarnings("restriction")
public class LockSashMove implements IStartup {

	private List<Sash> sashList = new ArrayList<Sash>();

	public void earlyStartup() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		workbench.getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
				if (window != null) {
					window.addPerspectiveListener(new IPerspectiveListener() {
						public void perspectiveActivated(IWorkbenchPage page,
								IPerspectiveDescriptor perspective) {
						}

						public void perspectiveChanged(IWorkbenchPage page,
								IPerspectiveDescriptor perspective,
								String changeId) {
							fixedSash();
						}
					});
				}
			}
		});
		fixedSash();
	}

	private void fixedSash() {
		sashList.clear();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				WorkbenchPage page = (WorkbenchPage) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				PerspectiveHelper helper = page.getPerspectivePresentation();
				ViewSashContainer viewSash = helper.getLayout();

				LayoutPart[] layoutParts = viewSash.getChildren();
				final Composite composite = viewSash.getParent();
				if (layoutParts != null && layoutParts.length > 0) {
					for (LayoutPart part : layoutParts) {
						if (part instanceof ViewStack) {
							addSash(composite);
						}
					}
				}

				composite.addControlListener(new ControlListener() {
					public void controlResized(ControlEvent controlevent) {
						setUnable(sashList);
					}

					public void controlMoved(ControlEvent controlevent) {
					}
				});
				setUnable(sashList);
			}
		});
	}

	private void addSash(Composite composite) {
		Control[] controls = composite.getChildren();
		for (Control control : controls) {
			if (control instanceof Sash) {
				final Sash sash = ((Sash) control);
				sashList.add(sash);
			}
		}
	}

	private void setUnable(List<Sash> sashList) {
		for (Sash sash : sashList) {
			if (!sash.isDisposed()) {
				sash.setEnabled(false);
			}
		}
	}
}
