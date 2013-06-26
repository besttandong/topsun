package com.topsun.posclient.application.model;

import java.io.Serializable;

/**
 * 商品信息
 * 
 * @author Dong
 *
 */
public class Goods implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String goodsName; // 商品名称
	
	private String goodsType; //款号
	
	private double unitPrice;// 单价
	
	private double discountA;// 折扣金额
	
	private double discountB; // 折扣率
	
	private double amount; // 金额
	
	private double number; // 数量
	
	private int singlePoints; // 单品积分
	
	private double retailPrice; // 零售价
	
	private String listPrice; //价格清单

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountA() {
		return discountA;
	}

	public void setDiscountA(double discountA) {
		this.discountA = discountA;
	}

	public double getDiscountB() {
		return discountB;
	}

	public void setDiscountB(double discountB) {
		this.discountB = discountB;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public int getSinglePoints() {
		return singlePoints;
	}

	public void setSinglePoints(int singlePoints) {
		this.singlePoints = singlePoints;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getListPrice() {
		return listPrice;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}
	
	
}
