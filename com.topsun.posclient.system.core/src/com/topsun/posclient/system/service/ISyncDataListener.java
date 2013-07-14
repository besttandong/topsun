package com.topsun.posclient.system.service;

import com.topsun.posclient.system.SyncProgress;

/**
 * 键盘监听接口 
 * @author Administrator
 *
 */
public interface ISyncDataListener{
	
	void onChange(String message);

}
