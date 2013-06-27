package com.topsun.posclient.finance.dao;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.dao.PosProcessor;
import com.topsun.posclient.finance.dto.PayRecordDTO;

/**
 * @author Dong
 *
 */
public class StorePayDao extends PosProcessor {

	/**
	 * @param payRecordDTO
	 * @throws Exception
	 * @throws POSException 
	 */
	public void saveStorePay(PayRecordDTO payRecordDTO) throws Exception {
		if (checkConnection()) {
			// IPosService webService = this.getCallServerProcessor().getWebService();
		} else {
			this.getLocalProcessor().createXmlFileFromObject(payRecordDTO, "data_payRecord", AppConstants.DATA_STOREPAY_PATH);
		}
		
	}
}
