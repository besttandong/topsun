package com.topsun.posclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.topsun.posclient.datamodel.dto.UserDTO;

public class DataAndXMLConvertTest {
	
	public static void main(String[] args) throws Exception{
		
		/**
		 * 
		 */
		String filePath = DataAndXMLConvertTest.class.getClassLoader().getResource("").getFile();
		File file = new File(filePath+"data_user.xml");
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile());
//		JAXBContext context = JAXBContext.newInstance(UserDTO.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.marshal(userDTO, fos);
		
		/**
		 * 
		 */
		JAXBContext context = JAXBContext.newInstance(UserDTO.class);
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
		Unmarshaller unMarshaller = context.createUnmarshaller();
		UserDTO uDto = (UserDTO)unMarshaller.unmarshal(new StringReader(fileData.toString()));
		System.out.println(uDto.getUserList().size());
	}

}
