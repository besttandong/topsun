package com.topsun.posclient.sales.ui.table;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SalesTableContentProvider extends ArrayContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list = (List)inputElement;
			return list.toArray();
		}
		return super.getElements(inputElement);

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
//		oldInput.toString();
//		newInput.toString();
//		super.inputChanged(viewer, oldInput, newInput);
	}
	
	
}
