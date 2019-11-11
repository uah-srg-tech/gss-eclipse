/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.gss.lang.test_proc.scoping;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

import es.uah.aut.srg.gss.test_proc.GSSTestProcOutput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;
import es.uah.aut.srg.gss.xtext.GSSAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class TEST_PROCScopeProvider extends GSSAbstractScopeProvider {

	public IScope scope_GSSTestProcStep_prev_step_idref(GSSTestProcStep currStep, EReference reference) {
		
		Collection<GSSTestProcStep> items = new HashSet<GSSTestProcStep>();
		GSSTestProcTestProc currentTestProc = (GSSTestProcTestProc)(currStep.eContainer());

		if(currentTestProc != null) {
			items.addAll(currentTestProc.getStep());
			
			Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<GSSTestProcStep, IEObjectDescription>(){
		
				@Override
				public IEObjectDescription apply(GSSTestProcStep from) {
					if (from.getName() == null || from == currStep) {
						return null;
					}
					else {
						return EObjectDescription.create(from.getName(), from);
					}
				}
			});
			return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
		} else {
			return null;
		}
	}

	public IScope scope_GSSTestProcStep_output_idref_from_prev_step(GSSTestProcStep currStep, EReference reference) {
		
		Collection<GSSTestProcOutput> items = new HashSet<GSSTestProcOutput>();

		if(currStep.getPrev_step_idref() != null && 
				currStep.getPrev_step_idref().getOutputs() != null) {

			items.addAll(currStep.getPrev_step_idref().getOutputs().getOutput());
			
			Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<GSSTestProcOutput, IEObjectDescription>(){
		
				@Override
				public IEObjectDescription apply(GSSTestProcOutput from) {
					if (from.getName() != null) {
						return EObjectDescription.create(from.getName(), from);
					}
					else {
						return null;
					}
				}
			});
			return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
		} else {
			return null;
		}
	}
}
