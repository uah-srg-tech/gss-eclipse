package es.uah.aut.srg.gss.generator.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class GSSGeneratorMainTab extends AbstractLaunchConfigurationTab {

	protected Text fDatabaseLocationText;
	protected Button fDatabaseWorkspaceButton;
	protected Button fDatabaseFileSystemButton;
	
	protected Text fOutputLocationText;
	protected Button fOutputWorkspaceButton;
	
	protected static final String TAB_MAIN_NAME = "Main";
	
	protected static final String CONTROL_INPUT_DATABASE_LABEL = "Input Database";
	protected static final String CONTROL_OUTPUT_FOLDER_LABEL = "Output Folder";
	
	protected static final String BUTTON_WORKSPACE_LABEL = "&Workspace...";
	protected static final String BUTTON_FILESYSTEM_LABEL = "File System...";
	protected static final String LOCATION_LABEL = "Location:";
	protected static final String INPUT_DATABASE_LABEL = "Input Database";
	protected static final String SELECT_FOLDER_LABEL = "Select folder:";
	protected static final String SELECT_FILE_LABEL = "Select file:";
	
	protected InputListener fListener = new InputListener();
	
	class InputListener extends SelectionAdapter implements ModifyListener {
		@Override
		public void widgetSelected(SelectionEvent e) {
			Object source = e.getSource();
			if (source == fDatabaseFileSystemButton) {
				handleSelectFileFromFileSystem(fDatabaseFileSystemButton, fDatabaseLocationText);
			} else if (source == fDatabaseWorkspaceButton) {
				handleSelectFileFromWorkspace(fDatabaseWorkspaceButton, fDatabaseLocationText);
			} else if (source == fOutputWorkspaceButton) {
				handleSelectFolderFromWorkspace(fDatabaseWorkspaceButton, fOutputLocationText);
			}else  {
				updateLaunchConfigurationDialog();
			}
		}

		@Override
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
		}
	}
	
	protected void handleSelectFileFromFileSystem(Button source, Text dest) {
		
		FileDialog dialog = new FileDialog(source.getShell());
		dialog.setText(SELECT_FILE_LABEL);
		
		String result = dialog.open();
		if (result != null) {
			dest.setText(URI.createFileURI(result).toString());
		}
	}
	
	protected void handleSelectFolderFromWorkspace(Button source, Text dest) {
		
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(),
				true, "Output Folder Selection");
		dialog.setMessage("Select output folder");
				
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			IPath file = (IPath) result[0];
			dest.setText(URI.createPlatformResourceURI(file.toString(), true).toString());
		}
	}
	
	protected void handleSelectFileFromWorkspace(Button source, Text dest) {
		
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				getShell(), new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setTitle("Database Selection");
		dialog.setMessage("Select the source database");
		dialog.setAllowMultiple(false);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

		dialog.setValidator(new ISelectionStatusValidator() {
			@Override
			public IStatus validate(Object[] selection) {
				if (selection.length == 1 && selection[0] instanceof IFile) {
					return new Status(IStatus.OK, "0", 0, "", null);
				}
				return new Status(IStatus.ERROR, "0", 0,
						"Please select a valid file", null);
			}
		});
		
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			IFile file = (IFile) result[0];
			dest.setText(URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
		}
	}
	
	public void createInputDatabaseControl(Composite parent) {
		
		Group group = new Group(parent, SWT.NONE);
		group.setText(CONTROL_INPUT_DATABASE_LABEL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label fLocationLabel = new Label(group, SWT.NONE);
		fLocationLabel.setText(LOCATION_LABEL);
		
		fDatabaseLocationText = new Text(group, SWT.SINGLE | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 400;
		fDatabaseLocationText.setLayoutData(gd);
		fDatabaseLocationText.addModifyListener(fListener);
		
		Composite buttons = new Composite(group, SWT.NONE);
		layout = new GridLayout(2, false);
		layout.marginHeight = layout.marginWidth = 0;
		buttons.setLayout(layout);
		gd = new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END);
		gd.horizontalSpan = 2;
		buttons.setLayoutData(gd);
		
		fDatabaseWorkspaceButton = new Button(buttons, SWT.PUSH);
		fDatabaseWorkspaceButton.setText(BUTTON_WORKSPACE_LABEL);
		fDatabaseWorkspaceButton.setLayoutData(new GridData());
		fDatabaseWorkspaceButton.addSelectionListener(fListener);
		fDatabaseFileSystemButton = new Button(buttons, SWT.PUSH);
		fDatabaseFileSystemButton.setText(BUTTON_FILESYSTEM_LABEL);
		fDatabaseFileSystemButton.setLayoutData(new GridData());
		fDatabaseFileSystemButton.addSelectionListener(fListener);
	
	}
	
	public void createOutputFolderControl(Composite parent) {
		
		Group group = new Group(parent, SWT.NONE);
		group.setText(CONTROL_OUTPUT_FOLDER_LABEL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label fLocationLabel = new Label(group, SWT.NONE);
		fLocationLabel.setText(LOCATION_LABEL);
		
		fOutputLocationText = new Text(group, SWT.SINGLE | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 400;
		fOutputLocationText.setLayoutData(gd);
		fOutputLocationText.addModifyListener(fListener);
		
		Composite buttons = new Composite(group, SWT.NONE);
		layout = new GridLayout(1, false);
		layout.marginHeight = layout.marginWidth = 0;
		buttons.setLayout(layout);
		gd = new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_END);
		gd.horizontalSpan = 2;
		buttons.setLayoutData(gd);
		
		fOutputWorkspaceButton = new Button(buttons, SWT.PUSH);
		fOutputWorkspaceButton.setText(BUTTON_WORKSPACE_LABEL);
		fOutputWorkspaceButton.setLayoutData(new GridData());
		fOutputWorkspaceButton.addSelectionListener(fListener);
	
	}
	
	@Override
	public void createControl(Composite parent) {
		
		final ScrolledComposite scrollContainer = new ScrolledComposite(parent, SWT.V_SCROLL);
		scrollContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Composite composite = new Composite(scrollContainer, SWT.NONE);
		scrollContainer.setContent(composite);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		createInputDatabaseControl(composite);
		createOutputFolderControl(composite);

		Dialog.applyDialogFont(composite);
		composite.setSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scrollContainer.setExpandHorizontal(true);
		setControl(scrollContainer);

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		configuration.setAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		
		String fDatabaseLastLocation = "";
		String fOutputLastLocation = "";
		try {
			fDatabaseLastLocation = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
			fOutputLastLocation = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
		} catch (CoreException e) {
		}
		fDatabaseLocationText.setText(fDatabaseLastLocation);
		fOutputLocationText.setText(fOutputLastLocation);

	}
	
	protected String getDatabaseLocation() {
		return fDatabaseLocationText.getText().trim();
	}
	
	protected String getOutputLocation() {
		return fOutputLocationText.getText().trim();
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, getDatabaseLocation());
		configuration.setAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, getOutputLocation());
	}

	@Override
	public String getName() {
		return TAB_MAIN_NAME;
	}
	
	@Override
	public Image getImage() {
		return PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_ETOOL_HOME_NAV);
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		
		return true;
		
	}

}
