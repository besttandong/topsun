package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;

/**
 * 结算方式/收银方式
 * 
 * @author Dong
 *
 */
public class CashierMode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//ID编号	Primary Key
	
	private String typeName;//收银方式名称 有现金、银行卡、代金券等
	
	private int delFlg;//删除标识（默认为0）
	
	private int creater;//创建者
	
	private Date createdTime;//创建时间	
	
	private int updater;//最后修改者
	
	private Date lastUpdatedTime;//最后修改时间	
	
	private String revision;//版本戳

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
