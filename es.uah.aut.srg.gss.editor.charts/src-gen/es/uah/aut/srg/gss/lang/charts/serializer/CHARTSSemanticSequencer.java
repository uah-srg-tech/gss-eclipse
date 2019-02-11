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
package es.uah.aut.srg.gss.lang.charts.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.gss.charts.GSSChartsChart;
import es.uah.aut.srg.gss.charts.GSSChartsCharts;
import es.uah.aut.srg.gss.charts.chartsPackage;
import es.uah.aut.srg.gss.common.GSSModelFile;
import es.uah.aut.srg.gss.common.GSSModelFileImport;
import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.lang.charts.services.CHARTSGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CHARTSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CHARTSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == chartsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case chartsPackage.GSS_CHARTS_CHART:
				sequence_GSSChartsChart(context, (GSSChartsChart) semanticObject); 
				return; 
			case chartsPackage.GSS_CHARTS_CHARTS:
				sequence_GSSChartsCharts(context, (GSSChartsCharts) semanticObject); 
				return; 
			}
		else if (epackage == commonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case commonPackage.GSS_MODEL_FILE:
				sequence_GSSModelFile(context, (GSSModelFile) semanticObject); 
				return; 
			case commonPackage.GSS_MODEL_FILE_IMPORT:
				sequence_GSSModelFileImport(context, (GSSModelFileImport) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     GSSChartsChart returns GSSChartsChart
	 *
	 * Constraint:
	 *     (id=INTEGER name=STRING y_units=GSSChartsYUnits y_max=INTEGER)
	 */
	protected void sequence_GSSChartsChart(ISerializationContext context, GSSChartsChart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, chartsPackage.Literals.GSS_CHARTS_CHART__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, chartsPackage.Literals.GSS_CHARTS_CHART__ID));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_OBJECT__NAME));
			if (transientValues.isValueTransient(semanticObject, chartsPackage.Literals.GSS_CHARTS_CHART__YUNITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, chartsPackage.Literals.GSS_CHARTS_CHART__YUNITS));
			if (transientValues.isValueTransient(semanticObject, chartsPackage.Literals.GSS_CHARTS_CHART__YMAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, chartsPackage.Literals.GSS_CHARTS_CHART__YMAX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSChartsChartAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getGSSChartsChartAccess().getNameSTRINGTerminalRuleCall_8_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGSSChartsChartAccess().getY_unitsGSSChartsYUnitsEnumRuleCall_12_0(), semanticObject.getY_units());
		feeder.accept(grammarAccess.getGSSChartsChartAccess().getY_maxINTEGERParserRuleCall_16_0(), semanticObject.getY_max());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSChartsCharts returns GSSChartsCharts
	 *
	 * Constraint:
	 *     (name=ID (uri=QualifiedName | version=Version)+ Chart+=GSSChartsChart+)
	 */
	protected void sequence_GSSChartsCharts(ISerializationContext context, GSSChartsCharts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFileImport returns GSSModelFileImport
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_GSSModelFileImport(ISerializationContext context, GSSModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.GSS_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GSSModelFile returns GSSModelFile
	 *
	 * Constraint:
	 *     (imports+=GSSModelFileImport* element=GSSChartsCharts)
	 */
	protected void sequence_GSSModelFile(ISerializationContext context, GSSModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
