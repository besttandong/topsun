package com.topsun.posclient.application.common.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service.pos.webservice.topsunit.com/", name = "IPosService")
public interface IPosService {

    @WebResult(name = "syncData", targetNamespace = "")
    @RequestWrapper(localName = "syncData", targetNamespace = "http://service.pos.webservice.topsunit.com/", className = "com.topsun.posclient.common.webservice.SyncData")
    @WebMethod
    @ResponseWrapper(localName = "syncDataResponse", targetNamespace = "http://service.pos.webservice.topsunit.com/", className = "com.topsun.posclient.common.webservice.SyncDataResponse")
    public java.lang.String syncData(
        @WebParam(name = "type", targetNamespace = "")
        java.lang.String type
    );
    
    @WebResult(name = "uploadDataFile", targetNamespace = "")
    @RequestWrapper(localName = "uploadDataFile", targetNamespace = "http://service.pos.webservice.topsunit.com/", className = "com.topsun.posclient.common.webservice.UploadDataFile")
    @WebMethod
    @ResponseWrapper(localName = "uploadDataFileResponse", targetNamespace = "http://service.pos.webservice.topsunit.com/", className = "com.topsun.posclient.common.webservice.UploadDataFileResponse")
    public boolean uploadDataFile(
        @WebParam(name = "type", targetNamespace = "")
        java.lang.String type,
        @WebParam(name = "data", targetNamespace = "")
        java.lang.String data,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName
    );
}
