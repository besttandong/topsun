package com.topsun.posclient.finance;

import org.eclipse.osgi.util.NLS;

/**
 * @author LiLei
 *
 */
public class MessageResources extends NLS
{
	  private static final String BUNDLE_NAME = "com.topsun.posclient.finance.messageresources";
	  
	  public static String message_tips_save_error;
	  public static String message_tips_save_success;
	  public static String message_tips_query_error;
	  
	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}