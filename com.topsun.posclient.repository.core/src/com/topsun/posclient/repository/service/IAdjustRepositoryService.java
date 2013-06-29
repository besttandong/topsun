package com.topsun.posclient.repository.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.AdjustRepositoryDTO;

/**
 * ���ֽӿ�
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
