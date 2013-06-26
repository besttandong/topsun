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


package com.topsun.posclient.sales.ui.menu;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.sales.ui.menu.control.PShelf;
import com.topsun.posclient.sales.ui.menu.control.PShelfItem;
import com.topsun.posclient.sales.ui.tree.ImageUtils;
import com.topsun.posclient.sales.ui.tree.TopSunMenuTreeManager;
import com.topsun.posclient.sales.utils.ColorUtils;

/**
 * TODO 此处填写 class 信息
 *
 * @author Carrod.yu (mailto:haha.opensource@gmail.com)
 */
public class MenuView extends ViewPart {

	/**
	 * 
	 */
	public MenuView() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setBackground(ColorUtils.getSystemColor(SWT.COLOR_WHITE));
		GridLayout gridLayout = new GridLayout(1,false);
		composite.setLayout(gridLayout);
		
		PShelf pShelf = new PShelf(composite, SWT.BORDER);
//		pShelf.setBackground(color);
		pShelf.setLayoutData(new GridData(GridData.FILL_BOTH));
		Color color = PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_WHITE);
		
		PShelfItem item1 = new PShelfItem(pShelf, SWT.NONE);
		item1.setText("销售");
		Composite comp1 = item1.getBody();
		item1.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "salestree.png"));
		comp1.setBackground(color);
		comp1.setLayout(new GridLayout(1,false));
		TopSunMenuTreeManager.createSalesTree(comp1);
	
		PShelfItem item2 = new PShelfItem(pShelf, SWT.NONE);
		item2.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "buy.png"));
		item2.setText("财务管理");
		Composite comp2 = item2.getBody();
		item2.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "salestree.png"));
		comp2.setBackground(color);
		comp2.setLayout(new GridLayout(1,false));
		TopSunMenuTreeManager.createFinanceTree(comp2);
		
		PShelfItem item3 = new PShelfItem(pShelf, SWT.NONE);
		item3.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "salestree.png"));
		item3.setText("库存管理");
		Composite comp3 = item3.getBody();
		comp3.setBackground(color);
		comp3.setLayout(new GridLayout(1,false));
		TopSunMenuTreeManager.createRepositoryTree(comp3);
		
		PShelfItem item4 = new PShelfItem(pShelf, SWT.NONE);
		item4.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "buy.png"));
		item4.setText("系统设置");
		Composite comp4 = item4.getBody();
		comp4.setBackground(color);
		comp4.setLayout(new GridLayout(1,false));
		TopSunMenuTreeManager.createSystemTree(comp4);

	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}

/*
 * 修改历史
 * $Log$ 
 */