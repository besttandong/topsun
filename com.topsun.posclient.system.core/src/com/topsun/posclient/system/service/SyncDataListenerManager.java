package com.topsun.posclient.system.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Listener;

import com.topsun.posclient.system.SyncProgress;

/**
 * 监听管理sss
 * @author Administrator
 *
 */
public class SyncDataListenerManager {
	private static SyncDataListenerManager syncListenerManager;
	private SyncDataListenerManager(){};
	
	private List<ISyncDataListener> listeners = new ArrayList<ISyncDataListener>();
	
	public static  SyncDataListenerManager getInstance(){
		if(syncListenerManager == null){
			syncListenerManager = new SyncDataListenerManager();
			return syncListenerManager;
		}
		return syncListenerManager;
	}
	
	public void addKeyListener(ISyncDataListener listener){
		listeners.add(listener);
	}
	
	public void removeListener(ISyncDataListener iKeyListener){
		listeners.remove(iKeyListener);
	}
	
	public void fireChange(String message){
		for (ISyncDataListener keyListener : listeners) {
			keyListener.onChange(message);
		}
	}
	
}
