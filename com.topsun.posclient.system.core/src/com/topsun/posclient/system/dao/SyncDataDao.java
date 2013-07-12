package com.topsun.posclient.system.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.datamodel.dto.webservice.GetUserInfoReq;

/**
 * @author Lilei
 *
 */
public class SyncDataDao extends BaseDao {
	
	/**
	 * @throws Exception
	 */
	public void syncData() throws Exception{
		new SyncDataTask(){
			public void run() {
					try {
						downloadUserData();
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("--------------------------->>> 更新离线用户数据\n\n\n\n");
			}
		}.start();
		new SyncDataTask(){
			public void run(){
				try {
					downloadShopData();
					System.out.println("--------------------------->>> 更新离线店铺数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		new SyncDataTask(){
			public void run(){
				try {
					downloadItemData();
					System.out.println("--------------------------->>> 更新离线库存数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		new SyncDataTask(){
			public void run(){
				try {
					downloadCashierModeData();
					System.out.println("--------------------------->>> 更新离线结算方式数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new SyncDataTask(){
			public void run(){
				try {
					uploadPartSalesData();
					System.out.println("--------------------------->>> 上传零售数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new SyncDataTask(){
			public void run(){
				try {
					uploadPayRecordData();
					System.out.println("--------------------------->>> 上传缴款记录数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new SyncDataTask(){
			public void run(){
				try {
					uploadAdjustShopData();
					System.out.println("--------------------------->>> 上传调店数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new SyncDataTask(){
			public void run(){
				try {
					uploadAdjustRepositoryData();
					System.out.println("--------------------------->>> 上传回仓数据\n\n\n\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	private void downloadUserData() throws Exception {
		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
		IPosWebService webservice = this.getServerCaller().getWebService();
		String returnVal = webservice.downloadUserData(userInfoReqStr);
		
		saveLocalFile(AppConstants.DATA_USER_FILENAME, returnVal);
	}
	
	private void downloadShopData() throws Exception{
		
		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
		IPosWebService webservice = this.getServerCaller().getWebService();
		String returnVal = webservice.downloadShopData(userInfoReqStr);
		
		saveLocalFile(AppConstants.DATA_SHOP_FILENAME, returnVal);
	}
	
	private void downloadItemData() throws Exception{
		
		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
		IPosWebService webservice = this.getServerCaller().getWebService();
		String returnVal = webservice.downloadItemData(userInfoReqStr);
		
		saveLocalFile(AppConstants.DATA_ITEM_FILENAME, returnVal);
	}
	
	private void downloadCashierModeData() throws Exception{
		GetUserInfoReq userInfoReq = this.getServerCaller().buildUserInfoReq();
		String userInfoReqStr = this.getLocalProcessor().getStringFromObject(userInfoReq);
		IPosWebService webservice = this.getServerCaller().getWebService();
		String returnVal = webservice.downloadCashierModeData(userInfoReqStr);
		
		saveLocalFile(AppConstants.DATA_CASHIERMODE_FILENAME, returnVal);
	}
	
	private void uploadPartSalesData() throws Exception{
		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_PARTSALES_PATH);
		File[] dataFiles = file.listFiles();
		for(int i=0; i<dataFiles.length; i++){
			File dataFile = dataFiles[i];
			if(dataFile.isFile()){
				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
				IPosWebService webservice = this.getServerCaller().getWebService();
				webservice.savePartSales(saveData);
			}
		}
		
	}
	
	private void uploadPayRecordData() throws Exception{
		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_SHOPPAY_PATH);
		File[] dataFiles = file.listFiles();
		for(int i=0; i<dataFiles.length; i++){
			File dataFile = dataFiles[i];
			if(dataFile.isFile()){
				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
				IPosWebService webservice = this.getServerCaller().getWebService();
				webservice.saveShopPay(saveData);
			}
		}
	}
	
	private void uploadAdjustShopData() throws Exception{
		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTSHOP_PATH);
		File[] dataFiles = file.listFiles();
		for(int i=0; i<dataFiles.length; i++){
			File dataFile = dataFiles[i];
			if(dataFile.isFile()){
				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
				IPosWebService webservice = this.getServerCaller().getWebService();
				webservice.saveAdjustShop(saveData);
			}
		}
	}
	
	private void uploadAdjustRepositoryData() throws Exception{
		File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_ADJUSTREPOSITORY_PATH);
		File[] dataFiles = file.listFiles();
		for(int i=0; i<dataFiles.length; i++){
			File dataFile = dataFiles[i];
			if(dataFile.isFile()){
				String saveData = this.getLocalProcessor().getDataFileContent(dataFile);
				IPosWebService webservice = this.getServerCaller().getWebService();
				webservice.saveAdjustRepository(saveData);
			}
		}
	}
	
	/*************************************************************************************************/
	private void saveLocalFile(String filepath, String fileContent) throws Exception{
		File file = new File(ProjectUtil.getRuntimeClassPath()+filepath);
    	file.deleteOnExit();
    	try {
			file.createNewFile();
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
		    output.write(fileContent);
		    output.close();
		} catch (Exception e) {
			throw new Exception("更新本地离线数据文件失败");
		}
	}

}
