package com.topsun.posclient.sales.dao;

import java.io.File;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;

public class PartSaleDao extends BaseDao {

	/**
	 * @throws Exception
	 */
	public void saveSalesData(PartSalesDTO salesData) throws Exception {
		File file = this.getLocalProcessor().createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH);
		//在线调用Server端webservice
		if(checkConnection()){
			String saveData = this.getLocalProcessor().getDataFileContent(file);
//			PartSalesDTO partSalesDTO = (PartSalesDTO)this.getLocalProcessor().getObjectFromXml(saveData, PartSalesDTO.class);
			IPosWebService webservice = this.getServerCaller().getWebService();
			webservice.savePartSales(saveData);
		}
	}

}
