package com.topsun.posclient.repository.service;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.IBaseService;
import com.topsun.posclient.repository.dto.AdjustRepositoryDTO;

/**
 * µ÷²Ö½Ó¿Ú
 * 
 * @author Dong
 *
 */
public interface IAdjustRepositoryService extends IBaseService {

	/**
	 * @param adjustRepositoryDTO
	 * @throws POSException
	 */
	public void saveAdjustRepositoryInfo(AdjustRepositoryDTO adjustRepositoryDTO) throws POSException;
}
