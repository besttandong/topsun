package com.topsun.posclient.application.common;

import java.util.ArrayList;
import java.util.List;

import com.topsun.posclient.application.model.AdjustRepositoryInfo;
import com.topsun.posclient.application.model.AdjustStoreInfo;
import com.topsun.posclient.application.model.Goods;
import com.topsun.posclient.application.model.PartSales;

/**
 * 模拟数据工厂
 * 
 * @author Dong
 *
 */
public class MockDataFactory {
	
	public static List<Goods> createGoodsList(){
		Goods goods1 = new Goods();
		goods1.setGoodsName("长袖");
		goods1.setAmount(300D);
		goods1.setDiscountA(1.5D);
		goods1.setDiscountB(20D);
		goods1.setGoodsType("a-0975");
		goods1.setListPrice("200");
		goods1.setNumber(2d);
		goods1.setRetailPrice(120.00d);
		goods1.setSinglePoints(15);
		goods1.setUnitPrice(120.00d);
		goods1.setNumber(1D);
		
		Goods goods2 = new Goods();
		goods2.setGoodsName("电风扇");
		goods2.setAmount(80D);
		goods2.setDiscountA(1.5D);
		goods2.setDiscountB(20D);
		goods2.setGoodsType("a-0975");
		goods2.setListPrice("200");
		goods2.setNumber(2d);
		goods2.setRetailPrice(70.00d);
		goods2.setSinglePoints(15);
		goods2.setUnitPrice(70.00d);
		goods2.setNumber(1D);
		
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(goods1);
		goodsList.add(goods2);
		
		return goodsList;
	}
	
	public static List<AdjustStoreInfo> createAdjustStoreInfoList(){
		AdjustStoreInfo adjustStoreInfo1 = new AdjustStoreInfo();
		adjustStoreInfo1.setCallDate("2013-06-25");
		adjustStoreInfo1.setCallType("1");
		adjustStoreInfo1.setCheckDate("2013-06-25");
		adjustStoreInfo1.setGoodsNum(2);
		adjustStoreInfo1.setId("00101");
		adjustStoreInfo1.setIntoStore("乐天超市晨光家园店");
		adjustStoreInfo1.setOutStore("乐天超市东直门店");
		adjustStoreInfo1.setReCheckDate("2013-06-25");
		adjustStoreInfo1.setVoucherNo("20130625001");
		adjustStoreInfo1.setGoodsList(createGoodsList());
		
		AdjustStoreInfo adjustStoreInfo2 = new AdjustStoreInfo();
		adjustStoreInfo2.setCallDate("2013-06-24");
		adjustStoreInfo2.setCallType("2");
		adjustStoreInfo2.setCheckDate("2013-06-24");
		adjustStoreInfo2.setGoodsNum(2);
		adjustStoreInfo2.setId("00102");
		adjustStoreInfo2.setIntoStore("美廉美超市晨光家园店");
		adjustStoreInfo2.setOutStore("美廉美超市东直门店");
		adjustStoreInfo2.setReCheckDate("2013-06-24");
		adjustStoreInfo2.setVoucherNo("20130625002");
		adjustStoreInfo2.setGoodsList(createGoodsList());
		
		List<AdjustStoreInfo> adjustStoreInfos = new ArrayList<AdjustStoreInfo>();
		adjustStoreInfos.add(adjustStoreInfo1);
		adjustStoreInfos.add(adjustStoreInfo2);
		
		return adjustStoreInfos;
	}
	
	
	public static List<AdjustRepositoryInfo> createAdjustRepositoryInfoList(){
		AdjustRepositoryInfo adjustRepositoryInfo1 = new AdjustRepositoryInfo();
		adjustRepositoryInfo1.setId("00101");
		adjustRepositoryInfo1.setBackDate("2013-09-08");
		adjustRepositoryInfo1.setBackReason("回仓原因XXXXXXXXXX");
		adjustRepositoryInfo1.setCheckDate("2013-09-08");
		adjustRepositoryInfo1.setDeliver("张三");
		adjustRepositoryInfo1.setOrderNo("20130908001");
		adjustRepositoryInfo1.setReceiveRepository("朝阳区十里铺仓库");
		adjustRepositoryInfo1.setReCheckDate("2013-09-08");
		adjustRepositoryInfo1.setRemark("备注信息");
		adjustRepositoryInfo1.setStoreName("物美超市");
		adjustRepositoryInfo1.setGoodsList(createGoodsList());
		
		AdjustRepositoryInfo adjustRepositoryInfo2 = new AdjustRepositoryInfo();
		adjustRepositoryInfo2.setId("00102");
		adjustRepositoryInfo2.setBackDate("2013-08-08");
		adjustRepositoryInfo2.setBackReason("回仓原因XXXXXXXXXX");
		adjustRepositoryInfo2.setCheckDate("2013-08-08");
		adjustRepositoryInfo2.setDeliver("李四");
		adjustRepositoryInfo2.setOrderNo("20130808001");
		adjustRepositoryInfo2.setReceiveRepository("东城区和平里仓库");
		adjustRepositoryInfo2.setReCheckDate("2013-08-08");
		adjustRepositoryInfo2.setRemark("备注信息");
		adjustRepositoryInfo2.setStoreName("物美超市");
		adjustRepositoryInfo2.setGoodsList(createGoodsList());
		
		List<AdjustRepositoryInfo> adjustRepositoryInfos = new ArrayList<AdjustRepositoryInfo>();
		adjustRepositoryInfos.add(adjustRepositoryInfo1);
		adjustRepositoryInfos.add(adjustRepositoryInfo2);
		
		return adjustRepositoryInfos;
	}
	
	public static List<PartSales> createPartSalesList(){
		PartSales partSales1 = new PartSales();
		partSales1.setApplyUser("张三");
		partSales1.setBalloter("李四");
		partSales1.setBallotNo("20130627001");
		partSales1.setCardNo("99988722647");
		partSales1.setCheckDate("2013-06-27");
		partSales1.setChecker("张三");
		partSales1.setEnableBalance("200.00");
		partSales1.setEnablePoint("30");
		partSales1.setGoodsSales(createGoodsList());
		partSales1.setNo("20130627001");
		partSales1.setRemark("备注信息");
		partSales1.setSalesDate("2013-06-27");
		partSales1.setStorename("朝阳区十里铺店");
		partSales1.setUserName("会员一");
		
		PartSales partSales2 = new PartSales();
		partSales2.setApplyUser("张三");
		partSales2.setBalloter("李四");
		partSales2.setBallotNo("20130627002");
		partSales2.setCardNo("99988722222");
		partSales2.setCheckDate("2013-06-27");
		partSales2.setChecker("张三");
		partSales2.setEnableBalance("100.00");
		partSales2.setEnablePoint("100");
		partSales2.setGoodsSales(createGoodsList());
		partSales2.setNo("20130627002");
		partSales2.setRemark("备注信息");
		partSales2.setSalesDate("2013-06-27");
		partSales2.setStorename("朝阳区十里铺店");
		partSales2.setUserName("会员二");
		
		List<PartSales> partSalesList = new ArrayList<PartSales>();
		partSalesList.add(partSales1);
		partSalesList.add(partSales2);
		
		return partSalesList;
	}
}
