package com.topsun.posclient.system;

import org.eclipse.osgi.util.NLS;

/**
 * 国际化
 * 
 * @author LiLei
 *
 */
public class MessageResources extends NLS
{
	  private static final String BUNDLE_NAME = "com.topsun.posclient.system.messageresources";
	  
	  public static String message_error_failer;
	  public static String message_error_notconnection;
	  public static String message_error_savefailer;
	  
	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}