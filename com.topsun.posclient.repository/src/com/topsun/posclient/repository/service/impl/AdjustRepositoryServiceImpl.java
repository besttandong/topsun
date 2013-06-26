package com.topsun.posclient.repository.service.impl;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.repository.dao.AdjustRepositoryDao;
import com.topsun.posclient.repository.dto.AdjustRepositoryDTO;
import com.topsun.posclient.repository.service.IAdjustRepositoryService;

/**
 * 调仓接口实现
 * 
 * @author Dong
 *
 */
public class AdjustRepositoryServiceImpl extends BaseServiceImpl implements IAdjustRepositoryService {

	AdjustRepositoryDao adjustRepositoryDao = new AdjustRepositoryDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.repository.service.IAdjustRepositoryService#saveAdjustRepositoryInfo(com.topsun.posclient.repository.dto.AdjustRepositoryDTO)
	 */
	public void saveAdjustRepositoryInfo(AdjustRepositoryDTO adjustRepositoryDTO)
			throws POSException {
		try {
			adjustRepositoryDao.saveAdjustRepository(adjustRepositoryDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new POSException("调仓出错！");
		}
	}

	
	
}
