package com.topsun.posclient.system.service.impl;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.SettingData;
import com.topsun.posclient.system.service.ISettingService;

/**
 * @author Dong
 * 
 */
public class SettingServiceImpl extends BaseServiceImpl implements ISettingService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.topsun.posclient.system.service.ISettingService#saveSetting(com.topsun
	 * .posclient.datamodel.SettingData)
	 */
	public void saveSetting(SettingData settingData) throws POSException {
		String filepath = ProjectUtil.getRuntimeClassPath()+AppConstants.SEETING_FILE;
		try{
			ProjectUtil.writeProperties(filepath, "serverIP", settingData.getIp());
			ProjectUtil.writeProperties(filepath, "serverPort", settingData.getPort());
		}catch(Exception e){
			e.printStackTrace();
			throw new POSException("保存失败");
		}
	}
}
