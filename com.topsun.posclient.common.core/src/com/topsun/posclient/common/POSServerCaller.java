package com.topsun.posclient.common;

import java.net.URL;

import javax.xml.namespace.QName;

import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.common.webservice.IPosWebServiceService;

/**
 * 
 * @author Dong
 *
 */
public class POSServerCaller {
	
	public IPosWebService getWebService() throws Exception {
		QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "IPosWebServiceService");
		// 调用服务器WebService接口获取最新用户数据
		URL wsdlURL = IPosWebServiceService.WSDL_LOCATION;
		IPosWebServiceService ss = new IPosWebServiceService(wsdlURL, SERVICE_NAME);
        IPosWebService webservice = ss.getIPosWebServicePort();
		return webservice;
	}

}
