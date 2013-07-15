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
	  
	  public static String message_tips;
	  public static String message_error_failer;
	  public static String message_error_notconnection;
	  public static String message_error_savefailer;
	  
	  public static String message_tips_startsyncuser;
	  public static String message_tips_endsyncuser;
	  public static String message_tips_startsyncshop;
	  public static String message_tips_endsyncshop;
	  public static String message_tips_startsyncitem;
	  public static String message_tips_endsyncitem;
	  public static String message_tips_startsyncsales;
	  public static String message_tips_endsyncsales;
	  public static String message_tips_startsynccashiermode;
	  public static String message_tips_endsynccashiermode;
	  public static String message_tips_startsyncpayment;
	  public static String message_tips_endsyncpayment;
	  public static String message_tips_startsyncadjustshop;
	  public static String message_tips_endsyncadjustshop;
	  public static String message_tips_startsyncadjustrepository;
	  public static String message_tips_endsyncadjustrepository;
	  public static String message_tips_sync_success;
	  public static String message_tips_sync_failer;
	  
	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}