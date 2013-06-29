package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;

/**
 * ��Ʒ
 * 
 * @author Dong
 *
 */
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//ID���	Primary Key
	
	private String itemCode;//����
	
	private String itemName;//��Ʒ����	
	
	private int classId;//����ID���
	
	private int divisionId;//����ID���
	
	private int sectionId;//С��ID���	
	
	private int unitId;//��λID���
	
	private int stdId;//����ͺ�ID���	
	
	private int supplierId;//��Ӧ��ID���	
	
	private int BrandId;//Ʒ��ID���	
	
	private int area;//����
	
	private String description;//��Ʒ����
	
	private double wholesalePrice;//������
	
	private double retailPrice;//���ۼ�
	
	private double purchasePrice;//�ɹ���
	
	private double channelPrice;//������
	
	private double guidePrice;//ָ����
	
	private int delFlg;//ɾ����ʶ��Ĭ��Ϊ0��
	
	private int creater;//������
	
	private Date createdTime;//����ʱ��	
	
	private int updater;//����޸���
	
	private Date lastUpdatedTime;//����޸�ʱ��	
	
	private String revision;//�汾��

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getBrandId() {
		return BrandId;
	}

	public void setBrandId(int brandId) {
		BrandId = brandId;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getChannelPrice() {
		return channelPrice;
	}

	public void setChannelPrice(double channelPrice) {
		this.channelPrice = channelPrice;
	}

	public double getGuidePrice() {
		return guidePrice;
	}

	public void setGuidePrice(double guidePrice) {
		this.guidePrice = guidePrice;
	}

	public int getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}

	public int getCreater() {
		return creater;
	}

	public void setCreater(int creater) {
		this.creater = creater;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}
}