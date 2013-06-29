package com.topsun.posclient.finance.dao;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.PaymentDTO;

/**
 * @author Dong
 *
 */
public class PaymentDao extends BaseDao {

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
