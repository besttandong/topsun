package com.topsun.posclient.datamodel;

import java.util.Date;
import java.util.List;

/**
 * 调仓信息
 * 
 * @author Dong
 *
 */
public class AdjustRepositoryInfo {
	
	private String id; //标识
	
	private String shopName; //回仓店铺
	
	private String orderNo; //单据编号
	
	private String deliver; //发货人
	
	private Date backDate; //调仓日期
	
	private String receiveRepository; // 收获仓库
	
	private Date checkDate;//审核日期
	
	private String backReason;//回仓原因
	
	private Date reCheckDate; //复核日期
	
	private String remark;//备注
	
	private int num;//备注
	
	private List<Item> itemList; // 商品列表
	
	private String applyUser;//制单人
	
	private String checker;//审核人
	
	private String reChecker;//复核人
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getReChecker() {
		return reChecker;
	}

	public void setReChecker(String reChecker) {
		this.reChecker = reChecker;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getDeliver() {
		return deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	public Date getBackDate() {
		return backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public String getReceiveRepository() {
		return receiveRepository;
	}

	public void setReceiveRepository(String receiveRepository) {
		this.receiveRepository = receiveRepository;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getBackReason() {
		return backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
	}

	public Date getReCheckDate() {
		return reCheckDate;
	}

	public void setReCheckDate(Date reCheckDate) {
		this.reCheckDate = reCheckDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
