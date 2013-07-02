package com.topsun.posclient.common;

import java.util.ArrayList;
import java.util.List;

import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.AdjustStoreInfo;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.PartSales;

/**
 * 模拟数据工厂
 * 
 * @author Dong
 *
 */
public class MockDataFactory {
	
	public static List<Item> createItemList(){
		Item item1 = new Item();
		item1.setId(1);
		item1.setArea(1);
		item1.setBrandId(1);
		item1.setClassId(1);
		item1.setItemCode("00909787");
		item1.setItemName("长袖");
		item1.setDivisionId(1);
		item1.setPurchasePrice(200D);
		item1.setGuidePrice(300D);
		item1.setChannelPrice(200D);
		item1.setWholesalePrice(300D);
		item1.setUnitId(1);
		item1.setSupplierId(1);
		item1.setStdId(1);
		item1.setSectionId(1);
		
		Item item2 = new Item();
		item2.setItemName("电风扇");
		item2.setId(1);
		item2.setArea(1);
		item2.setBrandId(1);
		item2.setClassId(1);
		item2.setItemCode("00909787");
		item2.setDivisionId(1);
		item2.setPurchasePrice(200D);
		item2.setGuidePrice(300D);
		item2.setChannelPrice(200D);
		item2.setWholesalePrice(300D);
		item2.setUnitId(1);
		item2.setSupplierId(1);
		item2.setStdId(1);
		item2.setSectionId(1);
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		
		return itemList;
	}
	
