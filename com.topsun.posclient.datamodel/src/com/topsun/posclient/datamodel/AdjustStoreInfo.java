package com.topsun.posclient.datamodel;

import java.util.Date;
import java.util.List;

/**
 * ������Ϣ
 * 
 * @author Dong
 *
 */
public class AdjustStoreInfo {
	
	private String id; //��ʶ
	
	private String outStore; //��������
	
	private String intoStore;//�������
	
	private String voucherNo; //���ݱ��
	
	private Date callDate; //��������
	
	private String callType; // ��������
	
	private Date checkDate;//�������
	
	private Date reCheckDate; //��������
	
	private String remark;//��ע
	
	private int itemNum; //�������� ȡgoosList��size
	
	private List<Item> itemList; // ��Ʒ�б�
	
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
