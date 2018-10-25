package es.uah.aut.srg.gss.generator.ui;

import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;

public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		
		Set<GSSTmTcFormatTmTCFormat> formats = GSSGenerator.getTmTcFormats(database);

		// TODO: Launch the transformations
	}

}
