package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 库存盘点信息
 * 
 * @author Dong
 *
 */
public class StockCheck implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 1L;
	
	private String docNum;//单据编号
	
	private String docState;//单据审核状态,只有是“已保存”状态盘点单可以修改，其他状态不可修改
	
	private int checkTypeId;//盘点类别ID	店铺盘点时固定为2
	
	private int checkShId;//盘点店铺ID
	
	private int checkWhId;//盘点仓库ID	
	
	private int checkRange;//盘点范围ID
	
	private Date checkDate;//盘点日期
	
	private int isAdjusted;//生成调整单	默认为0
	
	private String memo;//备注
	
	private Date auditDate;//最后审核日期	
	
	private int auditId;//最后审核人ID	
	
	private List<Item> itemList; // 商品列表
	
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public String getDocState() {
		return docState;
	}

	public void setDocState(String docState) {
		this.docState = docState;
	}

	public int getCheckTypeId() {
		return checkTypeId;
	}

	public void setCheckTypeId(int checkTypeId) {
		this.checkTypeId = checkTypeId;
	}

	public int getCheckShId() {
		return checkShId;
	}

	public void setCheckShId(int checkShId) {
		this.checkShId = checkShId;
	}

	public int getCheckWhId() {
		return checkWhId;
	}

	public void setCheckWhId(int checkWhId) {
		this.checkWhId = checkWhId;
	}

	public int getCheckRange() {
		return checkRange;
	}

	public void setCheckRange(int checkRange) {
		this.checkRange = checkRange;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public int getIsAdjusted() {
		return isAdjusted;
	}

	public void setIsAdjusted(int isAdjusted) {
		this.isAdjusted = isAdjusted;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public int getAuditId() {
		return auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}
}
