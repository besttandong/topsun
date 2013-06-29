package com.topsun.posclient.common.dao;

import java.net.InetAddress;

import com.topsun.posclient.common.LocalDataProcessor;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.POSServerCaller;

public class BaseDao {
	
	LocalDataProcessor localProcessor = new LocalDataProcessor();

	POSServerCaller serverCaller = new POSServerCaller();

	static String host = "10.10.10.9";
	static int timeOut = 3000; //超时应该在3钞以上  


	/**
	 * 是否在线
	 * 
	 * @return
	 * @throws POSException 
	 */
	public boolean checkConnection() {
		return doCheck();
	}

	private boolean doCheck() {
		boolean status = false;
		try {
			status = InetAddress.getByName(host).isReachable(timeOut);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return status;
	}

	public LocalDataProcessor getLocalProcessor() {
		return localProcessor;
	}

	public POSServerCaller getServerCaller() {
		return serverCaller;
	}
}
