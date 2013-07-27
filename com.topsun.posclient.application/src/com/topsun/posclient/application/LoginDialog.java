package com.topsun.posclient.application;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.common.LoggerUtil;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.ui.utils.ImageUtils;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.system.service.ILoginService;
import com.topsun.posclient.system.service.impl.LoginServiceImpl;


public class LoginDialog extends TitleAreaDialog {
	
	private  ILoginService longinsService = new LoginServiceImpl();

	private Text passwordText;
	private Text userNameText;
	

	/**
	 * Create the dialog
	 * 
	 * @param parentShell
	 */
	public LoginDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Font font = new Font(parent.getDisplay(),"宋体", 10, SWT.BOLD);
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
//		container.getShell().setSize(600, 400);
		container.setBackgroundImage(ImageUtils.createImage(TopSunApplicationActivator.PLUGIN_ID, "icons//back.png"));
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginLeft = 60;
		gridLayout.marginHeight = 40;
		gridLayout.marginTop = 30;
		gridLayout.marginBottom = 30;
		gridLayout.numColumns = 2;
		container.setLayout(gridLayout);
		GridData data = new GridData();
		data.widthHint = 400;
		data.heightHint = 400;
		container.setLayoutData(data);
		

		final Label label = new Label(container, SWT.RIGHT);
		// label.setImage(CacheImage.getINSTANCE().getImage(AppConstants.APPLICATION_ID,
		// ImageKey.USER_NAME));
		
		label.setFont(font);
		label.setForeground( Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		label.setText(MessageResources.message_username+"    ");

		userNameText = new Text(container, SWT.BORDER);
		GridData gd_userNameText = new GridData();
		gd_userNameText.widthHint = 150;
		userNameText.setFont(font);
		userNameText.setForeground( Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		userNameText.setLayoutData(gd_userNameText);
		userNameText.setText("admin");

		final Label label_1 = new Label(container, SWT.RIGHT);
		label_1.setText(MessageResources.message_password);
		GridData data2 = new GridData();
		data2.verticalIndent = 20;
		label_1.setFont(font);
		label_1.setForeground( Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		label_1.setLayoutData(data2);
		
		
		passwordText = new Text(container, SWT.BORDER|SWT.PASSWORD);
		final GridData gd_passwordText = new GridData();
		gd_passwordText.widthHint = 150;
		gd_passwordText.verticalIndent = 20;
		passwordText.setFont(font);
		passwordText.setForeground( Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		passwordText.setLayoutData(gd_passwordText);
		passwordText.setText("123456");

		setTitle(MessageResources.message_posclient);
		return area;
	}

	/**
	 * Create contents of the button bar
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, MessageResources.message_login, true);
		createButton(parent, IDialogConstants.CANCEL_ID, MessageResources.message_cancel, false);
	}

	/**
	 * Return the initial size of the dialog
	 */

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setSize(400,400);
		Shell shell = Display.getCurrent().getActiveShell();
		Rectangle screenSize = Display.getDefault().getClientArea();
		Rectangle frameSize = newShell.getBounds();
		newShell.setLocation(new Point((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2));
		newShell.setText(MessageResources.message_title);
		newShell.setBackgroundMode(SWT.INHERIT_FORCE);
		
	}

	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			try {
				login(userNameText.getText(), passwordText.getText());
				okPressed();
			} catch (Exception e) {
				MessageDialog.openError(getShell(), MessageResources.message_tips_loginfailer, e.getMessage());
				e.printStackTrace();
				return;
			}
		}
		if (buttonId == IDialogConstants.CANCEL_ID) {
			cancelPressed();
		}
		super.buttonPressed(buttonId);
	}

	/**
	 * <p>
	 * </p>
	 * 
	 * @throws Exception
	 */
	private void login(String userName, String password) throws Exception {
		
		User operator;
		try {
			operator = longinsService.getUserData(userName, password);
			if (null != operator){
				return;
			}else{
				LoggerUtil.logError(TopSunApplicationActivator.PLUGIN_ID, MessageResources.message_tips_loginfailer);
				throw new Exception(MessageResources.message_tips_loginfailer);
			}
		} catch (POSException e) {
			e.printStackTrace();
			LoggerUtil.logError(TopSunApplicationActivator.PLUGIN_ID, e.getErrorMessage());
		}
		
	}
}
