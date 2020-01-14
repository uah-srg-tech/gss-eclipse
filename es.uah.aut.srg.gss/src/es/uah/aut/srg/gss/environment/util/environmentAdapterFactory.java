/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.environment.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.environment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.environment.environmentPackage
 * @generated
 */
public class environmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static environmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = environmentPackage.eINSTANCE;
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
	protected environmentSwitch<Adapter> modelSwitch =
		new environmentSwitch<Adapter>() {
			@Override
			public Adapter caseGSSEnvironmentEnvironment(GSSEnvironmentEnvironment object) {
				return createGSSEnvironmentEnvironmentAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentScenario(GSSEnvironmentScenario object) {
				return createGSSEnvironmentScenarioAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentOptions(GSSEnvironmentOptions object) {
				return createGSSEnvironmentOptionsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentInfo(GSSEnvironmentInfo object) {
				return createGSSEnvironmentInfoAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentInfoPrint(GSSEnvironmentInfoPrint object) {
				return createGSSEnvironmentInfoPrintAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPhyHeaderPrint(GSSEnvironmentPhyHeaderPrint object) {
				return createGSSEnvironmentPhyHeaderPrintAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentDiscardErrorFlags(GSSEnvironmentDiscardErrorFlags object) {
				return createGSSEnvironmentDiscardErrorFlagsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentProtocols(GSSEnvironmentProtocols object) {
				return createGSSEnvironmentProtocolsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentProtocol(GSSEnvironmentProtocol object) {
				return createGSSEnvironmentProtocolAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentProtocolType(GSSEnvironmentProtocolType object) {
				return createGSSEnvironmentProtocolTypeAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentInterfaces(GSSEnvironmentInterfaces object) {
				return createGSSEnvironmentInterfacesAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentMainInterface(GSSEnvironmentMainInterface object) {
				return createGSSEnvironmentMainInterfaceAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentInterface(GSSEnvironmentInterface object) {
				return createGSSEnvironmentInterfaceAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentLevelInOut(GSSEnvironmentLevelInOut object) {
				return createGSSEnvironmentLevelInOutAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentLevelIn(GSSEnvironmentLevelIn object) {
				return createGSSEnvironmentLevelInAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentLevelOut(GSSEnvironmentLevelOut object) {
				return createGSSEnvironmentLevelOutAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentSpecialPackets(GSSEnvironmentSpecialPackets object) {
				return createGSSEnvironmentSpecialPacketsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentSpecialPacket(GSSEnvironmentSpecialPacket object) {
				return createGSSEnvironmentSpecialPacketAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentUpperLevels(GSSEnvironmentUpperLevels object) {
				return createGSSEnvironmentUpperLevelsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentUpperLevel(GSSEnvironmentUpperLevel object) {
				return createGSSEnvironmentUpperLevelAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPrintingData(GSSEnvironmentPrintingData object) {
				return createGSSEnvironmentPrintingDataAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentStructuredData(GSSEnvironmentStructuredData object) {
				return createGSSEnvironmentStructuredDataAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPeriod(GSSEnvironmentPeriod object) {
				return createGSSEnvironmentPeriodAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentIntervalRange(GSSEnvironmentIntervalRange object) {
				return createGSSEnvironmentIntervalRangeAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPeriodicTCs(GSSEnvironmentPeriodicTCs object) {
				return createGSSEnvironmentPeriodicTCsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPeriodicTC(GSSEnvironmentPeriodicTC object) {
				return createGSSEnvironmentPeriodicTCAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPeriodicTCLevel2(GSSEnvironmentPeriodicTCLevel2 object) {
				return createGSSEnvironmentPeriodicTCLevel2Adapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPeriodicTCLevel1(GSSEnvironmentPeriodicTCLevel1 object) {
				return createGSSEnvironmentPeriodicTCLevel1Adapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPeriodicTCLevel0(GSSEnvironmentPeriodicTCLevel0 object) {
				return createGSSEnvironmentPeriodicTCLevel0Adapter();
			}
			@Override
			public Adapter caseGSSEnvironmentGlobalVars(GSSEnvironmentGlobalVars object) {
				return createGSSEnvironmentGlobalVarsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentGlobalVar(GSSEnvironmentGlobalVar object) {
				return createGSSEnvironmentGlobalVarAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentReferenceField(GSSEnvironmentReferenceField object) {
				return createGSSEnvironmentReferenceFieldAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentReferencePeriodicTC(GSSEnvironmentReferencePeriodicTC object) {
				return createGSSEnvironmentReferencePeriodicTCAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentReferenceSpecialPacket(GSSEnvironmentReferenceSpecialPacket object) {
				return createGSSEnvironmentReferenceSpecialPacketAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentMonitors(GSSEnvironmentMonitors object) {
				return createGSSEnvironmentMonitorsAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentPlot(GSSEnvironmentPlot object) {
				return createGSSEnvironmentPlotAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentAlarmMsg(GSSEnvironmentAlarmMsg object) {
				return createGSSEnvironmentAlarmMsgAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentModify(GSSEnvironmentModify object) {
				return createGSSEnvironmentModifyAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentAlarmVal(GSSEnvironmentAlarmVal object) {
				return createGSSEnvironmentAlarmValAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentGVFiltered(GSSEnvironmentGVFiltered object) {
				return createGSSEnvironmentGVFilteredAdapter();
			}
			@Override
			public Adapter caseGSSEnvironmentGVPeriodic(GSSEnvironmentGVPeriodic object) {
				return createGSSEnvironmentGVPeriodicAdapter();
			}
			@Override
			public Adapter caseGSSModelElement(GSSModelElement object) {
				return createGSSModelElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment <em>GSS Environment Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment
	 * @generated
	 */
	public Adapter createGSSEnvironmentEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario <em>GSS Environment Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario
	 * @generated
	 */
	public Adapter createGSSEnvironmentScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions <em>GSS Environment Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentOptions
	 * @generated
	 */
	public Adapter createGSSEnvironmentOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfo <em>GSS Environment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfo
	 * @generated
	 */
	public Adapter createGSSEnvironmentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint <em>GSS Environment Info Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint
	 * @generated
	 */
	public Adapter createGSSEnvironmentInfoPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint <em>GSS Environment Phy Header Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint
	 * @generated
	 */
	public Adapter createGSSEnvironmentPhyHeaderPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags <em>GSS Environment Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags
	 * @generated
	 */
	public Adapter createGSSEnvironmentDiscardErrorFlagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols <em>GSS Environment Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols
	 * @generated
	 */
	public Adapter createGSSEnvironmentProtocolsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol <em>GSS Environment Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol
	 * @generated
	 */
	public Adapter createGSSEnvironmentProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType <em>GSS Environment Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType
	 * @generated
	 */
	public Adapter createGSSEnvironmentProtocolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces <em>GSS Environment Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces
	 * @generated
	 */
	public Adapter createGSSEnvironmentInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface <em>GSS Environment Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface
	 * @generated
	 */
	public Adapter createGSSEnvironmentMainInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface <em>GSS Environment Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface
	 * @generated
	 */
	public Adapter createGSSEnvironmentInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut <em>GSS Environment Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut
	 * @generated
	 */
	public Adapter createGSSEnvironmentLevelInOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn <em>GSS Environment Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn
	 * @generated
	 */
	public Adapter createGSSEnvironmentLevelInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut <em>GSS Environment Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut
	 * @generated
	 */
	public Adapter createGSSEnvironmentLevelOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets <em>GSS Environment Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets
	 * @generated
	 */
	public Adapter createGSSEnvironmentSpecialPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket <em>GSS Environment Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket
	 * @generated
	 */
	public Adapter createGSSEnvironmentSpecialPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels <em>GSS Environment Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels
	 * @generated
	 */
	public Adapter createGSSEnvironmentUpperLevelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel <em>GSS Environment Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel
	 * @generated
	 */
	public Adapter createGSSEnvironmentUpperLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData <em>GSS Environment Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData
	 * @generated
	 */
	public Adapter createGSSEnvironmentPrintingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData <em>GSS Environment Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData
	 * @generated
	 */
	public Adapter createGSSEnvironmentStructuredDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod <em>GSS Environment Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod
	 * @generated
	 */
	public Adapter createGSSEnvironmentPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange <em>GSS Environment Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange
	 * @generated
	 */
	public Adapter createGSSEnvironmentIntervalRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs <em>GSS Environment Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs
	 * @generated
	 */
	public Adapter createGSSEnvironmentPeriodicTCsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC <em>GSS Environment Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC
	 * @generated
	 */
	public Adapter createGSSEnvironmentPeriodicTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2 <em>GSS Environment Periodic TC Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2
	 * @generated
	 */
	public Adapter createGSSEnvironmentPeriodicTCLevel2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1 <em>GSS Environment Periodic TC Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1
	 * @generated
	 */
	public Adapter createGSSEnvironmentPeriodicTCLevel1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0 <em>GSS Environment Periodic TC Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0
	 * @generated
	 */
	public Adapter createGSSEnvironmentPeriodicTCLevel0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars <em>GSS Environment Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars
	 * @generated
	 */
	public Adapter createGSSEnvironmentGlobalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar <em>GSS Environment Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar
	 * @generated
	 */
	public Adapter createGSSEnvironmentGlobalVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField <em>GSS Environment Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField
	 * @generated
	 */
	public Adapter createGSSEnvironmentReferenceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC <em>GSS Environment Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC
	 * @generated
	 */
	public Adapter createGSSEnvironmentReferencePeriodicTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket <em>GSS Environment Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket
	 * @generated
	 */
	public Adapter createGSSEnvironmentReferenceSpecialPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors <em>GSS Environment Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors
	 * @generated
	 */
	public Adapter createGSSEnvironmentMonitorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot <em>GSS Environment Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPlot
	 * @generated
	 */
	public Adapter createGSSEnvironmentPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg <em>GSS Environment Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg
	 * @generated
	 */
	public Adapter createGSSEnvironmentAlarmMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify <em>GSS Environment Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify
	 * @generated
	 */
	public Adapter createGSSEnvironmentModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal <em>GSS Environment Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal
	 * @generated
	 */
	public Adapter createGSSEnvironmentAlarmValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered <em>GSS Environment GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered
	 * @generated
	 */
	public Adapter createGSSEnvironmentGVFilteredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic <em>GSS Environment GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic
	 * @generated
	 */
	public Adapter createGSSEnvironmentGVPeriodicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.common.GSSModelElement <em>GSS Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement
	 * @generated
	 */
	public Adapter createGSSModelElementAdapter() {
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

} //environmentAdapterFactory
