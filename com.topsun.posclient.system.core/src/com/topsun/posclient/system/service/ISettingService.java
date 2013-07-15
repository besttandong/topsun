package com.topsun.posclient.system.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.SettingData;

/**
 * @author Dong
 *
 */
public interface ISettingService extends IBaseService {
	
	/**
	 * @param settingData
	 * @throws POSException
	 */
	public void saveSetting(SettingData settingData) throws POSException;
	
	/**
	 * 获取系统配置信息
	 * @return
	 * @throws POSException
	 */
	public SettingData getSetting() throws POSException;

}
