/**
 * Services.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.topsun.posclient.webservice;

import com.topsun.posclient.webservice.dto.GetUserInfo;
import com.topsun.posclient.webservice.dto.GetUserInfoResponse;
import com.topsun.posclient.webservice.dto.HelloWorld;
import com.topsun.posclient.webservice.dto.HelloWorldResponse;
import com.topsun.posclient.webservice.dto.QueryReturnRepository;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryResponse;
import com.topsun.posclient.webservice.dto.QueryShopAllot;
import com.topsun.posclient.webservice.dto.QueryShopAllotResponse;
import com.topsun.posclient.webservice.dto.SavePartSales;
import com.topsun.posclient.webservice.dto.SavePartSalesResponse;
import com.topsun.posclient.webservice.dto.SaveReturnRepository;
import com.topsun.posclient.webservice.dto.SaveReturnRepositoryResponse;
import com.topsun.posclient.webservice.dto.SaveShopAllot;
import com.topsun.posclient.webservice.dto.SaveShopAllotResponse;
import com.topsun.posclient.webservice.dto.SyncItemData;
import com.topsun.posclient.webservice.dto.SyncItemDataResponse;

/*
 *  Services java interface
 */

public interface Services {

	/**
	 * Auto generated method signature
	 * 
	 * @param syncItemData0
	 */

	public SyncItemDataResponse syncItemData(

	SyncItemData syncItemData0)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param syncItemData0
	 */
	public void startsyncItemData(

	SyncItemData syncItemData0,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param helloWorld2
	 */

	public HelloWorldResponse helloWorld(

	HelloWorld helloWorld2)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param helloWorld2
	 */
	public void starthelloWorld(

	HelloWorld helloWorld2,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param getUserInfo4
	 */

	public GetUserInfoResponse getUserInfo(

	GetUserInfo getUserInfo4)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param getUserInfo4
	 */
	public void startgetUserInfo(

	GetUserInfo getUserInfo4,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param saveShopAllot6
	 */

	public SaveShopAllotResponse saveShopAllot(

	SaveShopAllot saveShopAllot6)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param saveShopAllot6
	 */
	public void startsaveShopAllot(

	SaveShopAllot saveShopAllot6,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param queryShopAllot8
	 */

	public QueryShopAllotResponse queryShopAllot(

	QueryShopAllot queryShopAllot8)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param queryShopAllot8
	 */
	public void startqueryShopAllot(

	QueryShopAllot queryShopAllot8,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param queryReturnRepository10
	 */

	public QueryReturnRepositoryResponse queryReturnRepository(

	QueryReturnRepository queryReturnRepository10)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param queryReturnRepository10
	 */
	public void startqueryReturnRepository(

	QueryReturnRepository queryReturnRepository10,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param savePartSales12
	 */

	public SavePartSalesResponse savePartSales(

	SavePartSales savePartSales12)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param savePartSales12
	 */
	public void startsavePartSales(

	SavePartSales savePartSales12,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param saveReturnRepository14
	 */

	public SaveReturnRepositoryResponse saveReturnRepository(

	SaveReturnRepository saveReturnRepository14)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param saveReturnRepository14
	 */
	public void startsaveReturnRepository(

	SaveReturnRepository saveReturnRepository14,

	final ServicesCallbackHandler callback)

	throws java.rmi.RemoteException;

	//
}
