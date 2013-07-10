package com.topsun.posclient.datamodel;

import java.io.Serializable;

/**
 * 结算方式
 * @author Dong
 *
 */
public class CashierModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//主键	Primary Key
	
	private String typeName;//结算方式名称
	
	private double amount; // 金额
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}