package com.topsun.posclient.application.dao;

import java.net.URL;

import javax.xml.namespace.QName;

import com.topsun.posclient.application.common.webservice.IPosService;
import com.topsun.posclient.application.common.webservice.PosWebService;

public class CallServerProcessor {
	
	static String NAME_SPACE_URL = "http://service.pos.webservice.topsunit.com/";
	
	static String LOCAL_PART = "PosWebService";
	
	public IPosService getWebService(){
		
		QName SERVICE_NAME = new QName(CallServerProcessor.NAME_SPACE_URL, CallServerProcessor.LOCAL_PART);
		URL wsdlURL = PosWebService.WSDL_LOCATION;
        PosWebService ss = new PosWebService(wsdlURL, SERVICE_NAME);
        IPosService port = ss.getIPosServicePort();  
        return port;
	}

}
