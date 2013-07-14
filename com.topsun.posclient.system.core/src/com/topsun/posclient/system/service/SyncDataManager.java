package com.topsun.posclient.system.service;

import java.util.Stack;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.topsun.posclient.common.POSException;
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
	
	public String syncType;
	public static final String SYNC_ALL = "所有";
	public static final String SYNC_RESPOITORY = "库存";
	public static final String SYNC_CASHIER_MODE = "促销方案";
	public static final String SYNC_USER_DATA = "用户数据";
	
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
	
	
	public String getSyncType() {
		return syncType;
	}

	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	public void doSyncData(final SyncProgress progress) throws POSException{
		this.progress = progress;
		checkRegistrySyncType(syncType);
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
				MessageDialog.openInformation(shell, "提示", "同步完成");
			}
		});

		
	}
	
	
	private void regsitryService(ISyncDataService dataService){
		syncStack.push(dataService);
	}
	
	public void checkRegistrySyncType(String syncType){
		if(syncType.equals(SYNC_ALL)){
			
			regsitryService(new SyncUserDataServiceImpl());
			regsitryService(new SyncShopDataServiceImpl());
			regsitryService(new SyncPayRecordDataServiceImpl());
			regsitryService(new SyncPartSalesDataServiceImpl());
			regsitryService(new SyncItemDataServiceImpl());
			regsitryService(new SyncCashierModeDataServiceImpl());
			regsitryService(new SyncAdjustRepositoryDataServiceImpl());
			regsitryService(new SyncAdjustShopDataServiceImpl());
			
		}
		
		if(syncType.equals(SYNC_RESPOITORY)){
			regsitryService(new SyncAdjustRepositoryDataServiceImpl());
			regsitryService(new SyncAdjustShopDataServiceImpl());
		}
		
		if(syncType.equals(SYNC_CASHIER_MODE)){
			regsitryService(new SyncCashierModeDataServiceImpl());
		}
		
		if(syncType.equals(SYNC_USER_DATA)){
			regsitryService(new SyncUserDataServiceImpl());
			regsitryService(new SyncShopDataServiceImpl());
		}
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
