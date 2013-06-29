package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ������Ϣ
 * 
 * @author Dong
 *
 */
public class PartSales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String storename; //��������
	
	private String no;//���ݱ��
	
	private String balloter;//����Ա
	
	private String ballotNo;//����Ʊ��
	
	private String remark;// ��ע
	
	private Date salesDate;//��������
	
	private Date checkDate; //�������
	
	private String userName; //��Ա
	
	private String cardNo;// ��Ա����
	
	private String enableBalance; //�������

	private String enablePoint; //���û���
	
	private String applyUser;//�Ƶ���
	
	private String checker;//�����
	
	private List<Item> itemList;
	
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getEnablePoint() {
		return enablePoint;
	}

	public void setEnablePoint(String enablePoint) {
		this.enablePoint = enablePoint;
	}

	public String getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBalloter() {
		return balloter;
	}

	public void setBalloter(String balloter) {
		this.balloter = balloter;
	}

	public String getBallotNo() {
		return ballotNo;
	}

	public void setBallotNo(String ballotNo) {
		this.ballotNo = ballotNo;
	}

	public String getEnableBalance() {
		return enableBalance;
	}

	public void setEnableBalance(String enableBalance) {
		this.enableBalance = enableBalance;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
