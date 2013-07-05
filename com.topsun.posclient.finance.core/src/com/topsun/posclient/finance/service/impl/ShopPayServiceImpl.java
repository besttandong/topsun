package com.topsun.posclient.finance.service.impl;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.dto.PayRecordDTO;
import com.topsun.posclient.finance.dao.ShopPayDao;
import com.topsun.posclient.finance.service.IShopPayService;

/**
 * @author Dong
 *
 */
public class ShopPayServiceImpl extends BaseServiceImpl implements IShopPayService {

	ShopPayDao storePayLocalDao = new ShopPayDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.finance.service.IStorePayService#saveStorePay(com.topsun.posclient.finance.dto.PayRecordDTO)
	 */
	public void saveShopPay(PayRecordDTO payRecordDTO) throws POSException {
		try{
			storePayLocalDao.saveStorePay(payRecordDTO);
		}catch(Exception e){
			e.printStackTrace();
			throw new POSException("缴款失败");
		}
	}

}
