package com.topsun.posclient.application.model;

import java.util.Date;
import java.util.List;

/**
 * ������Ϣ
 * 
 * @author Dong
 *
 */
public class AdjustRepositoryInfo {
	
	private String id; //��ʶ
	
	private String storeName; //�زֵ���
	
	private String orderNo; //���ݱ��
	
	private String deliver; //������
	
	private String backDate; //��������
	
	private String receiveRepository; // �ջ�ֿ�
	
	private String checkDate;//�������
	
	private String backReason;//�ز�ԭ��
	
	private String reCheckDate; //��������
	
	private String remark;//��ע
	
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
