/*******************************************************************************
 * $Header: /cvsroot/prototype/01_src/refactor/ui-framework/com.icbc.desktop.ui/src/com/icbc/desktop/ui/menu/control/appmenu/AutoLoadMenuListener.java,v 1.1 2011/09/27 01:01:50 yujie Exp $
 * $Revision: 1.1 $
 * $Date: 2011/09/27 01:01:50 $
 *
 *==============================================================================
 *
 * Copyright (c) 2005-2015 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2011-9-24
 *******************************************************************************/


package com.topsun.posclient.system.service.impl;

/**
 * 
 *
 * @author  (mailto:yujie@primeton.com)
 */
public interface AutoLoadMenuListener {
	void drawProgressMonitor(String title);
	
	void closeProgressMonitor(String title);
}

