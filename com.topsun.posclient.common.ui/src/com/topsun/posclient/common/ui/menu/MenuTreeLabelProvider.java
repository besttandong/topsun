package com.topsun.posclient.common.ui.menu;

import java.net.URL;

import org.eclipse.core.internal.registry.BundleHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

import com.topsun.posclient.common.ui.model.TopSunTree;

public class MenuTreeLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		URL url = null;
		if(element instanceof TopSunTree){
			TopSunTree sunTree = (TopSunTree)element;	
			Bundle bundle = BundleHelper.getDefault().getBundle(sunTree.getPluginId());
			url = BundleUtility.find(bundle,sunTree.getIcon());
		}
		
		
		return ImageDescriptor.createFromURL(url).createImage(); 
	}

	@Override
	public String getText(Object element) {
		if(element instanceof TopSunTree){
			TopSunTree sunTree = (TopSunTree)element;	
			return sunTree.getTreeName();
		}
		return element.toString();
	}

}
