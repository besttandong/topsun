package com.topsun.posclient.finance.dao;

import com.topsun.posclient.common.AppConstants;
import com.topsun.posclient.common.dao.BaseDao;
import com.topsun.posclient.datamodel.dto.ReceiveDTO;

/**
 * @author Dong
 *
 */
public class ReceiveDao extends BaseDao {

	public void saveReceive(ReceiveDTO receiveDTO) throws Exception {
		if (checkConnection()) {
			//TODO
		} else {
			this.getLocalProcessor().createXmlFileFromObject(receiveDTO, "data_receive", AppConstants.DATA_PAYMENT_PATH);
		}
		
	}
}
