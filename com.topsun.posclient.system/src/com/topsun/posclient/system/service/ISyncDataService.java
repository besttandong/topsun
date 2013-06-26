package com.topsun.posclient.system.service;

import com.topsun.posclient.application.common.service.IBaseService;

/**
 * ����ͬ���ӿ�
 * 
 * @author Dong
 *
 */
public interface ISyncDataService extends IBaseService {
	
	/**
	 * ͬ���û�����
	 * @throws Exception
	 */
	public void syncUserData() throws Exception;
	
	/**
	 * ͬ���������
	 * @throws Exception
	 */
	public void syncRepositoryData() throws Exception;
	
	/**
	 * ͬ����������
	 * @throws Exception
	 */
	public void syncAll() throws Exception;

}
