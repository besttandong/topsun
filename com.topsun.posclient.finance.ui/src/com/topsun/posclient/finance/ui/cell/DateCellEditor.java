package com.topsun.posclient.finance.ui.cell;

import java.util.Calendar;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;

import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

public class DateCellEditor extends CellEditor {
	public Table table;
	public DateCellEditor(Composite parent){
		super(parent);
		this.table = (Table)parent;
	}

	@Override
	protected Control createControl(Composite parent) {
		CalendarCombo calendarCombo = new CalendarCombo(parent, SWT.READ_ONLY, new Settings(), null);
		calendarCombo.setDate(Calendar.getInstance());
//		calendarCombo.setEnabled(false);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		calendarCombo.setLayoutData(data);
		return calendarCombo;
	}

	@Override
	protected Object doGetValue() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	protected void doSetFocus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doSetValue(Object value) {
		value.toString();
		// TODO Auto-generated method stub
		
	}

}

class Settings extends DefaultSettings {
	
	/*			public Locale getLocale() {
					//return Locale.GERMAN;
				}
	*/
				public boolean keyboardNavigatesCalendar() {
					return false;
				}

				
			}
