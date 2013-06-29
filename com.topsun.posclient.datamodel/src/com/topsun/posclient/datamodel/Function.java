package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.List;

/**
 * 功能模块
 * 
 * @author Dong
 *
 */
public class Function implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String actionURL;//ActionURL
	
	private String functionName;//功能名
	
	private String description;//功能描述
	
	private List<Function> childs;//子模块
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActionURL() {
		return actionURL;
	}

	public void setActionURL(String actionURL) {
		this.actionURL = actionURL;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Function> getChilds() {
		return childs;
	}

	public void setChilds(List<Function> childs) {
		this.childs = childs;
	}

}
