package com.topsun.posclient.common.dao;

import com.topsun.posclient.common.LocalDataProcessor;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.POSServerCaller;
import com.topsun.posclient.common.ProjectUtil;

public class BaseDao {
	
	LocalDataProcessor localProcessor = new LocalDataProcessor();

	POSServerCaller serverCaller = new POSServerCaller();


	/**
	 * 
	 * @return
	 * @throws POSException 
	 */
	public boolean checkConnection() {
		return ProjectUtil.doCheck();
	}


	public LocalDataProcessor getLocalProcessor() {
		return localProcessor;
	}

	public POSServerCaller getServerCaller() {
		return serverCaller;
	}
}
