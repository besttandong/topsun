package com.topsun.posclient.system.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.system.SyncProgress;

/**
 * 
 * @author Dong
 *
 */
public interface ISyncDataService extends IBaseService {
	
	public void syncData(SyncProgress progress) throws POSException;

}
