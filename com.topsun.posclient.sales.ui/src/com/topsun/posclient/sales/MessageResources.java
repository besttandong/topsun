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
	  private static final String BUNDLE_NAME = "com.topsun.posclient.sales.messageresources";
	  
	  public static String message_ui_group_iteminfo;
	  public static String message_ui_group_baseinfo;
	  public static String message_ui_text_code_search;
	  public static String message_ui_text_code;
	  public static String message_ui_text_num;
	  public static String message_ui_text_retailPrice;
	  public static String message_ui_text_amount;
	  public static String message_ui_button_cashier;
	  public static String message_ui_tips;
	  public static String message_ui_tips_guideisnotnull;
	  public static String message_ui_button_cancel;
	  public static String message_ui_lable_maker;
	  public static String message_ui_label_checker;
	  public static String message_ui_label_numcount;
	  public static String message_ui_label_amountcount;
	  public static String message_ui_label_repositorynum;
	  public static String message_ui_label_inputbarcode;
	  public static String message_ui_label_num;
	  public static String message_ui_label_saomiao;
	  public static String message_ui_label_saomiaolen;
	  public static String message_ui_label_length;
	  public static String message_ui_label_shop;
	  public static String message_ui_label_no;
	  public static String message_ui_label_balloter;
	  public static String message_ui_label_ballotNo;
	  public static String message_ui_label_guide;
	  public static String message_ui_label_salesDate;
	  public static String message_ui_label_vipcardno;
	  public static String message_ui_label_vipname;
	  public static String message_ui_label_point;
	  public static String message_ui_label_blance;
	  public static String message_ui_label_remark;

	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}