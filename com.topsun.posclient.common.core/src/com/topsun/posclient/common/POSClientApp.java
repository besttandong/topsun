package com.topsun.posclient.common;

import java.util.HashMap;
import java.util.Map;

import com.topsun.posclient.datamodel.User;

/**
 * @author Dong
 *
 */
public class POSClientApp {
	
	/**
	 * 
	 */
	static POSClientApp posClientApp;
	
	/**
	 * 
	 */
	private Map<String, Object> contextData = new HashMap<String, Object>();
	
	public static POSClientApp get(){
		if(null == posClientApp){
			return new POSClientApp();
		}
		return posClientApp;
	}
	
	public void saveLoginUser(User loginUser){
		contextData.put(AppConstants.LOGIN_USER, loginUser);
	}
	
	public User getLoginUser(){
		return (User)contextData.get(AppConstants.LOGIN_USER);
	}

}