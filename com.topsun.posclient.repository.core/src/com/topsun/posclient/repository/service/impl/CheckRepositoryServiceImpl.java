package com.topsun.posclient.repository.service.impl;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.StockCheck;
import com.topsun.posclient.datamodel.dto.StockCheckDTO;
import com.topsun.posclient.repository.dao.CheckRepositoryDao;
import com.topsun.posclient.repository.service.ICheckRepositoryService;

/**
 * @author Dong
 *
 */
public class CheckRepositoryServiceImpl implements ICheckRepositoryService {

	CheckRepositoryDao checkRepositoryDao = new CheckRepositoryDao();
	
	/* (non-Javadoc)
	 * @see com.topsun.posclient.repository.service.ICheckRepositoryService#saveStockCheck(com.topsun.posclient.datamodel.dto.StockCheckDTO)
	 */
	public void saveStockCheck(StockCheckDTO stockCheckDTO) throws POSException {
		try {
			checkRepositoryDao.saveCheckRepository(stockCheckDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new POSException("保存盘点数据失败");
		}
	}

	/* (non-Javadoc)
	 * @see com.topsun.posclient.repository.service.ICheckRepositoryService#queryAdjustShopList(com.topsun.posclient.datamodel.StockCheck)
	 */
	public List<StockCheck> queryAdjustShopList(StockCheck stockCheck)
			throws POSException {
		List<StockCheck> stockCheckList = null;
		try {
			stockCheckList = checkRepositoryDao.queryCheckRepository(stockCheck);
		} catch (Exception e) {
			throw new POSException("查询失败");
		}
		return stockCheckList;
	}

}
