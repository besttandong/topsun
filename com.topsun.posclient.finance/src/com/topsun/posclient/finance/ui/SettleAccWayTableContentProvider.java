package com.topsun.posclient.finance.ui;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;

/**
 * @author Dong
 *
 */
public class SettleAccWayTableContentProvider extends ArrayContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ArrayContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list = (List)inputElement;
			return list.toArray();
		}
		return super.getElements(inputElement);

	}
}
