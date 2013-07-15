package com.topsun.posclient.common;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.topsun.posclient.datamodel.dto.PartSalesDTO;

public class DataAndXMLConvertTest {

	public static void main(String[] args) throws Exception {

		//生成所有结算方式数据文件
//		CashierModeDTO cashierModeDTO = new CashierModeDTO();
//		cashierModeDTO.setCashierModeList(MockDataFactory.createCashierModelList());
//
//		String filePath = DataAndXMLConvertTest.class.getClassLoader()
//				.getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_CASHIERMODE_FILENAME);
//
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(CashierModeDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(cashierModeDTO, fos);
		
//		AdjustRepositoryDTO adjustRepositoryDTO = new AdjustRepositoryDTO();
//		adjustRepositoryDTO.setAdjustRepositoryInfos(MockDataFactory.createAdjustRepositoryInfoList());
//		
//		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_ADJUSTREPOSITORY_PATH + "adjustrepository_data_"
//				+ System.currentTimeMillis() + ".xml");
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(AdjustRepositoryDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(adjustRepositoryDTO, fos);
		
//		ShopDTO shopDTO = MockDataFactory.createShopDTO();
//		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_SHOP_FILENAME);
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(ShopDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(shopDTO, fos);
		
//		ItemDTO itemDTO = MockDataFactory.createItemDTO();
//		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_ITEM_FILENAME);
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(ItemDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(itemDTO, fos);
		
//		UserDTO userDTO = MockDataFactory.createUserDTO();
//		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_USER_FILENAME);
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(UserDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(userDTO, fos);
		
//		AllotStyleDTO allotStyleDTO = MockDataFactory.createAllotStyleDTO();
//		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_ALLOTSTYLE_FILENAME);
//		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(AllotStyleDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(allotStyleDTO, fos);
		
//		AdjustShopDTO adjustShopDTO = MockDataFactory.createAdjustShopDTO();
//		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
//		File file = new File(filePath + AppConstants.DATA_ADJUSTSHOP_PATH+ "adjustShop_data_"+ System.currentTimeMillis() + ".xml");
//		System.out.println(file.getPath());
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(AdjustShopDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(adjustShopDTO, fos);
		
		
		PartSalesDTO partSalesDTO = MockDataFactory.createPartSalesDTO();
		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
		File file = new File(filePath + AppConstants.DATA_PARTSALES_PATH+ "data_PartSales"+ System.currentTimeMillis() + ".xml");
		System.out.println(file.getPath());
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
		JAXBContext context = JAXBContext.newInstance(PartSalesDTO.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(partSalesDTO, fos);
		
	}

}
