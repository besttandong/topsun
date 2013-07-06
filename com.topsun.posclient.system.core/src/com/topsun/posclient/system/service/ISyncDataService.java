package com.topsun.posclient.system.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;

/**
 * 
 * @author Dong
 *
 */
public interface ISyncDataService extends IBaseService {
	
	public void syncData() throws POSException;

}
