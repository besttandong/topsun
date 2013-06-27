package com.topsun.posclient.finance.service.impl;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.finance.dao.SettleAccWayDao;
import com.topsun.posclient.finance.dto.SettleAccWayDTO;
import com.topsun.posclient.finance.service.ISettleAccWayService;

public class SettleAccWayServiceImpl extends BaseServiceImpl implements ISettleAccWayService {
	
	private SettleAccWayDao settleAccWayLocalDao = new SettleAccWayDao();
	
	public void saveSettleAccWay(SettleAccWayDTO settleAccWayDTO) throws POSException {
		try {
			settleAccWayLocalDao.saveSettleAccWay(settleAccWayDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new POSException("保存结算方式失败");
		}
	}

}
