package com.topsun.posclient.common.ui.menu;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
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
		//Font font = new Font(parent.getDisplay(),"黑体", 9, SWT.BOLD);
//		pShelf.setFont(font);
//		pShelf.setBackground(color);
		pShelf.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		MenuTreeManagerFacede.getInstance().loadMenuExtension();
		MenuTreeManagerFacede.getInstance().initMenu(pShelf);

	}


	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}


}
