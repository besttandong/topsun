package com.topsun.posclient.common;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.eclipse.core.runtime.Platform;

/**
 * @author LiLei
 *
 */
public class ProjectUtil {

	static SimpleDateFormat defaultFmt = new SimpleDateFormat("yyyy-MM-dd");

	static SimpleDateFormat defaultTimeFmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	public static String getRuntimeClassPath() {
		// String path = Platform.getBundle(CommonCoreActivator.PLUGIN_ID)
		// .getLocation().replace("initial@reference:file:", "")
		// + "bin\\";
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
	
	public static String getDateString(Date date) {
		String dateStr = null;
		if(null == date){
			dateStr = defaultFmt.format(new Date());
		}else{
			dateStr = defaultFmt.format(date);
		}
		return dateStr;
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

	public static String readValue(String filePath, String key)
			throws Exception {
		Properties props = new Properties();
		InputStream in = new BufferedInputStream(new FileInputStream(filePath));
		props.load(in);
		String value = props.getProperty(key);
		return value;
	}

	public static BigDecimal getBigDecimal(String value) {
		if (null != value) {
			value = value.trim();
		} else {
			value = "0";
		}
		BigDecimal decimal = new BigDecimal(value);
		return decimal;
	}

	public static Calendar getCalendar(Date date) {
		if (null == date) {
			date = new Date();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
	
	/**
	 * Check net connection status
	 * @return
	 */
	public static boolean checkConnection() {
		boolean status = false;
		try {
			String host = ProjectUtil.readValue(
					ProjectUtil.getRuntimeClassPath()
							+ AppConstants.SEETING_FILE, "serverIP");
			String timeOut = ProjectUtil.readValue(
					ProjectUtil.getRuntimeClassPath()
							+ AppConstants.SEETING_FILE, "reconnectionTime");
			status = InetAddress.getByName(host).isReachable(
					Integer.valueOf(timeOut));
			System.out.println("联机状态 --------->>> "+status);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static void main(String[] args){
		boolean status = false;
		try {
			status = InetAddress.getByName("127.0.0.1").isReachable(2000);
			System.out.println("联机状态 --------->>> "+status);
			
			InetAddress address1=InetAddress.getLocalHost();
			System.out.println(address1.isReachable(5000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
