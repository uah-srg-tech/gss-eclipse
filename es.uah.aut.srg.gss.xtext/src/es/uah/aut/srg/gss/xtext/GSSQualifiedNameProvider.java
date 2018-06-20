/*******************************************************************************
 * Copyright (c) 2013-2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import es.uah.aut.srg.gss.common.GSSModelElement;
import es.uah.aut.srg.gss.common.GSSModelObject;
import es.uah.aut.srg.gss.util.GSSStringHelper;

public class GSSQualifiedNameProvider extends 
	DefaultDeclarativeQualifiedNameProvider {
	
	public static class GSSDefaultNameConverter extends IQualifiedNameConverter.DefaultImpl {

		@Override
		public String getDelimiter() {
			return GSSStringHelper.OBJECT_DELIMITER;
		}
		
	}
	
	public QualifiedName qualifiedName(GSSModelElement element) {
		if (element.getName() == null || element.getVersion() == null)
			return null;
		else
			return getConverter().toQualifiedName(GSSStringHelper.getElementName(element));
	  }
	
	public QualifiedName qualifiedName(GSSModelObject object)
	{	
		return getConverter().toQualifiedName(GSSStringHelper.getFullObjectNameToElement(object));
	}

}