	public static List<AdjustStoreInfo> createAdjustStoreInfoList(){
		AdjustStoreInfo adjustStoreInfo1 = new AdjustStoreInfo();
		adjustStoreInfo1.setCallDate(ProjectUtil.getDate("2013-06-25"));
		adjustStoreInfo1.setCallType("1");
		adjustStoreInfo1.setCheckDate(ProjectUtil.getDate("2013-06-25"));
		adjustStoreInfo1.setItemNum(2);
		adjustStoreInfo1.setId("00101");
		adjustStoreInfo1.setIntoStore("乐天超市晨光家园店");
		adjustStoreInfo1.setOutStore("乐天超市东直门店");
		adjustStoreInfo1.setReCheckDate(ProjectUtil.getDate("2013-06-25"));
		adjustStoreInfo1.setVoucherNo("20130625001");
		adjustStoreInfo1.setItemList(createItemList());
		
		AdjustStoreInfo adjustStoreInfo2 = new AdjustStoreInfo();
		adjustStoreInfo2.setCallDate(ProjectUtil.getDate("2013-06-24"));
		adjustStoreInfo2.setCallType("2");
		adjustStoreInfo2.setCheckDate(ProjectUtil.getDate("2013-06-24"));
		adjustStoreInfo2.setItemNum(2);
		adjustStoreInfo2.setId("00102");
		adjustStoreInfo2.setIntoStore("美廉美超市晨光家园店");
		adjustStoreInfo2.setOutStore("美廉美超市东直门店");
		adjustStoreInfo2.setReCheckDate(ProjectUtil.getDate("2013-06-24"));
		adjustStoreInfo2.setVoucherNo("20130625002");
		adjustStoreInfo2.setItemList(createItemList());
		
		List<AdjustStoreInfo> adjustStoreInfos = new ArrayList<AdjustStoreInfo>();
		adjustStoreInfos.add(adjustStoreInfo1);
		adjustStoreInfos.add(adjustStoreInfo2);
		
		return adjustStoreInfos;
	}
	
	
	public static List<AdjustRepositoryInfo> createAdjustRepositoryInfoList(){
		AdjustRepositoryInfo adjustRepositoryInfo1 = new AdjustRepositoryInfo();
		adjustRepositoryInfo1.setId("00101");
		adjustRepositoryInfo1.setBackDate(ProjectUtil.getDate("2013-09-08"));
		adjustRepositoryInfo1.setBackReason("回仓原因XXXXXXXXXX");
		adjustRepositoryInfo1.setCheckDate(ProjectUtil.getDate("2013-09-08"));
		adjustRepositoryInfo1.setDeliver("张三");
		adjustRepositoryInfo1.setOrderNo("20130908001");
		adjustRepositoryInfo1.setReceiveRepository("朝阳区十里铺仓库");
		adjustRepositoryInfo1.setReCheckDate(ProjectUtil.getDate("2013-09-08"));
		adjustRepositoryInfo1.setRemark("备注信息");
		adjustRepositoryInfo1.setStoreName("物美超市");
		adjustRepositoryInfo1.setItemList(createItemList());
		
		AdjustRepositoryInfo adjustRepositoryInfo2 = new AdjustRepositoryInfo();
		adjustRepositoryInfo2.setId("00102");
		adjustRepositoryInfo2.setBackDate(ProjectUtil.getDate("2013-08-08"));
		adjustRepositoryInfo2.setBackReason("回仓原因XXXXXXXXXX");
		adjustRepositoryInfo2.setCheckDate(ProjectUtil.getDate("2013-08-08"));
		adjustRepositoryInfo2.setDeliver("李四");
		adjustRepositoryInfo2.setOrderNo("20130808001");
		adjustRepositoryInfo2.setReceiveRepository("东城区和平里仓库");
		adjustRepositoryInfo2.setReCheckDate(ProjectUtil.getDate("2013-08-08"));
		adjustRepositoryInfo2.setRemark("备注信息");
		adjustRepositoryInfo2.setStoreName("物美超市");
		adjustRepositoryInfo2.setItemList(createItemList());
		
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
		partSales1.setCheckDate(ProjectUtil.getDate("2013-06-27"));
		partSales1.setChecker("张三");
		partSales1.setEnableBalance("200.00");
		partSales1.setEnablePoint("30");
		partSales1.setItemList(createItemList());
		partSales1.setNo("20130627001");
		partSales1.setRemark("备注信息");
		partSales1.setSalesDate(ProjectUtil.getDate("2013-06-27"));
		partSales1.setStorename("朝阳区十里铺店");
		partSales1.setUserName("会员一");
		
		PartSales partSales2 = new PartSales();
		partSales2.setApplyUser("张三");
		partSales2.setBalloter("李四");
		partSales2.setBallotNo("20130627002");
		partSales2.setCardNo("99988722222");
		partSales2.setCheckDate(ProjectUtil.getDate("2013-06-27"));
		partSales2.setChecker("张三");
		partSales2.setEnableBalance("100.00");
		partSales2.setEnablePoint("100");
		partSales2.setItemList(createItemList());
		partSales2.setNo("20130627002");
		partSales2.setRemark("备注信息");
		partSales2.setSalesDate(ProjectUtil.getDate("2013-06-27"));
		partSales2.setStorename("朝阳区十里铺店");
		partSales2.setUserName("会员二");
		
		List<PartSales> partSalesList = new ArrayList<PartSales>();
		partSalesList.add(partSales1);
		partSalesList.add(partSales2);
		
		return partSalesList;
	}
	
	public List<CashierModel> createCashierModelList(){
		CashierModel model1 = new CashierModel();
		model1.setId(1);
		model1.setTypeName("现金");
		CashierModel model2 = new CashierModel();
		model2.setId(2);
		model2.setTypeName("银行卡");
		CashierModel model3 = new CashierModel();
		model3.setId(3);
		model3.setTypeName("支票");
		CashierModel model4 = new CashierModel();
		model4.setId(4);
		model4.setTypeName("代金券");
		
		List<CashierModel> cashierModeList = new ArrayList<CashierModel>();
		cashierModeList.add(model1);
		cashierModeList.add(model2);
		cashierModeList.add(model3);
		cashierModeList.add(model4);
		return cashierModeList;
	}
}
