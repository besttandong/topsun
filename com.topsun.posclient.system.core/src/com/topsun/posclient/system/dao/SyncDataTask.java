package com.topsun.posclient.system.dao;

import com.topsun.posclient.common.LoggerUtil;
import com.topsun.posclient.system.SystemActivator;

/**
 * @author Lilei
 * 
 */
public class SyncDataTask extends Thread {

	public void run() {
	}

	public void uncaughtException(Thread thread, Throwable e) {
		LoggerUtil.logError(SystemActivator.PLUGIN_ID, "同步失败");
	}

}
