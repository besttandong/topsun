package com.topsun.posclient.system.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.system.MessageResources;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.service.ISyncDataService;

/**
 * @author LiLei
 * 
 */
public class SyncDataServiceImpl extends BaseServiceImpl implements ISyncDataService {
	
//	private SyncDataDao syncDataDao = new SyncDataDao();
	

	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ISyncDataService#syncData()
	 */
	public void syncData(SyncProgress progress) throws POSException {
		
		try {
		//	if(syncDataDao.checkConnection()){
//				syncDataDao.syncData(progress);
//			}else{
//				throw new POSException(MessageResources.message_error_notconnection);
//			}
		} catch (Exception e) {
			throw new POSException(MessageResources.message_error_failer);
		}
	}


}
