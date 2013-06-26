package com.topsun.posclient.application.common;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.topsun.posclient.application.common.webservice.IPosService;
import com.topsun.posclient.application.common.webservice.PosWebService;
import com.topsun.posclient.application.dao.LocalProcessor;

/**
 * @author Dong
 * 
 */
public class POSJob  {

	LocalProcessor localDataProcessor = new LocalProcessor();

	QName SERVICE_NAME = new QName("http://service.pos.webservice.topsunit.com/", "PosWebService");

	public void perform() {
		String path = ProjectUtil.getRuntimeClassPath()
				+ AppConstants.DATA_PARTSALES_PATH;
		File file = new File(path);
		String[] allRepositroyFile = file.list();
		for (int i = 0; i < allRepositroyFile.length; i++) {
			file = new File(path + "//" + allRepositroyFile[i]);
			String content = localDataProcessor.getDataFileContent(file);

			URL wsdlURL = PosWebService.WSDL_LOCATION;
			PosWebService ss = new PosWebService(wsdlURL, SERVICE_NAME);
			IPosService port = ss.getIPosServicePort();
			boolean returnVal = port.uploadDataFile("1", content,
					file.getName());
			try {
				if (returnVal) {
					localDataProcessor.copyFileToBack(file, true);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
