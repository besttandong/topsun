package com.topsun.posclient.sales.service;


import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;

/**
 * ���۽ӿ�
 * 
 * @author Dong
 *
 */
public interface IPartSaleService extends IBaseService {
	
	/**
	 * ������������
	 * 
	 * @param partSalesList
	 * @throws Exception
	 */
	public void saveSaleData(PartSalesDTO salesDTO) throws Exception;

}
