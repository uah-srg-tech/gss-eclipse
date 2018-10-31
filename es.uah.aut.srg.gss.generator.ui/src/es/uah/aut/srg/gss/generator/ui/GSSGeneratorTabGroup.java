package es.uah.aut.srg.gss.generator.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class GSSGeneratorTabGroup extends AbstractLaunchConfigurationTabGroup {


	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		setTabs(new ILaunchConfigurationTab[] { new GSSGeneratorMainTab(), new CommonTab() });

	}

}
