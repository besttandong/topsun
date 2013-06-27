package com.topsun.posclient.common.ui.model;

public class TopSunTreeModel {
	private String pluginId;
	private String icon;
	private String treeId;
	private String viewid;
	private String treeName;
	private String index;
	
	
	
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPluginId() {
		return pluginId;
	}

	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public TopSunTreeModel(TopSunMenuModel menu){
		menu.getTrees().add(this);
	}
	
	public String getTreeId() {
		return treeId;
	}


	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}


	public String getViewid() {
		return viewid;
	}

	public void setViewid(String viewid) {
		this.viewid = viewid;
	}



	public String getTreeName() {
		return treeName;
	}



	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	
}
