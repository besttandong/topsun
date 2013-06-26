package com.topsun.posclient.repository.service;

import junit.framework.TestCase;

import com.topsun.posclient.application.common.MockDataFactory;
import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.repository.dto.AdjustRepositoryDTO;
import com.topsun.posclient.repository.service.impl.AdjustRepositoryServiceImpl;

public class AdjustRepositoryServiceTest extends TestCase {

	IAdjustRepositoryService IAdjustRepositoryService = new AdjustRepositoryServiceImpl();
	
	public void testSaveAdjustRepositoryInfo(){
		
		AdjustRepositoryDTO adjustRepositoryDTO = new AdjustRepositoryDTO();
		adjustRepositoryDTO.setAdjustRepositoryInfos(MockDataFactory.createAdjustRepositoryInfoList());
		
		try {
			IAdjustRepositoryService.saveAdjustRepositoryInfo(adjustRepositoryDTO);
		} catch (POSException e) {
			e.printStackTrace();
		}
	}
}
