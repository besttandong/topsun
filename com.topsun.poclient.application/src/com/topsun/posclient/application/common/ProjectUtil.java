package com.topsun.posclient.application.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import com.topsun.posclient.application.TopSunApplicationActivator;

/**
 * @author Dong
 * 
 */
public class ProjectUtil {

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
	
	public static String getRuntimeClassPath(){
		String path = TopSunApplicationActivator.getDefault().getBundle().getLocation().replace("initial@reference:file:", "")+ "bin\\";
		return path;
	}
	
	public static String[] listToStrArray(List<Object> element) {
		if (element == null || element.size() == 0)
			return null;
		Iterator<Object> it = element.iterator();
		String[] strArray = new String[element.size()];
		int i = 0;
		while (it.hasNext()) {
			strArray[i] = String.valueOf(it.next());
			i++;
		}
		return strArray;
	}
	
}
