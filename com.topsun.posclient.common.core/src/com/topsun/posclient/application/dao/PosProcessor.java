package com.topsun.posclient.application.dao;

import java.net.InetAddress;

import com.topsun.posclient.application.common.POSException;

/**
 * ���ݴ���ӿ�
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
	static int timeOut = 3000; //��ʱӦ����3������  
	
	
	/**
	 * �Ƿ�����
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
