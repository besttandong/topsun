package com.topsun.posclient.common.core;

import java.util.ArrayList;
import java.util.List;

public class BarcodeListenetManager {


	private static BarcodeListenetManager keyListenerManager;
	private BarcodeListenetManager(){};

	private List<IBarcodeListener> listeners = new ArrayList<IBarcodeListener>();

	public static  BarcodeListenetManager getInstance(){
		if(keyListenerManager == null){
			keyListenerManager = new BarcodeListenetManager();
			return keyListenerManager;
		}
		return keyListenerManager;
	}

	public void addKeyListener(IBarcodeListener listener){
		listeners.add(listener);
	}

	public void removeListener(IBarcodeListener iKeyListener){
		listeners.remove(iKeyListener);
	}

	public void fireChange(String operationType){
		for (IBarcodeListener keyListener : listeners) {
			keyListener.onChangeBarcode(operationType);
		}
	}


}
