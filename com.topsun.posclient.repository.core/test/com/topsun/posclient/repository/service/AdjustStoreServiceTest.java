package com.topsun.posclient.repository.service;

import junit.framework.TestCase;

import com.topsun.posclient.common.MockDataFactory;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.dto.AdjustStoreDTO;
import com.topsun.posclient.repository.service.impl.AdjustStoreServiceImpl;

public class AdjustStoreServiceTest extends TestCase {

	IAdjustStoreService IAdjustStoreService = new AdjustStoreServiceImpl();
	
	public void testSaveAdjustStoreInfo(){
		
		AdjustStoreDTO adjustStoreDTO = new AdjustStoreDTO();
		adjustStoreDTO.setAdjustStoreInfos(MockDataFactory.createAdjustStoreInfoList());
		
		try {
			IAdjustStoreService.saveAdjustStoreInfo(adjustStoreDTO);
		} catch (POSException e) {
			e.printStackTrace();
		}
	}
}
