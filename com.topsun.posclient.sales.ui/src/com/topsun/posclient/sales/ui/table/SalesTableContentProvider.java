package com.topsun.posclient.sales.ui.table;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;

public class SalesTableContentProvider extends ArrayContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list = (List)inputElement;
			return list.toArray();
		}
		return super.getElements(inputElement);

	}
}
