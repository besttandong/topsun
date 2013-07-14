package com.topsun.posclient.system.dao;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.system.SyncProgress;
import com.topsun.posclient.system.service.SyncDataListenerManager;

/**
 * 数据同步处理
 * 
 * @author Lilei
 *
 */
public class SyncDataDao extends BaseDao {
	
	
	
	public void downloadUserData(final SyncProgress progress)  {
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------开始同步用户信息-------------!");
				try {
					Thread.sleep(1000);
//					GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
					//		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
					//		IPosWebService webservice = this.getServerCaller().getWebService();
					//		String returnVal = webservice.downloadUserData(userInfoReqStr);

					//		saveLocalFile(AppConstants.DATA_USER_FILENAME, returnVal,bar,infoText);
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------同步用户信息完成-------------!");
			}
		});
		

	}
	
	public void downloadShopData(SyncProgress progress) throws Exception{
		
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------开始同步店铺信息------------!");
				try {
					Thread.sleep(1000);
//					GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//					String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//					IPosWebService webservice = this.getServerCaller().getWebService();
//					String returnVal = webservice.downloadShopData(userInfoReqStr);
//					
//					saveLocalFile(AppConstants.DATA_SHOP_FILENAME, returnVal,bar,infoText);
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------店铺信息同步完成-------------!");
			}
		});
		

	}
	
	public void downloadItemData(SyncProgress progress) throws Exception{
		
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------开始同步商品信息-------------!");
				try {
					Thread.sleep(1000);
					
//					GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//					String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//					IPosWebService webservice = this.getServerCaller().getWebService();
//					String returnVal = webservice.downloadItemData(userInfoReqStr);
//					
//					saveLocalFile(AppConstants.DATA_ITEM_FILENAME, returnVal,bar,infoText);
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------商品信息同步完成-------------!");
			}
		});
		
		

	}
	
	public void downloadCashierModeData(SyncProgress progress) throws Exception{
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------开始同步店铺收银方式-------------!");
				try {
					Thread.sleep(1000);
//					GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//					String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//					IPosWebService webservice = this.getServerCaller().getWebService();
//					String returnVal = webservice.downloadCashierModeData(userInfoReqStr);
//					
//					saveLocalFile(AppConstants.DATA_CASHIERMODE_FILENAME, returnVal,bar,infoText);
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------同步店铺收银方式完成-------------!");
			}
		});
		
	}
	
	public void uploadPartSalesData(SyncProgress progress) throws Exception{
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------开始同步零售信息-------------!");
				try {
					Thread.sleep(1000);
//					File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_PARTSALES_PATH);
//					File[] dataFiles = file.listFiles();
//					for(int i=0; i<dataFiles.length; i++){
//						File dataFile = dataFiles[i];
//						if(dataFile.isFile()){
//							String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//							IPosWebService webservice = this.getServerCaller().getWebService();
//							webservice.savePartSales(saveData);
//						}
//					}
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------同步零售信息完成-------------!");
			}
		});
	}
	
	public void uploadPayRecordData(SyncProgress progress) throws Exception{
		
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------开始同步店铺缴款信息-------------!");
				try {
					Thread.sleep(1000);
//					File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_SHOPPAY_PATH);
//					File[] dataFiles = file.listFiles();
//					for(int i=0; i<dataFiles.length; i++){
//						File dataFile = dataFiles[i];
//						if(dataFile.isFile()){
//							String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//							IPosWebService webservice = this.getServerCaller().getWebService();
//							webservice.saveShopPay(saveData);
//						}
//					}
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------同步店铺缴款信息完成-------------!");
			}
		});
		
	}
	
	public void uploadAdjustShopData(SyncProgress progress) throws Exception{
	
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------同步上传店调店信息-------------!");
				try {
					Thread.sleep(1000);
//					File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTSHOP_PATH);
//					File[] dataFiles = file.listFiles();
//					for(int i=0; i<dataFiles.length; i++){
//						File dataFile = dataFiles[i];
//						if(dataFile.isFile()){
//							String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//							IPosWebService webservice = this.getServerCaller().getWebService();
//							webservice.saveAdjustShop(saveData);
//						}
//					}
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------同步店调店信息完成-------------!");
			}
		});
	}
	
	public void uploadAdjustRepositoryData(SyncProgress progress) throws Exception{
		
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				SyncDataListenerManager.getInstance().fireChange("-----------同步上传回仓信息开始-------------!");
				try {
					Thread.sleep(1000);
//					File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTREPOSITORY_PATH);
//					File[] dataFiles = file.listFiles();
//					for(int i=0; i<dataFiles.length; i++){
//						File dataFile = dataFiles[i];
//						if(dataFile.isFile()){
//							String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//							IPosWebService webservice = this.getServerCaller().getWebService();
//							webservice.saveAdjustRepository(saveData);
//						}
//					}
				} catch (Exception e) {
					throw new RuntimeException();
				}
				SyncDataListenerManager.getInstance().fireChange("-----------同步回仓信息完成-------------!");
			}
		});
		
	}
	
	/*************************************************************************************************/
	public void saveLocalFile(String filepath, String fileContent,SyncProgress progress) throws Exception{
		
		
//		File file = new File(ProjectUtil.getRuntimeClassPath()+filepath);
//    	file.deleteOnExit();
//    	BufferedWriter output = null;
//    	try {
//			file.createNewFile();
//			
//			output = new BufferedWriter(new FileWriter(file));
//		    output.write(fileContent);
//		    
//		} catch (Exception e) {
//			throw new Exception("更新本地离线数据文件失败");
//		}finally{
//			if(null != output){
//				output.close();
//			}
//		}
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
