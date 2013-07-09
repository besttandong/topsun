package com.topsun.posclient.sales;

import org.eclipse.osgi.util.NLS;

/**
 * 国际化
 * 
 * @author LiLei
 *
 */
public class MessageResources extends NLS
{
	  private static final String BUNDLE_NAME = "com.topsun.posclient.sales.ui.messageresources";
	  
	  public static String message_ui_group_iteminfo;
	  public static String message_serverip;
	  public static String message_port;
	  public static String message_reconnection;
	  public static String message_save;
	  public static String message_tips;
	  public static String message_tips_inputserverip;
	  public static String message_tips_inputport;

	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}