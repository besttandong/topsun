package com.topsun.posclient.sales.dao;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.ProjectUtil;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.Item;
import com.topsun.posclient.datamodel.PartSales;
import com.topsun.posclient.datamodel.PartSalesCashier;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;
import com.topsun.posclient.webservice.POSServerCaller;
import com.topsun.posclient.webservice.dto.ArrayOfRetail;
import com.topsun.posclient.webservice.dto.ArrayOfRetail_M;
import com.topsun.posclient.webservice.dto.ArrayOfRetail_P;
import com.topsun.posclient.webservice.dto.Retail;
import com.topsun.posclient.webservice.dto.Retail_M;
import com.topsun.posclient.webservice.dto.Retail_P;
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
		if(1 == 1){
			//保存本地备份数据
			File file = this.getLocalProcessor().createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH_BACK);
			
			String saveData = this.getLocalProcessor().getDataFileContent(file);
			PartSalesDTO dto = (PartSalesDTO)this.getLocalProcessor().getObjectFromXml(saveData, PartSalesDTO.class);
			List<PartSales> salesList = dto.getPartSalesList();
			Retail[] localRetail = new Retail[salesList.size()];
			for(int i=0; i<salesList.size(); i++){
				PartSales sales = salesList.get(i);
				Retail retail = new Retail();
				retail.setShopID(1);
				retail.setEmployeeID(1);
				retail.setCashierID(1);
				retail.setCardID(1);
				retail.setEnableBalance(ProjectUtil.getBigDecimal(sales.getEnableBalance()));
				retail.setEnablePoint(0);
				retail.setUseBalance(ProjectUtil.getBigDecimal(sales.getEnableBalance()));
				retail.setUsePoint(20);
				retail.setSalesDate(ProjectUtil.getCalendar(sales.getSalesDate()));
				retail.setDocNum(sales.getNo());
				retail.setBillNo(sales.getBallotNo());
				retail.setReceivable(ProjectUtil.getBigDecimal(sales.getEnableBalance()));
				retail.setDiscount(ProjectUtil.getBigDecimal(null));
				retail.setTotals(ProjectUtil.getBigDecimal(sales.getEnableBalance()));
				retail.setIsReturn(0);
				retail.setAuditDate(ProjectUtil.getCalendar(sales.getCheckDate()));
				retail.setAuditID(1);
				
				retail.setRetail_Ms(getArrayOfRetail_M(sales.getItemList()));
				retail.setRetail_Ps(getArrayOfRetail_P(sales.getPsCashierList()));
				
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
			System.out.println(response.getSavePartSalesResult().getResult().getMsg());
		}else{
			this.getLocalProcessor().createXmlFileFromObject(salesData, "data_PartSales", AppConstants.DATA_PARTSALES_PATH);
		}
	}
	
	private ArrayOfRetail_P getArrayOfRetail_P(List<PartSalesCashier> cashierList){
		Retail_P[] retail_PArray = new Retail_P[cashierList.size()];
		for(int i=0; i<cashierList.size(); i++){
			System.out.println("-------->> 结算方式 ");
			PartSalesCashier pCashier = cashierList.get(i);
			Retail_P p = new Retail_P();
			p.setPayModeID(pCashier.getPayModelId());
			p.setSum(new BigDecimal(pCashier.getSum()));
			retail_PArray[i] = p;
		}
		ArrayOfRetail_P arrayOfRetail_P = new ArrayOfRetail_P();
		arrayOfRetail_P.setRetail_P(retail_PArray);
		return arrayOfRetail_P;
	}
	
	private ArrayOfRetail_M getArrayOfRetail_M(List<Item> itemList){
		
		Retail_M[] retail_MArray = new Retail_M[itemList.size()];
		for(int i=0; i<itemList.size(); i++){
			System.out.println("-------->> 商品明细 ");
			Item item = itemList.get(i);
			Retail_M m = new Retail_M();
			m.setItemId(item.getId());
			m.setLineNum(i);
			m.setPrice(new BigDecimal(item.getRetailPrice()));
			m.setQuantity(item.getNum());
			m.setSum(new BigDecimal(item.getRetailPrice()));
			retail_MArray[i] = m;
		}
		ArrayOfRetail_M arrayOfRetail_M = new ArrayOfRetail_M();
		arrayOfRetail_M.setRetail_M(retail_MArray);
		
		return arrayOfRetail_M;
	}
	

}
