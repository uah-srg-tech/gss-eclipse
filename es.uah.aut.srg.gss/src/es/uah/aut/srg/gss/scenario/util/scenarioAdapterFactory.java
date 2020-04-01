/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.scenario.util;

import es.uah.aut.srg.gss.scenario.*;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage
 * @generated
 */
public class scenarioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static scenarioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenarioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = scenarioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scenarioSwitch<Adapter> modelSwitch =
		new scenarioSwitch<Adapter>() {
			@Override
			public Adapter caseGSSScenarioScenario(GSSScenarioScenario object) {
				return createGSSScenarioScenarioAdapter();
			}
			@Override
			public Adapter caseGSSScenarioOptions(GSSScenarioOptions object) {
				return createGSSScenarioOptionsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioInfo(GSSScenarioInfo object) {
				return createGSSScenarioInfoAdapter();
			}
			@Override
			public Adapter caseGSSScenarioInfoPrint(GSSScenarioInfoPrint object) {
				return createGSSScenarioInfoPrintAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPhyHeaderPrint(GSSScenarioPhyHeaderPrint object) {
				return createGSSScenarioPhyHeaderPrintAdapter();
			}
			@Override
			public Adapter caseGSSScenarioDiscardErrorFlags(GSSScenarioDiscardErrorFlags object) {
				return createGSSScenarioDiscardErrorFlagsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioProtocols(GSSScenarioProtocols object) {
				return createGSSScenarioProtocolsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioProtocol(GSSScenarioProtocol object) {
				return createGSSScenarioProtocolAdapter();
			}
			@Override
			public Adapter caseGSSScenarioProtocolType(GSSScenarioProtocolType object) {
				return createGSSScenarioProtocolTypeAdapter();
			}
			@Override
			public Adapter caseGSSScenarioInterfaces(GSSScenarioInterfaces object) {
				return createGSSScenarioInterfacesAdapter();
			}
			@Override
			public Adapter caseGSSScenarioMainInterface(GSSScenarioMainInterface object) {
				return createGSSScenarioMainInterfaceAdapter();
			}
			@Override
			public Adapter caseGSSScenarioInterface(GSSScenarioInterface object) {
				return createGSSScenarioInterfaceAdapter();
			}
			@Override
			public Adapter caseGSSScenarioLevelInOut(GSSScenarioLevelInOut object) {
				return createGSSScenarioLevelInOutAdapter();
			}
			@Override
			public Adapter caseGSSScenarioLevelIn(GSSScenarioLevelIn object) {
				return createGSSScenarioLevelInAdapter();
			}
			@Override
			public Adapter caseGSSScenarioLevelOut(GSSScenarioLevelOut object) {
				return createGSSScenarioLevelOutAdapter();
			}
			@Override
			public Adapter caseGSSScenarioSpecialPackets(GSSScenarioSpecialPackets object) {
				return createGSSScenarioSpecialPacketsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioSpecialPacket(GSSScenarioSpecialPacket object) {
				return createGSSScenarioSpecialPacketAdapter();
			}
			@Override
			public Adapter caseGSSScenarioUpperLevels(GSSScenarioUpperLevels object) {
				return createGSSScenarioUpperLevelsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioUpperLevel(GSSScenarioUpperLevel object) {
				return createGSSScenarioUpperLevelAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPrintingData(GSSScenarioPrintingData object) {
				return createGSSScenarioPrintingDataAdapter();
			}
			@Override
			public Adapter caseGSSScenarioStructuredData(GSSScenarioStructuredData object) {
				return createGSSScenarioStructuredDataAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPeriod(GSSScenarioPeriod object) {
				return createGSSScenarioPeriodAdapter();
			}
			@Override
			public Adapter caseGSSScenarioIntervalRange(GSSScenarioIntervalRange object) {
				return createGSSScenarioIntervalRangeAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPeriodicTCs(GSSScenarioPeriodicTCs object) {
				return createGSSScenarioPeriodicTCsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPeriodicTC(GSSScenarioPeriodicTC object) {
				return createGSSScenarioPeriodicTCAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPeriodicTCLevel2(GSSScenarioPeriodicTCLevel2 object) {
				return createGSSScenarioPeriodicTCLevel2Adapter();
			}
			@Override
			public Adapter caseGSSScenarioPeriodicTCLevel1(GSSScenarioPeriodicTCLevel1 object) {
				return createGSSScenarioPeriodicTCLevel1Adapter();
			}
			@Override
			public Adapter caseGSSScenarioPeriodicTCLevel0(GSSScenarioPeriodicTCLevel0 object) {
				return createGSSScenarioPeriodicTCLevel0Adapter();
			}
			@Override
			public Adapter caseGSSScenarioGlobalVars(GSSScenarioGlobalVars object) {
				return createGSSScenarioGlobalVarsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioGlobalVar(GSSScenarioGlobalVar object) {
				return createGSSScenarioGlobalVarAdapter();
			}
			@Override
			public Adapter caseGSSScenarioReference(GSSScenarioReference object) {
				return createGSSScenarioReferenceAdapter();
			}
			@Override
			public Adapter caseGSSScenarioReferenceField(GSSScenarioReferenceField object) {
				return createGSSScenarioReferenceFieldAdapter();
			}
			@Override
			public Adapter caseGSSScenarioReferencePeriodicTC(GSSScenarioReferencePeriodicTC object) {
				return createGSSScenarioReferencePeriodicTCAdapter();
			}
			@Override
			public Adapter caseGSSScenarioReferenceSpecialPacket(GSSScenarioReferenceSpecialPacket object) {
				return createGSSScenarioReferenceSpecialPacketAdapter();
			}
			@Override
			public Adapter caseGSSScenarioMonitors(GSSScenarioMonitors object) {
				return createGSSScenarioMonitorsAdapter();
			}
			@Override
			public Adapter caseGSSScenarioMonitor(GSSScenarioMonitor object) {
				return createGSSScenarioMonitorAdapter();
			}
			@Override
			public Adapter caseGSSScenarioPlot(GSSScenarioPlot object) {
				return createGSSScenarioPlotAdapter();
			}
			@Override
			public Adapter caseGSSScenarioAlarmMsg(GSSScenarioAlarmMsg object) {
				return createGSSScenarioAlarmMsgAdapter();
			}
			@Override
			public Adapter caseGSSScenarioModify(GSSScenarioModify object) {
				return createGSSScenarioModifyAdapter();
			}
			@Override
			public Adapter caseGSSScenarioAlarmVal(GSSScenarioAlarmVal object) {
				return createGSSScenarioAlarmValAdapter();
			}
			@Override
			public Adapter caseGSSScenarioGVRef(GSSScenarioGVRef object) {
				return createGSSScenarioGVRefAdapter();
			}
			@Override
			public Adapter caseGSSScenarioGVFiltered(GSSScenarioGVFiltered object) {
				return createGSSScenarioGVFilteredAdapter();
			}
			@Override
			public Adapter caseGSSScenarioGVPeriodic(GSSScenarioGVPeriodic object) {
				return createGSSScenarioGVPeriodicAdapter();
			}
			@Override
			public Adapter caseTMTCIFScenario(TMTCIFScenario object) {
				return createTMTCIFScenarioAdapter();
			}
			@Override
			public Adapter caseTMTCIFScenarioInterface(TMTCIFScenarioInterface object) {
				return createTMTCIFScenarioInterfaceAdapter();
			}
			@Override
			public Adapter caseTMTCIFScenarioVariable(TMTCIFScenarioVariable object) {
				return createTMTCIFScenarioVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario <em>GSS Scenario Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario
	 * @generated
	 */
	public Adapter createGSSScenarioScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioOptions <em>GSS Scenario Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioOptions
	 * @generated
	 */
	public Adapter createGSSScenarioOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo <em>GSS Scenario Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfo
	 * @generated
	 */
	public Adapter createGSSScenarioInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint <em>GSS Scenario Info Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint
	 * @generated
	 */
	public Adapter createGSSScenarioInfoPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint <em>GSS Scenario Phy Header Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint
	 * @generated
	 */
	public Adapter createGSSScenarioPhyHeaderPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags <em>GSS Scenario Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags
	 * @generated
	 */
	public Adapter createGSSScenarioDiscardErrorFlagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocols <em>GSS Scenario Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocols
	 * @generated
	 */
	public Adapter createGSSScenarioProtocolsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol <em>GSS Scenario Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol
	 * @generated
	 */
	public Adapter createGSSScenarioProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType <em>GSS Scenario Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType
	 * @generated
	 */
	public Adapter createGSSScenarioProtocolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces <em>GSS Scenario Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces
	 * @generated
	 */
	public Adapter createGSSScenarioInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMainInterface <em>GSS Scenario Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMainInterface
	 * @generated
	 */
	public Adapter createGSSScenarioMainInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface <em>GSS Scenario Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface
	 * @generated
	 */
	public Adapter createGSSScenarioInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut <em>GSS Scenario Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut
	 * @generated
	 */
	public Adapter createGSSScenarioLevelInOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn <em>GSS Scenario Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn
	 * @generated
	 */
	public Adapter createGSSScenarioLevelInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut <em>GSS Scenario Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut
	 * @generated
	 */
	public Adapter createGSSScenarioLevelOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets <em>GSS Scenario Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets
	 * @generated
	 */
	public Adapter createGSSScenarioSpecialPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket <em>GSS Scenario Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket
	 * @generated
	 */
	public Adapter createGSSScenarioSpecialPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels <em>GSS Scenario Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels
	 * @generated
	 */
	public Adapter createGSSScenarioUpperLevelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel <em>GSS Scenario Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel
	 * @generated
	 */
	public Adapter createGSSScenarioUpperLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData <em>GSS Scenario Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData
	 * @generated
	 */
	public Adapter createGSSScenarioPrintingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData <em>GSS Scenario Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData
	 * @generated
	 */
	public Adapter createGSSScenarioStructuredDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod <em>GSS Scenario Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriod
	 * @generated
	 */
	public Adapter createGSSScenarioPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange <em>GSS Scenario Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange
	 * @generated
	 */
	public Adapter createGSSScenarioIntervalRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs <em>GSS Scenario Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs
	 * @generated
	 */
	public Adapter createGSSScenarioPeriodicTCsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC <em>GSS Scenario Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC
	 * @generated
	 */
	public Adapter createGSSScenarioPeriodicTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2 <em>GSS Scenario Periodic TC Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2
	 * @generated
	 */
	public Adapter createGSSScenarioPeriodicTCLevel2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1 <em>GSS Scenario Periodic TC Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1
	 * @generated
	 */
	public Adapter createGSSScenarioPeriodicTCLevel1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0 <em>GSS Scenario Periodic TC Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0
	 * @generated
	 */
	public Adapter createGSSScenarioPeriodicTCLevel0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars <em>GSS Scenario Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars
	 * @generated
	 */
	public Adapter createGSSScenarioGlobalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar <em>GSS Scenario Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar
	 * @generated
	 */
	public Adapter createGSSScenarioGlobalVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReference <em>GSS Scenario Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReference
	 * @generated
	 */
	public Adapter createGSSScenarioReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField <em>GSS Scenario Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField
	 * @generated
	 */
	public Adapter createGSSScenarioReferenceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC <em>GSS Scenario Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC
	 * @generated
	 */
	public Adapter createGSSScenarioReferencePeriodicTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket <em>GSS Scenario Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket
	 * @generated
	 */
	public Adapter createGSSScenarioReferenceSpecialPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors <em>GSS Scenario Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitors
	 * @generated
	 */
	public Adapter createGSSScenarioMonitorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor <em>GSS Scenario Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitor
	 * @generated
	 */
	public Adapter createGSSScenarioMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPlot <em>GSS Scenario Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPlot
	 * @generated
	 */
	public Adapter createGSSScenarioPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg <em>GSS Scenario Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg
	 * @generated
	 */
	public Adapter createGSSScenarioAlarmMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModify <em>GSS Scenario Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModify
	 * @generated
	 */
	public Adapter createGSSScenarioModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal <em>GSS Scenario Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal
	 * @generated
	 */
	public Adapter createGSSScenarioAlarmValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVRef <em>GSS Scenario GV Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVRef
	 * @generated
	 */
	public Adapter createGSSScenarioGVRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered <em>GSS Scenario GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered
	 * @generated
	 */
	public Adapter createGSSScenarioGVFilteredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic <em>GSS Scenario GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic
	 * @generated
	 */
	public Adapter createGSSScenarioGVPeriodicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario <em>TMTCIF Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario
	 * @generated
	 */
	public Adapter createTMTCIFScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface <em>TMTCIF Scenario Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface
	 * @generated
	 */
	public Adapter createTMTCIFScenarioInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable <em>TMTCIF Scenario Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable
	 * @generated
	 */
	public Adapter createTMTCIFScenarioVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //scenarioAdapterFactory
