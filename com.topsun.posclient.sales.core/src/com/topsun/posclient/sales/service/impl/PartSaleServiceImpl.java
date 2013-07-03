package com.topsun.posclient.sales.service.impl;

import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.dto.PartSalesDTO;
import com.topsun.posclient.sales.dao.PartSaleDao;
import com.topsun.posclient.sales.service.IPartSaleService;

/**
 * 
 * @author Dong
 *
 */
public class PartSaleServiceImpl extends BaseServiceImpl implements IPartSaleService {
	
	private PartSaleDao partSaleDao = new PartSaleDao();

	/* (non-Javadoc)
	 * @see com.topsun.posclient.sales.service.IPartSaleService#saveSaleData(com.topsun.posclient.sales.entity.PartSales)
	 */
	public void saveSaleData(PartSalesDTO salesDTO) throws Exception {
		try {
			partSaleDao.saveSalesData(salesDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("保存零售数据失败");
		}
	}

}
