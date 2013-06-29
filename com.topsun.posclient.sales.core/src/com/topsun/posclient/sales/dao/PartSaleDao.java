package com.topsun.posclient.sales.dao;

import java.io.File;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;

public class PartSaleDao extends BaseDao {

	/**
	 * @throws Exception
	 */
	public void saveSalesData(PartSalesDTO salesData) throws Exception {
		this.getLocalProcessor().createXmlFileFromObject(salesData,
				"data_PartSales", AppConstants.DATA_PARTSALES_PATH);

		String saveData = this
				.getLocalProcessor()
				.getDataFileContent(
						new File(
								"D:\\workspace_back\\com.topsun.posclient.application\\bin\\data\\upload\\partsales_data\\data_PartSales_1372111545298.xml"));

		// caller.call("/PartSales/savePartSalesData", saveData);
		// this.getServerCaller().callServer();
		// caller.call("/PartSales/savePartSales", saveData);
	}

}
