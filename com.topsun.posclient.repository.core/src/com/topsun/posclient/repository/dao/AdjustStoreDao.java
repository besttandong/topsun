package com.topsun.posclient.repository.dao;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.AdjustStoreDTO;

/**
 * @author Dong
 *
 */
public class AdjustStoreDao extends BaseDao {
	
	/**
	 * @param adjustStoreDTO
	 * @throws Exception
	 */
	public void saveAdjustStore(AdjustStoreDTO adjustStoreDTO) throws Exception {
		this.getLocalProcessor().createXmlFileFromObject(adjustStoreDTO, "data_adjustStore", AppConstants.DATA_ADJUSTSTORE_PATH);
	}

}
