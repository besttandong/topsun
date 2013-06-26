/*******************************************************************************
 * $Header$
 * $Revision$
 * $Date$
 *
 *==============================================================================
 *
 * Copyright (c) 2005-2015 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2011-10-14
 *******************************************************************************/


package com.topsun.posclient.sales.utils;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PlatformUI;


/**
 * 
 * TODO 此处填写 class 信息
 *
 * @author Carrod.yu (mailto:haha.opensource@gmail.com)
 */
public class ColorUtils {
	public static Color getSystemColor(int RGB){
		return PlatformUI.getWorkbench().getDisplay().getSystemColor(RGB);
	}
}

/*
 * 修改历史
 * $Log$ 
 */