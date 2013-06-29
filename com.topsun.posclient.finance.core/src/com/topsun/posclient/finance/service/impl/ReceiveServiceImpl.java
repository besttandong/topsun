package com.topsun.posclient.finance.service.impl;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.Receive;
import com.topsun.posclient.datamodel.dto.ReceiveDTO;
import com.topsun.posclient.finance.dao.ReceiveDao;
import com.topsun.posclient.finance.service.IReceiveService;

/**
 * @author Dong
 *
 */
public class ReceiveServiceImpl extends BaseServiceImpl implements IReceiveService {

	ReceiveDao receiveDao = new ReceiveDao();

	/* (non-Javadoc)
	 * @see com.topsun.posclient.finance.service.IReceiveService#saveReceive(com.topsun.posclient.finance.dto.ReceiveDTO)
	 */
	public void saveReceive(ReceiveDTO receiveDTO) throws POSException {
		try {
			receiveDao.saveReceive(receiveDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Receive> queryReceive() throws POSException {
		return null;
	}
	
	
}
