package com.topsun.posclient.system.service;

/**
 * 键盘监听接口 
 * @author Administrator
 *
 */
public interface ISyncDataListener{
	
	void onChange(String message,int count);
	
	void onChange(String message);

}
