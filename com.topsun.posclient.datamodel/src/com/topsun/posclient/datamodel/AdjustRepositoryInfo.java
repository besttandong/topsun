package com.topsun.posclient.datamodel;

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
	
	private Date backDate; //��������
	
	private String receiveRepository; // �ջ�ֿ�
	
	private Date checkDate;//�������
	
	private String backReason;//�ز�ԭ��
	
	private Date reCheckDate; //��������
	
	private String remark;//��ע
	
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
