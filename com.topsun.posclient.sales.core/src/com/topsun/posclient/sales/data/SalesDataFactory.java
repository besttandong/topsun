package com.topsun.posclient.sales.data;

import java.util.ArrayList;
import java.util.List;

import com.topsun.posclient.application.model.Goods;

public class SalesDataFactory {

	public static List<Goods> initGoodsSales(){
		
		List<Goods> goodsSales = new ArrayList<Goods>();
		Goods goodsSale = new Goods();
		goodsSale.setGoodsName("ГЄаф");
		goodsSale.setAmount(300D);
		goodsSale.setDiscountA(1.5D);
		goodsSale.setDiscountB(20D);
		goodsSale.setGoodsType("a-0975");
		goodsSale.setListPrice("200");
		goodsSale.setNumber(2d);
		goodsSale.setRetailPrice(120.00d);
		goodsSale.setSinglePoints(15);
		goodsSale.setUnitPrice(120.00d);
		goodsSale.setNumber(1D);
		goodsSales.add(goodsSale);
		
//		GoodsSales goodsSale2 = new GoodsSales();
//		goodsSale2.setGoodsName("ЖЬаф");
//		goodsSale2.setAmount(300D);
//		goodsSale2.setDiscountA(1.5D);
//		goodsSale2.setDiscountB(20D);
//		goodsSale2.setGoodsType("b-0975");
//		goodsSale2.setListPrice("200");
//		goodsSale2.setNumber(2d);
//		goodsSale2.setRetailPrice(120.00d);
//		goodsSale2.setSinglePoints(15);
//		goodsSale2.setUnitPrice(120.00d);
//		goodsSale2.setNumber(1D);
//		goodsSales.add(goodsSale2);
		
		return goodsSales;
	}
}
