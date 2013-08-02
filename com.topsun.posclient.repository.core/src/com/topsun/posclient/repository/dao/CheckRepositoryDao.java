package com.topsun.posclient.repository.dao;

import java.io.File;
import java.util.List;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.StockCheck;
import com.topsun.posclient.datamodel.dto.StockCheckDTO;

/**
 * 库存盘点
 * 
 * @author Dong
 */
public class CheckRepositoryDao extends BaseDao {

	/**
	 * 保存调店信息
	 * 
	 * @param adjustStoreDTO 调店信息
	 * @throws Exception
	 */
	public void saveCheckRepository(StockCheckDTO stockCheckDTO) throws Exception {
		if (checkConnection()) {
			//保存本地备份数据
			File file = this.getLocalProcessor().createXmlFileFromObject(stockCheckDTO, "data_stockCheckDTO", AppConstants.DATA_CHECKREPOSITORY_PATH_BACK);
			String saveData = this.getLocalProcessor().getDataFileContent(file);
//			IPosWebService webservice = this.getServerCaller().getWebService();
//			webservice.saveShopPay(saveData);
		}else{
			this.getLocalProcessor().createXmlFileFromObject(stockCheckDTO,
					"data_stockCheck", AppConstants.DATA_CHECKREPOSITORY_PATH);
		}
	}
	
	public List<StockCheck> queryCheckRepository(StockCheck stockCheck) throws Exception, POSException {
		if (checkConnection()) {
			return null;
		}else{
			throw new POSException("查询失败");
		}
	}
}
