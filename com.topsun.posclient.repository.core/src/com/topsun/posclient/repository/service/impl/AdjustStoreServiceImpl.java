package com.topsun.posclient.repository.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.dto.AdjustStoreDTO;
import com.topsun.posclient.repository.dao.AdjustStoreDao;
import com.topsun.posclient.repository.service.IAdjustStoreService;

/**
 * 调店服务接口
 * 
 * @author Dong
 *
 */
public class AdjustStoreServiceImpl extends BaseServiceImpl implements IAdjustStoreService {

	AdjustStoreDao adjustStoreDao = new AdjustStoreDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.repository.service.IAdjustStoreService#saveAdjustStoreInfo(com.topsun.posclient.repository.dto.AdjustStoreDTO)
	 */
	public void saveAdjustStoreInfo(AdjustStoreDTO adjustStoreDTO)
			throws POSException {
		try{
			adjustStoreDao.saveAdjustStore(adjustStoreDTO);
		}catch(Exception e){
			e.printStackTrace();
			throw new POSException("调店出错！");
		}
	}

	
}
