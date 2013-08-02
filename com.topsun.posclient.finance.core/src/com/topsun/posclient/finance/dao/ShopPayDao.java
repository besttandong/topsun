package com.topsun.posclient.finance.dao;

import java.io.File;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.PayRecordDTO;

/**
 * @author Dong
 *
 */
public class ShopPayDao extends BaseDao {

	/**
	 * 保存缴款记录
	 * @param payRecordDTO
	 * @throws Exception
	 * @throws POSException 
	 */
	public void saveStorePay(PayRecordDTO payRecordDTO) throws Exception {
		//在线调用Server端webservice
		if(checkConnection()){
			//保存本地备份数据
			File file = this.getLocalProcessor().createXmlFileFromObject(payRecordDTO, "data_payRecord", AppConstants.DATA_SHOPPAY_PATH_BACK);
			String saveData = this.getLocalProcessor().getDataFileContent(file);
//			this.getServerCaller().getWebService().saveShopAllot(saveShopAllot6);
		}else{
			this.getLocalProcessor().createXmlFileFromObject(payRecordDTO, "data_payRecord", AppConstants.DATA_SHOPPAY_PATH);
		}
		
	}
}
