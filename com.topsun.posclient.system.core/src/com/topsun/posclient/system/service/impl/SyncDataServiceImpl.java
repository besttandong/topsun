package com.topsun.posclient.system.service.impl;

import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.system.service.ISyncDataService;

/**
 * 同步数据服务实现
 * @author Dong
 * 
 */
public class SyncDataServiceImpl extends BaseServiceImpl implements ISyncDataService {

	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ISyncDataService#syncUserData()
	 */
	public void syncUserData() throws Exception {
		
//		QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "PosWebService");
//		URL wsdlURL = PosWebService.WSDL_LOCATION;
//        PosWebService ss = new PosWebService(wsdlURL, SERVICE_NAME);
//        IPosService port = ss.getIPosServicePort();  
//        System.out.println("Invoking syncData...");
//        String returnVal = port.syncData("1");
//        System.out.println("syncData.result=" + returnVal);
//        
//        File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_USER_FILENAME);
//    	file.deleteOnExit();
//    	file.createNewFile();
//    	BufferedWriter output = new BufferedWriter(new FileWriter(file));
//	    output.write(returnVal);
//	    output.close();
        
	}
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ISyncDataService#syncRepositoryData()
	 */
	public void syncRepositoryData() throws Exception {
//		QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "PosWebService");
//		URL wsdlURL = PosWebService.WSDL_LOCATION;
//        PosWebService ss = new PosWebService(wsdlURL, SERVICE_NAME);
//        IPosService port = ss.getIPosServicePort();  
//        String returnVal = port.syncData("2");
//        
//        File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_USER_FILENAME);
//    	file.deleteOnExit();
//    	file.createNewFile();
//    	BufferedWriter output = new BufferedWriter(new FileWriter(file));
//	    output.write(returnVal);
//	    output.close();
	}
	
	public static void main(String[] args){
		try {
			new SyncDataServiceImpl().syncUserData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void syncAll() throws Exception {
		
	}

}
