package com.topsun.posclient.system.ui;

import org.eclipse.osgi.util.NLS;

/**
 * 国际化
 * 
 * @author LiLei
 *
 */
public class MessageResources extends NLS
{
	  private static final String BUNDLE_NAME = "com.topsun.posclient.system.ui.messageresources";
	  
	  public static String message_currentconnstatus;
	  public static String message_serverip;
	  public static String message_port;
	  public static String message_reconnection;
	  public static String message_save;
	  public static String message_tips;
	  public static String message_tips_inputserverip;
	  public static String message_tips_inputport;
	  public static String message_tips_inputreconnectiontime;
	  
	  public static String message_tips_success;
	  public static String message_tips_failer;

	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}