package com.topsun.posclient.application.model;

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
	
	private String storeName; //回仓店铺
	
	private String orderNo; //单据编号
	
	private String deliver; //发货人
	
	private String backDate; //调仓日期
	
	private String receiveRepository; // 收获仓库
	
	private String checkDate;//审核日期
	
	private String backReason;//回仓原因
	
	private String reCheckDate; //复核日期
	
	private String remark;//备注
	
	private List<Goods> goodsList; // 商品列表
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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

	public String getBackDate() {
		return backDate;
	}

	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}

	public String getReceiveRepository() {
		return receiveRepository;
	}

	public void setReceiveRepository(String receiveRepository) {
		this.receiveRepository = receiveRepository;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getBackReason() {
		return backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
	}

	public String getReCheckDate() {
		return reCheckDate;
	}

	public void setReCheckDate(String reCheckDate) {
		this.reCheckDate = reCheckDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
