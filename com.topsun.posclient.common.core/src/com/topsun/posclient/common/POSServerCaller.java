package com.topsun.posclient.common;

import java.net.URL;

import javax.xml.namespace.QName;

import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.common.webservice.IPosWebServiceService;
import com.topsun.posclient.datamodel.dto.webservice.UserCredential;
import com.topsun.posclient.datamodel.dto.webservice.UserInfoReq;

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
	
	/**
	 * @return
	 */
	public UserInfoReq buildUserInfoReq(){
		
		String userName = POSClientApp.get().getLoginUser().getUserName();
		String passWord = POSClientApp.get().getLoginUser().getPassWord();
		String userCode = POSClientApp.get().getLoginUser().getUserCode();
		
		UserCredential userCredential = new UserCredential();
		userCredential.setUserName(userName);
		userCredential.setPassWord(passWord);
		
		UserInfoReq userInfoReq = new UserInfoReq();
		userInfoReq.setUserCode(userCode);
		userInfoReq.setUserCredential(userCredential);
		
		return userInfoReq;
	}

}
