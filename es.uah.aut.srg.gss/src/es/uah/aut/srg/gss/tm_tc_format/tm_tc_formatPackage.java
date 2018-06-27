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
package es.uah.aut.srg.gss.tm_tc_format;

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
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatFactory
 * @model kind="package"
 * @generated
 */
public interface tm_tc_formatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tm_tc_format";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tm_tc_format";

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
	tm_tc_formatPackage eINSTANCE = es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl <em>GSS Tm Tc Format Tm TC Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CS Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CS Formula Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>VS Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>FDIC Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VR Field Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>AField</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>AI Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Tm TC Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Tm TC Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl <em>GSS Tm Tc Format CS Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatCSField()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET = 8;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format CS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format CS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSizeImpl <em>GSS Tm Tc Format Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSizeImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatSize()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_SIZE = 8;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatGlobalOffsetImpl <em>GSS Tm Tc Format Global Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatGlobalOffsetImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatGlobalOffset()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_GLOBAL_OFFSET = 9;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFormulaFieldImpl <em>GSS Tm Tc Format CS Formula Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFormulaFieldImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__BYTE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FIRST_BIT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__GLOBAL_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FORMULA = 9;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format CS Formula Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format CS Formula Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CS_FORMULA_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFormulaImpl <em>GSS Tm Tc Format Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFormulaImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFormula()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_FORMULA = 10;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl <em>GSS Tm Tc Format VS Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatVSField()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT = 6;

	/**
	 * The feature id for the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Variable Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE = 10;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format VS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format VS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VS_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatConstSizeImpl <em>GSS Tm Tc Format Const Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatConstSizeImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatConstSize()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_CONST_SIZE = 11;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVariableSizeImpl <em>GSS Tm Tc Format Variable Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVariableSizeImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatVariableSize()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_VARIABLE_SIZE = 12;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatMaxSizeImpl <em>GSS Tm Tc Format Max Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatMaxSizeImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatMaxSize()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_MAX_SIZE = 13;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVRFieldSizeImpl <em>GSS Tm Tc Format VR Field Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVRFieldSizeImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatVRFieldSize()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_VR_FIELD_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VR_FIELD_SIZE__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VR_FIELD_SIZE__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VR_FIELD_SIZE__NAME = 2;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format VR Field Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VR_FIELD_SIZE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format VR Field Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VR_FIELD_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl <em>GSS Tm Tc Format FDIC Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFDICField()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Check Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Floating Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Sorted Fields To Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK = 9;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format FDIC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format FDIC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FDIC_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFloatingOffsetImpl <em>GSS Tm Tc Format Floating Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFloatingOffsetImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFloatingOffset()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_FLOATING_OFFSET = 14;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSortedFieldsToCheckImpl <em>GSS Tm Tc Format Sorted Fields To Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSortedFieldsToCheckImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatSortedFieldsToCheck()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK = 15;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFieldToCheckImpl <em>GSS Tm Tc Format Field To Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFieldToCheckImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFieldToCheck()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_FIELD_TO_CHECK = 16;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAFieldImpl <em>GSS Tm Tc Format AField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAFieldImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatAField()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_AFIELD = 6;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__BYTE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__FIRST_BIT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__GLOBAL_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Array Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD__ARRAY_DIMENSION = 9;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AFIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayDimensionImpl <em>GSS Tm Tc Format Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayDimensionImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatArrayDimension()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_ARRAY_DIMENSION = 17;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl <em>GSS Tm Tc Format AI Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatAIField()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__FID = 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__PFID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER = 5;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Local Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Array Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF = 9;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format AI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format AI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_AI_FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SIZE__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SIZE__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SIZE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Global Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_GLOBAL_OFFSET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Global Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_GLOBAL_OFFSET_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FORMULA__SLOPE = 0;

	/**
	 * The feature id for the '<em><b>Intercept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FORMULA__INTERCEPT = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CONST_SIZE__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CONST_SIZE__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Const Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CONST_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Const Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_CONST_SIZE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VARIABLE_SIZE__FID_REF = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VARIABLE_SIZE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VARIABLE_SIZE__POWER = 2;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Variable Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VARIABLE_SIZE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Variable Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_VARIABLE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_MAX_SIZE__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_MAX_SIZE__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Max Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_MAX_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Max Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_MAX_SIZE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Floating Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FLOATING_OFFSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Floating Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FLOATING_OFFSET_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Field To Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK = 0;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Sorted Fields To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Sorted Fields To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FIELD_TO_CHECK__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Field To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FIELD_TO_CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Field To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_FIELD_TO_CHECK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_DIMENSION__FID_REF = 0;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_DIMENSION__MAX_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayRefImpl <em>GSS Tm Tc Format Array Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayRefImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatArrayRef()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_ARRAY_REF = 18;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_REF__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Array Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Array Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_ARRAY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatLocalOffsetImpl <em>GSS Tm Tc Format Local Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatLocalOffsetImpl
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatLocalOffset()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_LOCAL_OFFSET = 19;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_LOCAL_OFFSET__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_LOCAL_OFFSET__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Tm Tc Format Local Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_LOCAL_OFFSET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Tm Tc Format Local Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TM_TC_FORMAT_LOCAL_OFFSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType <em>GSS Tm Tc Format Tm TC Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatTmTCFormatType()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_TM_TC_FORMAT_TYPE = 20;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType <em>GSS Tm Tc Format Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFieldType()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_FIELD_TYPE = 21;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder <em>GSS Tm Tc Format Field Byte Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFieldByteOrder()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_FIELD_BYTE_ORDER = 22;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit <em>GSS Tm Tc Format SField First Bit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatSFieldFirstBit()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_SFIELD_FIRST_BIT = 23;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit <em>GSS Tm Tc Format Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatUnit()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_UNIT = 24;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower <em>GSS Tm Tc Format Power</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatPower()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_POWER = 25;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType <em>GSS Tm Tc Format Check Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType
	 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatCheckType()
	 * @generated
	 */
	int GSS_TM_TC_FORMAT_CHECK_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat <em>GSS Tm Tc Format Tm TC Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Tm TC Format</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat
	 * @generated
	 */
	EClass getGSSTmTcFormatTmTCFormat();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getProtocol()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatTmTCFormat_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getType()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatTmTCFormat_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getCSFormulaField <em>CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CS Formula Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getCSFormulaField()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_CSFormulaField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getCSField <em>CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CS Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getCSField()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_CSField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getVSField <em>VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VS Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getVSField()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_VSField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getFDICField <em>FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FDIC Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getFDICField()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_FDICField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getVRFieldSize <em>VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VR Field Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getVRFieldSize()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_VRFieldSize();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getAField <em>AField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AField</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getAField()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_AField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getAIField <em>AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AI Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat#getAIField()
	 * @see #getGSSTmTcFormatTmTCFormat()
	 * @generated
	 */
	EReference getGSSTmTcFormatTmTCFormat_AIField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField <em>GSS Tm Tc Format CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format CS Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField
	 * @generated
	 */
	EClass getGSSTmTcFormatCSField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getFid()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getPfid()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getName()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getDescription()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getType()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getByteOrder()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getFirstBit()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getSize()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EReference getGSSTmTcFormatCSField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField#getGlobalOffset()
	 * @see #getGSSTmTcFormatCSField()
	 * @generated
	 */
	EReference getGSSTmTcFormatCSField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize <em>GSS Tm Tc Format Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize
	 * @generated
	 */
	EClass getGSSTmTcFormatSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize#getBytes()
	 * @see #getGSSTmTcFormatSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatSize_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize#getBits()
	 * @see #getGSSTmTcFormatSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatSize_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset <em>GSS Tm Tc Format Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset
	 * @generated
	 */
	EClass getGSSTmTcFormatGlobalOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset#getBytes()
	 * @see #getGSSTmTcFormatGlobalOffset()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatGlobalOffset_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset#getBits()
	 * @see #getGSSTmTcFormatGlobalOffset()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatGlobalOffset_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField <em>GSS Tm Tc Format CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format CS Formula Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField
	 * @generated
	 */
	EClass getGSSTmTcFormatCSFormulaField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFid()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getPfid()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getName()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getDescription()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getType()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getByteOrder()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFirstBit()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatCSFormulaField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getSize()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EReference getGSSTmTcFormatCSFormulaField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getGlobalOffset()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EReference getGSSTmTcFormatCSFormulaField_GlobalOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFormula()
	 * @see #getGSSTmTcFormatCSFormulaField()
	 * @generated
	 */
	EReference getGSSTmTcFormatCSFormulaField_Formula();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula <em>GSS Tm Tc Format Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Formula</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula
	 * @generated
	 */
	EClass getGSSTmTcFormatFormula();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula#getSlope()
	 * @see #getGSSTmTcFormatFormula()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFormula_Slope();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula#getIntercept <em>Intercept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intercept</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula#getIntercept()
	 * @see #getGSSTmTcFormatFormula()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFormula_Intercept();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField <em>GSS Tm Tc Format VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format VS Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField
	 * @generated
	 */
	EClass getGSSTmTcFormatVSField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFid()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getPfid()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getName()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getDescription()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getType()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getByteOrder()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFirstBit()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVSField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getConstSize <em>Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getConstSize()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EReference getGSSTmTcFormatVSField_ConstSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getGlobalOffset()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EReference getGSSTmTcFormatVSField_GlobalOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getMaxSize()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EReference getGSSTmTcFormatVSField_MaxSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getVariableSize <em>Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getVariableSize()
	 * @see #getGSSTmTcFormatVSField()
	 * @generated
	 */
	EReference getGSSTmTcFormatVSField_VariableSize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize <em>GSS Tm Tc Format Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Const Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize
	 * @generated
	 */
	EClass getGSSTmTcFormatConstSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize#getBytes()
	 * @see #getGSSTmTcFormatConstSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatConstSize_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize#getBits()
	 * @see #getGSSTmTcFormatConstSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatConstSize_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize <em>GSS Tm Tc Format Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Variable Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize
	 * @generated
	 */
	EClass getGSSTmTcFormatVariableSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getFidRef()
	 * @see #getGSSTmTcFormatVariableSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVariableSize_FidRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getUnit()
	 * @see #getGSSTmTcFormatVariableSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVariableSize_Unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getPower()
	 * @see #getGSSTmTcFormatVariableSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVariableSize_Power();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize <em>GSS Tm Tc Format Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Max Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize
	 * @generated
	 */
	EClass getGSSTmTcFormatMaxSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize#getBytes()
	 * @see #getGSSTmTcFormatMaxSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatMaxSize_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize#getBits()
	 * @see #getGSSTmTcFormatMaxSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatMaxSize_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize <em>GSS Tm Tc Format VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format VR Field Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize
	 * @generated
	 */
	EClass getGSSTmTcFormatVRFieldSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getFid()
	 * @see #getGSSTmTcFormatVRFieldSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVRFieldSize_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getPfid()
	 * @see #getGSSTmTcFormatVRFieldSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVRFieldSize_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize#getName()
	 * @see #getGSSTmTcFormatVRFieldSize()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatVRFieldSize_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField <em>GSS Tm Tc Format FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format FDIC Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField
	 * @generated
	 */
	EClass getGSSTmTcFormatFDICField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getFid()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getPfid()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getName()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getDescription()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getCheckType <em>Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getCheckType()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_CheckType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getByteOrder()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getFirstBit()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFDICField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getSize()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EReference getGSSTmTcFormatFDICField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getFloatingOffset <em>Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floating Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getFloatingOffset()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EReference getGSSTmTcFormatFDICField_FloatingOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorted Fields To Check</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField#getSortedFieldsToCheck()
	 * @see #getGSSTmTcFormatFDICField()
	 * @generated
	 */
	EReference getGSSTmTcFormatFDICField_SortedFieldsToCheck();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset <em>GSS Tm Tc Format Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Floating Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset
	 * @generated
	 */
	EClass getGSSTmTcFormatFloatingOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset#getFidRef()
	 * @see #getGSSTmTcFormatFloatingOffset()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFloatingOffset_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck <em>GSS Tm Tc Format Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Sorted Fields To Check</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck
	 * @generated
	 */
	EClass getGSSTmTcFormatSortedFieldsToCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck#getFieldToCheck <em>Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field To Check</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck#getFieldToCheck()
	 * @see #getGSSTmTcFormatSortedFieldsToCheck()
	 * @generated
	 */
	EReference getGSSTmTcFormatSortedFieldsToCheck_FieldToCheck();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck <em>GSS Tm Tc Format Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Field To Check</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck
	 * @generated
	 */
	EClass getGSSTmTcFormatFieldToCheck();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldToCheck#getFidRef()
	 * @see #getGSSTmTcFormatFieldToCheck()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatFieldToCheck_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField <em>GSS Tm Tc Format AField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format AField</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField
	 * @generated
	 */
	EClass getGSSTmTcFormatAField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getFid()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getPfid()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getName()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getDescription()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getType()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getByteOrder()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getFirstBit()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getSize()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EReference getGSSTmTcFormatAField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getGlobalOffset()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EReference getGSSTmTcFormatAField_GlobalOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Dimension</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField#getArrayDimension()
	 * @see #getGSSTmTcFormatAField()
	 * @generated
	 */
	EReference getGSSTmTcFormatAField_ArrayDimension();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension <em>GSS Tm Tc Format Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Array Dimension</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension
	 * @generated
	 */
	EClass getGSSTmTcFormatArrayDimension();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension#getFidRef()
	 * @see #getGSSTmTcFormatArrayDimension()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatArrayDimension_FidRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayDimension#getMaxItems()
	 * @see #getGSSTmTcFormatArrayDimension()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatArrayDimension_MaxItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField <em>GSS Tm Tc Format AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format AI Field</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField
	 * @generated
	 */
	EClass getGSSTmTcFormatAIField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getFid()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getPfid()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_Pfid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getName()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getDescription()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getType()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getByteOrder()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getFirstBit()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatAIField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getSize()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EReference getGSSTmTcFormatAIField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getLocalOffset <em>Local Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getLocalOffset()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EReference getGSSTmTcFormatAIField_LocalOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getArrayRef <em>Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField#getArrayRef()
	 * @see #getGSSTmTcFormatAIField()
	 * @generated
	 */
	EReference getGSSTmTcFormatAIField_ArrayRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef <em>GSS Tm Tc Format Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Array Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef
	 * @generated
	 */
	EClass getGSSTmTcFormatArrayRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef#getFidRef()
	 * @see #getGSSTmTcFormatArrayRef()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatArrayRef_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset <em>GSS Tm Tc Format Local Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Tm Tc Format Local Offset</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset
	 * @generated
	 */
	EClass getGSSTmTcFormatLocalOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset#getBytes()
	 * @see #getGSSTmTcFormatLocalOffset()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatLocalOffset_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatLocalOffset#getBits()
	 * @see #getGSSTmTcFormatLocalOffset()
	 * @generated
	 */
	EAttribute getGSSTmTcFormatLocalOffset_Bits();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType <em>GSS Tm Tc Format Tm TC Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format Tm TC Format Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType
	 * @generated
	 */
	EEnum getGSSTmTcFormatTmTCFormatType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType <em>GSS Tm Tc Format Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format Field Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType
	 * @generated
	 */
	EEnum getGSSTmTcFormatFieldType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder <em>GSS Tm Tc Format Field Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format Field Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder
	 * @generated
	 */
	EEnum getGSSTmTcFormatFieldByteOrder();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit <em>GSS Tm Tc Format SField First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format SField First Bit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit
	 * @generated
	 */
	EEnum getGSSTmTcFormatSFieldFirstBit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit <em>GSS Tm Tc Format Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format Unit</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit
	 * @generated
	 */
	EEnum getGSSTmTcFormatUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower <em>GSS Tm Tc Format Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format Power</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower
	 * @generated
	 */
	EEnum getGSSTmTcFormatPower();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType <em>GSS Tm Tc Format Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Tm Tc Format Check Type</em>'.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType
	 * @generated
	 */
	EEnum getGSSTmTcFormatCheckType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tm_tc_formatFactory gettm_tc_formatFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl <em>GSS Tm Tc Format Tm TC Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatTmTCFormat()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_TM_TC_FORMAT = eINSTANCE.getGSSTmTcFormatTmTCFormat();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL = eINSTANCE.getGSSTmTcFormatTmTCFormat_Protocol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE = eINSTANCE.getGSSTmTcFormatTmTCFormat_Type();

		/**
		 * The meta object literal for the '<em><b>CS Formula Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD = eINSTANCE.getGSSTmTcFormatTmTCFormat_CSFormulaField();

		/**
		 * The meta object literal for the '<em><b>CS Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD = eINSTANCE.getGSSTmTcFormatTmTCFormat_CSField();

		/**
		 * The meta object literal for the '<em><b>VS Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD = eINSTANCE.getGSSTmTcFormatTmTCFormat_VSField();

		/**
		 * The meta object literal for the '<em><b>FDIC Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD = eINSTANCE.getGSSTmTcFormatTmTCFormat_FDICField();

		/**
		 * The meta object literal for the '<em><b>VR Field Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE = eINSTANCE.getGSSTmTcFormatTmTCFormat_VRFieldSize();

		/**
		 * The meta object literal for the '<em><b>AField</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD = eINSTANCE.getGSSTmTcFormatTmTCFormat_AField();

		/**
		 * The meta object literal for the '<em><b>AI Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD = eINSTANCE.getGSSTmTcFormatTmTCFormat_AIField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl <em>GSS Tm Tc Format CS Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatCSField()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_CS_FIELD = eINSTANCE.getGSSTmTcFormatCSField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__FID = eINSTANCE.getGSSTmTcFormatCSField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__PFID = eINSTANCE.getGSSTmTcFormatCSField_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__NAME = eINSTANCE.getGSSTmTcFormatCSField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION = eINSTANCE.getGSSTmTcFormatCSField_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__TYPE = eINSTANCE.getGSSTmTcFormatCSField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER = eINSTANCE.getGSSTmTcFormatCSField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT = eINSTANCE.getGSSTmTcFormatCSField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_CS_FIELD__SIZE = eINSTANCE.getGSSTmTcFormatCSField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET = eINSTANCE.getGSSTmTcFormatCSField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSizeImpl <em>GSS Tm Tc Format Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSizeImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatSize()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_SIZE = eINSTANCE.getGSSTmTcFormatSize();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_SIZE__BYTES = eINSTANCE.getGSSTmTcFormatSize_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_SIZE__BITS = eINSTANCE.getGSSTmTcFormatSize_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatGlobalOffsetImpl <em>GSS Tm Tc Format Global Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatGlobalOffsetImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatGlobalOffset()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_GLOBAL_OFFSET = eINSTANCE.getGSSTmTcFormatGlobalOffset();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BYTES = eINSTANCE.getGSSTmTcFormatGlobalOffset_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_GLOBAL_OFFSET__BITS = eINSTANCE.getGSSTmTcFormatGlobalOffset_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFormulaFieldImpl <em>GSS Tm Tc Format CS Formula Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFormulaFieldImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatCSFormulaField()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_CS_FORMULA_FIELD = eINSTANCE.getGSSTmTcFormatCSFormulaField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FID = eINSTANCE.getGSSTmTcFormatCSFormulaField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__PFID = eINSTANCE.getGSSTmTcFormatCSFormulaField_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__NAME = eINSTANCE.getGSSTmTcFormatCSFormulaField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__DESCRIPTION = eINSTANCE.getGSSTmTcFormatCSFormulaField_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__TYPE = eINSTANCE.getGSSTmTcFormatCSFormulaField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__BYTE_ORDER = eINSTANCE.getGSSTmTcFormatCSFormulaField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FIRST_BIT = eINSTANCE.getGSSTmTcFormatCSFormulaField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__SIZE = eINSTANCE.getGSSTmTcFormatCSFormulaField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__GLOBAL_OFFSET = eINSTANCE.getGSSTmTcFormatCSFormulaField_GlobalOffset();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_CS_FORMULA_FIELD__FORMULA = eINSTANCE.getGSSTmTcFormatCSFormulaField_Formula();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFormulaImpl <em>GSS Tm Tc Format Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFormulaImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFormula()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_FORMULA = eINSTANCE.getGSSTmTcFormatFormula();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FORMULA__SLOPE = eINSTANCE.getGSSTmTcFormatFormula_Slope();

		/**
		 * The meta object literal for the '<em><b>Intercept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FORMULA__INTERCEPT = eINSTANCE.getGSSTmTcFormatFormula_Intercept();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl <em>GSS Tm Tc Format VS Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatVSField()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_VS_FIELD = eINSTANCE.getGSSTmTcFormatVSField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__FID = eINSTANCE.getGSSTmTcFormatVSField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__PFID = eINSTANCE.getGSSTmTcFormatVSField_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__NAME = eINSTANCE.getGSSTmTcFormatVSField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION = eINSTANCE.getGSSTmTcFormatVSField_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__TYPE = eINSTANCE.getGSSTmTcFormatVSField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER = eINSTANCE.getGSSTmTcFormatVSField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT = eINSTANCE.getGSSTmTcFormatVSField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Const Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE = eINSTANCE.getGSSTmTcFormatVSField_ConstSize();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET = eINSTANCE.getGSSTmTcFormatVSField_GlobalOffset();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE = eINSTANCE.getGSSTmTcFormatVSField_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Variable Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE = eINSTANCE.getGSSTmTcFormatVSField_VariableSize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatConstSizeImpl <em>GSS Tm Tc Format Const Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatConstSizeImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatConstSize()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_CONST_SIZE = eINSTANCE.getGSSTmTcFormatConstSize();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CONST_SIZE__BYTES = eINSTANCE.getGSSTmTcFormatConstSize_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_CONST_SIZE__BITS = eINSTANCE.getGSSTmTcFormatConstSize_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVariableSizeImpl <em>GSS Tm Tc Format Variable Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVariableSizeImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatVariableSize()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_VARIABLE_SIZE = eINSTANCE.getGSSTmTcFormatVariableSize();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VARIABLE_SIZE__FID_REF = eINSTANCE.getGSSTmTcFormatVariableSize_FidRef();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VARIABLE_SIZE__UNIT = eINSTANCE.getGSSTmTcFormatVariableSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VARIABLE_SIZE__POWER = eINSTANCE.getGSSTmTcFormatVariableSize_Power();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatMaxSizeImpl <em>GSS Tm Tc Format Max Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatMaxSizeImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatMaxSize()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_MAX_SIZE = eINSTANCE.getGSSTmTcFormatMaxSize();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_MAX_SIZE__BYTES = eINSTANCE.getGSSTmTcFormatMaxSize_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_MAX_SIZE__BITS = eINSTANCE.getGSSTmTcFormatMaxSize_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVRFieldSizeImpl <em>GSS Tm Tc Format VR Field Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVRFieldSizeImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatVRFieldSize()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_VR_FIELD_SIZE = eINSTANCE.getGSSTmTcFormatVRFieldSize();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VR_FIELD_SIZE__FID = eINSTANCE.getGSSTmTcFormatVRFieldSize_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VR_FIELD_SIZE__PFID = eINSTANCE.getGSSTmTcFormatVRFieldSize_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_VR_FIELD_SIZE__NAME = eINSTANCE.getGSSTmTcFormatVRFieldSize_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl <em>GSS Tm Tc Format FDIC Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFDICField()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_FDIC_FIELD = eINSTANCE.getGSSTmTcFormatFDICField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__FID = eINSTANCE.getGSSTmTcFormatFDICField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__PFID = eINSTANCE.getGSSTmTcFormatFDICField_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__NAME = eINSTANCE.getGSSTmTcFormatFDICField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION = eINSTANCE.getGSSTmTcFormatFDICField_Description();

		/**
		 * The meta object literal for the '<em><b>Check Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE = eINSTANCE.getGSSTmTcFormatFDICField_CheckType();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER = eINSTANCE.getGSSTmTcFormatFDICField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT = eINSTANCE.getGSSTmTcFormatFDICField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE = eINSTANCE.getGSSTmTcFormatFDICField_Size();

		/**
		 * The meta object literal for the '<em><b>Floating Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET = eINSTANCE.getGSSTmTcFormatFDICField_FloatingOffset();

		/**
		 * The meta object literal for the '<em><b>Sorted Fields To Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK = eINSTANCE.getGSSTmTcFormatFDICField_SortedFieldsToCheck();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFloatingOffsetImpl <em>GSS Tm Tc Format Floating Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFloatingOffsetImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFloatingOffset()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_FLOATING_OFFSET = eINSTANCE.getGSSTmTcFormatFloatingOffset();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF = eINSTANCE.getGSSTmTcFormatFloatingOffset_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSortedFieldsToCheckImpl <em>GSS Tm Tc Format Sorted Fields To Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatSortedFieldsToCheckImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatSortedFieldsToCheck()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK = eINSTANCE.getGSSTmTcFormatSortedFieldsToCheck();

		/**
		 * The meta object literal for the '<em><b>Field To Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK = eINSTANCE.getGSSTmTcFormatSortedFieldsToCheck_FieldToCheck();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFieldToCheckImpl <em>GSS Tm Tc Format Field To Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFieldToCheckImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFieldToCheck()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_FIELD_TO_CHECK = eINSTANCE.getGSSTmTcFormatFieldToCheck();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_FIELD_TO_CHECK__FID_REF = eINSTANCE.getGSSTmTcFormatFieldToCheck_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAFieldImpl <em>GSS Tm Tc Format AField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAFieldImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatAField()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_AFIELD = eINSTANCE.getGSSTmTcFormatAField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__FID = eINSTANCE.getGSSTmTcFormatAField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__PFID = eINSTANCE.getGSSTmTcFormatAField_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__NAME = eINSTANCE.getGSSTmTcFormatAField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__DESCRIPTION = eINSTANCE.getGSSTmTcFormatAField_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__TYPE = eINSTANCE.getGSSTmTcFormatAField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__BYTE_ORDER = eINSTANCE.getGSSTmTcFormatAField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AFIELD__FIRST_BIT = eINSTANCE.getGSSTmTcFormatAField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_AFIELD__SIZE = eINSTANCE.getGSSTmTcFormatAField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_AFIELD__GLOBAL_OFFSET = eINSTANCE.getGSSTmTcFormatAField_GlobalOffset();

		/**
		 * The meta object literal for the '<em><b>Array Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_AFIELD__ARRAY_DIMENSION = eINSTANCE.getGSSTmTcFormatAField_ArrayDimension();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayDimensionImpl <em>GSS Tm Tc Format Array Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayDimensionImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatArrayDimension()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_ARRAY_DIMENSION = eINSTANCE.getGSSTmTcFormatArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_ARRAY_DIMENSION__FID_REF = eINSTANCE.getGSSTmTcFormatArrayDimension_FidRef();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_ARRAY_DIMENSION__MAX_ITEMS = eINSTANCE.getGSSTmTcFormatArrayDimension_MaxItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl <em>GSS Tm Tc Format AI Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatAIField()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_AI_FIELD = eINSTANCE.getGSSTmTcFormatAIField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__FID = eINSTANCE.getGSSTmTcFormatAIField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__PFID = eINSTANCE.getGSSTmTcFormatAIField_Pfid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__NAME = eINSTANCE.getGSSTmTcFormatAIField_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__DESCRIPTION = eINSTANCE.getGSSTmTcFormatAIField_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__TYPE = eINSTANCE.getGSSTmTcFormatAIField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER = eINSTANCE.getGSSTmTcFormatAIField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT = eINSTANCE.getGSSTmTcFormatAIField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_AI_FIELD__SIZE = eINSTANCE.getGSSTmTcFormatAIField_Size();

		/**
		 * The meta object literal for the '<em><b>Local Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET = eINSTANCE.getGSSTmTcFormatAIField_LocalOffset();

		/**
		 * The meta object literal for the '<em><b>Array Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF = eINSTANCE.getGSSTmTcFormatAIField_ArrayRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayRefImpl <em>GSS Tm Tc Format Array Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatArrayRefImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatArrayRef()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_ARRAY_REF = eINSTANCE.getGSSTmTcFormatArrayRef();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_ARRAY_REF__FID_REF = eINSTANCE.getGSSTmTcFormatArrayRef_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatLocalOffsetImpl <em>GSS Tm Tc Format Local Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatLocalOffsetImpl
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatLocalOffset()
		 * @generated
		 */
		EClass GSS_TM_TC_FORMAT_LOCAL_OFFSET = eINSTANCE.getGSSTmTcFormatLocalOffset();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_LOCAL_OFFSET__BYTES = eINSTANCE.getGSSTmTcFormatLocalOffset_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TM_TC_FORMAT_LOCAL_OFFSET__BITS = eINSTANCE.getGSSTmTcFormatLocalOffset_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType <em>GSS Tm Tc Format Tm TC Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatTmTCFormatType()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_TM_TC_FORMAT_TYPE = eINSTANCE.getGSSTmTcFormatTmTCFormatType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType <em>GSS Tm Tc Format Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFieldType()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_FIELD_TYPE = eINSTANCE.getGSSTmTcFormatFieldType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder <em>GSS Tm Tc Format Field Byte Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatFieldByteOrder()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_FIELD_BYTE_ORDER = eINSTANCE.getGSSTmTcFormatFieldByteOrder();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit <em>GSS Tm Tc Format SField First Bit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatSFieldFirstBit()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_SFIELD_FIRST_BIT = eINSTANCE.getGSSTmTcFormatSFieldFirstBit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit <em>GSS Tm Tc Format Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatUnit()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_UNIT = eINSTANCE.getGSSTmTcFormatUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower <em>GSS Tm Tc Format Power</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatPower()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_POWER = eINSTANCE.getGSSTmTcFormatPower();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType <em>GSS Tm Tc Format Check Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType
		 * @see es.uah.aut.srg.gss.tm_tc_format.impl.tm_tc_formatPackageImpl#getGSSTmTcFormatCheckType()
		 * @generated
		 */
		EEnum GSS_TM_TC_FORMAT_CHECK_TYPE = eINSTANCE.getGSSTmTcFormatCheckType();

	}

} //tm_tc_formatPackage
