package com.topsun.posclient.finance.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.PayRecordDTO;

/**
 * @author Dong
 *
 */
public interface IStorePayService extends IBaseService {

	/**
	 * @param payRecordDTO
	 * @throws Exception
	 */
	public void saveStorePay(PayRecordDTO payRecordDTO) throws POSException;;
}
