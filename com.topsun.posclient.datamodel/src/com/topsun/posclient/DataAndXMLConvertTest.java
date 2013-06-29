package com.topsun.posclient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.topsun.posclient.datamodel.Function;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.datamodel.dto.UserDTO;

public class DataAndXMLConvertTest {
	
	public static void main(String[] args) throws Exception{
		
		Function child1 = new Function();
		child1.setId(3);
		child1.setActionURL("com.topsun.posclient.sales.PartSalesView");
		child1.setFunctionName("零售");
		child1.setDescription("功能描述");
		
		Function child2 = new Function();
		child2.setId(4);
		child2.setActionURL("com.topsun.posclient.sales.ReceiveView");
		child2.setFunctionName("收款");
		child2.setDescription("功能描述");
		
		Function child3 = new Function();
		child3.setId(5);
		child3.setActionURL("com.topsun.posclient.sales.PaymentView");
		child3.setFunctionName("付款");
		child3.setDescription("功能描述");
		
		List<Function> childs1 = new ArrayList<Function>();
		childs1.add(child1);
		
		List<Function> childs2 = new ArrayList<Function>();
		childs2.add(child2);
		childs2.add(child3);
		
		Function function1 = new Function();
		function1.setId(1);
		function1.setActionURL("com.topsun.posclient.sales");
		function1.setFunctionName("销售模块");
		function1.setDescription("功能描述");
		function1.setChilds(childs1);
		
		Function function2 = new Function();
		function2.setId(2);
		function2.setActionURL("com.topsun.posclient.finance");
		function2.setFunctionName("财务模块");
		function2.setDescription("功能描述");
		function2.setChilds(childs2);
		
		List<Function> functionList = new ArrayList<Function>();
		functionList.add(function1);
		functionList.add(function2);
		
		
		List<User> userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.setId(1);
		user1.setUserCode("10010");
		user1.setUserName("zhangsan");
		user1.setDeptId(1);
		user1.setDeptName("营业部");
		user1.setEmployeeId(1);
		user1.setEmployeeName("张三");
		user1.setPassWord("123456");
		user1.setFunctionList(functionList);
		
		User user2 = new User();
		user2.setId(2);
		user2.setUserCode("10010");
		user2.setUserName("lisi");
		user2.setDeptId(1);
		user2.setDeptName("营业部");
		user2.setEmployeeId(1);
		user2.setEmployeeName("李四");
		user2.setPassWord("123456");
		user2.setFunctionList(functionList);
		
		userList.add(user1);
		userList.add(user2);
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUserList(userList);
		
		
		
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
