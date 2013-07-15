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
		progress.getInfoText().setText("");
		
		int size = syncStack.size();
		int count = 0;
		
		progress.getBar().setVisible(true);
		for (int i = 0; i < syncStack.size(); i++) {
			syncStack.get(i).syncData(progress);
			count = count + (100/size);
			progress.getBar().setSelection(count);
		}
		
		syncStack.clear();
		
		progress.getBar().getSize();
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				Shell shell = progress.getBar().getShell();
				progress.getBar().setSelection(100);
				MessageDialog.openInformation(shell, MessageResources.message_tips, MessageResources.message_tips_sync_success);
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
	public void onChange(final String message) {
		
		String str  = progress.getInfoText().getText() + "\r\n";
		progress.getInfoText().setText(str + message);
		
//		Display.getDefault().asyncExec(new Runnable() {
//			@Override
//			public void run() {
//				
//				
//			}
//		});
	
	}
	
}
