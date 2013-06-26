package com.topsun.posclient.finance.dao;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.dao.PosProcessor;
import com.topsun.posclient.finance.dto.PaymentDTO;

/**
 * @author Dong
 *
 */
public class PaymentDao extends PosProcessor {

	/**
	 * @param paymentDTO
	 * @throws Exception
	 */
	public void savePayment(PaymentDTO paymentDTO) throws Exception {
		if (checkConnection()) {
			//TODO
		} else {
			this.getLocalProcessor().createXmlFileFromObject(paymentDTO, "data_payment", AppConstants.DATA_PAYMENT_PATH);
		}
		
	}
}
