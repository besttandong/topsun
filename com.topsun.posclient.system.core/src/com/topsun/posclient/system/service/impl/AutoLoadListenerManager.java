/*******************************************************************************
 * $Header: /cvsroot/prototype/01_src/refactor/ui-framework/com.icbc.desktop.ui/src/com/icbc/desktop/ui/menu/control/appmenu/AutoLoadListenerManager.java,v 1.1 2011/09/27 01:01:50 yujie Exp $
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

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *(mailto:yujie@primeton.com)
 */
public class AutoLoadListenerManager {
	
	private static AutoLoadListenerManager autoLoadListenerManager = new AutoLoadListenerManager();
	private List<AutoLoadMenuListener> list = new ArrayList<AutoLoadMenuListener>();
	
	public static  AutoLoadListenerManager getInstance(){
		if(autoLoadListenerManager == null){
			autoLoadListenerManager = new AutoLoadListenerManager();
		}
		return autoLoadListenerManager;
	}
	
	public void addListener(AutoLoadMenuListener autoLoadMenuListener){
		list.add(autoLoadMenuListener);
	}
	
	public void fireClose(String title){
		for (AutoLoadMenuListener autoLoadMenuListener : list) {
			autoLoadMenuListener.closeProgressMonitor(title);
		}
	}
	
	public void fireOpen(String title){
		for (AutoLoadMenuListener autoLoadMenuListener : list) {
			autoLoadMenuListener.drawProgressMonitor(title);
		}
	}
}

/*
 * �޸���ʷ
 * $Log: AutoLoadListenerManager.java,v $
 * Revision 1.1  2011/09/27 01:01:50  yujie
 * Update : �Զ����ز˵�
 * 
 */