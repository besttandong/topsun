package com.topsun.posclient.repository.ui.view;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;

public class AdjustRepositoryTableContentProvider extends ArrayContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list = (List)inputElement;
			return list.toArray();
		}
		return super.getElements(inputElement);

	}
}
