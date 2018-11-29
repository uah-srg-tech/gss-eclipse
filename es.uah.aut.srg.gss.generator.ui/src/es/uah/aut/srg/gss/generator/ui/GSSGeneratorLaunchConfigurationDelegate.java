package es.uah.aut.srg.gss.generator.ui;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;

public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		
		try {
			Collection<GSSTmTcFormatTmTcFormat> formats = GSSGenerator.getTmTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, "pluginID", e.getMessage(), e));
		}

		// TODO: Launch the transformations
	}

}
