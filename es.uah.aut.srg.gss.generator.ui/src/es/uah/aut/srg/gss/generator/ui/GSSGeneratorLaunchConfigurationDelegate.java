package es.uah.aut.srg.gss.generator.ui;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;


public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {
	
	protected static EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] { EcorePackage.eINSTANCE, 
				commonPackage.eINSTANCE,
				tm_tc_formatPackage.eINSTANCE };
    	}
	};

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		String output = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
		
		Collection<GSSTmTcFormatTmTcFormat> formats = null;
				
		try {
			formats = GSSGenerator.getTmTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		for (GSSTmTcFormatTmTcFormat gssTmTcFormatTmTcFormat : formats) {
		
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource folder = root.findMember(output);
			
			if (folder == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + output + "' not found!"));
			}
		
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTmTcFormatTmTcFormat,
					"es::uah::aut::srg::gss::generator::templates::tm_tc_formatSerializer::Serializer", 
					false, gssTmTcFormatTmTcFormat.getName() + ".gss_tm_tc_format");
			
		}
		
	}

}
