package com.topsun.posclient.sales.service;

import com.topsun.posclient.application.common.MockDataFactory;
import com.topsun.posclient.application.common.POSClientTestCase;
import com.topsun.posclient.sales.dto.PartSalesDTO;
import com.topsun.posclient.sales.service.impl.PartSaleServiceImpl;

public class PartSaleServiceTest extends POSClientTestCase {
	
	IPartSaleService partSaleService = new PartSaleServiceImpl();
	
	/**
	 * 
	 */
	public void testSaveSaleData(){
		try {
			PartSalesDTO salesDTO = new PartSalesDTO();
			salesDTO.setPartSalesList(MockDataFactory.createPartSalesList());
			partSaleService.saveSaleData(salesDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
