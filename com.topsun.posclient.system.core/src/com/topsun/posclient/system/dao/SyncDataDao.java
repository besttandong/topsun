package com.topsun.posclient.system.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.system.MessageResources;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.service.SyncDataListenerManager;

/**
 * 数据同步处理
 * 
 * @author Lilei
 *
 */
public class SyncDataDao extends BaseDao {
	
	public void downloadUserData(final SyncProgress progress,final int count) throws Exception  {
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncuser);
					try {
//						GetUserInfo getUserInfo = getServerCaller().buildGetUserInfo();
//						String userInfoReqStr = getLocalProcessor().getStringFromObject(getUserInfo);
//						IPosWebService webservice = getServerCaller().getWebService();
//						String returnVal = webservice.downloadUserData(userInfoReqStr);
//
//						saveLocalFile(AppConstants.DATA_USER_FILENAME, returnVal);
						
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncuser,count);
				}
			});
	}
	
	public void downloadShopData(SyncProgress progress,final int count) throws Exception{
		
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncshop);
					try {
//						GetUserInfo getUserInfo = getServerCaller().buildGetUserInfo();
//						String userInfoReqStr = getLocalProcessor().getStringFromObject(getUserInfo);
//						IPosWebService webservice = getServerCaller().getWebService();
//						String returnVal = webservice.downloadShopData(userInfoReqStr);
//						
//						saveLocalFile(AppConstants.DATA_SHOP_FILENAME, returnVal);
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncshop,count);
				}
			});
	}
	
	public void downloadItemData(SyncProgress progress,final int count) throws Exception{
		
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncitem);
					try {
//						GetUserInfo getUserInfo = getServerCaller().buildGetUserInfo();
//						String userInfoReqStr = getLocalProcessor().getStringFromObject(getUserInfo);
//						IPosWebService webservice = getServerCaller().getWebService();
//						String returnVal = webservice.downloadItemData(userInfoReqStr);
//						
//						saveLocalFile(AppConstants.DATA_ITEM_FILENAME, returnVal);
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncitem,count);
				}
			});
	}
	
	public void downloadCashierModeData(SyncProgress progress,final int count) throws Exception{
		
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsynccashiermode);
					try {
//						GetUserInfo getUserInfo = getServerCaller().buildGetUserInfo();
//						String userInfoReqStr = getLocalProcessor().getStringFromObject(getUserInfo);
//						IPosWebService webservice = getServerCaller().getWebService();
//						String returnVal = webservice.downloadCashierModeData(userInfoReqStr);
//						
//						saveLocalFile(AppConstants.DATA_CASHIERMODE_FILENAME, returnVal);
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsynccashiermode,count);
				}
			});
	}
	
	public void uploadPartSalesData(SyncProgress progress,final int count) throws Exception{
		
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncsales);
					try {
						File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_PARTSALES_PATH);
						File[] dataFiles = file.listFiles();
						for(int i=0; i<dataFiles.length; i++){
							File dataFile = dataFiles[i];
							if(dataFile.isFile()){
//								String saveData = getLocalProcessor().getDataFileContent(dataFile);
//								IPosWebService webservice = getServerCaller().getWebService();
//								webservice.savePartSales(saveData);
							}
						}
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncsales,count);
				}
			});
	}
	
	public void uploadPayRecordData(SyncProgress progress,final int count) throws Exception{
		
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncpayment);
					try {
						File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_SHOPPAY_PATH);
						File[] dataFiles = file.listFiles();
						for(int i=0; i<dataFiles.length; i++){
							File dataFile = dataFiles[i];
							if(dataFile.isFile()){
//								String saveData = getLocalProcessor().getDataFileContent(dataFile);
//								IPosWebService webservice = getServerCaller().getWebService();
//								webservice.saveShopPay(saveData);
							}
						}
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncpayment,count);
				}
			});
	}
	
	public void uploadAdjustShopData(SyncProgress progress,final int count) throws Exception{
	
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncadjustshop);
					try {
						File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTSHOP_PATH);
						File[] dataFiles = file.listFiles();
						for(int i=0; i<dataFiles.length; i++){
							File dataFile = dataFiles[i];
							if(dataFile.isFile()){
//								String saveData = getLocalProcessor().getDataFileContent(dataFile);
//								IPosWebService webservice = getServerCaller().getWebService();
//								webservice.saveAdjustShop(saveData);
							}
						}
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncadjustshop,count);
				}
			});
	}
	
	public void uploadAdjustRepositoryData(SyncProgress progress,final int count) throws Exception{
		
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_startsyncadjustrepository);
					try {
						File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTREPOSITORY_PATH);
						File[] dataFiles = file.listFiles();
						for(int i=0; i<dataFiles.length; i++){
							File dataFile = dataFiles[i];
							if(dataFile.isFile()){
//								String saveData = getLocalProcessor().getDataFileContent(dataFile);
//								IPosWebService webservice = getServerCaller().getWebService();
//								webservice.saveAdjustRepository(saveData);
							}
						}
					} catch (Exception e) {
						throw new RuntimeException();
					}
					SyncDataListenerManager.getInstance().fireChange("---------------> "+MessageResources.message_tips_endsyncadjustrepository,count);
				}
			});
		
	}
	
	/*************************************************************************************************/
	public void saveLocalFile(String filepath, String fileContent) throws Exception{
		File file = new File(ProjectUtil.getRuntimeClassPath()+filepath);
    	file.deleteOnExit();
    	BufferedWriter output = null;
    	try {
			file.createNewFile();
			
			output = new BufferedWriter(new FileWriter(file));
		    output.write(fileContent);
		    
		} catch (Exception e) {
			throw new Exception(MessageResources.message_tips_sync_failer);
		}finally{
			if(null != output){
				output.close();
			}
		}
	}
	
	public void createDisplayThread(final Text infoText,final String text){
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				{
					String str  = infoText.getText() + "\r\n";
					infoText.setText(str + text);
				}
				
			}
		});
	}
	
	public void setProgress(final ProgressBar bar ,final int worked){
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				{
					bar.setSelection(worked);
				}

			}
		});
	}

}
