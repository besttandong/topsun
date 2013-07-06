package com.topsun.posclient.system.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.system.dao.SyncDataDao;
import com.topsun.posclient.system.service.ISyncDataService;

/**
 * @author LiLei
 * 
 */
public class SyncDataServiceImpl extends BaseServiceImpl implements ISyncDataService {
	
	private SyncDataDao syncDataDao = new SyncDataDao();

	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ISyncDataService#syncData()
	 */
	public void syncData() throws POSException {
		
		try {
			if(syncDataDao.checkConnection()){
				syncDataDao.syncData();
			}else{
				throw new POSException("当前处于离线状态，不能进行数据同步！请尝试连接服务器！");
			}
		} catch (Exception e) {
			throw new POSException("数据同步失败");
		}
	}

}
