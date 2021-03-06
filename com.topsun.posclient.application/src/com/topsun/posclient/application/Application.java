package com.topsun.posclient.application;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import com.topsun.posclient.common.listener.IKeyListener;
import com.topsun.posclient.common.listener.KeyListenerManager;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication{

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) {
//		Display display = PlatformUI.createDisplay();
//		try {
//			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
//			if (returnCode == PlatformUI.RETURN_RESTART) {
//				return IApplication.EXIT_RESTART;
//			}
//			return IApplication.EXIT_OK;
//		} finally {
//			display.dispose();
//		}
		 

		
		Display display = PlatformUI.createDisplay();
		display.addFilter(SWT.KeyDown, new Listener()
	    {
	     public void handleEvent(Event e)
	     {
	      if (e.keyCode == SWT.INSERT)
	      {
	    	  KeyListenerManager.getInstance().fireChange("INSERT");
	      }
	     }
	    });;
		try {
			Shell shell = Display.getCurrent().getActiveShell();


		      try {
		        if (!doLogin(shell)) {
		          Platform.endSplash();
		          return EXIT_OK;
		        }
		      }
		      finally {
		        if (shell != null) {
		          shell.dispose();
		        }
		      }
			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
			if (returnCode == PlatformUI.RETURN_RESTART) {
				return IApplication.EXIT_RESTART;
			}
			return IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		if (!PlatformUI.isWorkbenchRunning())
			return;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(new Runnable() {
			public void run() {
				if (!display.isDisposed())
					workbench.close();
			}
		});
	}
	
	private boolean doLogin(Shell shell) {
	    LoginDialog dialog = new LoginDialog(shell);
	    
	    int result = dialog.open();
	    if (result != Dialog.OK) {
	      return false;
	    }
	    return true;
	  }
}
