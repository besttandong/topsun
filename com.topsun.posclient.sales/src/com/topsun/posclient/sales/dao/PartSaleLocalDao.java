package com.topsun.posclient.sales.dao;


import java.io.File;

import com.topsun.posclient.application.common.CallPOSServer;
import com.topsun.posclient.application.dao.LocalProcessor;
import com.topsun.posclient.sales.dto.PartSalesDTO;

public class PartSaleLocalDao extends LocalProcessor {
	
	/**
	 * @throws Exception
	 */
	public void saveSalesData(PartSalesDTO salesData) throws Exception {
		// this.createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH);

		CallPOSServer caller = new CallPOSServer();
		
		String saveData = this.getDataFileContent(new File("D:\\workspace_back\\com.topsun.posclient.application\\bin\\data\\upload\\partsales_data\\data_PartSales_1372111545298.xml"));
		
		//caller.call("/PartSales/savePartSalesData", saveData);
		
		caller.call("/PartSales/savePartSales", saveData);
	}

}
