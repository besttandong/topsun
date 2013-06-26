package com.topsun.posclient.sales.ui.tree;

import java.net.URL;

import org.eclipse.core.internal.registry.BundleHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

public class MenuTreeLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		URL url;
		Bundle bundle = BundleHelper.getDefault().getBundle("com.topsun.posclient.sales");
		url = BundleUtility.find(bundle, "icons\\sales.png");
		return ImageDescriptor.createFromURL(url).createImage(); 
	}

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		return element.toString();
	}

}
