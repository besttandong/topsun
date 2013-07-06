package com.topsun.posclient.common.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Lilei
 *
 */
@WebService(targetNamespace = "http://service.pos.webservice.topsunit.com/", name = "IPosWebService")
public interface IPosWebService {
	
    public String downloadUserData(@WebParam(name = "userCredential")String userCredential);
    
    public String downloadShopData(@WebParam(name = "userCredential")String userCredential);
    
    public String downloadItemData(@WebParam(name = "userCredential")String userCredential);
    
    public String downloadCashierModeData(@WebParam(name = "userCredential")String userCredential);
	
	public String savePartSales(@WebParam(name = "partSalesDTO") String partSalesDTO);
	
	public String saveShopPay(@WebParam(name = "payRecordDTO") String payRecordDTO);
	
	public String saveAdjustShop(@WebParam(name = "adjustShopDTO") String adjustShopDTO);
	
	public String saveAdjustRepository(@WebParam(name = "adjustRepositoryDTO") String adjustRepositoryDTO);
	
	public String savePayment(@WebParam(name = "paymentDTO") String paymentDTO);
	
	public String saveReceive(@WebParam(name = "receiveDTO") String receiveDTO);
}


