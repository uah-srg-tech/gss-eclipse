package es.uah.aut.srg.gss.generator.ui;

import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.generator.GSSGenerator;
import es.uah.aut.srg.gss.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormatType;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatFactory;
import es.uah.aut.srg.gss.xtext.xml.XMLGeneratorUtil;


public class GSSGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {

		//create common ccsds/pus formats
		GSSTmTcFormatTmTcFormat ccsdsTcFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		ccsdsTcFormat.setName("CCSDS_TC");
		ccsdsTcFormat.setDescription("CCSDS_TC");
		ccsdsTcFormat.setUri("es.uah.aut.srg.ccsds_tc");
		ccsdsTcFormat.setVersion("v1");
		ccsdsTcFormat.setProtocol("CCSDS");
		ccsdsTcFormat.setType(GSSTmTcFormatTmTcFormatType.TC);
		GSSGenerator.createVSField(ccsdsTcFormat, 0, 0, "CCSDSPacket", null, 7*8, 12, 8, 248*8, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 1, 0, "PacketHeader", null, 6*8, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 2, 1, "PacketID", null, 16, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 3, 2, "VersionNumber", null, 3, 0);
		GSSGenerator.createCSField(ccsdsTcFormat, 4, 2, "Type", null, 1, 3);
		GSSGenerator.createCSField(ccsdsTcFormat, 5, 2, "DFHFlag", null, 1, 4);
		GSSGenerator.createCSField(ccsdsTcFormat, 6, 2, "APID", null, 11, 5);
		GSSGenerator.createCSField(ccsdsTcFormat, 7, 6, "PID", null, 7, 5);
		GSSGenerator.createCSField(ccsdsTcFormat, 8, 6, "PCAT", null, 4, 12);
		GSSGenerator.createCSField(ccsdsTcFormat, 9, 1, "PacketSequenceControl", null, 16, 16);
		GSSGenerator.createCSField(ccsdsTcFormat, 10, 9, "SequenceFlag", null, 2, 16);
		GSSGenerator.createCSField(ccsdsTcFormat, 11, 9, "SequenceCount", null, 14, 18);
		GSSGenerator.createCSField(ccsdsTcFormat, 12, 1, "PacketLength", null, 16, 32);
		GSSGenerator.createVSField(ccsdsTcFormat, 13, 0, "PacketDataField", null, 1*8, 12, 8, 242*8, 6*8);
		GSSGenerator.createCSField(ccsdsTcFormat, 14, 13, "SecondaryHeader", null, 4*8, 6*8);
		GSSGenerator.createVSField(ccsdsTcFormat, 15, 13, "ApplicationData", null, -5*8, 12, 8, 236*8, 10*8);
		GSSGenerator.createFDICField(ccsdsTcFormat, 16, 13, "CRC", null, 16, 15,
				new ArrayList<Integer>(Arrays.asList(1, 14, 15)));
		
		GSSTmTcFormatTmTcFormat pusTcFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		pusTcFormat.setName("PUS_TC");
		pusTcFormat.setDescription("PUS_TC");
		pusTcFormat.setUri("es.uah.aut.srg.pus_tc");
		pusTcFormat.setVersion("v1");
		pusTcFormat.setProtocol("PUS");
		pusTcFormat.setType(GSSTmTcFormatTmTcFormatType.TC);
		GSSGenerator.createCSField(pusTcFormat, 0, 0, "SecondaryHeader", null, 4*8, 0);
		GSSGenerator.createCSField(pusTcFormat, 1, 0, "CCSDSSecondaryHeaderFlag", null, 1, 0);
		GSSGenerator.createCSField(pusTcFormat, 2, 0, "PUSVersion", null, 3, 1);
		GSSGenerator.createCSField(pusTcFormat, 3, 0, "ACK", null, 4, 4);
		GSSGenerator.createCSField(pusTcFormat, 4, 0, "ServiceType", null, 1*8, 1*8);
		GSSGenerator.createCSField(pusTcFormat, 5, 0, "ServiceSubtype", null, 1*8, 2*8);
		GSSGenerator.createCSField(pusTcFormat, 6, 0, "SourceID", null, 1*8, 3*8);
		GSSGenerator.createVSField(pusTcFormat, 7, 7, "ApplicationData", null, 0, 8, 8, 236*8, 4*8);
		GSSGenerator.createVRFieldSize(pusTcFormat, 8, 7, "AppDataLength");
		
