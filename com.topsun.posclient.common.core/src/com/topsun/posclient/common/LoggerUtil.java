package com.topsun.posclient.common;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.topsun.posclient.common.core.CommonCoreActivator;

/**
 * 日志处理
 * 
 * @author LiLei
 *
 */
public class LoggerUtil {

	public static void logError(Throwable t) {
		logError(null, t.getMessage(), t);
	}

	public static void logError(String bundleID, Throwable t) {
		logError(bundleID, t.getMessage(), t);
	}

	public static void logError(String bundleID, String message, Throwable t) {
		log(bundleID, message, t, Status.ERROR, Status.OK);
	}

	public static void logWarning(String message) {
		log(null, message, null, Status.WARNING, Status.OK);
	}

	public static void logError(String bundleID, String message) {
		logError(bundleID, message, null);
	}

	public static void log(String bundleID, String message, Throwable t, int serverity, int code) {
		if (bundleID == null) {
			bundleID = CommonCoreActivator.getDefault().getBundle().getSymbolicName();
		}
		Platform.getLog(Platform.getBundle(bundleID)).log(new Status(serverity, bundleID, code, message, t));
	}
}
