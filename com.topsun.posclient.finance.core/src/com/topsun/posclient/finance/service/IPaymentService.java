package com.topsun.posclient.finance.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.PaymentDTO;

public interface IPaymentService extends IBaseService {
	
	public void savePayment(PaymentDTO paymentDTO) throws POSException;

}
