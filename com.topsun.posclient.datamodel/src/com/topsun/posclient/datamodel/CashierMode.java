package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;

/**
 * ���㷽ʽ/������ʽ
 * 
 * @author Dong
 *
 */
public class CashierMode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//ID���	Primary Key
	
	private String typeName;//������ʽ���� ���ֽ����п�������ȯ��
	
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

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
