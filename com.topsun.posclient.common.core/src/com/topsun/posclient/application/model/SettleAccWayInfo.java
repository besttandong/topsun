package com.topsun.posclient.application.model;

import java.io.Serializable;

/**
 * ���㷽ʽ
 * ������㷽ʽӦ�õ�����տ�
 * 
 * @author Dong
 *
 */
public class SettleAccWayInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;//��ʶ
	
	private int settleAccWay; //���㷽ʽ  0 �ֽ���㡢1 ���п���2 ��ҿ���3 ����ȯ  4 ֧Ʊ 
	
	private String payCustomer;//Ӧ�õ�����
	
	private String receiveCustomer;//Ӧ�õ��տ�
	
	private String posId;//Ӧ�õ�POS
	
	private String bankName;//����
	
	private String account;//�˺�
	
	private String remark;//��ע

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
