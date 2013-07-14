package com.topsun.posclient.system.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.dao.SyncDataDao;
import com.topsun.posclient.system.service.ISyncDataService;

public class SyncShopDataServiceImpl extends BaseServiceImpl implements ISyncDataService  {
	
	private SyncDataDao syncDataDao = new SyncDataDao();
	
	@Override
	public void syncData(SyncProgress progress)
			throws POSException {
		try {
			syncDataDao.downloadShopData(progress);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
