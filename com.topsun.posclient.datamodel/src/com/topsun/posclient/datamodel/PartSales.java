package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 零售信息
 * 
 * @author Dong
 *
 */
public class PartSales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String storename; //店铺名称
	
	private String no;//单据编号
	
	private String balloter;//收银员
	
	private String ballotNo;//收银票号
	
	private String remark;// 备注
	
	private Date salesDate;//销售日期
	
	private Date checkDate; //审核日期
	
	private String userName; //会员
	
	private String cardNo;// 会员卡号
	
	private String enableBalance; //可用余额

	private String enablePoint; //可用积分
	
	private String applyUser;//制单人
	
	private String checker;//审核人
	
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
