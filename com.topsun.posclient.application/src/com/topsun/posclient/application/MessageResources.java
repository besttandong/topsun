package com.topsun.posclient.application;

import org.eclipse.osgi.util.NLS;

/**
 * 国际化
 * 
 * @author LiLei
 *
 */
public class MessageResources extends NLS
{
	  private static final String BUNDLE_NAME = "com.topsun.posclient.application.messageresources";
	  
	  public static String message_username;
	  public static String message_password;
	  public static String message_login;
	  public static String message_cancel;
	  public static String message_posclient;
	  public static String message_title;
	  public static String message_message_tips_loginfailer;

	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}