package com.topsun.posclient.sales.dao;

import java.io.File;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.common.webservice.IPosWebService;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;

/**
 * @author Dong
 *
 */
public class PartSaleDao extends BaseDao {

	/**
	 * @throws Exception
	 */
	public void saveSalesData(PartSalesDTO salesData) throws Exception {
		//在线调用Server端webservice
		if(checkConnection()){
			//保存本地备份数据
			File file = this.getLocalProcessor().createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH_BACK);
			String saveData = this.getLocalProcessor().getDataFileContent(file);
			IPosWebService webservice = this.getServerCaller().getWebService();
			webservice.savePartSales(saveData);
		}else{
			this.getLocalProcessor().createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH);
		}
	}

}
