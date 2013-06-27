package com.topsun.posclient.repository.dao;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.dao.LocalProcessor;
import com.topsun.posclient.repository.dto.AdjustRepositoryDTO;

/**
 * @author Dong
 *
 */
public class AdjustRepositoryDao extends LocalProcessor {

	/**
	 * @param adjustRepositoryDTO
	 * @throws Exception
	 */
	public void saveAdjustRepository(AdjustRepositoryDTO adjustRepositoryDTO) throws Exception {
		this.createXmlFileFromObject(adjustRepositoryDTO, "data_adjustRepository", AppConstants.DATA_ADJUSTREPOSITORY_PATH);
	}
}
