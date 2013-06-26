package com.topsun.posclient.repository.dao;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.dao.LocalProcessor;
import com.topsun.posclient.repository.dto.AdjustStoreDTO;

/**
 * @author Dong
 *
 */
public class AdjustStoreDao extends LocalProcessor {
	
	/**
	 * @param adjustStoreDTO
	 * @throws Exception
	 */
	public void saveAdjustStore(AdjustStoreDTO adjustStoreDTO) throws Exception {
		this.createXmlFileFromObject(adjustStoreDTO, "data_adjustStore", AppConstants.DATA_ADJUSTSTORE_PATH);
	}

}
