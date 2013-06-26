package com.topsun.posclient.application.dao;

import java.net.InetAddress;

import com.topsun.posclient.application.common.POSException;

/**
 * 数据处理接口
 * 
 * 
 * 
 * @author Dong
 *
 */
public class PosProcessor {
	
	LocalProcessor localProcessor = new LocalProcessor();
	
	CallServerProcessor callServerProcessor = new CallServerProcessor();
	
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

	public LocalProcessor getLocalProcessor() {
		return localProcessor;
	}

	public CallServerProcessor getCallServerProcessor() {
		return callServerProcessor;
	}

}
