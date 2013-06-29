package com.topsun.posclient.repository.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.AdjustStoreDTO;

/**
 * µ÷µê½Ó¿Ú
 * 
 * @author Dong
 *
 */
public interface IAdjustStoreService extends IBaseService {
	
	/**
	 * @param adjustStoreDTO
	 * @throws POSException
	 */
	public void saveAdjustStoreInfo(AdjustStoreDTO adjustStoreDTO) throws POSException;

}
