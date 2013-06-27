package com.topsun.posclient.common.ui.model;

public class TopSunTree {
	private String pluginId;
	private String icon;
	
	
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



	private String treeId;
	private String viewid;
	private String treeName;

	public TopSunTree(TopSunMenu menu){
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
