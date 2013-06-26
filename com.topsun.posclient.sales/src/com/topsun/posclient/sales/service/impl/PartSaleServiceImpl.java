package com.topsun.posclient.sales.service.impl;

import com.topsun.posclient.application.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.sales.dao.PartSaleLocalDao;
import com.topsun.posclient.sales.dto.PartSalesDTO;
import com.topsun.posclient.sales.service.IPartSaleService;

/**
 * 
 * @author Dong
 *
 */
public class PartSaleServiceImpl extends BaseServiceImpl implements IPartSaleService {
	
	private PartSaleLocalDao partSaleLocalDao = new PartSaleLocalDao();

	/* (non-Javadoc)
	 * @see com.topsun.posclient.sales.service.IPartSaleService#saveSaleData(com.topsun.posclient.sales.entity.PartSales)
	 */
	public void saveSaleData(PartSalesDTO salesDTO) throws Exception {
		try {
			partSaleLocalDao.saveSalesData(salesDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("保存销售数据失败");
		}
	}

}
