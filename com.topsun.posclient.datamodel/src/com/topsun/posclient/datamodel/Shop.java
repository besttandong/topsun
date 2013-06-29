package com.topsun.posclient.datamodel;

import java.io.Serializable;
import java.util.Date;

/**
 * 店铺
 * 
 * @author Dong
 *
 */
public class Shop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//ID编号	Primary Key
	
	private String shpCode;//店铺编码
	
	private String shpName;//店铺名称
	
	private int shpTypeID;//经营类型
	
	private int shpClassID;//店铺类型
	
	private int depEntryID;//所属部门
	
	private int cusEntryID;//所属客户
	
	private String brandList;//经营品牌
	
	private long isStock;//管理库存
	
	private int areaID;//区域
	
	private int provinceID;//省份
	
	private int cityID;//城市
	
	private int cityAreaID;//省市/城区
	
	private String address;//地址
	
	private String shopTel;//店铺电话
	
	private String director;//主管
	
	private String dtel;//主管电话
	
	private String passWord;//店铺密码
	
	private String controlID;//负库存控制
	
	private Date startDate;//开店日期
	
	private Date startTime;//每日开铺
	
	private Date endTime;//
	
	private int empDutyID;//大区经理
	
	private int empID;//片区主管
	
	private int isInvalid;//停用标识
	
	private int paymentID;//收银方式
	
	private String bank;//缴款银行
	
	private String accountNO;//银行账号
	
	private String forbidden;//功能禁用项
	
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

	public String getShpCode() {
		return shpCode;
	}

	public void setShpCode(String shpCode) {
		this.shpCode = shpCode;
	}

	public String getShpName() {
		return shpName;
	}

	public void setShpName(String shpName) {
		this.shpName = shpName;
	}

	public int getShpTypeID() {
		return shpTypeID;
	}

	public void setShpTypeID(int shpTypeID) {
		this.shpTypeID = shpTypeID;
	}

	public int getShpClassID() {
		return shpClassID;
	}

	public void setShpClassID(int shpClassID) {
		this.shpClassID = shpClassID;
	}

	public int getDepEntryID() {
		return depEntryID;
	}

	public void setDepEntryID(int depEntryID) {
		this.depEntryID = depEntryID;
	}

	public int getCusEntryID() {
		return cusEntryID;
	}

	public void setCusEntryID(int cusEntryID) {
		this.cusEntryID = cusEntryID;
	}

	public String getBrandList() {
		return brandList;
	}

	public void setBrandList(String brandList) {
		this.brandList = brandList;
	}

	public long getIsStock() {
		return isStock;
	}

	public void setIsStock(long isStock) {
		this.isStock = isStock;
	}

	public int getAreaID() {
		return areaID;
	}

	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}

	public int getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public int getCityAreaID() {
		return cityAreaID;
	}

	public void setCityAreaID(int cityAreaID) {
		this.cityAreaID = cityAreaID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopTel() {
		return shopTel;
	}

	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDtel() {
		return dtel;
	}

	public void setDtel(String dtel) {
		this.dtel = dtel;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getControlID() {
		return controlID;
	}

	public void setControlID(String controlID) {
		this.controlID = controlID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getEmpDutyID() {
		return empDutyID;
	}

	public void setEmpDutyID(int empDutyID) {
		this.empDutyID = empDutyID;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getIsInvalid() {
		return isInvalid;
	}

	public void setIsInvalid(int isInvalid) {
		this.isInvalid = isInvalid;
	}

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
	}

	public String getForbidden() {
		return forbidden;
	}

	public void setForbidden(String forbidden) {
		this.forbidden = forbidden;
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
