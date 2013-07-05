package com.topsun.posclient.common;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.eclipse.core.runtime.Platform;

import com.topsun.posclient.common.core.CommonCoreActivator;

public class ProjectUtil {

	static SimpleDateFormat defaultFmt = new SimpleDateFormat("yyyy-MM-dd");

	static SimpleDateFormat defaultTimeFmt = new SimpleDateFormat(
			"yyyy-MM-dd hh:mm:ss");

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

	public static String getRuntimeClassPath() {
		String path = Platform.getBundle(CommonCoreActivator.PLUGIN_ID)
				.getLocation().replace("initial@reference:file:", "")
				+ "bin\\";
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

	public static void writeProperties(String filePath, String parameterName,
			String parameterValue) throws Exception {
		Properties prop = new Properties();
		InputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		prop.setProperty(parameterName, parameterValue);
	}

	public static String readValue(String filePath, String key) throws Exception {
		Properties props = new Properties();
		InputStream in = new BufferedInputStream(new FileInputStream(filePath));
		props.load(in);
		String value = props.getProperty(key);
		return value;
	}
	
	public static boolean doCheck() {
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
}
