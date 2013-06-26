package com.topsun.posclient.finance.service;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.IBaseService;
import com.topsun.posclient.finance.dto.SettleAccWayDTO;

public interface ISettleAccWayService extends IBaseService {
	
	public void saveSettleAccWay(SettleAccWayDTO settleAccWayDTO) throws POSException;

}
