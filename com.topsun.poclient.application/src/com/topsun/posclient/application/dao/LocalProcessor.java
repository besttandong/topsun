package com.topsun.posclient.application.dao;

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

import com.topsun.posclient.application.common.ProjectUtil;

/**
 * 本地数据处理
 * 
 * @author Dong
 * 
 */
public class LocalProcessor {

	String id;

	public LocalProcessor() { }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalProcessor(String id) {
		this.id = id;
	}
	
	/**
	 * 将文件转移到备份目录
	 * @param file 要转移的文件
	 * @param needDel 是否需要删除
	 * @return
	 * @throws IOException
	 */
	public boolean copyFileToBack(File file, boolean needDel) throws IOException{
		String backPath = file.getAbsolutePath().replace("upload", "back");
		File backFile = new File(backPath);
		if(!backFile.exists()){
			backFile.createNewFile();
		}
		if(needDel){
			// 转移到备份目录后删除
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
	 * 根据XML字符内容获取数据对象
	 * 
	 * @param data
	 * @param classe
	 * @return
	 * @throws JAXBException
	 */
	public Object getObjectFromXml(String data, Class classe)
			throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unMarshaller = context.createUnmarshaller();
		return unMarshaller.unmarshal(new StringReader(data));
	}

	/**
	 * 根据数据对象创建XML文件
	 * 
	 * @param data
	 * @param fileName
	 * @param dataPath
	 * @throws JAXBException
	 * @throws IOException
	 */
	public void createXmlFileFromObject(Object data, String fileName,
			String dataPath) throws JAXBException, IOException {
		String filePath = ProjectUtil.class.getClassLoader().getResource("")
				.getFile();
		File file = new File(filePath + dataPath + fileName + "_"
				+ System.currentTimeMillis() + ".xml");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
		JAXBContext context = JAXBContext.newInstance(data.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(data, fos);
	}
}
