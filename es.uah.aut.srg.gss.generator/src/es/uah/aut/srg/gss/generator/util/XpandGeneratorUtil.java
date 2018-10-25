/*******************************************************************************
 * Copyright (c) 2013-2017 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.generator.util;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;

/**
 * Clase encargada de la transformación Modelo a Texto. 
 * Genera los ficheros fuente a partir de un componente 
 * y la ruta de un template.
 */
public class XpandGeneratorUtil {

	
	public XpandGeneratorUtil() {

	}
	
	protected static EmfRegistryMetaModel metaModel = new EmfRegistryMetaModel(){

		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] {
				tm_tc_formatPackage.eINSTANCE
			};
		}
		
	};
	
	/**
	 * Triggers a regular M2T Xpand transformation in which the resulting
	 * content will be stored in the file system.
	 * 
	 * @param containerName the root container pathname where the generated
	 * files will be stored.
	 * @param model the intput model.
	 * @param metamodel the EMF registry metamodel used in the transformation.
	 * @param templatePath the path of the Xpand template.
	 * @param append <code>true</code> if, when a file that is being generated
	 * existed previously, the new content shall be appended at the end of the
	 * existing one; <code>false</code> otherwise.
	 * @param parameters optional parameters passed to the Xpand template.
	 */
	public static void generate(String containerName,
			EObject model,
			String templatePath,
			boolean append,
			Object... parameters)
	{
		
		OutputImpl output = new OutputImpl();
	    Outlet outlet = new Outlet(containerName);
	    if (append == true)
	    {
	    	outlet.setAppend(true);
	    }
	    outlet.setOverwrite(true);
	    output.addOutlet(outlet);
	    
	    ProtectedRegionResolverImpl resolv = new ProtectedRegionResolverImpl();
	    resolv.setSrcPathes(containerName);

	    Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
	    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, resolv, globalVarsMap, null, null);

	    // Register the EMF MetaModel with the metamodels used within the transformation
	    execCtx.registerMetaModel(metaModel);
	    
	    // Register the JAVA MetaModel. This is added in order to be able to
	    // use Java Classes as Types within the transformation. If you also
	    // want the Xpand/Xtend editors not to generate any errors, you have
	    // activate the use of the JavaBeans MetaModel on the menu
	    // Preferences -> Xpand/Xtend.
	    execCtx.registerMetaModel(new JavaMetaModel());
	    
	    XpandFacade facade = XpandFacade.create(execCtx);

	    facade.evaluate(templatePath, model, parameters);

	}
	


}
