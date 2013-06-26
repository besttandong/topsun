package com.topsun.posclient.sales.ui.tree;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class TopSunMenuTreeManager {

	static IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	static int instanceNum;
	static String viewID = "com.topsun.posclient.sales.ui.menu.SalesView";
	
	static String storePayViewID = "com.topsun.posclient.finance.ui.StorePayView";
	static String settleAccountWayViewID = "com.topsun.posclient.finance.ui.SettleAccountWayView";
	
	static String adjustRepositoryViewID = "com.topsun.posclient.repository.ui.AdjustRepositoryView";
	static String adjustStoreViewID = "com.topsun.posclient.repository.ui.AdjustStoreView";
	static String checkRepositoryViewID = "com.topsun.posclient.repository.ui.CheckRepositoryView";
	static String verifyRepositoryViewID = "com.topsun.posclient.repository.ui.VerifyRepositoryView";

	static String syncdataViewID = "com.topsun.posclient.system.ui.SyncDataView";
	static String settingViewID = "com.topsun.posclient.system.ui.SettingView";

	private static void checkSecondaryId() {
		IWorkbenchPage page = window.getActivePage();
		IViewReference vr = page.findViewReference(viewID,
				Integer.toString(instanceNum));
		if (vr != null) {
			instanceNum++;
			checkSecondaryId();
		} else {
			return;
		}

	}

	public static String[] getTreeNameByCategories(int type) {
		switch (type) {
		case ITopSunMenuConstans.SALES_MODULE:
			String[] names = new String[] { "����"};
			return names;
		case ITopSunMenuConstans.SYSTEM_MODULE:
			String[] names1 = new String[] { "����ͬ��", "����" };
			return names1;

		case ITopSunMenuConstans.FINANCE_MODULE:
			String[] names2 = new String[] { "���㷽ʽ", "���̽ɿ�" };
			return names2;

		case ITopSunMenuConstans.REPOSITORY_MODULE:
			String[] names3 = new String[] { "�ֵ���", "�����", "����̵�", "�̵�˶�" };
			return names3;
		default:
			return new String[] {};
		}
	}

	public static TreeViewer createSalesTree(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setLabelProvider(new MenuTreeLabelProvider());
		treeViewer.setContentProvider(new MenuTreeContentProvider());
		treeViewer
				.setInput(getTreeNameByCategories(ITopSunMenuConstans.SALES_MODULE));
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection iSelection = event.getSelection();
				if (iSelection instanceof TreeSelection) {
					TreeSelection selection = (TreeSelection) iSelection;
					Object obj = selection.getFirstElement();
					if (obj instanceof String) {
						String selectionTreeName = (String) obj;
						if ("����".equals(selectionTreeName)) {
							checkSecondaryId();
							if (window != null) {
								try {
									IViewPart part = window
											.getActivePage()
											.showView(
													viewID,
													Integer.toString(instanceNum),
													IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;

									// window.getActivePage().showView(viewID,
									// Integer.toString(instanceNum),
									// IWorkbenchPage.VIEW_ACTIVATE);
								} catch (PartInitException e) {
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}

						}
					}
				}
			}

		});

		return treeViewer;
	}

	/**
	 * �����������˵���
	 * 
	 * @param parent
	 * @return
	 */
	public static TreeViewer createFinanceTree(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setLabelProvider(new MenuTreeLabelProvider());
		treeViewer.setContentProvider(new MenuTreeContentProvider());
		treeViewer.setInput(getTreeNameByCategories(ITopSunMenuConstans.FINANCE_MODULE));
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				ISelection iSelection = event.getSelection();
				if (iSelection instanceof TreeSelection) {
					TreeSelection selection = (TreeSelection) iSelection;
					Object obj = selection.getFirstElement();
					if (obj instanceof String) {
						String selectionTreeName = (String) obj;
						if ("���㷽ʽ".equals(selectionTreeName)) {
							if (window != null) {
								try {
									window.getActivePage().showView(
											settleAccountWayViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}else if("���̽ɿ�".equals(selectionTreeName)){
							if (window != null) {
								try {
									window.getActivePage().showView(
											storePayViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}
					}
				}
			}

		});

		return treeViewer;
	}
	
	/**
	 * ����������˵���
	 * 
	 * @param parent
	 * @return
	 */
	public static TreeViewer createRepositoryTree(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setLabelProvider(new MenuTreeLabelProvider());
		treeViewer.setContentProvider(new MenuTreeContentProvider());
		treeViewer.setInput(getTreeNameByCategories(ITopSunMenuConstans.REPOSITORY_MODULE));
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				ISelection iSelection = event.getSelection();
				if (iSelection instanceof TreeSelection) {
					TreeSelection selection = (TreeSelection) iSelection;
					Object obj = selection.getFirstElement();
					if (obj instanceof String) {
						String selectionTreeName = (String) obj;
						if ("�ֵ���".equals(selectionTreeName)) {
							if (window != null) {
								try {
									window.getActivePage().showView(
											adjustRepositoryViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}else if("�����".equals(selectionTreeName)){
							if (window != null) {
								try {
									window.getActivePage().showView(
											adjustStoreViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}else if("����̵�".equals(selectionTreeName)){
							if (window != null) {
								try {
									window.getActivePage().showView(
											checkRepositoryViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}else if("�̵�˶�".equals(selectionTreeName)){
							if (window != null) {
								try {
									window.getActivePage().showView(
											verifyRepositoryViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}
					}
				}
			}

		});

		return treeViewer;
	}

	public static TreeViewer createSystemTree(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setLabelProvider(new MenuTreeLabelProvider());
		treeViewer.setContentProvider(new MenuTreeContentProvider());
		treeViewer
				.setInput(getTreeNameByCategories(ITopSunMenuConstans.SYSTEM_MODULE));
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection iSelection = event.getSelection();
				if (iSelection instanceof TreeSelection) {
					TreeSelection selection = (TreeSelection) iSelection;
					Object obj = selection.getFirstElement();
					if (obj instanceof String) {
						String selectionTreeName = (String) obj;
						if ("����ͬ��".equals(selectionTreeName)) {
							// checkSecondaryId();
							if (window != null) {
								try {
									window.getActivePage().showView(
											syncdataViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;

									// window.getActivePage().showView(viewID,
									// Integer.toString(instanceNum),
									// IWorkbenchPage.VIEW_ACTIVATE);
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}

						}else if("����".equals(selectionTreeName)){
							// checkSecondaryId();
							if (window != null) {
								try {
									window.getActivePage().showView(
											settingViewID,
											Integer.toString(instanceNum),
											IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;
								} catch (PartInitException e) {
									e.printStackTrace();
									MessageDialog.openError(
											window.getShell(),
											"Error",
											"Error opening view:"
													+ e.getMessage());
								}
							}
						}
					}
				}
			}

		});

		return treeViewer;
	}
}
