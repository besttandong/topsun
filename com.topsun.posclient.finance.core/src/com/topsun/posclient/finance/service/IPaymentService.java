package com.topsun.posclient.finance.service;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.IBaseService;
import com.topsun.posclient.finance.dto.PaymentDTO;

public interface IPaymentService extends IBaseService {
	
	public void savePayment(PaymentDTO paymentDTO) throws POSException;

}
