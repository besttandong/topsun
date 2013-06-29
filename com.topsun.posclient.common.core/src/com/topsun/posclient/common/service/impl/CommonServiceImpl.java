package com.topsun.posclient.common.service.impl;

import java.util.List;

import com.topsun.posclient.common.dao.CommonDao;
import com.topsun.posclient.common.service.ICommonService;
import com.topsun.posclient.datamodel.CashierMode;
import com.topsun.posclient.datamodel.Shop;
import com.topsun.posclient.datamodel.dto.CashierModeDTO;

/**
 * 公共服务实现
 * 
 * @author Dong
 *
 */
public class CommonServiceImpl implements ICommonService {
	
	private CommonDao commonDao = new CommonDao();

	/* (non-Javadoc)
	 * @see com.topsun.posclient.service.ICommonService#getShopByUserId(int)
	 */
	public Shop getShopByUserId(int userId) throws Exception {
		
		return null;
	}

	public List<CashierMode> getAllCashierMode() throws Exception {
		CashierModeDTO  cashierModeDTO = commonDao.getAllCashierMode();
		return cashierModeDTO.getCashierModeList();
	}

}
