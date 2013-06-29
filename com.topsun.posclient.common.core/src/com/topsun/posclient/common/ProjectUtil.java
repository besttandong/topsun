package com.topsun.posclient.common;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.eclipse.core.runtime.Platform;

public class ProjectUtil {
	
	static SimpleDateFormat defaultFmt = new SimpleDateFormat("yyyy-MM-dd");
	
	static SimpleDateFormat defaultTimeFmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	private static Properties getProperties(String fileName) {
		InputStream in = ProjectUtil.class.getClassLoader().getResourceAsStream(fileName);
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

	public static String getRuntimeClassPath(){
		String path = Platform.getBundle(CommonCoreActivator.PLUGIN_ID).getLocation().replace("initial@reference:file:", "")+ "bin\\";
		return path;
	}
	
	/**
	 * 格式化日期
	 * 
	 * @param dateStr 日期字符 如 2013-06-28
	 * @param custFormat 格式字符 如 yyyy-MM-dd
	 * @return Date对象
	 */
	public static Date getDateByFormat(String dateStr, String custFormat){
		SimpleDateFormat dataformat = new SimpleDateFormat(custFormat);
		Date date = null;
		try {
			date = dataformat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date getDate(String dateStr){
		Date date = null;
		try {
			date = defaultFmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date getDateTime(String dateStr){
		Date date = null;
		try {
			date = defaultTimeFmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
}
