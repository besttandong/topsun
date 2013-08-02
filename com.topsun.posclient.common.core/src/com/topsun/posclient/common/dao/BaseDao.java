package com.topsun.posclient.common.dao;

import com.topsun.posclient.common.LocalDataProcessor;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.ProjectUtil;

public class BaseDao {
	
	LocalDataProcessor localProcessor = new LocalDataProcessor();

	/**
	 * 
	 * @return
	 * @throws POSException 
	 */
	public boolean checkConnection() {
		return ProjectUtil.checkConnection();
	}


	public LocalDataProcessor getLocalProcessor() {
		return localProcessor;
	}
}
