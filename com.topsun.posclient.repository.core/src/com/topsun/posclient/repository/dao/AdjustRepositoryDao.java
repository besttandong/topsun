package com.topsun.posclient.repository.dao;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.AdjustRepositoryDTO;

/**
 * @author Dong
 *
 */
public class AdjustRepositoryDao extends BaseDao {

	/**
	 * @param adjustRepositoryDTO
	 * @throws Exception
	 */
	public void saveAdjustRepository(AdjustRepositoryDTO adjustRepositoryDTO) throws Exception {
		this.getLocalProcessor().createXmlFileFromObject(adjustRepositoryDTO, "data_adjustRepository", AppConstants.DATA_ADJUSTREPOSITORY_PATH);
	}
}
