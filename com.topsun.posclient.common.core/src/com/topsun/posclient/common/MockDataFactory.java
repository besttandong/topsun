package com.topsun.posclient.common;

import java.util.ArrayList;
import java.util.List;

import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.AdjustStoreInfo;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.PartSales;

/**
 * ģ�����ݹ���
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
		item1.setItemName("����");
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
		item2.setItemName("�����");
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
		adjustStoreInfo1.setIntoStore("���쳬�г����԰��");
		adjustStoreInfo1.setOutStore("���쳬�ж�ֱ�ŵ�");
		adjustStoreInfo1.setReCheckDate(ProjectUtil.getDate("2013-06-25"));
		adjustStoreInfo1.setVoucherNo("20130625001");
		adjustStoreInfo1.setItemList(createItemList());
		
		AdjustStoreInfo adjustStoreInfo2 = new AdjustStoreInfo();
		adjustStoreInfo2.setCallDate(ProjectUtil.getDate("2013-06-24"));
		adjustStoreInfo2.setCallType("2");
		adjustStoreInfo2.setCheckDate(ProjectUtil.getDate("2013-06-24"));
		adjustStoreInfo2.setItemNum(2);
		adjustStoreInfo2.setId("00102");
		adjustStoreInfo2.setIntoStore("���������г����԰��");
		adjustStoreInfo2.setOutStore("���������ж�ֱ�ŵ�");
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
		adjustRepositoryInfo1.setBackReason("�ز�ԭ��XXXXXXXXXX");
		adjustRepositoryInfo1.setCheckDate(ProjectUtil.getDate("2013-09-08"));
		adjustRepositoryInfo1.setDeliver("����");
		adjustRepositoryInfo1.setOrderNo("20130908001");
		adjustRepositoryInfo1.setReceiveRepository("������ʮ���ֿ̲�");
		adjustRepositoryInfo1.setReCheckDate(ProjectUtil.getDate("2013-09-08"));
		adjustRepositoryInfo1.setRemark("��ע��Ϣ");
		adjustRepositoryInfo1.setStoreName("��������");
		adjustRepositoryInfo1.setItemList(createItemList());
		
		AdjustRepositoryInfo adjustRepositoryInfo2 = new AdjustRepositoryInfo();
		adjustRepositoryInfo2.setId("00102");
		adjustRepositoryInfo2.setBackDate(ProjectUtil.getDate("2013-08-08"));
		adjustRepositoryInfo2.setBackReason("�ز�ԭ��XXXXXXXXXX");
		adjustRepositoryInfo2.setCheckDate(ProjectUtil.getDate("2013-08-08"));
		adjustRepositoryInfo2.setDeliver("����");
		adjustRepositoryInfo2.setOrderNo("20130808001");
		adjustRepositoryInfo2.setReceiveRepository("��������ƽ��ֿ�");
		adjustRepositoryInfo2.setReCheckDate(ProjectUtil.getDate("2013-08-08"));
		adjustRepositoryInfo2.setRemark("��ע��Ϣ");
		adjustRepositoryInfo2.setStoreName("��������");
		adjustRepositoryInfo2.setItemList(createItemList());
		
		List<AdjustRepositoryInfo> adjustRepositoryInfos = new ArrayList<AdjustRepositoryInfo>();
		adjustRepositoryInfos.add(adjustRepositoryInfo1);
		adjustRepositoryInfos.add(adjustRepositoryInfo2);
		
		return adjustRepositoryInfos;
	}
	
	public static List<PartSales> createPartSalesList(){
		PartSales partSales1 = new PartSales();
		partSales1.setApplyUser("����");
		partSales1.setBalloter("����");
		partSales1.setBallotNo("20130627001");
		partSales1.setCardNo("99988722647");
		partSales1.setCheckDate(ProjectUtil.getDate("2013-06-27"));
		partSales1.setChecker("����");
		partSales1.setEnableBalance("200.00");
		partSales1.setEnablePoint("30");
		partSales1.setItemList(createItemList());
		partSales1.setNo("20130627001");
		partSales1.setRemark("��ע��Ϣ");
		partSales1.setSalesDate(ProjectUtil.getDate("2013-06-27"));
		partSales1.setStorename("������ʮ���̵�");
		partSales1.setUserName("��Աһ");
		
		PartSales partSales2 = new PartSales();
		partSales2.setApplyUser("����");
		partSales2.setBalloter("����");
		partSales2.setBallotNo("20130627002");
		partSales2.setCardNo("99988722222");
		partSales2.setCheckDate(ProjectUtil.getDate("2013-06-27"));
		partSales2.setChecker("����");
		partSales2.setEnableBalance("100.00");
		partSales2.setEnablePoint("100");
		partSales2.setItemList(createItemList());
		partSales2.setNo("20130627002");
		partSales2.setRemark("��ע��Ϣ");
		partSales2.setSalesDate(ProjectUtil.getDate("2013-06-27"));
		partSales2.setStorename("������ʮ���̵�");
		partSales2.setUserName("��Ա��");
		
		List<PartSales> partSalesList = new ArrayList<PartSales>();
		partSalesList.add(partSales1);
		partSalesList.add(partSales2);
		
		return partSalesList;
	}
}
