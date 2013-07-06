package com.topsun.posclient.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.topsun.posclient.datamodel.AdjustRepositoryInfo;
import com.topsun.posclient.datamodel.AdjustShopInfo;
import com.topsun.posclient.datamodel.CashierModel;
import com.topsun.posclient.datamodel.Function;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.PartSales;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.ItemDTO;
import com.topsun.posclient.datamodel.dto.ShopDTO;
import com.topsun.posclient.datamodel.dto.UserDTO;

/**
 * 模拟数据工厂
 * 
 * @author Dong
 *
 */
public class MockDataFactory {
	
	public static UserDTO createUserDTO() {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserList(createUserList());
		return userDTO;
	}
	
	public static List<Shop> createShopList(){
		List<Shop> shopList = new ArrayList<Shop>();
		Shop shop1 = new Shop();
		shop1.setAccountNO("6225667888900987");
		shop1.setAddress("北京市朝阳区石佛营路");
		shop1.setAreaID(1);
		shop1.setBank("CCB");
		shop1.setBrandList("XXXXXXXXXXXX");
		shop1.setCityAreaID(1);
		shop1.setCityID(1);
		shop1.setControlID("1");
		shop1.setCusEntryID(1);
		shop1.setDepEntryID(1);
		shop1.setDirector("zhangsan");
		shop1.setDtel("18201501085");
		shop1.setEmpDutyID(1);
		shop1.setEmpID(1);
		shop1.setEndTime(new Date());
		shop1.setForbidden("XXXXXXX");
		shop1.setId(1);
		shop1.setIsInvalid(1);
		shop1.setIsStock(1);
		shop1.setPassWord("123456");
		shop1.setPaymentID(1);
		shop1.setStartTime(new Date());
		shop1.setStartDate(new Date());
		shop1.setShpTypeID(1);
		shop1.setShpName("XXXXXX店铺");
		shop1.setShpCode("1");
		shop1.setShpClassID(1);
		shop1.setShopTel("010-98989898");
		shop1.setProvinceID(1);
		
		Shop shop2 = new Shop();
		shop2.setAccountNO("6225667888900987");
		shop2.setAddress("北京市朝阳区石佛营路");
		shop2.setAreaID(2);
		shop2.setBank("CCB");
		shop2.setBrandList("XXXXXXXXXXXX");
		shop2.setCityAreaID(2);
		shop2.setCityID(2);
		shop2.setControlID("2");
		shop2.setCusEntryID(2);
		shop2.setDepEntryID(2);
		shop2.setDirector("zhangsan");
		shop2.setDtel("28202502085");
		shop2.setEmpDutyID(2);
		shop2.setEmpID(2);
		shop2.setEndTime(new Date());
		shop2.setForbidden("XXXXXXX");
		shop2.setId(2);
		shop2.setIsInvalid(2);
		shop2.setIsStock(2);
		shop2.setPassWord("223456");
		shop2.setPaymentID(2);
		shop2.setStartTime(new Date());
		shop2.setStartDate(new Date());
		shop2.setShpTypeID(2);
		shop2.setShpName("XXXXXX店铺");
		shop2.setShpCode("2");
		shop2.setShpClassID(2);
		shop2.setShopTel("010-98989898");
		shop2.setProvinceID(2);
		
		shopList.add(shop1);
		shopList.add(shop2);
		
		return shopList;
	}
	
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
		item1.setRetailPrice(200D);
		item1.setWholesalePrice(300D);
		item1.setUnitId(1);
		item1.setSupplierId(1);
		item1.setStdId(1);
		item1.setSectionId(1);
		item1.setAreaName("华北区");
		item1.setClassName("服饰");
		item1.setSectionName("衬衣");
		item1.setDivisionName("XXXX");
		item1.setBrandName("丹尼尔斯");
		item1.setSupplierName("XXXXXXXXX工厂");
		item1.setNum(200);
		
