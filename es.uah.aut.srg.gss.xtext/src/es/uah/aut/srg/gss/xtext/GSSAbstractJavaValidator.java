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

import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.gss.common.GSSModelElement;
import es.uah.aut.srg.gss.common.commonPackage;

public class GSSAbstractJavaValidator extends AbstractDeclarativeValidator {

	@Check
	public void checkGSSModelElement_URIandName(GSSModelElement element)
	{
		if (element.getName() != null &&
			element.getUri() != null &&
			element.getName() != "")
		{
			String[] tmp = element.getUri().split("[.]");
			String name = "";
			if (tmp != null && tmp.length >= 1)
				name = tmp[tmp.length-1];
			if (element.getName().toLowerCase().matches(name.toLowerCase()) == false)
			{
				error("The name of the element and the last fragment of the URI must match.",
						commonPackage.eINSTANCE.getGSSModelElement_Uri());
			}
		}
	}
	
}
