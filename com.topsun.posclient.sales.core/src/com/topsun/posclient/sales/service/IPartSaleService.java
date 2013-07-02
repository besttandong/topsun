package com.topsun.posclient.sales.service;


import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;

/**
 * 零售接口
 * 
 * @author Dong
 *
 */
public interface IPartSaleService extends IBaseService {
	
	/**
	 * 保存销售数据
	 * 
	 * @param partSalesList
	 * @throws Exception
	 */
	public void saveSaleData(PartSalesDTO salesDTO) throws Exception;

}
