package es.uah.aut.srg.gss.generator.ui;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import es.uah.aut.srg.gss.xtext.xml.XMLGeneratorUtil;


public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		String output = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");

		Map<String, GSSTmTcFormatTmTcFormat> tcFormats = null;
		try {
			tcFormats = GSSGenerator.getTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Map<String, GSSTmTcFormatTmTcFormat> tmFormats = null;
		try {
			tmFormats = GSSGenerator.getTmFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource folder = root.findMember(output);
		
		if (folder == null || (folder instanceof IFolder) == false) {
			throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + output + "' not found!"));
		}
		
		for (GSSTmTcFormatTmTcFormat gssTmTcFormatTmTcFormat : tcFormats.values()) {
		
			String formatName = "tcFormats\\" + gssTmTcFormatTmTcFormat.getName() + ".gss_tm_tc_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTmTcFormatTmTcFormat,
					"es::uah::aut::srg::gss::generator::templates::tm_tc_formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(formatName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
		}
		
		for (GSSTmTcFormatTmTcFormat gssTmTcFormatTmTcFormat : tmFormats.values()) {
		
			String formatName = "tmFormats\\" + gssTmTcFormatTmTcFormat.getName() + ".gss_tm_tc_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssTmTcFormatTmTcFormat,
					"es::uah::aut::srg::gss::generator::templates::tm_tc_formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(formatName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((GSSModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
		}
	}
}