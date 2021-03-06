package com.topsun.posclient.system.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.system.MessageResources;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.dao.SyncDataDao;
import com.topsun.posclient.system.service.ISyncDataService;

public class SyncCashierModeDataServiceImpl extends BaseServiceImpl implements ISyncDataService  {
	
	private SyncDataDao syncDataDao = new SyncDataDao();
	
	@Override
	public void syncData(SyncProgress progress,int count)
			throws POSException {
		if(syncDataDao.checkConnection()){
			try {
				syncDataDao.downloadCashierModeData(progress,count);
			} catch (Exception e) {
				throw new POSException(MessageResources.message_error_failer);
			}
		}else{
			throw new POSException(MessageResources.message_error_notconnection);
		}
	}

}
