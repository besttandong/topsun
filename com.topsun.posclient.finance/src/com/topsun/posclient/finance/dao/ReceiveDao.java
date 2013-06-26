package com.topsun.posclient.finance.dao;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.dao.PosProcessor;
import com.topsun.posclient.finance.dto.ReceiveDTO;

/**
 * @author Dong
 *
 */
public class ReceiveDao extends PosProcessor {

	public void saveReceive(ReceiveDTO receiveDTO) throws Exception {
		if (checkConnection()) {
			//TODO
		} else {
			this.getLocalProcessor().createXmlFileFromObject(receiveDTO, "data_receive", AppConstants.DATA_PAYMENT_PATH);
		}
		
	}
}
