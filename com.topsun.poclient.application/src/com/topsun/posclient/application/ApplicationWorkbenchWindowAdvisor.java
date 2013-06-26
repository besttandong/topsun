package com.topsun.posclient.application;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShowCoolBar(false);// ��ʾ����������
		configurer.setShowStatusLine(true);// ��ʾ״̬������
		configurer.setShowProgressIndicator(false); // ��ʾ����������
		configurer.setTitle("TOPSUN");
		//configurer.setShellStyle(SWT.CLOSE | SWT.MIN |SWT.MAX);
		configurer.setShowMenuBar(false);// ��ʾ�˵�����
		configurer.setShowFastViewBars(false);
	}

	@Override
	public void postWindowCreate() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		Shell shell = configurer.getWindow().getShell();
		customizationWindow(shell);
		
		IStatusLineManager statusLine = configurer.getActionBarConfigurer().getStatusLineManager();
		statusLine.setMessage(null, "����ģʽ\t\t|���ţ�Ӫҵ��\t\t|����Ա������");  
	}
	
	private void customizationWindow(Shell shell) {
		shell.setMaximized(true);
		//frozenWindow(shell);
	}
	
	private void frozenWindow(final Shell shell) {
		final AtomicBoolean windowOpened = new AtomicBoolean(false);
		final AtomicInteger frozenWidth = new AtomicInteger();
		final AtomicInteger frozenHeight = new AtomicInteger();
		final AtomicInteger frozenX = new AtomicInteger();
		final AtomicInteger frozenY = new AtomicInteger();

		getWindowConfigurer().getWorkbenchConfigurer().getWorkbench().addWindowListener(new WindowListenerAdaptor() {
			public void windowOpened(IWorkbenchWindow window) {
				Rectangle bounds = shell.getBounds();
				windowOpened.set(true);
				frozenX.set(bounds.x);
				frozenY.set(bounds.y);
				frozenWidth.set(bounds.width);
				frozenHeight.set(bounds.height);
			}
		});

		shell.addControlListener(new ControlListener() {
			public void controlResized(ControlEvent e) {
				if (windowOpened.get()) {
					if (!shell.getMinimized() && !shell.getMaximized()) {
						shell.setLocation(frozenX.get(), frozenY.get());
						shell.setSize(frozenWidth.get(), frozenHeight.get());
					}
				}
			}

			public void controlMoved(ControlEvent e) {
				if (windowOpened.get()) {
					if (shell.getLocation().x != frozenX.get() || shell.getLocation().y != frozenY.get()) {
						shell.setLocation(frozenX.get(), frozenY.get());
						shell.setSize(frozenWidth.get(), frozenHeight.get());
					}
				}
			}
		});
	}
	
	
}
