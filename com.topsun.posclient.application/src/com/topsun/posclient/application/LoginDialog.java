package com.topsun.posclient.application;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.topsun.posclient.common.POSException;
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
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		container.setLayout(gridLayout);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		final Label label = new Label(container, SWT.RIGHT);
		// label.setImage(CacheImage.getINSTANCE().getImage(AppConstants.APPLICATION_ID,
		// ImageKey.USER_NAME));
		label.setText(MessageResources.message_username);

		userNameText = new Text(container, SWT.BORDER);
		final GridData gd_userNameText = new GridData(SWT.FILL, SWT.CENTER,
				true, false);
		userNameText.setLayoutData(gd_userNameText);
		userNameText.setText("admin");

		final Label label_1 = new Label(container, SWT.RIGHT);
		label_1.setText(MessageResources.message_password);

		passwordText = new Text(container, SWT.BORDER);
		final GridData gd_passwordText = new GridData(SWT.FILL, SWT.CENTER,
				true, false);
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
	protected Point getInitialSize() {
		return new Point(354, 229);
	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(MessageResources.message_title);
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
				throw new Exception(MessageResources.message_tips_loginfailer);
			}
		} catch (POSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