		Item item2 = new Item();
		item2.setItemName("电风扇");
		item2.setId(1);
		item2.setArea(1);
		item2.setBrandId(1);
		item2.setClassId(1);
		item2.setItemCode("00909787");
		item2.setDivisionId(1);
		item2.setPurchasePrice(200D);
		item2.setRetailPrice(200D);
		item2.setGuidePrice(300D);
		item2.setChannelPrice(200D);
		item2.setWholesalePrice(300D);
		item2.setUnitId(1);
		item2.setSupplierId(1);
		item2.setStdId(1);
		item2.setSectionId(1);
		item2.setAreaName("华东区");
		item2.setClassName("电器");
		item2.setSectionName("小电器");
		item2.setDivisionName("XXXX");
		item2.setBrandName("TCL");
		item2.setSupplierName("XXXXXXXXX工厂");
		item2.setNum(100);
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		
		return itemList;
	}
	
	public static List<AdjustShopInfo> createAdjustShopInfoList(){
		AdjustShopInfo adjustShopInfo1 = new AdjustShopInfo();
		adjustShopInfo1.setCallDate(ProjectUtil.getDate("2013-06-25"));
		adjustShopInfo1.setCallType("1");
		adjustShopInfo1.setCheckDate(ProjectUtil.getDate("2013-06-25"));
		adjustShopInfo1.setItemNum(2);
		adjustShopInfo1.setId("00101");
		adjustShopInfo1.setIntoShop("乐天超市晨光家园店");
		adjustShopInfo1.setOutShop("乐天超市东直门店");
		adjustShopInfo1.setReCheckDate(ProjectUtil.getDate("2013-06-25"));
		adjustShopInfo1.setVoucherNo("20130625001");
		adjustShopInfo1.setItemList(createItemList());
		
		AdjustShopInfo adjustShopInfo2 = new AdjustShopInfo();
		adjustShopInfo2.setCallDate(ProjectUtil.getDate("2013-06-24"));
		adjustShopInfo2.setCallType("2");
		adjustShopInfo2.setCheckDate(ProjectUtil.getDate("2013-06-24"));
		adjustShopInfo2.setItemNum(2);
		adjustShopInfo2.setId("00102");
		adjustShopInfo2.setIntoShop("美廉美超市晨光家园店");
		adjustShopInfo2.setOutShop("美廉美超市东直门店");
		adjustShopInfo2.setReCheckDate(ProjectUtil.getDate("2013-06-24"));
		adjustShopInfo2.setVoucherNo("20130625002");
		adjustShopInfo2.setItemList(createItemList());
		
		List<AdjustShopInfo> adjustShopInfos = new ArrayList<AdjustShopInfo>();
		adjustShopInfos.add(adjustShopInfo1);
		adjustShopInfos.add(adjustShopInfo2);
		
		return adjustShopInfos;
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
		adjustRepositoryInfo1.setShopName("物美超市");
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
		adjustRepositoryInfo2.setShopName("物美超市");
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
		partSales1.setShopName("朝阳区十里铺店");
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
		partSales2.setShopName("朝阳区十里铺店");
		partSales2.setUserName("会员二");
		
		List<PartSales> partSalesList = new ArrayList<PartSales>();
		partSalesList.add(partSales1);
		partSalesList.add(partSales2);
		
		return partSalesList;
	}
	
	/**
	 * 创建用户数据
	 * 
	 * @return
	 */
	public static List<User> createUserList(){
		Function child1 = new Function();
		child1.setId(3);
		child1.setActionURL("com.topsun.posclient.sales.PartSalesView");
		child1.setFunctionName("零售");
		child1.setDescription("功能描述");
		
		Function child2 = new Function();
		child2.setId(4);
		child2.setActionURL("com.topsun.posclient.sales.ReceiveView");
		child2.setFunctionName("收款");
		child2.setDescription("功能描述");
		
		Function child3 = new Function();
		child3.setId(5);
		child3.setActionURL("com.topsun.posclient.sales.PaymentView");
		child3.setFunctionName("付款");
		child3.setDescription("功能描述");
		
		List<Function> childs1 = new ArrayList<Function>();
		childs1.add(child1);
		
		List<Function> childs2 = new ArrayList<Function>();
		childs2.add(child2);
		childs2.add(child3);
		
		Function function1 = new Function();
		function1.setId(1);
		function1.setActionURL("com.topsun.posclient.sales");
		function1.setFunctionName("销售模块");
		function1.setDescription("功能描述");
		function1.setChilds(childs1);
		
		Function function2 = new Function();
		function2.setId(2);
		function2.setActionURL("com.topsun.posclient.finance");
		function2.setFunctionName("财务模块");
		function2.setDescription("功能描述");
		function2.setChilds(childs2);
		
		List<Function> functionList = new ArrayList<Function>();
		functionList.add(function1);
		functionList.add(function2);
		
		
		List<User> userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setUserCode("10010");
		user1.setUserName("zhangsan");
		user1.setDeptId(1);
		user1.setDeptName("营业部");
		user1.setEmployeeId(1);
		user1.setEmployeeName("张三");
		user1.setPassWord("123456");
		user1.setFunctionList(functionList);
		
		User user2 = new User();
		user2.setId(2);
		user2.setUserCode("10010");
		user2.setUserName("lisi");
		user2.setDeptId(1);
		user2.setDeptName("营业部");
		user2.setEmployeeId(1);
		user2.setEmployeeName("李四");
		user2.setPassWord("123456");
		user2.setFunctionList(functionList);
		
		userList.add(user1);
		userList.add(user2);
		return userList;
	}
	
	public static List<CashierModel> createCashierModelList(){
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
	
	public static ItemDTO createItemDTO(){
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setItemList(createItemList());
		return itemDTO;
	}
	
	public static ShopDTO createShopDTO(){
		ShopDTO shopDTO = new ShopDTO();
		shopDTO.setShopList(createShopList());
		return shopDTO;
	}
}
