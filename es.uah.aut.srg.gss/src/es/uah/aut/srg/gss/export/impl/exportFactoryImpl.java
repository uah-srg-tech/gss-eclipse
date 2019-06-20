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
package es.uah.aut.srg.gss.export.impl;

import es.uah.aut.srg.gss.export.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class exportFactoryImpl extends EFactoryImpl implements exportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static exportFactory init() {
		try {
			exportFactory theexportFactory = (exportFactory)EPackage.Registry.INSTANCE.getEFactory(exportPackage.eNS_URI);
			if (theexportFactory != null) {
				return theexportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new exportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case exportPackage.GSS_EXPORT_EXPORT: return createGSSExportExport();
			case exportPackage.GSS_EXPORT_SIZES: return createGSSExportSizes();
			case exportPackage.GSS_EXPORT_SIZE: return createGSSExportSize();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH: return createGSSExportSizeFromFileLength();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE: return createGSSExportSizeFromFileLine();
			case exportPackage.GSS_EXPORT_SIZE_IN_BITS: return createGSSExportSizeInBits();
			case exportPackage.GSS_EXPORT_SETTINGS: return createGSSExportSettings();
			case exportPackage.GSS_EXPORT_SETTING: return createGSSExportSetting();
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST: return createGSSExportSettingFromConst();
			case exportPackage.GSS_EXPORT_SETTING_FROM_SIZE: return createGSSExportSettingFromSize();
			case exportPackage.GSS_EXPORT_SETTING_FROM_FILE: return createGSSExportSettingFromFile();
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD: return createGSSExportSettingFromField();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST: return createGSSExportSettingAIFromConst();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE: return createGSSExportSettingAIFromFile();
			case exportPackage.GSS_EXPORT_ACTIVATE_DI_CS: return createGSSExportActivateDICs();
			case exportPackage.GSS_EXPORT_DIC: return createGSSExportDIC();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case exportPackage.GSS_EXPORT_UNIT:
				return createGSSExportUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case exportPackage.GSS_EXPORT_UNIT:
				return convertGSSExportUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport createGSSExportExport() {
		GSSExportExportImpl gssExportExport = new GSSExportExportImpl();
		return gssExportExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSizes createGSSExportSizes() {
		GSSExportSizesImpl gssExportSizes = new GSSExportSizesImpl();
		return gssExportSizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSize createGSSExportSize() {
		GSSExportSizeImpl gssExportSize = new GSSExportSizeImpl();
		return gssExportSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSizeFromFileLength createGSSExportSizeFromFileLength() {
		GSSExportSizeFromFileLengthImpl gssExportSizeFromFileLength = new GSSExportSizeFromFileLengthImpl();
		return gssExportSizeFromFileLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSizeFromFileLine createGSSExportSizeFromFileLine() {
		GSSExportSizeFromFileLineImpl gssExportSizeFromFileLine = new GSSExportSizeFromFileLineImpl();
		return gssExportSizeFromFileLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSizeInBits createGSSExportSizeInBits() {
		GSSExportSizeInBitsImpl gssExportSizeInBits = new GSSExportSizeInBitsImpl();
		return gssExportSizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettings createGSSExportSettings() {
		GSSExportSettingsImpl gssExportSettings = new GSSExportSettingsImpl();
		return gssExportSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSetting createGSSExportSetting() {
		GSSExportSettingImpl gssExportSetting = new GSSExportSettingImpl();
		return gssExportSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettingFromConst createGSSExportSettingFromConst() {
		GSSExportSettingFromConstImpl gssExportSettingFromConst = new GSSExportSettingFromConstImpl();
		return gssExportSettingFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettingFromSize createGSSExportSettingFromSize() {
		GSSExportSettingFromSizeImpl gssExportSettingFromSize = new GSSExportSettingFromSizeImpl();
		return gssExportSettingFromSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettingFromFile createGSSExportSettingFromFile() {
		GSSExportSettingFromFileImpl gssExportSettingFromFile = new GSSExportSettingFromFileImpl();
		return gssExportSettingFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettingFromField createGSSExportSettingFromField() {
		GSSExportSettingFromFieldImpl gssExportSettingFromField = new GSSExportSettingFromFieldImpl();
		return gssExportSettingFromField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettingAIFromConst createGSSExportSettingAIFromConst() {
		GSSExportSettingAIFromConstImpl gssExportSettingAIFromConst = new GSSExportSettingAIFromConstImpl();
		return gssExportSettingAIFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettingAIFromFile createGSSExportSettingAIFromFile() {
		GSSExportSettingAIFromFileImpl gssExportSettingAIFromFile = new GSSExportSettingAIFromFileImpl();
		return gssExportSettingAIFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportActivateDICs createGSSExportActivateDICs() {
		GSSExportActivateDICsImpl gssExportActivateDICs = new GSSExportActivateDICsImpl();
		return gssExportActivateDICs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportDIC createGSSExportDIC() {
		GSSExportDICImpl gssExportDIC = new GSSExportDICImpl();
		return gssExportDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportUnit createGSSExportUnitFromString(EDataType eDataType, String initialValue) {
		GSSExportUnit result = GSSExportUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSExportUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportPackage getexportPackage() {
		return (exportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static exportPackage getPackage() {
		return exportPackage.eINSTANCE;
	}

} //exportFactoryImpl
