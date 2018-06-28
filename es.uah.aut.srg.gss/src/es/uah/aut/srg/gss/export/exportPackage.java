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
package es.uah.aut.srg.gss.export;

import es.uah.aut.srg.gss.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.export.exportFactory
 * @model kind="package"
 * @generated
 */
public interface exportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "export";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/export";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	exportPackage eINSTANCE = es.uah.aut.srg.gss.export.impl.exportPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl <em>GSS Export Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportExportImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportExport()
	 * @generated
	 */
	int GSS_EXPORT_EXPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__FROM = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__TO = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__SIZES = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__SETTINGS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activate DI Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT__ACTIVATE_DI_CS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GSS Export Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GSS Export Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_EXPORT_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl <em>GSS Export Sizes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizes()
	 * @generated
	 */
	int GSS_EXPORT_SIZES = 1;

	/**
	 * The feature id for the '<em><b>Size From File Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Size From File Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE = 1;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZES__SIZE_IN_BITS = 2;

	/**
	 * The number of structural features of the '<em>GSS Export Sizes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Export Sizes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl <em>GSS Export Size From File Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizeFromFileLength()
	 * @generated
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID = 0;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE = 1;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Setting From Const</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST = 4;

	/**
	 * The number of structural features of the '<em>GSS Export Size From File Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Export Size From File Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LENGTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl <em>GSS Export Size From File Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizeFromFileLine()
	 * @generated
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE__ID = 0;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE = 2;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT = 4;

	/**
	 * The number of structural features of the '<em>GSS Export Size From File Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Export Size From File Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_FROM_FILE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeInBitsImpl <em>GSS Export Size In Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizeInBitsImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizeInBits()
	 * @generated
	 */
	int GSS_EXPORT_SIZE_IN_BITS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_IN_BITS__ID = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_IN_BITS__FROM = 1;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_IN_BITS__ADD_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_IN_BITS__UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Export Size In Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_IN_BITS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Export Size In Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SIZE_IN_BITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl <em>GSS Export Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettings()
	 * @generated
	 */
	int GSS_EXPORT_SETTINGS = 5;

	/**
	 * The feature id for the '<em><b>Setting From Const</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS__SETTING_FROM_CONST = 0;

	/**
	 * The feature id for the '<em><b>Setting From Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Setting From File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS__SETTING_FROM_FILE = 2;

	/**
	 * The feature id for the '<em><b>Setting From Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Setting AI From Const</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST = 4;

	/**
	 * The feature id for the '<em><b>Setting AI From File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE = 5;

	/**
	 * The number of structural features of the '<em>GSS Export Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GSS Export Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromConstImpl <em>GSS Export Setting From Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromConstImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromConst()
	 * @generated
	 */
	int GSS_EXPORT_SETTING_FROM_CONST = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_CONST__VALUE = 0;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Export Setting From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_CONST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Export Setting From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_CONST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromSizeImpl <em>GSS Export Setting From Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromSizeImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromSize()
	 * @generated
	 */
	int GSS_EXPORT_SETTING_FROM_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Size Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_SIZE__SIZE_REF = 0;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_SIZE__TO_FIELD_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Export Setting From Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Export Setting From Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFileImpl <em>GSS Export Setting From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFileImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromFile()
	 * @generated
	 */
	int GSS_EXPORT_SETTING_FROM_FILE = 8;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE__FILE = 0;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE__TO_FIELD_REF = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE__LINE = 4;

	/**
	 * The number of structural features of the '<em>GSS Export Setting From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Export Setting From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFieldImpl <em>GSS Export Setting From Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFieldImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromField()
	 * @generated
	 */
	int GSS_EXPORT_SETTING_FROM_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Export Setting From Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Export Setting From Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_FROM_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl <em>GSS Export Setting AI From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingAIFromFile()
	 * @generated
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE = 11;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl <em>GSS Export Setting AI From Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingAIFromConst()
	 * @generated
	 */
	int GSS_EXPORT_SETTING_AI_FROM_CONST = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE = 0;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF = 1;

	/**
	 * The feature id for the '<em><b>To Array Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX = 2;

	/**
	 * The number of structural features of the '<em>GSS Export Setting AI From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_CONST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Export Setting AI From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_CONST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE__FILE = 0;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE__TO_FIELD_REF = 1;

	/**
	 * The feature id for the '<em><b>To Array Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE__LINE = 5;

	/**
	 * The number of structural features of the '<em>GSS Export Setting AI From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GSS Export Setting AI From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_SETTING_AI_FROM_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportActivateDICsImpl <em>GSS Export Activate DI Cs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportActivateDICsImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportActivateDICs()
	 * @generated
	 */
	int GSS_EXPORT_ACTIVATE_DI_CS = 12;

	/**
	 * The feature id for the '<em><b>DIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_ACTIVATE_DI_CS__DIC = 0;

	/**
	 * The number of structural features of the '<em>GSS Export Activate DI Cs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_ACTIVATE_DI_CS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Export Activate DI Cs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_ACTIVATE_DI_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportDICImpl <em>GSS Export DIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.impl.GSSExportDICImpl
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportDIC()
	 * @generated
	 */
	int GSS_EXPORT_DIC = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_DIC__ID = 0;

	/**
	 * The feature id for the '<em><b>DIC Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_DIC__DIC_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Export DIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_DIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Export DIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_EXPORT_DIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.export.GSSExportUnit <em>GSS Export Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportUnit()
	 * @generated
	 */
	int GSS_EXPORT_UNIT = 14;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportExport <em>GSS Export Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Export</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport
	 * @generated
	 */
	EClass getGSSExportExport();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportExport#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport#getFrom()
	 * @see #getGSSExportExport()
	 * @generated
	 */
	EAttribute getGSSExportExport_From();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportExport#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport#getTo()
	 * @see #getGSSExportExport()
	 * @generated
	 */
	EAttribute getGSSExportExport_To();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.export.GSSExportExport#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizes</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport#getSizes()
	 * @see #getGSSExportExport()
	 * @generated
	 */
	EReference getGSSExportExport_Sizes();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.export.GSSExportExport#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport#getSettings()
	 * @see #getGSSExportExport()
	 * @generated
	 */
	EReference getGSSExportExport_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.export.GSSExportExport#getActivateDICs <em>Activate DI Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activate DI Cs</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportExport#getActivateDICs()
	 * @see #getGSSExportExport()
	 * @generated
	 */
	EReference getGSSExportExport_ActivateDICs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSizes <em>GSS Export Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Sizes</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizes
	 * @generated
	 */
	EClass getGSSExportSizes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSizes#getSizeFromFileLength <em>Size From File Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size From File Length</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizes#getSizeFromFileLength()
	 * @see #getGSSExportSizes()
	 * @generated
	 */
	EReference getGSSExportSizes_SizeFromFileLength();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSizes#getSizeFromFileLine <em>Size From File Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size From File Line</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizes#getSizeFromFileLine()
	 * @see #getGSSExportSizes()
	 * @generated
	 */
	EReference getGSSExportSizes_SizeFromFileLine();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSizes#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size In Bits</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizes#getSizeInBits()
	 * @see #getGSSExportSizes()
	 * @generated
	 */
	EReference getGSSExportSizes_SizeInBits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength <em>GSS Export Size From File Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Size From File Length</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength
	 * @generated
	 */
	EClass getGSSExportSizeFromFileLength();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getId()
	 * @see #getGSSExportSizeFromFileLength()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getFromFile()
	 * @see #getGSSExportSizeFromFileLength()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLength_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getAddSize <em>Add Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getAddSize()
	 * @see #getGSSExportSizeFromFileLength()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLength_AddSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getUnit()
	 * @see #getGSSExportSizeFromFileLength()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLength_Unit();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getSettingFromConst <em>Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setting From Const</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getSettingFromConst()
	 * @see #getGSSExportSizeFromFileLength()
	 * @generated
	 */
	EReference getGSSExportSizeFromFileLength_SettingFromConst();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine <em>GSS Export Size From File Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Size From File Line</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine
	 * @generated
	 */
	EClass getGSSExportSizeFromFileLine();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getId()
	 * @see #getGSSExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLine_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getFromFile()
	 * @see #getGSSExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLine_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getLine()
	 * @see #getGSSExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLine_Line();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getAddSize <em>Add Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getAddSize()
	 * @see #getGSSExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLine_AddSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine#getUnit()
	 * @see #getGSSExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getGSSExportSizeFromFileLine_Unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits <em>GSS Export Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Size In Bits</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeInBits
	 * @generated
	 */
	EClass getGSSExportSizeInBits();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeInBits#getId()
	 * @see #getGSSExportSizeInBits()
	 * @generated
	 */
	EAttribute getGSSExportSizeInBits_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeInBits#getFrom()
	 * @see #getGSSExportSizeInBits()
	 * @generated
	 */
	EAttribute getGSSExportSizeInBits_From();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getAddSize <em>Add Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeInBits#getAddSize()
	 * @see #getGSSExportSizeInBits()
	 * @generated
	 */
	EAttribute getGSSExportSizeInBits_AddSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSizeInBits#getUnit()
	 * @see #getGSSExportSizeInBits()
	 * @generated
	 */
	EAttribute getGSSExportSizeInBits_Unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettings <em>GSS Export Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Settings</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings
	 * @generated
	 */
	EClass getGSSExportSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromConst <em>Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From Const</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromConst()
	 * @see #getGSSExportSettings()
	 * @generated
	 */
	EReference getGSSExportSettings_SettingFromConst();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromSize <em>Setting From Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromSize()
	 * @see #getGSSExportSettings()
	 * @generated
	 */
	EReference getGSSExportSettings_SettingFromSize();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromFile <em>Setting From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromFile()
	 * @see #getGSSExportSettings()
	 * @generated
	 */
	EReference getGSSExportSettings_SettingFromFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromField <em>Setting From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From Field</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromField()
	 * @see #getGSSExportSettings()
	 * @generated
	 */
	EReference getGSSExportSettings_SettingFromField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingAIFromConst <em>Setting AI From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting AI From Const</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings#getSettingAIFromConst()
	 * @see #getGSSExportSettings()
	 * @generated
	 */
	EReference getGSSExportSettings_SettingAIFromConst();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingAIFromFile <em>Setting AI From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting AI From File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettings#getSettingAIFromFile()
	 * @see #getGSSExportSettings()
	 * @generated
	 */
	EReference getGSSExportSettings_SettingAIFromFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromConst <em>GSS Export Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Setting From Const</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromConst
	 * @generated
	 */
	EClass getGSSExportSettingFromConst();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromConst#getValue()
	 * @see #getGSSExportSettingFromConst()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromConst_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromConst#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromConst#getToFieldRef()
	 * @see #getGSSExportSettingFromConst()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromConst_ToFieldRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromSize <em>GSS Export Setting From Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Setting From Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromSize
	 * @generated
	 */
	EClass getGSSExportSettingFromSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromSize#getSizeRef <em>Size Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromSize#getSizeRef()
	 * @see #getGSSExportSettingFromSize()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromSize_SizeRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromSize#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromSize#getToFieldRef()
	 * @see #getGSSExportSettingFromSize()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromSize_ToFieldRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile <em>GSS Export Setting From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Setting From File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile
	 * @generated
	 */
	EClass getGSSExportSettingFromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getFile()
	 * @see #getGSSExportSettingFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromFile_File();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getToFieldRef()
	 * @see #getGSSExportSettingFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromFile_ToFieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getOffset()
	 * @see #getGSSExportSettingFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromFile_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getSize()
	 * @see #getGSSExportSettingFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getLine()
	 * @see #getGSSExportSettingFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromFile_Line();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromField <em>GSS Export Setting From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Setting From Field</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromField
	 * @generated
	 */
	EClass getGSSExportSettingFromField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromField#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromField#getFieldRef()
	 * @see #getGSSExportSettingFromField()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromField_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromField#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingFromField#getToFieldRef()
	 * @see #getGSSExportSettingFromField()
	 * @generated
	 */
	EAttribute getGSSExportSettingFromField_ToFieldRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile <em>GSS Export Setting AI From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Setting AI From File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile
	 * @generated
	 */
	EClass getGSSExportSettingAIFromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getFile()
	 * @see #getGSSExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromFile_File();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getToFieldRef()
	 * @see #getGSSExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromFile_ToFieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getToArrayIndex <em>To Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Array Index</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getToArrayIndex()
	 * @see #getGSSExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromFile_ToArrayIndex();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getOffset()
	 * @see #getGSSExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromFile_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getSize()
	 * @see #getGSSExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile#getLine()
	 * @see #getGSSExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromFile_Line();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst <em>GSS Export Setting AI From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Setting AI From Const</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst
	 * @generated
	 */
	EClass getGSSExportSettingAIFromConst();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getValue()
	 * @see #getGSSExportSettingAIFromConst()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromConst_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToFieldRef()
	 * @see #getGSSExportSettingAIFromConst()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromConst_ToFieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToArrayIndex <em>To Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Array Index</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToArrayIndex()
	 * @see #getGSSExportSettingAIFromConst()
	 * @generated
	 */
	EAttribute getGSSExportSettingAIFromConst_ToArrayIndex();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportActivateDICs <em>GSS Export Activate DI Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export Activate DI Cs</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportActivateDICs
	 * @generated
	 */
	EClass getGSSExportActivateDICs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.export.GSSExportActivateDICs#getDIC <em>DIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DIC</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportActivateDICs#getDIC()
	 * @see #getGSSExportActivateDICs()
	 * @generated
	 */
	EReference getGSSExportActivateDICs_DIC();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.export.GSSExportDIC <em>GSS Export DIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Export DIC</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportDIC
	 * @generated
	 */
	EClass getGSSExportDIC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportDIC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportDIC#getId()
	 * @see #getGSSExportDIC()
	 * @generated
	 */
	EAttribute getGSSExportDIC_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.export.GSSExportDIC#getDICRef <em>DIC Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DIC Ref</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportDIC#getDICRef()
	 * @see #getGSSExportDIC()
	 * @generated
	 */
	EAttribute getGSSExportDIC_DICRef();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.export.GSSExportUnit <em>GSS Export Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Export Unit</em>'.
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @generated
	 */
	EEnum getGSSExportUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	exportFactory getexportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl <em>GSS Export Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportExportImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportExport()
		 * @generated
		 */
		EClass GSS_EXPORT_EXPORT = eINSTANCE.getGSSExportExport();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_EXPORT__FROM = eINSTANCE.getGSSExportExport_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_EXPORT__TO = eINSTANCE.getGSSExportExport_To();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_EXPORT__SIZES = eINSTANCE.getGSSExportExport_Sizes();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_EXPORT__SETTINGS = eINSTANCE.getGSSExportExport_Settings();

		/**
		 * The meta object literal for the '<em><b>Activate DI Cs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_EXPORT__ACTIVATE_DI_CS = eINSTANCE.getGSSExportExport_ActivateDICs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl <em>GSS Export Sizes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizesImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizes()
		 * @generated
		 */
		EClass GSS_EXPORT_SIZES = eINSTANCE.getGSSExportSizes();

		/**
		 * The meta object literal for the '<em><b>Size From File Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH = eINSTANCE.getGSSExportSizes_SizeFromFileLength();

		/**
		 * The meta object literal for the '<em><b>Size From File Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE = eINSTANCE.getGSSExportSizes_SizeFromFileLine();

		/**
		 * The meta object literal for the '<em><b>Size In Bits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SIZES__SIZE_IN_BITS = eINSTANCE.getGSSExportSizes_SizeInBits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl <em>GSS Export Size From File Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizeFromFileLength()
		 * @generated
		 */
		EClass GSS_EXPORT_SIZE_FROM_FILE_LENGTH = eINSTANCE.getGSSExportSizeFromFileLength();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID = eINSTANCE.getGSSExportSizeFromFileLength_Id();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE = eINSTANCE.getGSSExportSizeFromFileLength_FromFile();

		/**
		 * The meta object literal for the '<em><b>Add Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE = eINSTANCE.getGSSExportSizeFromFileLength_AddSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT = eINSTANCE.getGSSExportSizeFromFileLength_Unit();

		/**
		 * The meta object literal for the '<em><b>Setting From Const</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST = eINSTANCE.getGSSExportSizeFromFileLength_SettingFromConst();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl <em>GSS Export Size From File Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizeFromFileLine()
		 * @generated
		 */
		EClass GSS_EXPORT_SIZE_FROM_FILE_LINE = eINSTANCE.getGSSExportSizeFromFileLine();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LINE__ID = eINSTANCE.getGSSExportSizeFromFileLine_Id();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE = eINSTANCE.getGSSExportSizeFromFileLine_FromFile();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE = eINSTANCE.getGSSExportSizeFromFileLine_Line();

		/**
		 * The meta object literal for the '<em><b>Add Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE = eINSTANCE.getGSSExportSizeFromFileLine_AddSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT = eINSTANCE.getGSSExportSizeFromFileLine_Unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeInBitsImpl <em>GSS Export Size In Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSizeInBitsImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSizeInBits()
		 * @generated
		 */
		EClass GSS_EXPORT_SIZE_IN_BITS = eINSTANCE.getGSSExportSizeInBits();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_IN_BITS__ID = eINSTANCE.getGSSExportSizeInBits_Id();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_IN_BITS__FROM = eINSTANCE.getGSSExportSizeInBits_From();

		/**
		 * The meta object literal for the '<em><b>Add Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_IN_BITS__ADD_SIZE = eINSTANCE.getGSSExportSizeInBits_AddSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SIZE_IN_BITS__UNIT = eINSTANCE.getGSSExportSizeInBits_Unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl <em>GSS Export Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettings()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTINGS = eINSTANCE.getGSSExportSettings();

		/**
		 * The meta object literal for the '<em><b>Setting From Const</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SETTINGS__SETTING_FROM_CONST = eINSTANCE.getGSSExportSettings_SettingFromConst();

		/**
		 * The meta object literal for the '<em><b>Setting From Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE = eINSTANCE.getGSSExportSettings_SettingFromSize();

		/**
		 * The meta object literal for the '<em><b>Setting From File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SETTINGS__SETTING_FROM_FILE = eINSTANCE.getGSSExportSettings_SettingFromFile();

		/**
		 * The meta object literal for the '<em><b>Setting From Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD = eINSTANCE.getGSSExportSettings_SettingFromField();

		/**
		 * The meta object literal for the '<em><b>Setting AI From Const</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST = eINSTANCE.getGSSExportSettings_SettingAIFromConst();

		/**
		 * The meta object literal for the '<em><b>Setting AI From File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE = eINSTANCE.getGSSExportSettings_SettingAIFromFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromConstImpl <em>GSS Export Setting From Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromConstImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromConst()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTING_FROM_CONST = eINSTANCE.getGSSExportSettingFromConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_CONST__VALUE = eINSTANCE.getGSSExportSettingFromConst_Value();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF = eINSTANCE.getGSSExportSettingFromConst_ToFieldRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromSizeImpl <em>GSS Export Setting From Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromSizeImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromSize()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTING_FROM_SIZE = eINSTANCE.getGSSExportSettingFromSize();

		/**
		 * The meta object literal for the '<em><b>Size Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_SIZE__SIZE_REF = eINSTANCE.getGSSExportSettingFromSize_SizeRef();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_SIZE__TO_FIELD_REF = eINSTANCE.getGSSExportSettingFromSize_ToFieldRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFileImpl <em>GSS Export Setting From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFileImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromFile()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTING_FROM_FILE = eINSTANCE.getGSSExportSettingFromFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FILE__FILE = eINSTANCE.getGSSExportSettingFromFile_File();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FILE__TO_FIELD_REF = eINSTANCE.getGSSExportSettingFromFile_ToFieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FILE__OFFSET = eINSTANCE.getGSSExportSettingFromFile_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FILE__SIZE = eINSTANCE.getGSSExportSettingFromFile_Size();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FILE__LINE = eINSTANCE.getGSSExportSettingFromFile_Line();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFieldImpl <em>GSS Export Setting From Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFieldImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingFromField()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTING_FROM_FIELD = eINSTANCE.getGSSExportSettingFromField();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF = eINSTANCE.getGSSExportSettingFromField_FieldRef();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF = eINSTANCE.getGSSExportSettingFromField_ToFieldRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl <em>GSS Export Setting AI From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingAIFromFile()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTING_AI_FROM_FILE = eINSTANCE.getGSSExportSettingAIFromFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_FILE__FILE = eINSTANCE.getGSSExportSettingAIFromFile_File();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_FILE__TO_FIELD_REF = eINSTANCE.getGSSExportSettingAIFromFile_ToFieldRef();

		/**
		 * The meta object literal for the '<em><b>To Array Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX = eINSTANCE.getGSSExportSettingAIFromFile_ToArrayIndex();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET = eINSTANCE.getGSSExportSettingAIFromFile_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE = eINSTANCE.getGSSExportSettingAIFromFile_Size();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_FILE__LINE = eINSTANCE.getGSSExportSettingAIFromFile_Line();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl <em>GSS Export Setting AI From Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportSettingAIFromConst()
		 * @generated
		 */
		EClass GSS_EXPORT_SETTING_AI_FROM_CONST = eINSTANCE.getGSSExportSettingAIFromConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE = eINSTANCE.getGSSExportSettingAIFromConst_Value();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF = eINSTANCE.getGSSExportSettingAIFromConst_ToFieldRef();

		/**
		 * The meta object literal for the '<em><b>To Array Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX = eINSTANCE.getGSSExportSettingAIFromConst_ToArrayIndex();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportActivateDICsImpl <em>GSS Export Activate DI Cs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportActivateDICsImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportActivateDICs()
		 * @generated
		 */
		EClass GSS_EXPORT_ACTIVATE_DI_CS = eINSTANCE.getGSSExportActivateDICs();

		/**
		 * The meta object literal for the '<em><b>DIC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_EXPORT_ACTIVATE_DI_CS__DIC = eINSTANCE.getGSSExportActivateDICs_DIC();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.impl.GSSExportDICImpl <em>GSS Export DIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.impl.GSSExportDICImpl
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportDIC()
		 * @generated
		 */
		EClass GSS_EXPORT_DIC = eINSTANCE.getGSSExportDIC();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_DIC__ID = eINSTANCE.getGSSExportDIC_Id();

		/**
		 * The meta object literal for the '<em><b>DIC Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_EXPORT_DIC__DIC_REF = eINSTANCE.getGSSExportDIC_DICRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.export.GSSExportUnit <em>GSS Export Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.export.GSSExportUnit
		 * @see es.uah.aut.srg.gss.export.impl.exportPackageImpl#getGSSExportUnit()
		 * @generated
		 */
		EEnum GSS_EXPORT_UNIT = eINSTANCE.getGSSExportUnit();

	}

} //exportPackage
