package com.topsun.posclient.common.webservice.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2013-07-12T14:38:38.301-07:00
 * Generated source version: 2.7.4
 * 
 */
@WebService(targetNamespace = "http://www.topsunit.com/rms", name = "IRMSServices")
@XmlSeeAlso({ObjectFactory.class})
public interface IRMSServices {

    @WebResult(name = "getUserInfoResult", targetNamespace = "http://www.topsunit.com/rms")
    @Action(input = "http://www.topsunit.com/rms/IRMSServices/getUserInfo", output = "http://www.topsunit.com/rms/IRMSServices/getUserInfoResponse")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "http://www.topsunit.com/rms", className = "com.topsun.posclient.common.webservice.test.GetUserInfo")
    @WebMethod(action = "http://www.topsunit.com/rms/IRMSServices/getUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "http://www.topsunit.com/rms", className = "com.topsun.posclient.common.webservice.test.GetUserInfoResult")
    public GetUserInfoResult getUserInfo(
        @WebParam(name = "getUserInfo", targetNamespace = "http://www.topsunit.com/rms") GetUserInfo getUserInfo
    );

    @WebResult(name = "savePartSalesResult", targetNamespace = "http://www.topsunit.com/rms")
    @Action(input = "http://www.topsunit.com/rms/IRMSServices/savePartSales", output = "http://www.topsunit.com/rms/IRMSServices/savePartSalesResponse")
    @RequestWrapper(localName = "savePartSales", targetNamespace = "http://www.topsunit.com/rms", className = "SavePartSales")
    @WebMethod(action = "http://www.topsunit.com/rms/IRMSServices/savePartSales")
    @ResponseWrapper(localName = "savePartSalesResponse", targetNamespace = "http://www.topsunit.com/rms", className = "SavePartSalesResponse")
    public SavePartSalesResult savePartSales(
        @WebParam(name = "savePartSalesReq", targetNamespace = "http://www.topsunit.com/rms")
        PartSalesData savePartSalesReq
    );
}
