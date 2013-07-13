package com.topsun.posclient.system.service;

import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;

/**
 * 
 * @author Dong
 *
 */
public interface ISyncDataService extends IBaseService {
	
	public void syncData(ProgressBar bar,Text infoText) throws POSException;

}
