package com.topsun.posclient.system.dao;

/**
 * @author Lilei
 * 
 */
public class SyncDataTask extends Thread {

	public void run() {
	}

	public void uncaughtException(Thread thread, Throwable e) {
		e.printStackTrace();
	}

}
