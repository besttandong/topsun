package com.topsun.posclient.finance.ui.cell;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;

import com.topsun.widget.calendar.CalendarCombo;
import com.topsun.widget.calendar.DefaultSettings;

public class DateCellEditor extends CellEditor {
	public Table table;
	
	public CalendarCombo calendarCombo ;
	
	public DateCellEditor(Composite parent){
		super(parent);
		this.table = (Table)parent;
	}

	@Override
	protected Control createControl(Composite parent) {
		CalendarCombo date = new CalendarCombo(parent, SWT.READ_ONLY, new Settings(), null);
		date.setDate(Calendar.getInstance());
//		calendarCombo.setEnabled(false);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		date.setLayoutData(data);
		calendarCombo = date;
		return date;
	}

	@Override
	protected Object doGetValue() {
		// TODO Auto-generated method stub
		return calendarCombo.getDateAsString();
	}

	@Override
	protected void doSetFocus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doSetValue(Object value) {
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");

		Date date;
		try {
			if("".equals(value.toString())){
				return;
			}
			date = sdf.parse(value.toString());
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendarCombo.setDate(calendar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		
		
//		value = calendarCombo.getDateAsString();
//		value.toString();
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
