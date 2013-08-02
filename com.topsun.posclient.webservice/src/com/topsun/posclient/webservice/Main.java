package com.topsun.posclient.webservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.topsun.posclient.webservice.dto.ArrayOfuser;
import com.topsun.posclient.webservice.dto.GetUserInfo;
import com.topsun.posclient.webservice.dto.GetUserInfoReq;
import com.topsun.posclient.webservice.dto.GetUserInfoResult;
import com.topsun.posclient.webservice.dto.HelloWorld;
import com.topsun.posclient.webservice.dto.ProcessResult;
import com.topsun.posclient.webservice.dto.User;
import com.topsun.posclient.webservice.dto.UserCredential;

public class Main {
	
	public static void main(String[] args){
		HelloWorld hw = new HelloWorld();
		hw.setInputPara("topsun");
		ServicesStub stub = null;
		
		UserCredential userCredential = new UserCredential();
		userCredential.setPassWord("000000");
		userCredential.setUserName("admin");
		
		GetUserInfoReq req = new GetUserInfoReq();
		req.setUserCredential(userCredential);
		req.setUserCode("admin");
		
		GetUserInfo getUserInfo = new GetUserInfo();
		getUserInfo.setGetUserInfoReq(req);
		try {
			stub = new ServicesStub();
			System.out.println(stub.helloWorld(hw).getHelloWorldResult());
			
			GetUserInfoResult result = stub.getUserInfo(getUserInfo).getGetUserInfoResult();
			ProcessResult pr = result.getResult();
			ArrayOfuser users = result.getUsers();
			System.out.println(pr.getFlag()+" -- "+pr.getMsg());
			System.out.println("获取到的用户信息: ");
			User[] userArray = users.getUser();
			for(int i=0; i<userArray.length; i++){
				System.out.println(userArray[i].getUserName()+" ---- "+userArray[i].getDeptName());
			}
			
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
