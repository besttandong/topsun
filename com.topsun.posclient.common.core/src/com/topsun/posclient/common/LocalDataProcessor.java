package com.topsun.posclient.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * 
 * @author Dong
 * 
 */
public class LocalDataProcessor {

	String id;

	public LocalDataProcessor() { }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDataProcessor(String id) {
		this.id = id;
	}
	
	public boolean copyFileToBack(File file, boolean needDel) throws IOException{
		String backPath = file.getAbsolutePath().replace("upload", "back");
		File backFile = new File(backPath);
		if(!backFile.exists()){
			backFile.createNewFile();
		}
		if(needDel){
			file.delete();
		}
		return true;
	}
	
	public String getDataFileContent(File file){
		StringBuffer fileData = new StringBuffer();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			while ((tempString = reader.readLine()) != null) {
				fileData.append(tempString);
				line++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return fileData.toString();
	}

	/**
	 * 
	 * @param data
	 * @param classe
	 * @return
	 * @throws JAXBException
	 */
	@SuppressWarnings("rawtypes")
	public Object getObjectFromXml(String data, Class classe)
			throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unMarshaller = context.createUnmarshaller();
		return unMarshaller.unmarshal(new StringReader(data));
	}

	/**
	 * 
	 * @param data
	 * @param fileName
	 * @param dataPath
	 * @throws JAXBException
	 * @throws IOException
	 */
	public File createXmlFileFromObject(Object data, String fileName,
			String dataPath) throws JAXBException, IOException {
		String filePath = ProjectUtil.getRuntimeClassPath();
		File file = new File(filePath + dataPath + fileName + "_"
				+ System.currentTimeMillis() + ".xml");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
		JAXBContext context = JAXBContext.newInstance(data.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(data, fos);
		return file;
	}
}
