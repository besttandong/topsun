/*******************************************************************************
 * $Header: /cvsroot/prototype/01_src/refactor/ui-framework/com.icbc.desktop.ui/src/com/icbc/desktop/ui/menu/control/appmenu/AutoLoadProgressMananger.java,v 1.1 2011/09/27 01:01:50 yujie Exp $
 * $Revision: 1.1 $
 * $Date: 2011/09/27 01:01:50 $
 *
 *==============================================================================
 *
 * Copyright (c) 2005-2015 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2011-9-26
 *******************************************************************************/


package com.topsun.posclient.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.ProgressMonitorPart;

/**
 * 
 *
 * @author mailto:yujie@primeton.com)
 */
public class AutoLoadProgressMananger {
	
	private static AutoLoadProgressMananger autoLoadProgressMananger = new AutoLoadProgressMananger();
	
	private List<ProgressMonitorPart> monitorPartList = new ArrayList<ProgressMonitorPart>();

	private AutoLoadProgressMananger(){
		
	}
	
	public static AutoLoadProgressMananger getInstance(){
		if(autoLoadProgressMananger == null){
			autoLoadProgressMananger = new AutoLoadProgressMananger();
		}
		return autoLoadProgressMananger;
	}
	
	
	public void addMonitor(ProgressMonitorPart monitorPart){
		monitorPartList.add(monitorPart);
	}
	
	public void removeMonitor(ProgressMonitorPart monitorPart){
		monitorPartList.remove(monitorPart);
	}
	
	public int getSize(){
		return monitorPartList.size();
	}
	
}

