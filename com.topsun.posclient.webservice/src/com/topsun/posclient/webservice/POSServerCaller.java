package com.topsun.posclient.webservice;

import com.topsun.posclient.webservice.dto.UserCredential;


/**
 * 
 * @author LiLei
 *
 */
public class POSServerCaller {
	
	public static Services getWebService() throws Exception {
		ServicesStub service = new ServicesStub();
		return service;
	}
	
	public static UserCredential getDefaultUserCredential(){
		UserCredential userCredential = new UserCredential();
		userCredential.setUserName("admin");
		userCredential.setPassWord("000000");
		return userCredential;
	}
}

