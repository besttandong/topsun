package com.topsun.posclient.common.ui.menu;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.topsun.posclient.common.ui.model.TopSunMenu;
import com.topsun.posclient.common.ui.model.TopSunTree;
import com.topsun.posclient.common.ui.utils.ImageUtils;
import com.topsun.posclient.widget.pshelf.PShelf;
import com.topsun.posclient.widget.pshelf.PShelfItem;

/**
 * 
 * @author yujie
 *
 */
public class MenuTreeManagerFacede {
	
	private static MenuTreeManagerFacede facede = new MenuTreeManagerFacede();
	
	private static List<TopSunMenu> menuList  = new ArrayList<TopSunMenu>();
	
	private static List<TopSunTree> treeList  = new ArrayList<TopSunTree>();
	
	private MenuTreeManagerFacede(){
		
	}
	
	static IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	static int instanceNum;
	
	private static void checkSecondaryId(String viewID) {
		IWorkbenchPage page = window.getActivePage();
		IViewReference vr = page.findViewReference(viewID,
				Integer.toString(instanceNum));
		if (vr != null) {
			instanceNum++;
			checkSecondaryId(viewID);
		} else {
			return;
		}

	}
	public static MenuTreeManagerFacede getInstance(){
		if(facede == null){
			facede = new MenuTreeManagerFacede();
			return facede;
		}
		return facede;
	}
	
	private TopSunTree findTree(String treeName){
		for (TopSunTree tree : treeList) {
			if(treeName.equals(tree.getTreeName())){
				return tree;
			}
		}
		return null;
	}
	
	private TopSunMenu findMenu(String menuID){
		for (TopSunMenu menu : menuList) {
			if(menuID.equals(menu.getMenuID())){
				return menu;
			}
		}
		return null;
	};
	private void createTree(Composite composite,final TopSunMenu menu){
		loadTreeExtension(menu);
		TreeViewer treeViewer = new TreeViewer(composite);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setLabelProvider(new MenuTreeLabelProvider());
		treeViewer.setContentProvider(new MenuTreeContentProvider());
		TopSunMenu t_Menu = findMenu(menu.getMenuID());
		List<TopSunTree> topSunTrees = t_Menu.getTrees();
		List<String> treeNames = new ArrayList<String>();
		for (TopSunTree topSunTree : topSunTrees) {
			treeNames.add(topSunTree.getTreeName());
		}
		if(treeNames == null || treeNames.size() ==0){
			return;
		}
		treeViewer.setInput(topSunTrees);
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection iSelection = event.getSelection();
				if (iSelection instanceof TreeSelection) {
					TreeSelection selection = (TreeSelection) iSelection;
					Object obj = selection.getFirstElement();
					if (obj instanceof TopSunTree) {
						TopSunTree selectionTree = (TopSunTree) obj;
						
						TopSunTree topsunTree = findTree(selectionTree.getTreeName());
						String viewId = topsunTree.getViewid();
							checkSecondaryId(viewId);
							if (window != null) {
								try {
									IViewPart part = window
											.getActivePage()
											.showView(
													viewId,
													Integer.toString(instanceNum),
													IWorkbenchPage.VIEW_ACTIVATE);
									instanceNum++;

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

		});

	}
	public void loadTreeExtension(TopSunMenu menu){
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint("com.topsun.tree").getExtensions();
		for (IExtension iExtension : extensions) {
			IConfigurationElement[] configurationElement = iExtension.getConfigurationElements();
			for (IConfigurationElement iConfigurationElement : configurationElement) {
				String pluginId = "";
					try {
						pluginId = iExtension.getDeclaringPluginDescriptor().getPlugin().toString();
					} catch (InvalidRegistryObjectException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				String menuId = iConfigurationElement.getAttribute("menuid");
				String treeName = iConfigurationElement.getAttribute("name");
				String treeid = iConfigurationElement.getAttribute("treeid");
				String viewid = iConfigurationElement.getAttribute("viewid");
				String index = iConfigurationElement.getAttribute("index");
				String icon = iConfigurationElement.getAttribute("icons");
				
				if(menu.getMenuID().equals(menuId)){
					TopSunTree sunTree = new TopSunTree(menu);
					sunTree.setTreeId(treeid);
					sunTree.setTreeName(treeName);
					sunTree.setViewid(viewid);
					sunTree.setPluginId(pluginId);
					sunTree.setIcon(icon);
					treeList.add(sunTree);
				}
			}
		}
	}
	
	public void initMenu(){
		
	}
	
	public List<PShelfItem>  loadMenuExtension(PShelf parent){
		List<PShelfItem> items = new ArrayList<PShelfItem>();
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint("com.topsun.menu").getExtensions();
		for (IExtension iExtension : extensions) {
			IConfigurationElement[] configurationElement = iExtension.getConfigurationElements();
			for (IConfigurationElement iConfigurationElement : configurationElement) {
				String meunName = iConfigurationElement.getAttribute("name");
				String index = iConfigurationElement.getAttribute("index");
				String menuid = iConfigurationElement.getAttribute("menuid");
				String icon = iConfigurationElement.getAttribute("icon");
				
				TopSunMenu menu = new TopSunMenu();
				menu.setMenuID(menuid);
				menu.setMenuName(meunName);
				menuList.add(menu);
				
				PShelfItem item = new PShelfItem(parent, SWT.NONE);
				item.setText(meunName);
				String pluginId;
				try {
					pluginId = iExtension.getDeclaringPluginDescriptor().getPlugin().toString();
					Composite compsite = item.getBody();
					Color color = PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_WHITE);
					item.setImage(ImageUtils.createImage(pluginId,icon));
					compsite.setBackground(color);
					compsite.setLayout(new GridLayout(1,false));
					
					//Create Tree Viewer
					createTree(compsite,menu);
					items.add(item);
				} catch (InvalidRegistryObjectException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		return items;
	}
}
