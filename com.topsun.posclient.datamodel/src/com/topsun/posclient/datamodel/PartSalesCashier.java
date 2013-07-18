package com.topsun.posclient.datamodel;

import java.io.Serializable;

/**
 * 零售结算信息
 * 
 * 收银时记录每种结算方式的金额
 * 
 * @author Dong
 *
 */
public class PartSalesCashier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;// ID
	
	private int mainId;//主表ID，零售信息ID
	
	private String docNum;//单据编号
	
	private int payModelId;//结算方式ID
	
	private double sum;//金额

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMainId() {
		return mainId;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public int getPayModelId() {
		return payModelId;
	}

	public void setPayModelId(int payModelId) {
		this.payModelId = payModelId;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
}
