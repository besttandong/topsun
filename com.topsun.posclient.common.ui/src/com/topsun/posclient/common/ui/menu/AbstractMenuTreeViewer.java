package com.topsun.posclient.common.ui.menu;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;


public class AbstractMenuTreeViewer implements IMenuTreeViewer {

	@Override
	public TreeViewer createTreeview(Composite composite) {
		// TODO Auto-generated method stub
		return null;
	}
//
//	static IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//	static int instanceNum;
//	
//	private static void checkSecondaryId() {
//		IWorkbenchPage page = window.getActivePage();
//		IViewReference vr = page.findViewReference(viewID,
//				Integer.toString(instanceNum));
//		if (vr != null) {
//			instanceNum++;
//			checkSecondaryId();
//		} else {
//			return;
//		}
//
//	}
//	
//	@Override
//	public TreeViewer createTreeview(Composite parent) {
//
//
//		TreeViewer treeViewer = new TreeViewer(parent);
//		Tree tree = treeViewer.getTree();
//		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
//		treeViewer.setLabelProvider(new MenuTreeLabelProvider());
//		treeViewer.setContentProvider(new MenuTreeContentProvider());
//		//treeViewer.setInput(getTreeNameByCategories(ITopSunMenuConstans.SALES_MODULE));
//		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
//
//			@Override
//			public void doubleClick(DoubleClickEvent event) {
//				ISelection iSelection = event.getSelection();
//				if (iSelection instanceof TreeSelection) {
//					TreeSelection selection = (TreeSelection) iSelection;
//					Object obj = selection.getFirstElement();
//					if (obj instanceof String) {
//						String selectionTreeName = (String) obj;
//						if ("¡„ €".equals(selectionTreeName)) {
//							checkSecondaryId();
//							if (window != null) {
//								try {
//									IViewPart part = window
//											.getActivePage()
//											.showView(
//													viewID,
//													Integer.toString(instanceNum),
//													IWorkbenchPage.VIEW_ACTIVATE);
//									instanceNum++;
//
//									// window.getActivePage().showView(viewID,
//									// Integer.toString(instanceNum),
//									// IWorkbenchPage.VIEW_ACTIVATE);
//								} catch (PartInitException e) {
//									MessageDialog.openError(
//											window.getShell(),
//											"Error",
//											"Error opening view:"
//													+ e.getMessage());
//								}
//							}
//
//						}
//					}
//				}
//			}
//
//		});
//
//		return treeViewer;
//	
//	
//	}

}