		GSSTmTcFormatTmTcFormat ccsdsTmFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		ccsdsTmFormat.setName("CCSDS_TM");
		ccsdsTmFormat.setDescription("CCSDS_TM");
		ccsdsTmFormat.setUri("es.uah.aut.srg.ccsds_tm");
		ccsdsTmFormat.setVersion("v1");
		ccsdsTmFormat.setProtocol("CCSDS");
		ccsdsTmFormat.setType(GSSTmTcFormatTmTcFormatType.TM);
		GSSGenerator.createVSField(ccsdsTmFormat, 0, 0, "CCSDSPacket", null, 7*8, 12, 8, 4112*8, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 1, 0, "PacketHeader", null, 6*8, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 2, 1, "PacketID", null, 16, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 3, 2, "VersionNumber", null, 3, 0);
		GSSGenerator.createCSField(ccsdsTmFormat, 4, 2, "Type", null, 1, 3);
		GSSGenerator.createCSField(ccsdsTmFormat, 5, 2, "DFHFlag", null, 1, 4);
		GSSGenerator.createCSField(ccsdsTmFormat, 6, 2, "APID", null, 11, 5);
		GSSGenerator.createCSField(ccsdsTmFormat, 7, 6, "PID", null, 7, 5);
		GSSGenerator.createCSField(ccsdsTmFormat, 8, 6, "PCAT", null, 4, 12);
		GSSGenerator.createCSField(ccsdsTmFormat, 9, 1, "PacketSequenceControl", null, 16, 16);
		GSSGenerator.createCSField(ccsdsTmFormat, 10, 9, "SequenceFlag", null, 2, 16);
		GSSGenerator.createCSField(ccsdsTmFormat, 11, 9, "SequenceCount", null, 14, 18);
		GSSGenerator.createCSField(ccsdsTmFormat, 12, 1, "PacketLength", null, 16, 32);
		GSSGenerator.createVSField(ccsdsTmFormat, 13, 0, "PacketDataField", null, 8, 12, 8, 4106*8, 6*8);
		GSSGenerator.createCSField(ccsdsTmFormat, 14, 13, "SecondaryHeader", null, 10*8, 6*8);
		GSSGenerator.createVSField(ccsdsTmFormat, 15, 13, "SourceData", null, -11*8, 12, 8, 4096*8, 16*8);
		GSSGenerator.createFDICField(ccsdsTmFormat, 16, 13, "CRC", null, 16, 15,
				new ArrayList<Integer>(Arrays.asList(1, 14, 15)));
		
		GSSTmTcFormatTmTcFormat pusTmFormat = tm_tc_formatFactory.eINSTANCE.createGSSTmTcFormatTmTcFormat();
		pusTmFormat.setName("PUS_TM");
		pusTmFormat.setDescription("PUS_TM");
		pusTmFormat.setUri("es.uah.aut.srg.pus_tm");
		pusTmFormat.setVersion("v1");
		pusTmFormat.setProtocol("PUS");
		pusTmFormat.setType(GSSTmTcFormatTmTcFormatType.TM);
		GSSGenerator.createCSField(pusTmFormat, 0, 0, "SecondaryHeader", null, 10*8, 0);
		GSSGenerator.createCSField(pusTmFormat, 1, 0, "Spare", null, 1, 0);
		GSSGenerator.createCSField(pusTmFormat, 2, 0, "PUSVersion", null, 3, 1);
		GSSGenerator.createCSField(pusTmFormat, 3, 0, "Spare", null, 4, 4);
		GSSGenerator.createCSField(pusTmFormat, 4, 0, "ServiceType", null, 8, 1*8);
		GSSGenerator.createCSField(pusTmFormat, 5, 0, "ServiceSubtype", null, 8, 2*8);
		GSSGenerator.createCSField(pusTmFormat, 6, 0, "DestinationID", null, 8, 3*8);
		GSSGenerator.createCSField(pusTmFormat, 7, 0, "SCTime", null, 6*8, 4*8);
		GSSGenerator.createCSField(pusTmFormat, 8, 7, "Sync", null, 1, 4*8);
		GSSGenerator.createCSField(pusTmFormat, 9, 7, "Seconds", null, 31, 4*8+1);
		GSSGenerator.createCSField(pusTmFormat, 10, 7, "Subseconds", null, 16, 8*8);
		GSSGenerator.createVSField(pusTmFormat, 11, 11, "SourceData", null, 0, 12, 8, 4096*8, 10*8);
		GSSGenerator.createVRFieldSize(pusTmFormat, 12, 11, "SourceDataLength");
		
		String database = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		String output = configuration.getAttribute(GSSGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");

		Map<String, GSSTmTcFormatTmTcFormat> tcFormats = null;
		try {
			tcFormats = GSSGenerator.getTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		tcFormats.put("CCSDS_TC", ccsdsTcFormat);
		tcFormats.put("PUS_TC", pusTcFormat);
		
		Map<String, GSSTmTcFormatTmTcFormat> tmFormats = null;
		try {
			tmFormats = GSSGenerator.getTmFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		tmFormats.put("CCSDS_TC", ccsdsTmFormat);
		tmFormats.put("PUS_TC", pusTmFormat);

		Collection<GSSExportExport> exportsLevel1 = null;
		try {
			exportsLevel1 = GSSGenerator.getExportsLevel1(database, ccsdsTcFormat, pusTcFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<GSSExportExport> exportsLevel2 = null;
		try {
			exportsLevel2 = GSSGenerator.getExportsLevel2(database, tcFormats);
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
		
		for (GSSExportExport gssExportExport : exportsLevel1) {
		
			String exportName = "exportsLevel1\\" + gssExportExport.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssExportExport,
					"es::uah::aut::srg::gss::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(exportName);
			
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
		
		for (GSSExportExport gssExportExport : exportsLevel2) {
		
			String exportName = "exportsLevel2\\" + gssExportExport.getName() + ".gss_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), gssExportExport,
					"es::uah::aut::srg::gss::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
			
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(exportName);
			
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