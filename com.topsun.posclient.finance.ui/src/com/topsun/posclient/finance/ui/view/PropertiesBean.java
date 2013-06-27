package com.topsun.posclient.finance.ui.view;

public class PropertiesBean {
	
	private String settleAccWay = "";
	private String payCustomer = "";
	private String receiveCustomer = "";
	private String posId = "";
	private String bankName = "";
	private String account = "";
	private String remark = "";

	public PropertiesBean() {
	}

	public PropertiesBean(String settleAccWay, String payCustomer, String receiveCustomer,
			String posId, String bankName, String account, String remark) {
		this.settleAccWay = settleAccWay;
		this.payCustomer = payCustomer;
		this.receiveCustomer = receiveCustomer;
		this.posId = posId;
		this.bankName = bankName;
		this.account = account;
		this.remark = remark;
	}

	public String getSettleAccWay() {
		return settleAccWay;
	}

	public void setSettleAccWay(String settleAccWay) {
		this.settleAccWay = settleAccWay;
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
}