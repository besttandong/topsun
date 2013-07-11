package com.topsun.posclient.common.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.topsun.posclient.datamodel.dto.webservice.GetUserInfoResult;
import com.topsun.posclient.datamodel.dto.webservice.GetUserInfoReq;

/**
 * This class was generated by Apache CXF 2.7.4 2013-07-10T17:52:46.689-07:00
 * Generated source version: 2.7.4
 * 
 */
@WebService(targetNamespace = "http://www.topsunit.com/rms", name = "IRMSServices")
public interface IRMSServices {

	@WebResult(name = "getUserInfoResult", targetNamespace = "http://www.topsunit.com/rms")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "http://www.topsunit.com/rms", className = "com.topsun.posclient.datamodel.dto.webservice.GetUserInfoReq")
    @WebMethod(action = "http://www.topsunit.com/rms/IRMSServices/getUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "http://www.topsunit.com/rms", className = "com.topsun.posclient.datamodel.dto.webservice.GetUserInfoResponse")
	public GetUserInfoResult getUserInfo(
			@WebParam(name = "getUserInfoReq", targetNamespace = "http://www.topsunit.com/rms") GetUserInfoReq userInfoReq);

	// public SavePartSalesResult savePartSales(
	// @WebParam(name = "savePartSalesReq", targetNamespace =
	// "http://www.topsunit.com/rms")
	// PartSalesData savePartSalesReq
	// );
}
