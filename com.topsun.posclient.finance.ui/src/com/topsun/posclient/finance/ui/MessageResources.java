package com.topsun.posclient.finance.ui;

import org.eclipse.osgi.util.NLS;

/**
 * 国际化
 * 
 * @author LiLei
 *
 */
public class MessageResources extends NLS
{
	  private static final String BUNDLE_NAME = "com.topsun.posclient.finance.ui.messageresources";
	  
	  static {
	    NLS.initializeMessages(BUNDLE_NAME, MessageResources.class);
	  }
	}