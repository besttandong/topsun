package com.topsun.posclient.application.dao;

import java.io.File;

import com.topsun.posclient.application.common.AppConstants;
import com.topsun.posclient.application.common.ProjectUtil;
import com.topsun.posclient.application.common.dto.OperatorDTO;

/**
 * @author Dong
 *
 */
public class OperatorLocalDao extends LocalProcessor {
	
	/**
	 * @return
	 * @throws Exception
	 */
	public OperatorDTO getOperatorData() throws Exception {
		File file = new File(ProjectUtil.getRuntimeClassPath() + AppConstants.DATA_USER_FILENAME);
		OperatorDTO operatorDTO = (OperatorDTO) this.getObjectFromXml(getDataFileContent(file), OperatorDTO.class);
		return operatorDTO;
	}

}
