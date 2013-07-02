package com.topsun.posclient.repository.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;

/**
 * 
 * @author Dong
 *
 */
public interface IAdjustShopService extends IBaseService {
	
	/**
	 * @param adjustStoreDTO
	 * @throws POSException
	 */
	public void saveAdjustStoreInfo(AdjustShopDTO adjustStoreDTO) throws POSException;

}
