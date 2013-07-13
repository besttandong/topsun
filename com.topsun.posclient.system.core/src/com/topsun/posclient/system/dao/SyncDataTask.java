package com.topsun.posclient.system.dao;

import com.topsun.posclient.common.LoggerUtil;
import com.topsun.posclient.system.SystemActivator;

/**
 * 数据同步任务
 * 
 * @author Lilei
 * 
 */
public class SyncDataTask extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run() {}

	/**
	 * @param thread
	 * @param e
	 */
	public void uncaughtException(Thread thread, Throwable e) {
		LoggerUtil.logError(SystemActivator.PLUGIN_ID, "同步失败");
	}

}
