package com.topsun.posclient.common.ui.model;

import java.util.ArrayList;
import java.util.List;

public class TopSunMenuModel {
	
	private String menuID;
	private String menuName;
	private String pluginID;
	private String icon;
	private String index;
	
	
	public String getPluginID() {
		return pluginID;
	}
	public void setPluginID(String pluginID) {
		this.pluginID = pluginID;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	private List<TopSunTreeModel> trees = new ArrayList<TopSunTreeModel>();

	public String getMenuID() {
		return menuID;
	}
	public void setMenuID(String menuID) {
		this.menuID = menuID;
	}

	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public List<TopSunTreeModel> getTrees() {
		return trees;
	}
	public void setTrees(List<TopSunTreeModel> trees) {
		this.trees = trees;
	}
	
	
}
