package com.topsun.posclient.application.model;

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
	
	private String callDate; //��������
	
	private String callType; // ��������
	
	private String checkDate;//�������
	
	private String reCheckDate; //��������
	
	private String remark;//��ע
	
	private int goodsNum; //�������� ȡgoosList��size
	
	private List<Goods> goodsList; // ��Ʒ�б�
	
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
