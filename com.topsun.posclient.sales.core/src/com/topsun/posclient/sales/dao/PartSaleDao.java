package com.topsun.posclient.sales.dao;

import java.io.File;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.PartSales;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;
import com.topsun.posclient.webservice.POSServerCaller;
import com.topsun.posclient.webservice.dto.ArrayOfRetail;
import com.topsun.posclient.webservice.dto.Retail;
import com.topsun.posclient.webservice.dto.SavePartSales;
import com.topsun.posclient.webservice.dto.SavePartSalesReq;
import com.topsun.posclient.webservice.dto.SavePartSalesResponse;

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
			PartSalesDTO dto = (PartSalesDTO)this.getLocalProcessor().getObjectFromXml(saveData, PartSalesDTO.class);
			List<PartSales> salesList = dto.getPartSalesList();
			Retail[] localRetail = new Retail[salesList.size()];
			for(int i=0; i<salesList.size(); i++){
				PartSales sales = salesList.get(i);
				Retail retail = new Retail();
				retail.setBillNo(sales.getBallotNo());
				localRetail[i] = retail;
			}
			
			ArrayOfRetail retail = new ArrayOfRetail();
			retail.setRetail(localRetail);
			
			SavePartSalesReq req = new SavePartSalesReq();
			req.setRetails(retail);
			req.setUserCredential(POSServerCaller.getDefaultUserCredential());
			
			SavePartSales savePartSales12 = new SavePartSales();
			savePartSales12.setSavePartSalesReq(req);
			
			SavePartSalesResponse response = POSServerCaller.getWebService().savePartSales(savePartSales12);
			if(!response.getSavePartSalesResult().getResult().getFlag().equals("0")){
				
			}
		}else{
			this.getLocalProcessor().createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH);
		}
	}

}
