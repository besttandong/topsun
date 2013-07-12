package com.topsun.posclient.common;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.eclipse.core.runtime.Platform;

public class ProjectUtil {

	static SimpleDateFormat defaultFmt = new SimpleDateFormat("yyyy-MM-dd");

	static SimpleDateFormat defaultTimeFmt = new SimpleDateFormat(
			"yyyy-MM-dd hh:mm:ss");

	public static String getRuntimeClassPath() {
//		String path = Platform.getBundle(CommonCoreActivator.PLUGIN_ID)
//				.getLocation().replace("initial@reference:file:", "")
//				+ "bin\\";
		String path = Platform.getInstanceLocation().getURL().getFile();
		return path;
	}

	public static Date getDateByFormat(String dateStr, String custFormat) {
		SimpleDateFormat dataformat = new SimpleDateFormat(custFormat);
		Date date = null;
		try {
			date = dataformat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date getDate(String dateStr) {
		Date date = null;
		try {
			date = defaultFmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Date getDateTime(String dateStr) {
		Date date = null;
		try {
			date = defaultTimeFmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	private static Properties getProperties(String fileName) {
		InputStream in = ProjectUtil.class.getClassLoader()
				.getResourceAsStream(fileName);
		Properties p = new Properties();
		try {
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

	public static Object getPropertiesValue(String keyName, String fileName) {
		Properties p = getProperties(fileName);
		return p.get(keyName);
	}
	public static void writeProperties(String filePath, String parameterName,
			String parameterValue) throws Exception {
		Properties prop = new Properties();
		OutputStream outputStream = new FileOutputStream(filePath);  
		prop.setProperty(parameterName, parameterValue);  
		prop.store(outputStream, "author: topsun");  
        outputStream.close();  
	}

	public static String readValue(String filePath, String key) throws Exception {
		Properties props = new Properties();
		InputStream in = new BufferedInputStream(new FileInputStream(filePath));
		props.load(in);
		String value = props.getProperty(key);
		return value;
	}
	
	public static boolean checkConnection() {
		boolean status = false;
		try {
			String host = ProjectUtil.readValue(ProjectUtil.getRuntimeClassPath()+AppConstants.SEETING_FILE, "serverIP");
			String timeOut = ProjectUtil.readValue(ProjectUtil.getRuntimeClassPath()+AppConstants.SEETING_FILE, "timeOut");
			status = InetAddress.getByName(host).isReachable(Integer.valueOf(timeOut));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return status;
	}
	
	public static void main(String[] args){
		String filepath = ProjectUtil.getRuntimeClassPath()+AppConstants.SEETING_FILE;
		
		System.out.println("----------------->>> File full path is "+filepath);
		String serverIP = ProjectUtil.getPropertiesValue("serverIP", filepath).toString();
		System.out.println("----------------->>> "+serverIP);
		
		String port = ProjectUtil.getPropertiesValue("port", filepath).toString();
		System.out.println("----------------->>> "+port);
	}
	
}
