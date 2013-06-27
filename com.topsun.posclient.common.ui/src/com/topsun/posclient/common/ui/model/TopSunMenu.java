package com.topsun.posclient.common.ui.model;

import java.util.ArrayList;
import java.util.List;

public class TopSunMenu {
	
	private String menuID;
	private String menuName;
	private List<TopSunTree> trees = new ArrayList<TopSunTree>();

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
	public List<TopSunTree> getTrees() {
		return trees;
	}
	public void setTrees(List<TopSunTree> trees) {
		this.trees = trees;
	}
	
	
}
