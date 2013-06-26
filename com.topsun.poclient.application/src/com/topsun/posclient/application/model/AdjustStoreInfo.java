package com.topsun.posclient.application.model;

import java.util.List;

/**
 * 调店信息
 * 
 * @author Dong
 *
 */
public class AdjustStoreInfo {
	
	private String id; //标识
	
	private String outStore; //调出店铺
	
	private String intoStore;//调入店铺
	
	private String voucherNo; //单据编号
	
	private String callDate; //调拨日期
	
	private String callType; // 调拨类型
	
	private String checkDate;//审核日期
	
	private String reCheckDate; //复核日期
	
	private String remark;//备注
	
	private int goodsNum; //调货数量 取goosList的size
	
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

	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
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

	public String getOutStore() {
		return outStore;
	}

	public void setOutStore(String outStore) {
		this.outStore = outStore;
	}

	public String getIntoStore() {
		return intoStore;
	}

	public void setIntoStore(String intoStore) {
		this.intoStore = intoStore;
	}

	public String getCallDate() {
		return callDate;
	}

	public void setCallDate(String callDate) {
		this.callDate = callDate;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	
}
