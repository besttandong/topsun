package com.topsun.posclient.datamodel;

import java.util.Date;
import java.util.List;

/**
 * 调店信息
 * 
 * @author Dong
 *
 */
public class AdjustShopInfo {
	
	private String id; //标识
	
	private String outShop; //调出店铺
	
	private String intoShop;//调入店铺
	
	private String voucherNo; //单据编号
	
	private Date callDate; //调拨日期
	
	private String callType; // 调拨类型
	
	private Date checkDate;//审核日期
	
	private Date reCheckDate; //复核日期
	
	private String remark;//备注
	
	private int itemNum; //调货数量 取goosList的size
	
	private List<Item> itemList; // 商品列表
	
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

	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
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

	public String getOutShop() {
		return outShop;
	}

	public void setOutShop(String outShop) {
		this.outShop = outShop;
	}

	public String getIntoShop() {
		return intoShop;
	}

	public void setIntoShop(String intoShop) {
		this.intoShop = intoShop;
	}

	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
	
}
