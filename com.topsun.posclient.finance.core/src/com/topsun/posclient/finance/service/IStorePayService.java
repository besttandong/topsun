package com.topsun.posclient.finance.service;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.PayRecordDTO;

/**
 * 店铺缴款服务接口
 * 
 * @author Dong
 *
 */
public interface IStorePayService extends IBaseService {

	/**
	 * 保存缴款记录
	 * @param payRecordDTO
	 * @throws Exception
	 */
	public void saveStorePay(PayRecordDTO payRecordDTO) throws POSException;
}
