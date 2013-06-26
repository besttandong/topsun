package com.topsun.posclient.finance.service;

import com.topsun.posclient.application.common.POSException;
import com.topsun.posclient.application.common.service.IBaseService;
import com.topsun.posclient.finance.dto.ReceiveDTO;

public interface IReceiveService extends IBaseService {

	public void saveReceive(ReceiveDTO receiveDTO) throws POSException;
}
