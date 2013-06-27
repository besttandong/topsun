package com.topsun.posclient.system.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;

import javax.xml.namespace.QName;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.common.ProjectUtil;
import com.topsun.posclient.application.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.application.common.webservice.IPosService;
import com.topsun.posclient.application.common.webservice.PosWebService;
import com.topsun.posclient.system.service.ISyncDataService;

/**
 * @author Dong
 * 
 */
public class SyncDataServiceImpl extends BaseServiceImpl implements ISyncDataService {

	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ISyncDataService#syncUserData()
	 */
	public void syncUserData() throws Exception {
		
		QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "PosWebService");
		URL wsdlURL = PosWebService.WSDL_LOCATION;
        PosWebService ss = new PosWebService(wsdlURL, SERVICE_NAME);
        IPosService port = ss.getIPosServicePort();  
        System.out.println("Invoking syncData...");
        String returnVal = port.syncData("1");
        System.out.println("syncData.result=" + returnVal);
        
        File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_USER_FILENAME);
    	file.deleteOnExit();
    	file.createNewFile();
    	BufferedWriter output = new BufferedWriter(new FileWriter(file));
	    output.write(returnVal);
	    output.close();
        
	}
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.system.service.ISyncDataService#syncRepositoryData()
	 */
	public void syncRepositoryData() throws Exception {
		QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "PosWebService");
		URL wsdlURL = PosWebService.WSDL_LOCATION;
        PosWebService ss = new PosWebService(wsdlURL, SERVICE_NAME);
        IPosService port = ss.getIPosServicePort();  
        String returnVal = port.syncData("2");
        
        File file = new File(ProjectUtil.getRuntimeClassPath()+AppConstants.DATA_USER_FILENAME);
    	file.deleteOnExit();
    	file.createNewFile();
    	BufferedWriter output = new BufferedWriter(new FileWriter(file));
	    output.write(returnVal);
	    output.close();
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
