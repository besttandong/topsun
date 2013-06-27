package com.topsun.posclient.application.model;

import java.io.Serializable;

/**
 * ��Ʒ��Ϣ
 * 
 * @author Dong
 *
 */
public class Goods implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String goodsName; // ��Ʒ����
	
	private String goodsType; //���
	
	private double unitPrice;// ����
	
	private double discountA;// �ۿ۽��
	
	private double discountB; // �ۿ���
	
	private double amount; // ���
	
	private double number; // ����
	
	private int singlePoints; // ��Ʒ����
	
	private double retailPrice; // ���ۼ�
	
	private String listPrice; //�۸��嵥

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
