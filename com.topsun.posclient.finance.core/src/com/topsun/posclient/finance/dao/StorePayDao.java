package com.topsun.posclient.finance.dao;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.PayRecordDTO;

/**
 * @author Dong
 *
 */
public class StorePayDao extends BaseDao {

	/**
	 * 保存缴款记录
	 * @param payRecordDTO
	 * @throws Exception
	 * @throws POSException 
	 */
	public void saveStorePay(PayRecordDTO payRecordDTO) throws Exception {
		if (checkConnection()) {
			// IPosService webService = this.getCallServerProcessor().getWebService();
		} else {
			this.getLocalProcessor().createXmlFileFromObject(payRecordDTO, "data_payRecord", AppConstants.DATA_SHOPPAY_PATH);
		}
		
	}
}
