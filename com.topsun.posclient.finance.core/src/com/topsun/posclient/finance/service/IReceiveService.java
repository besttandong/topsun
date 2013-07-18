package com.topsun.posclient.finance.service;

import java.util.List;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.datamodel.Receive;
import com.topsun.posclient.datamodel.dto.ReceiveDTO;

public interface IReceiveService extends IBaseService {

	public void saveReceive(ReceiveDTO receiveDTO) throws POSException;
	
	public List<Receive> queryReceive(ReceiveDTO receiveDTO) throws POSException;
}
