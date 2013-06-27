package com.topsun.posclient.system.service;

import com.topsun.posclient.application.common.service.IBaseService;

/**
 * 数据同步接口
 * 
 * @author Dong
 *
 */
public interface ISyncDataService extends IBaseService {
	
	/**
	 * 同步用户数据
	 * @throws Exception
	 */
	public void syncUserData() throws Exception;
	
	/**
	 * 同步库存数据
	 * @throws Exception
	 */
	public void syncRepositoryData() throws Exception;
	
	/**
	 * 同步所有数据
	 * @throws Exception
	 */
	public void syncAll() throws Exception;

}
