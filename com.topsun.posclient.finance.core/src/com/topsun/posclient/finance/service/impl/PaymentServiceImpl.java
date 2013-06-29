package com.topsun.posclient.finance.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.dto.PaymentDTO;
import com.topsun.posclient.finance.dao.PaymentDao;
import com.topsun.posclient.finance.service.IPaymentService;

public class PaymentServiceImpl extends BaseServiceImpl implements IPaymentService {

	PaymentDao paymentDao = new PaymentDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.finance.service.IPaymentService#savePayment(com.topsun.posclient.finance.dto.PaymentDTO)
	 */
	public void savePayment(PaymentDTO paymentDTO) throws POSException{
		try {
			paymentDao.savePayment(paymentDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
