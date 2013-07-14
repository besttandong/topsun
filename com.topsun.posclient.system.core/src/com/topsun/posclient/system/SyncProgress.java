package com.topsun.posclient.system;

import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;

public class SyncProgress {
	
	
	private Text infoText;
	private ProgressBar bar;
	
	public SyncProgress( ProgressBar bar,Text infoText){
		this.bar = bar;
		this.infoText = infoText;
	}
	
	
	public Text getInfoText() {
		return infoText;
	}
	public void setInfoText(Text infoText) {
		this.infoText = infoText;
	}
	public ProgressBar getBar() {
		return bar;
	}
	public void setBar(ProgressBar bar) {
		this.bar = bar;
	}
	
	
	
}
