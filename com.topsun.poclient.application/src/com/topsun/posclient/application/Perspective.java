package com.topsun.posclient.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		IFolderLayout menu = layout.createFolder("menu", IPageLayout.LEFT,0.20f,layout.getEditorArea());
		IFolderLayout editor = layout.createFolder("editor", IPageLayout.RIGHT,  0.80f,layout.getEditorArea());
		menu.addView("topsun.menu");
		menu.addPlaceholder("topsun.menu");
//		editor.addView("com.topsun.sales");
//		editor.addPlaceholder("com.topsun.sales");
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
//		new LockSashMove().earlyStartup();
	}

}
