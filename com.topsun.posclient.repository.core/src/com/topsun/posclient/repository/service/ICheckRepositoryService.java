package com.topsun.posclient.repository.service;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.datamodel.StockCheck;
import com.topsun.posclient.datamodel.dto.StockCheckDTO;

/**
 * @author Dong
 *
 */
public interface ICheckRepositoryService {
	
	/**
	 * @param stockCheckDTO
	 * @throws POSException
	 */
	public void saveStockCheck(StockCheckDTO stockCheckDTO) throws POSException;
	
	/**
	 * @param stockCheck
	 * @return
	 * @throws POSException
	 */
	public List<StockCheck> queryAdjustShopList(StockCheck stockCheck) throws POSException;

}
