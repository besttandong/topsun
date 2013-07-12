package com.topsun.posclient.datamodel;

/**
 * 调拨类型
 * 
 * @author LiLei
 *
 */
public class AllotStyle {

	private long id;
	
	private String allotBase;// 调拨使用所属（WHS：仓库；SHP：店铺）
	
	private long styleCode; //类型编码
	
	private String styleName;//类型名称

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAllotBase() {
		return allotBase;
	}

	public void setAllotBase(String allotBase) {
		this.allotBase = allotBase;
	}

	public long getStyleCode() {
		return styleCode;
	}

	public void setStyleCode(long styleCode) {
		this.styleCode = styleCode;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
}
