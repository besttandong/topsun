package com.topsun.posclient.common.ui.utils;

import java.net.URL;

import org.eclipse.core.internal.registry.BundleHelper;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

public class ImageUtils {
	public static Image createImage(String bundleName,String iconsPath){
		URL url;
		Bundle bundle = BundleHelper.getDefault().getBundle(bundleName);
		url = BundleUtility.find(bundle, iconsPath);
		return ImageDescriptor.createFromURL(url).createImage();
	}
}
