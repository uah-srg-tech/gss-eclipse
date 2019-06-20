/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.config.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.config.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.config.configPackage
 * @generated
 */
public class configAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static configPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = configPackage.eINSTANCE;
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
	protected configSwitch<Adapter> modelSwitch =
		new configSwitch<Adapter>() {
			@Override
			public Adapter caseGSSConfigGSSConfig(GSSConfigGSSConfig object) {
				return createGSSConfigGSSConfigAdapter();
			}
			@Override
			public Adapter caseGSSConfigGSSOptions(GSSConfigGSSOptions object) {
				return createGSSConfigGSSOptionsAdapter();
			}
			@Override
			public Adapter caseGSSConfigGSSInfo(GSSConfigGSSInfo object) {
				return createGSSConfigGSSInfoAdapter();
			}
			@Override
			public Adapter caseGSSConfigGSSInfoPrint(GSSConfigGSSInfoPrint object) {
				return createGSSConfigGSSInfoPrintAdapter();
			}
			@Override
			public Adapter caseGSSConfigPhyHeaderPrint(GSSConfigPhyHeaderPrint object) {
				return createGSSConfigPhyHeaderPrintAdapter();
			}
			@Override
			public Adapter caseGSSConfigGSSDiscardErrorFlags(GSSConfigGSSDiscardErrorFlags object) {
				return createGSSConfigGSSDiscardErrorFlagsAdapter();
			}
			@Override
			public Adapter caseGSSConfigProtocols(GSSConfigProtocols object) {
				return createGSSConfigProtocolsAdapter();
			}
			@Override
			public Adapter caseGSSConfigProtocol(GSSConfigProtocol object) {
				return createGSSConfigProtocolAdapter();
			}
			@Override
			public Adapter caseGSSConfigInterfaces(GSSConfigInterfaces object) {
				return createGSSConfigInterfacesAdapter();
			}
			@Override
			public Adapter caseGSSConfigMainInterface(GSSConfigMainInterface object) {
				return createGSSConfigMainInterfaceAdapter();
			}
			@Override
			public Adapter caseGSSConfigInterface(GSSConfigInterface object) {
				return createGSSConfigInterfaceAdapter();
			}
			@Override
			public Adapter caseGSSConfigLevelInOut(GSSConfigLevelInOut object) {
				return createGSSConfigLevelInOutAdapter();
			}
			@Override
			public Adapter caseGSSConfigLevelIn(GSSConfigLevelIn object) {
				return createGSSConfigLevelInAdapter();
			}
			@Override
			public Adapter caseGSSConfigLevelOut(GSSConfigLevelOut object) {
				return createGSSConfigLevelOutAdapter();
			}
			@Override
			public Adapter caseGSSConfigSpecialPackets(GSSConfigSpecialPackets object) {
				return createGSSConfigSpecialPacketsAdapter();
			}
			@Override
			public Adapter caseGSSConfigSpecialPacket(GSSConfigSpecialPacket object) {
				return createGSSConfigSpecialPacketAdapter();
			}
			@Override
			public Adapter caseGSSConfigUpperLevels(GSSConfigUpperLevels object) {
				return createGSSConfigUpperLevelsAdapter();
			}
			@Override
			public Adapter caseGSSConfigUpperLevel(GSSConfigUpperLevel object) {
				return createGSSConfigUpperLevelAdapter();
			}
			@Override
			public Adapter caseGSSConfigPrintingData(GSSConfigPrintingData object) {
				return createGSSConfigPrintingDataAdapter();
			}
			@Override
			public Adapter caseGSSConfigStructuredData(GSSConfigStructuredData object) {
				return createGSSConfigStructuredDataAdapter();
			}
			@Override
			public Adapter caseGSSConfigPeriod(GSSConfigPeriod object) {
				return createGSSConfigPeriodAdapter();
			}
			@Override
			public Adapter caseGSSConfigIntervalRange(GSSConfigIntervalRange object) {
				return createGSSConfigIntervalRangeAdapter();
			}
			@Override
			public Adapter caseGSSConfigPeriodicTCs(GSSConfigPeriodicTCs object) {
				return createGSSConfigPeriodicTCsAdapter();
			}
			@Override
			public Adapter caseGSSConfigPeriodicTCLevel2(GSSConfigPeriodicTCLevel2 object) {
				return createGSSConfigPeriodicTCLevel2Adapter();
			}
			@Override
			public Adapter caseGSSConfigPeriodicTCLevel1(GSSConfigPeriodicTCLevel1 object) {
				return createGSSConfigPeriodicTCLevel1Adapter();
			}
			@Override
			public Adapter caseGSSConfigPeriodicTCLevel0(GSSConfigPeriodicTCLevel0 object) {
				return createGSSConfigPeriodicTCLevel0Adapter();
			}
			@Override
			public Adapter caseGSSConfigGlobalVars(GSSConfigGlobalVars object) {
				return createGSSConfigGlobalVarsAdapter();
			}
			@Override
			public Adapter caseGSSConfigGlobalVar(GSSConfigGlobalVar object) {
				return createGSSConfigGlobalVarAdapter();
			}
			@Override
			public Adapter caseGSSConfigReferenceField(GSSConfigReferenceField object) {
				return createGSSConfigReferenceFieldAdapter();
			}
			@Override
			public Adapter caseGSSConfigReferencePeriodicTC(GSSConfigReferencePeriodicTC object) {
				return createGSSConfigReferencePeriodicTCAdapter();
			}
			@Override
			public Adapter caseGSSConfigReferenceSpecialPacket(GSSConfigReferenceSpecialPacket object) {
				return createGSSConfigReferenceSpecialPacketAdapter();
			}
			@Override
			public Adapter caseGSSConfigMonitors(GSSConfigMonitors object) {
				return createGSSConfigMonitorsAdapter();
			}
			@Override
			public Adapter caseGSSConfigPlot(GSSConfigPlot object) {
				return createGSSConfigPlotAdapter();
			}
			@Override
			public Adapter caseGSSConfigAlarmMsg(GSSConfigAlarmMsg object) {
				return createGSSConfigAlarmMsgAdapter();
			}
			@Override
			public Adapter caseGSSConfigModify(GSSConfigModify object) {
				return createGSSConfigModifyAdapter();
			}
			@Override
			public Adapter caseGSSConfigAlarmVal(GSSConfigAlarmVal object) {
				return createGSSConfigAlarmValAdapter();
			}
			@Override
			public Adapter caseGSSConfigGVFiltered(GSSConfigGVFiltered object) {
				return createGSSConfigGVFilteredAdapter();
			}
			@Override
			public Adapter caseGSSConfigGVPeriodic(GSSConfigGVPeriodic object) {
				return createGSSConfigGVPeriodicAdapter();
			}
			@Override
			public Adapter caseGSSConfigTests(GSSConfigTests object) {
				return createGSSConfigTestsAdapter();
			}
			@Override
			public Adapter caseGSSConfigTestCase(GSSConfigTestCase object) {
				return createGSSConfigTestCaseAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig <em>GSS Config GSS Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig
	 * @generated
	 */
	public Adapter createGSSConfigGSSConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions <em>GSS Config GSS Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSOptions
	 * @generated
	 */
	public Adapter createGSSConfigGSSOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfo <em>GSS Config GSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfo
	 * @generated
	 */
	public Adapter createGSSConfigGSSInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint <em>GSS Config GSS Info Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint
	 * @generated
	 */
	public Adapter createGSSConfigGSSInfoPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint <em>GSS Config Phy Header Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint
	 * @generated
	 */
	public Adapter createGSSConfigPhyHeaderPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags <em>GSS Config GSS Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags
	 * @generated
	 */
	public Adapter createGSSConfigGSSDiscardErrorFlagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigProtocols <em>GSS Config Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocols
	 * @generated
	 */
	public Adapter createGSSConfigProtocolsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol <em>GSS Config Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol
	 * @generated
	 */
	public Adapter createGSSConfigProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces <em>GSS Config Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaces
	 * @generated
	 */
	public Adapter createGSSConfigInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface <em>GSS Config Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface
	 * @generated
	 */
	public Adapter createGSSConfigMainInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigInterface <em>GSS Config Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface
	 * @generated
	 */
	public Adapter createGSSConfigInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut <em>GSS Config Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut
	 * @generated
	 */
	public Adapter createGSSConfigLevelInOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigLevelIn <em>GSS Config Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelIn
	 * @generated
	 */
	public Adapter createGSSConfigLevelInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut <em>GSS Config Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut
	 * @generated
	 */
	public Adapter createGSSConfigLevelOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPackets <em>GSS Config Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPackets
	 * @generated
	 */
	public Adapter createGSSConfigSpecialPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket <em>GSS Config Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket
	 * @generated
	 */
	public Adapter createGSSConfigSpecialPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevels <em>GSS Config Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevels
	 * @generated
	 */
	public Adapter createGSSConfigUpperLevelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel <em>GSS Config Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevel
	 * @generated
	 */
	public Adapter createGSSConfigUpperLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPrintingData <em>GSS Config Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPrintingData
	 * @generated
	 */
	public Adapter createGSSConfigPrintingDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData <em>GSS Config Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigStructuredData
	 * @generated
	 */
	public Adapter createGSSConfigStructuredDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod <em>GSS Config Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriod
	 * @generated
	 */
	public Adapter createGSSConfigPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigIntervalRange <em>GSS Config Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigIntervalRange
	 * @generated
	 */
	public Adapter createGSSConfigIntervalRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs <em>GSS Config Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs
	 * @generated
	 */
	public Adapter createGSSConfigPeriodicTCsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2 <em>GSS Config Periodic TC Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2
	 * @generated
	 */
	public Adapter createGSSConfigPeriodicTCLevel2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1 <em>GSS Config Periodic TC Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1
	 * @generated
	 */
	public Adapter createGSSConfigPeriodicTCLevel1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0 <em>GSS Config Periodic TC Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0
	 * @generated
	 */
	public Adapter createGSSConfigPeriodicTCLevel0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVars <em>GSS Config Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVars
	 * @generated
	 */
	public Adapter createGSSConfigGlobalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar <em>GSS Config Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar
	 * @generated
	 */
	public Adapter createGSSConfigGlobalVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField <em>GSS Config Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField
	 * @generated
	 */
	public Adapter createGSSConfigReferenceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC <em>GSS Config Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC
	 * @generated
	 */
	public Adapter createGSSConfigReferencePeriodicTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket <em>GSS Config Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket
	 * @generated
	 */
	public Adapter createGSSConfigReferenceSpecialPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors <em>GSS Config Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors
	 * @generated
	 */
	public Adapter createGSSConfigMonitorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigPlot <em>GSS Config Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPlot
	 * @generated
	 */
	public Adapter createGSSConfigPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg <em>GSS Config Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg
	 * @generated
	 */
	public Adapter createGSSConfigAlarmMsgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigModify <em>GSS Config Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify
	 * @generated
	 */
	public Adapter createGSSConfigModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal <em>GSS Config Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmVal
	 * @generated
	 */
	public Adapter createGSSConfigAlarmValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered <em>GSS Config GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVFiltered
	 * @generated
	 */
	public Adapter createGSSConfigGVFilteredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigGVPeriodic <em>GSS Config GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVPeriodic
	 * @generated
	 */
	public Adapter createGSSConfigGVPeriodicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigTests <em>GSS Config Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTests
	 * @generated
	 */
	public Adapter createGSSConfigTestsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase <em>GSS Config Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase
	 * @generated
	 */
	public Adapter createGSSConfigTestCaseAdapter() {
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

} //configAdapterFactory
