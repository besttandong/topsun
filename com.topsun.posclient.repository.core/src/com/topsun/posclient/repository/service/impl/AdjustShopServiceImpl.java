package com.topsun.posclient.repository.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.dto.AdjustShopDTO;
import com.topsun.posclient.repository.dao.AdjustShopDao;
import com.topsun.posclient.repository.service.IAdjustShopService;

/**
 * �������ӿ�
 * 
 * @author Dong
 *
 */
public class AdjustShopServiceImpl extends BaseServiceImpl implements IAdjustShopService {

	AdjustShopDao adjustStoreDao = new AdjustShopDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.repository.service.IAdjustStoreService#saveAdjustStoreInfo(com.topsun.posclient.repository.dto.AdjustStoreDTO)
	 */
	public void saveAdjustStoreInfo(AdjustShopDTO adjustStoreDTO)
			throws POSException {
		try{
			adjustStoreDao.saveAdjustStore(adjustStoreDTO);
		}catch(Exception e){
			e.printStackTrace();
			throw new POSException("保存调店数据失败");
		}
	}

	
}
