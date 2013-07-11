package com.topsun.posclient.common;

import java.net.URL;

import javax.xml.namespace.QName;

import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.common.webservice.IPosWebServiceService;
import com.topsun.posclient.common.webservice.IRMSServices;
import com.topsun.posclient.common.webservice.Services;
import com.topsun.posclient.datamodel.dto.webservice.UserCredential;
import com.topsun.posclient.datamodel.dto.webservice.GetUserInfoReq;

/**
 * 
 * @author LiLei
 *
 */
public class POSServerCaller {
	
	/**
	 * @return
	 * @throws Exception
	 */
	public IPosWebService getWebService() throws Exception {
		QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "IPosWebServiceService");
		// 调用服务器WebService接口获取最新用户数据
		URL wsdlURL = IPosWebServiceService.WSDL_LOCATION;
		IPosWebServiceService ss = new IPosWebServiceService(wsdlURL, SERVICE_NAME);
        IPosWebService webservice = ss.getIPosWebServicePort();
		return webservice;
	}
	
	public IRMSServices getRMService() throws Exception {
		QName SERVICE_NAME = new QName("http://tempuri.org/", "Services");
		// 调用服务器WebService接口获取最新用户数据
		URL wsdlURL = IPosWebServiceService.WSDL_LOCATION;
		Services ss = new Services(wsdlURL, SERVICE_NAME);
		IRMSServices rmservices = ss.getBasicHttpBindingIRMSServices();
		return rmservices;
	}
	
	
	public static void main(String[] args){
		UserCredential userCredential = new UserCredential();
		userCredential.setUserName("admin");
		userCredential.setPassWord("000000");
		GetUserInfoReq req = new GetUserInfoReq();
		req.setUserCode("1");
		req.setUserCredential(userCredential);
		try {
			new POSServerCaller().getRMService().getUserInfo(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @return
	 */
	public GetUserInfoReq buildUserInfoReq(){
		
		String userName = POSClientApp.get().getLoginUser().getUserName();
		String passWord = POSClientApp.get().getLoginUser().getPassWord();
		String userCode = POSClientApp.get().getLoginUser().getUserCode();
		
		UserCredential userCredential = new UserCredential();
		userCredential.setUserName(userName);
		userCredential.setPassWord(passWord);
		
		GetUserInfoReq userInfoReq = new GetUserInfoReq();
		userInfoReq.setUserCode(userCode);
		userInfoReq.setUserCredential(userCredential);
		
		return userInfoReq;
	}

}
