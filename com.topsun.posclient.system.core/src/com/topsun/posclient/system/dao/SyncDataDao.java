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
import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.datamodel.dto.webservice.GetUserInfoReq;

/**
 * 数据同步处理
 * 
 * @author Lilei
 *
 */
public class SyncDataDao extends BaseDao {
	
	/**
	 * 数据同步（多线程）
	 * 
	 * @throws Exception
	 */
	public void syncData(final ProgressBar bar ,final Text infoText) throws Exception{
		
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				
				infoText.setText("-----------数据同步开始-------------!");
				try {
					downloadUserData(bar,infoText);
				} catch (Exception e) {
					throw new RuntimeException();
				}
				
				new SyncDataTask(){
					public void run(){
						try {
							downloadShopData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				
					new SyncDataTask(){
						public void run(){
							try {
								downloadShopData(bar,infoText);
							} catch (Exception e) {
								throw new RuntimeException();
							}
						}
					}.start();
					
				
				new SyncDataTask(){
					public void run(){
						try {
							downloadItemData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				new SyncDataTask(){
					public void run(){
						try {
							downloadCashierModeData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				
				new SyncDataTask(){
					public void run(){
						try {
							uploadPartSalesData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				
				new SyncDataTask(){
					public void run(){
						try {
							uploadPayRecordData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				
				new SyncDataTask(){
					public void run(){
						try {
							uploadAdjustShopData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				
				new SyncDataTask(){
					public void run(){
						try {
							uploadAdjustRepositoryData(bar,infoText);
						} catch (Exception e) {
							throw new RuntimeException();
						}
					}
				}.start();
				
			}
		});
	
		createDisplayThread(infoText,"-----------同步完成-----------");
		
	}
	
	private void downloadUserData(ProgressBar bar ,Text infoText) throws Exception {
		
		createDisplayThread(infoText,"-----------开始同步用户信息-------------!");
		Thread.sleep(2000);
		setProgress(bar, 10);
//		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//		IPosWebService webservice = this.getServerCaller().getWebService();
//		String returnVal = webservice.downloadUserData(userInfoReqStr);
		
//		saveLocalFile(AppConstants.DATA_USER_FILENAME, returnVal,bar,infoText);
		
		createDisplayThread(infoText,"-----------同步用户信息完成-------------!");
	}
	
	private void downloadShopData(ProgressBar bar ,final Text infoText) throws Exception{
		Thread.sleep(2000);
		createDisplayThread(infoText, "-----------开始同步店铺信息------------!");
		setProgress(bar, 20);
//		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//		IPosWebService webservice = this.getServerCaller().getWebService();
//		String returnVal = webservice.downloadShopData(userInfoReqStr);
//		
//		saveLocalFile(AppConstants.DATA_SHOP_FILENAME, returnVal,bar,infoText);
		createDisplayThread(infoText, "-----------店铺信息同步完成-------------!");
	}
	
	private void downloadItemData(ProgressBar bar ,Text infoText) throws Exception{
		setProgress(bar, 30);
		createDisplayThread(infoText, "-----------开始同步商品信息-------------!");
		Thread.sleep(2000);
//		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//		IPosWebService webservice = this.getServerCaller().getWebService();
//		String returnVal = webservice.downloadItemData(userInfoReqStr);
//		
//		saveLocalFile(AppConstants.DATA_ITEM_FILENAME, returnVal,bar,infoText);
		createDisplayThread(infoText, "-----------商品信息同步完成-------------!");
	}
	
	private void downloadCashierModeData(ProgressBar bar ,Text infoText) throws Exception{
		createDisplayThread(infoText, "-----------开始同步店铺收银方式-------------!");
		setProgress(bar, 40);
//		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
//		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
//		IPosWebService webservice = this.getServerCaller().getWebService();
//		String returnVal = webservice.downloadCashierModeData(userInfoReqStr);
//		
//		saveLocalFile(AppConstants.DATA_CASHIERMODE_FILENAME, returnVal,bar,infoText);
		
		createDisplayThread(infoText, "-----------同步店铺收银方式完成-------------!");
	}
	
	private void uploadPartSalesData(ProgressBar bar ,Text infoText) throws Exception{
		
		createDisplayThread(infoText, "----------开始同步零售信息-------------!");
		setProgress(bar, 50);
//		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_PARTSALES_PATH);
//		File[] dataFiles = file.listFiles();
//		for(int i=0; i<dataFiles.length; i++){
//			File dataFile = dataFiles[i];
//			if(dataFile.isFile()){
//				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//				IPosWebService webservice = this.getServerCaller().getWebService();
//				webservice.savePartSales(saveData);
//			}
//		}
		createDisplayThread(infoText, "-----------同步零售信息完成-------------!");
		
	}
	
	private void uploadPayRecordData(ProgressBar bar ,Text infoText) throws Exception{

		createDisplayThread(infoText, "-----------开始同步店铺缴款信息-------------!");
		setProgress(bar, 60);
//		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_SHOPPAY_PATH);
//		File[] dataFiles = file.listFiles();
//		for(int i=0; i<dataFiles.length; i++){
//			File dataFile = dataFiles[i];
//			if(dataFile.isFile()){
//				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//				IPosWebService webservice = this.getServerCaller().getWebService();
//				webservice.saveShopPay(saveData);
//			}
//		}
		createDisplayThread(infoText, "-----------同步店铺缴款信息完成-------------!");
	}
	
	private void uploadAdjustShopData(ProgressBar bar ,Text infoText) throws Exception{
		
		setProgress(bar, 70);
		createDisplayThread(infoText, "-----------同步上传店调店信息-------------!");
//		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTSHOP_PATH);
//		File[] dataFiles = file.listFiles();
//		for(int i=0; i<dataFiles.length; i++){
//			File dataFile = dataFiles[i];
//			if(dataFile.isFile()){
//				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//				IPosWebService webservice = this.getServerCaller().getWebService();
//				webservice.saveAdjustShop(saveData);
//			}
//		}
		createDisplayThread(infoText, "-----------同步店调店信息完成-------------!");
	}
	
	private void uploadAdjustRepositoryData(ProgressBar bar ,Text infoText) throws Exception{
		
		setProgress(bar, 80);
		createDisplayThread(infoText, "-----------同步上传回仓信息开始-------------!");
//		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTREPOSITORY_PATH);
//		File[] dataFiles = file.listFiles();
//		for(int i=0; i<dataFiles.length; i++){
//			File dataFile = dataFiles[i];
//			if(dataFile.isFile()){
//				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
//				IPosWebService webservice = this.getServerCaller().getWebService();
//				webservice.saveAdjustRepository(saveData);
//			}
//		}
		createDisplayThread(infoText, "-----------同步回仓信息完成-------------!");
		setProgress(bar, 100);
	}
	
	/*************************************************************************************************/
	private void saveLocalFile(String filepath, String fileContent,ProgressBar bar ,Text infoText) throws Exception{
		
		setProgress(bar, 90);
		createDisplayThread(infoText, "-----------同步本地文件开始-------------!");
		
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
		createDisplayThread(infoText, "-----------同步本地文件完成-------------!");
		setProgress(bar, 100);
	}
	
	private void createDisplayThread(final Text infoText,final String text){
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
	
	private void setProgress(final ProgressBar bar ,final int worked){
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
