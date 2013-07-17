package com.topsun.posclient.system.service;

import java.util.Stack;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.system.MessageResources;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.service.impl.SyncAdjustRepositoryDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncAdjustShopDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncCashierModeDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncItemDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncPartSalesDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncPayRecordDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncShopDataServiceImpl;
import com.topsun.posclient.system.service.impl.SyncUserDataServiceImpl;

public class SyncDataManager implements ISyncDataListener{
	
	public Stack<ISyncDataService> syncStack  = new Stack<ISyncDataService>();
	
	public SyncProgress progress;
	
	private static SyncDataManager dataManager;
	
	public static SyncDataManager getInstance(){
		if(dataManager  == null){
			dataManager = new SyncDataManager();
			return dataManager;
		}
		return dataManager;
	}
	
	private SyncDataManager(){
		SyncDataListenerManager.getInstance().addKeyListener(this);
	}
	
	public void doSyncData(final SyncProgress progress) throws POSException{
		this.progress = progress;
		checkRegistrySyncType();
		int size = syncStack.size();
		int count = 0;
		progress.getInfoText().setText("");
		
		progress.getBar().setVisible(true);
		for (int i = 0; i < syncStack.size(); i++) {
			count = count + (100/size);
			syncStack.get(i).syncData(progress,count);
			
		}
		
		syncStack.clear();
		
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				Shell shell = progress.getBar().getShell();
				progress.getBar().setSelection(100);
				MessageDialog.openInformation(shell, MessageResources.message_tips, MessageResources.message_tips_sync_success);
				progress.getBar().setSelection(0);
			}
		});

		
	}
	
	
	private void regsitryService(ISyncDataService dataService){
		syncStack.push(dataService);
	}
	
	public void checkRegistrySyncType(){
		regsitryService(new SyncUserDataServiceImpl());
		regsitryService(new SyncShopDataServiceImpl());
		regsitryService(new SyncPayRecordDataServiceImpl());
		regsitryService(new SyncPartSalesDataServiceImpl());
		regsitryService(new SyncItemDataServiceImpl());
		regsitryService(new SyncCashierModeDataServiceImpl());
		regsitryService(new SyncAdjustRepositoryDataServiceImpl());
		regsitryService(new SyncAdjustShopDataServiceImpl());
	}


	@Override
	public void onChange(final String message,int count) {
		
		String str  = progress.getInfoText().getText() + "\r\n";
		progress.getInfoText().setText(str + message);
		progress.getBar().setSelection(count);
		System.err.println(str + message + "::::::::::" + count);
//		Display.getDefault().asyncExec(new Runnable() {
//			@Override
//			public void run() {
//				
//				
//			}
//		});
	
	}

	@Override
	public void onChange(String message) {
		String str  = progress.getInfoText().getText() + "\r\n";
		progress.getInfoText().setText(str + message);
	}
	
}
