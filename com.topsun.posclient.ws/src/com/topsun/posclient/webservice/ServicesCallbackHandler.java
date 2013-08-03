/**
 * ServicesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.topsun.posclient.webservice;

import com.topsun.posclient.webservice.dto.GetUserInfoResponse;
import com.topsun.posclient.webservice.dto.HelloWorldResponse;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryResponse;
import com.topsun.posclient.webservice.dto.QueryShopAllotResponse;
import com.topsun.posclient.webservice.dto.SavePartSalesResponse;
import com.topsun.posclient.webservice.dto.SaveReturnRepositoryResponse;
import com.topsun.posclient.webservice.dto.SaveShopAllotResponse;
import com.topsun.posclient.webservice.dto.SyncItemDataResponse;

/**
 * ServicesCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class ServicesCallbackHandler {

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the
	 * NonBlocking Web service call is finished and appropriate method of this
	 * CallBack is called.
	 * 
	 * @param clientData
	 *            Object mechanism by which the user can pass in user data that
	 *            will be avilable at the time this callback is called.
	 */
	public ServicesCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public ServicesCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for syncItemData method override
	 * this method for handling normal response from syncItemData operation
	 */
	public void receiveResultsyncItemData(
			SyncItemDataResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from syncItemData operation
	 */
	public void receiveErrorsyncItemData(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for helloWorld method override this
	 * method for handling normal response from helloWorld operation
	 */
	public void receiveResulthelloWorld(
			HelloWorldResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from helloWorld operation
	 */
	public void receiveErrorhelloWorld(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getUserInfo method override
	 * this method for handling normal response from getUserInfo operation
	 */
	public void receiveResultgetUserInfo(
			GetUserInfoResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from getUserInfo operation
	 */
	public void receiveErrorgetUserInfo(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for saveShopAllot method override
	 * this method for handling normal response from saveShopAllot operation
	 */
	public void receiveResultsaveShopAllot(
			SaveShopAllotResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from saveShopAllot operation
	 */
	public void receiveErrorsaveShopAllot(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for queryShopAllot method override
	 * this method for handling normal response from queryShopAllot operation
	 */
	public void receiveResultqueryShopAllot(
			QueryShopAllotResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from queryShopAllot operation
	 */
	public void receiveErrorqueryShopAllot(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for queryReturnRepository method
	 * override this method for handling normal response from
	 * queryReturnRepository operation
	 */
	public void receiveResultqueryReturnRepository(
			QueryReturnRepositoryResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from queryReturnRepository operation
	 */
	public void receiveErrorqueryReturnRepository(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for savePartSales method override
	 * this method for handling normal response from savePartSales operation
	 */
	public void receiveResultsavePartSales(
			SavePartSalesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from savePartSales operation
	 */
	public void receiveErrorsavePartSales(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for saveReturnRepository method
	 * override this method for handling normal response from
	 * saveReturnRepository operation
	 */
	public void receiveResultsaveReturnRepository(
			SaveReturnRepositoryResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from saveReturnRepository operation
	 */
	public void receiveErrorsaveReturnRepository(java.lang.Exception e) {
	}

}
