package com.topsun.posclient.common.ui.menu;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.topsun.posclient.common.ui.model.TopSunTree;

public class MenuTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List){
			List list  = (List)inputElement;
			for (Object object : list) {
				if(object instanceof TopSunTree){
					TopSunTree tree  = (TopSunTree)object;;
				}
			}
			return list.toArray();
		}
		return new Object[]{inputElement};
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
