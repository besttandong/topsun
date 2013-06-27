package com.topsun.posclient.finance.dao;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.dao.PosProcessor;
import com.topsun.posclient.finance.dto.SettleAccWayDTO;

/**
 * @author Dong
 *
 */
public class SettleAccWayDao extends PosProcessor {

	/**
	 * @param settleAccWayDTO
	 * @throws Exception
	 */
	public void saveSettleAccWay(SettleAccWayDTO settleAccWayDTO) throws Exception {
		if (checkConnection()) {
			// IPosService webService = this.getCallServerProcessor().getWebService();
		} else {
			this.getLocalProcessor().createXmlFileFromObject(settleAccWayDTO, "data_settleAccWay", AppConstants.DATA_SETTLEACCWAY_PATH);
		}
	}
}
