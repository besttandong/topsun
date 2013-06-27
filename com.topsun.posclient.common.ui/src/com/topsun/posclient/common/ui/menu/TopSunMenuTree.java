package com.topsun.posclient.common.ui.menu;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.ui.utils.ColorUtils;
import com.topsun.posclient.common.ui.utils.ImageUtils;
import com.topsun.posclient.widget.pshelf.PShelf;
import com.topsun.posclient.widget.pshelf.PShelfItem;

public class TopSunMenuTree extends ViewPart{


	/**
	 * 
	 */
	public TopSunMenuTree() {
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
		Color color = PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_WHITE);
		PShelf pShelf = new PShelf(composite, SWT.BORDER);
//		pShelf.setBackground(color);
		pShelf.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		MenuTreeManagerFacede.getInstance().loadMenuExtension();
		MenuTreeManagerFacede.getInstance().initMenu(pShelf);
//		

//		TopSunMenuTreeManager.createSalesTree(comp1);
//		PShelfItem item2 = new PShelfItem(pShelf, SWT.NONE);
//		item2.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "buy.png"));
//		item2.setText("财务管理");
//		Composite comp2 = item2.getBody();
//		item2.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "salestree.png"));
//		comp2.setBackground(color);
//		comp2.setLayout(new GridLayout(1,false));
//		TopSunMenuTreeManager.createFinanceTree(comp2);
//		
//		PShelfItem item3 = new PShelfItem(pShelf, SWT.NONE);
//		item3.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "salestree.png"));
//		item3.setText("库存管理");
//		Composite comp3 = item3.getBody();
//		comp3.setBackground(color);
//		comp3.setLayout(new GridLayout(1,false));
//		TopSunMenuTreeManager.createRepositoryTree(comp3);
//		
//		PShelfItem item4 = new PShelfItem(pShelf, SWT.NONE);
//		item4.setImage(ImageUtils.createImage(SalesActivator.PLUGIN_ID, "buy.png"));
//		item4.setText("系统设置");
//		Composite comp4 = item4.getBody();
//		comp4.setBackground(color);
//		comp4.setLayout(new GridLayout(1,false));
//		TopSunMenuTreeManager.createSystemTree(comp4);

	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}


}
