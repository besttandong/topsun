package com.topsun.posclient.finance.service.impl;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.finance.dao.StorePayDao;
import com.topsun.posclient.finance.dto.PayRecordDTO;
import com.topsun.posclient.finance.service.IStorePayService;

/**
 * @author Dong
 *
 */
public class StorePayServiceImpl extends BaseServiceImpl implements IStorePayService {

	StorePayDao storePayLocalDao = new StorePayDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.finance.service.IStorePayService#saveStorePay(com.topsun.posclient.finance.dto.PayRecordDTO)
	 */
	public void saveStorePay(PayRecordDTO payRecordDTO) throws POSException {
		try{
			storePayLocalDao.saveStorePay(payRecordDTO);
		}catch(Exception e){
			e.printStackTrace();
			throw new POSException("±£´æ½É¿î¼ÇÂ¼Ê§°Ü");
		}
	}

}
