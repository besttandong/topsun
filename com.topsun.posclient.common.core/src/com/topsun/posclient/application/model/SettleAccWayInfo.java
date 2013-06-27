package com.topsun.posclient.application.model;

import java.io.Serializable;

/**
 * 结算方式
 * 保存结算方式应用到付款、收款
 * 
 * @author Dong
 *
 */
public class SettleAccWayInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;//标识
	
	private int settleAccWay; //结算方式  0 现金结算、1 银行卡、2 外币卡、3 代金券  4 支票 
	
	private String payCustomer;//应用到付款
	
	private String receiveCustomer;//应用到收款
	
	private String posId;//应用到POS
	
	private String bankName;//银行
	
	private String account;//账号
	
	private String remark;//备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPayCustomer() {
		return payCustomer;
	}

	public void setPayCustomer(String payCustomer) {
		this.payCustomer = payCustomer;
	}

	public String getReceiveCustomer() {
		return receiveCustomer;
	}

	public void setReceiveCustomer(String receiveCustomer) {
		this.receiveCustomer = receiveCustomer;
	}

	public String getPosId() {
		return posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSettleAccWay() {
		return settleAccWay;
	}

	public void setSettleAccWay(int settleAccWay) {
		this.settleAccWay = settleAccWay;
	}
}
