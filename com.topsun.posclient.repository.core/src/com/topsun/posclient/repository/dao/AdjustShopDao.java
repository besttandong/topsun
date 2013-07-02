package com.topsun.posclient.repository.dao;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;

/**
 * @author Dong
 *
 */
public class AdjustShopDao extends BaseDao {
	
	/**
	 * @param adjustStoreDTO
	 * @throws Exception
	 */
	public void saveAdjustStore(AdjustShopDTO adjustStoreDTO) throws Exception {
		this.getLocalProcessor().createXmlFileFromObject(adjustStoreDTO, "data_adjustStore", AppConstants.DATA_ADJUSTSTORE_PATH);
	}

}
