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
package es.uah.aut.srg.gss.format;

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
 * @see es.uah.aut.srg.gss.format.formatFactory
 * @model kind="package"
 * @generated
 */
public interface formatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "format";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/format";

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
	formatPackage eINSTANCE = es.uah.aut.srg.gss.format.impl.formatPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl <em>GSS Format Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFormat()
	 * @generated
	 */
	int GSS_FORMAT_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__PROTOCOL = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__TYPE = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT__FIELD = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GSS Format Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GSS Format Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMAT_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFieldImpl <em>GSS Format Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatField()
	 * @generated
	 */
	int GSS_FORMAT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD__NAME = commonPackage.GSS_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD__DESCRIPTION = commonPackage.GSS_MODEL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD__FID = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD__PFID = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Format Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD_FEATURE_COUNT = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Format Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD_OPERATION_COUNT = commonPackage.GSS_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatCSFieldImpl <em>GSS Format CS Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatCSFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatCSField()
	 * @generated
	 */
	int GSS_FORMAT_CS_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__NAME = GSS_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__DESCRIPTION = GSS_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__FID = GSS_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__PFID = GSS_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__TYPE = GSS_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__BYTE_ORDER = GSS_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__FIRST_BIT = GSS_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD__GLOBAL_OFFSET = GSS_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GSS Format CS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD_FEATURE_COUNT = GSS_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GSS Format CS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FIELD_OPERATION_COUNT = GSS_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatCSFormulaFieldImpl <em>GSS Format CS Formula Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatCSFormulaFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatCSFormulaField()
	 * @generated
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__NAME = GSS_FORMAT_CS_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__DESCRIPTION = GSS_FORMAT_CS_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__FID = GSS_FORMAT_CS_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__PFID = GSS_FORMAT_CS_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__TYPE = GSS_FORMAT_CS_FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__BYTE_ORDER = GSS_FORMAT_CS_FIELD__BYTE_ORDER;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__FIRST_BIT = GSS_FORMAT_CS_FIELD__FIRST_BIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__SIZE = GSS_FORMAT_CS_FIELD__SIZE;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__GLOBAL_OFFSET = GSS_FORMAT_CS_FIELD__GLOBAL_OFFSET;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD__FORMULA = GSS_FORMAT_CS_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Format CS Formula Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD_FEATURE_COUNT = GSS_FORMAT_CS_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Format CS Formula Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_CS_FORMULA_FIELD_OPERATION_COUNT = GSS_FORMAT_CS_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl <em>GSS Format VS Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatVSField()
	 * @generated
	 */
	int GSS_FORMAT_VS_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__NAME = GSS_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__DESCRIPTION = GSS_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__FID = GSS_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__PFID = GSS_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__TYPE = GSS_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__BYTE_ORDER = GSS_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__FIRST_BIT = GSS_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__CONST_SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variable Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__VARIABLE_SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__MAX_SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET = GSS_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>GSS Format VS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD_FEATURE_COUNT = GSS_FORMAT_FIELD_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>GSS Format VS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VS_FIELD_OPERATION_COUNT = GSS_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatVRFieldSizeImpl <em>GSS Format VR Field Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatVRFieldSizeImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatVRFieldSize()
	 * @generated
	 */
	int GSS_FORMAT_VR_FIELD_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VR_FIELD_SIZE__NAME = GSS_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VR_FIELD_SIZE__DESCRIPTION = GSS_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VR_FIELD_SIZE__FID = GSS_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VR_FIELD_SIZE__PFID = GSS_FORMAT_FIELD__PFID;

	/**
	 * The number of structural features of the '<em>GSS Format VR Field Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VR_FIELD_SIZE_FEATURE_COUNT = GSS_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSS Format VR Field Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VR_FIELD_SIZE_OPERATION_COUNT = GSS_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFDICFieldImpl <em>GSS Format FDIC Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFDICFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFDICField()
	 * @generated
	 */
	int GSS_FORMAT_FDIC_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__NAME = GSS_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__DESCRIPTION = GSS_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__FID = GSS_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__PFID = GSS_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Check Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__CHECK_TYPE = GSS_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__BYTE_ORDER = GSS_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__FIRST_BIT = GSS_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Floating Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__FLOATING_OFFSET = GSS_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sorted Fields To Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK = GSS_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Format FDIC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD_FEATURE_COUNT = GSS_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Format FDIC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FDIC_FIELD_OPERATION_COUNT = GSS_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatAFieldImpl <em>GSS Format AField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatAFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatAField()
	 * @generated
	 */
	int GSS_FORMAT_AFIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__NAME = GSS_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__DESCRIPTION = GSS_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__FID = GSS_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__PFID = GSS_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__TYPE = GSS_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__BYTE_ORDER = GSS_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__FIRST_BIT = GSS_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__ARRAY_DIMENSION = GSS_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD__GLOBAL_OFFSET = GSS_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Format AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD_FEATURE_COUNT = GSS_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Format AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AFIELD_OPERATION_COUNT = GSS_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl <em>GSS Format AI Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatAIField()
	 * @generated
	 */
	int GSS_FORMAT_AI_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__NAME = GSS_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__DESCRIPTION = GSS_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__FID = GSS_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__PFID = GSS_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__TYPE = GSS_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__BYTE_ORDER = GSS_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__FIRST_BIT = GSS_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__ARRAY_REF = GSS_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__SIZE = GSS_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD__LOCAL_OFFSET = GSS_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Format AI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD_FEATURE_COUNT = GSS_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Format AI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_AI_FIELD_OPERATION_COUNT = GSS_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatBytesBitsImpl <em>GSS Format Bytes Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatBytesBitsImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatBytesBits()
	 * @generated
	 */
	int GSS_FORMAT_BYTES_BITS = 9;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_BYTES_BITS__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_BYTES_BITS__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Format Bytes Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_BYTES_BITS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Format Bytes Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_BYTES_BITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormulaImpl <em>GSS Format Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFormulaImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFormula()
	 * @generated
	 */
	int GSS_FORMAT_FORMULA = 10;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMULA__SLOPE = 0;

	/**
	 * The feature id for the '<em><b>Intercept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMULA__INTERCEPT = 1;

	/**
	 * The number of structural features of the '<em>GSS Format Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Format Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl <em>GSS Format Variable Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatVariableSize()
	 * @generated
	 */
	int GSS_FORMAT_VARIABLE_SIZE = 11;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VARIABLE_SIZE__FID_REF = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VARIABLE_SIZE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VARIABLE_SIZE__POWER = 2;

	/**
	 * The number of structural features of the '<em>GSS Format Variable Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VARIABLE_SIZE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Format Variable Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_VARIABLE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFloatingOffsetImpl <em>GSS Format Floating Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFloatingOffsetImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFloatingOffset()
	 * @generated
	 */
	int GSS_FORMAT_FLOATING_OFFSET = 12;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FLOATING_OFFSET__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Format Floating Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FLOATING_OFFSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Format Floating Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FLOATING_OFFSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatSortedFieldsToCheckImpl <em>GSS Format Sorted Fields To Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatSortedFieldsToCheckImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatSortedFieldsToCheck()
	 * @generated
	 */
	int GSS_FORMAT_SORTED_FIELDS_TO_CHECK = 13;

	/**
	 * The feature id for the '<em><b>Field To Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK = 0;

	/**
	 * The number of structural features of the '<em>GSS Format Sorted Fields To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_SORTED_FIELDS_TO_CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Format Sorted Fields To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_SORTED_FIELDS_TO_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFieldToCheckImpl <em>GSS Format Field To Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFieldToCheckImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFieldToCheck()
	 * @generated
	 */
	int GSS_FORMAT_FIELD_TO_CHECK = 14;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD_TO_CHECK__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Format Field To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD_TO_CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Format Field To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_FIELD_TO_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatArrayDimensionImpl <em>GSS Format Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatArrayDimensionImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatArrayDimension()
	 * @generated
	 */
	int GSS_FORMAT_ARRAY_DIMENSION = 15;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_DIMENSION__FID_REF = 0;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>GSS Format Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Format Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatArrayRefImpl <em>GSS Format Array Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.impl.GSSFormatArrayRefImpl
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatArrayRef()
	 * @generated
	 */
	int GSS_FORMAT_ARRAY_REF = 16;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_REF__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Format Array Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Format Array Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FORMAT_ARRAY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatFormatType <em>GSS Format Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormatType
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFormatType()
	 * @generated
	 */
	int GSS_FORMAT_FORMAT_TYPE = 17;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatFieldType <em>GSS Format Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldType
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFieldType()
	 * @generated
	 */
	int GSS_FORMAT_FIELD_TYPE = 18;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder <em>GSS Format Field Byte Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFieldByteOrder()
	 * @generated
	 */
	int GSS_FORMAT_FIELD_BYTE_ORDER = 19;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit <em>GSS Format SField First Bit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatSFieldFirstBit()
	 * @generated
	 */
	int GSS_FORMAT_SFIELD_FIRST_BIT = 20;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatCheckType <em>GSS Format Check Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatCheckType
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatCheckType()
	 * @generated
	 */
	int GSS_FORMAT_CHECK_TYPE = 21;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatUnit <em>GSS Format Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatUnit
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatUnit()
	 * @generated
	 */
	int GSS_FORMAT_UNIT = 22;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.format.GSSFormatPower <em>GSS Format Power</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.format.GSSFormatPower
	 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatPower()
	 * @generated
	 */
	int GSS_FORMAT_POWER = 23;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatFormat <em>GSS Format Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Format</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormat
	 * @generated
	 */
	EClass getGSSFormatFormat();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormat#getProtocol()
	 * @see #getGSSFormatFormat()
	 * @generated
	 */
	EAttribute getGSSFormatFormat_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormat#getType()
	 * @see #getGSSFormatFormat()
	 * @generated
	 */
	EAttribute getGSSFormatFormat_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.format.GSSFormatFormat#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormat#getField()
	 * @see #getGSSFormatFormat()
	 * @generated
	 */
	EReference getGSSFormatFormat_Field();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatField <em>GSS Format Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatField
	 * @generated
	 */
	EClass getGSSFormatField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatField#getFid()
	 * @see #getGSSFormatField()
	 * @generated
	 */
	EAttribute getGSSFormatField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatField#getPfid()
	 * @see #getGSSFormatField()
	 * @generated
	 */
	EAttribute getGSSFormatField_Pfid();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatCSField <em>GSS Format CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format CS Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField
	 * @generated
	 */
	EClass getGSSFormatCSField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatCSField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField#getType()
	 * @see #getGSSFormatCSField()
	 * @generated
	 */
	EAttribute getGSSFormatCSField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatCSField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField#getByteOrder()
	 * @see #getGSSFormatCSField()
	 * @generated
	 */
	EAttribute getGSSFormatCSField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatCSField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField#getFirstBit()
	 * @see #getGSSFormatCSField()
	 * @generated
	 */
	EAttribute getGSSFormatCSField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatCSField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField#getSize()
	 * @see #getGSSFormatCSField()
	 * @generated
	 */
	EReference getGSSFormatCSField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatCSField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSField#getGlobalOffset()
	 * @see #getGSSFormatCSField()
	 * @generated
	 */
	EReference getGSSFormatCSField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatCSFormulaField <em>GSS Format CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format CS Formula Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSFormulaField
	 * @generated
	 */
	EClass getGSSFormatCSFormulaField();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatCSFormulaField#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCSFormulaField#getFormula()
	 * @see #getGSSFormatCSFormulaField()
	 * @generated
	 */
	EReference getGSSFormatCSFormulaField_Formula();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatVSField <em>GSS Format VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format VS Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField
	 * @generated
	 */
	EClass getGSSFormatVSField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getType()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EAttribute getGSSFormatVSField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getByteOrder()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EAttribute getGSSFormatVSField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getFirstBit()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EAttribute getGSSFormatVSField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getConstSize <em>Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getConstSize()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EReference getGSSFormatVSField_ConstSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getVariableSize <em>Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getVariableSize()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EReference getGSSFormatVSField_VariableSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getMaxSize()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EReference getGSSFormatVSField_MaxSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatVSField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVSField#getGlobalOffset()
	 * @see #getGSSFormatVSField()
	 * @generated
	 */
	EReference getGSSFormatVSField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatVRFieldSize <em>GSS Format VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format VR Field Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVRFieldSize
	 * @generated
	 */
	EClass getGSSFormatVRFieldSize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField <em>GSS Format FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format FDIC Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField
	 * @generated
	 */
	EClass getGSSFormatFDICField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getCheckType <em>Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField#getCheckType()
	 * @see #getGSSFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSFormatFDICField_CheckType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField#getByteOrder()
	 * @see #getGSSFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSFormatFDICField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField#getFirstBit()
	 * @see #getGSSFormatFDICField()
	 * @generated
	 */
	EAttribute getGSSFormatFDICField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField#getSize()
	 * @see #getGSSFormatFDICField()
	 * @generated
	 */
	EReference getGSSFormatFDICField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFloatingOffset <em>Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floating Offset</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField#getFloatingOffset()
	 * @see #getGSSFormatFDICField()
	 * @generated
	 */
	EReference getGSSFormatFDICField_FloatingOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorted Fields To Check</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFDICField#getSortedFieldsToCheck()
	 * @see #getGSSFormatFDICField()
	 * @generated
	 */
	EReference getGSSFormatFDICField_SortedFieldsToCheck();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatAField <em>GSS Format AField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format AField</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField
	 * @generated
	 */
	EClass getGSSFormatAField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField#getType()
	 * @see #getGSSFormatAField()
	 * @generated
	 */
	EAttribute getGSSFormatAField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField#getByteOrder()
	 * @see #getGSSFormatAField()
	 * @generated
	 */
	EAttribute getGSSFormatAField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField#getFirstBit()
	 * @see #getGSSFormatAField()
	 * @generated
	 */
	EAttribute getGSSFormatAField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Dimension</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField#getArrayDimension()
	 * @see #getGSSFormatAField()
	 * @generated
	 */
	EReference getGSSFormatAField_ArrayDimension();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField#getSize()
	 * @see #getGSSFormatAField()
	 * @generated
	 */
	EReference getGSSFormatAField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAField#getGlobalOffset()
	 * @see #getGSSFormatAField()
	 * @generated
	 */
	EReference getGSSFormatAField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatAIField <em>GSS Format AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format AI Field</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField
	 * @generated
	 */
	EClass getGSSFormatAIField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatAIField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField#getType()
	 * @see #getGSSFormatAIField()
	 * @generated
	 */
	EAttribute getGSSFormatAIField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatAIField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField#getByteOrder()
	 * @see #getGSSFormatAIField()
	 * @generated
	 */
	EAttribute getGSSFormatAIField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatAIField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField#getFirstBit()
	 * @see #getGSSFormatAIField()
	 * @generated
	 */
	EAttribute getGSSFormatAIField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatAIField#getArrayRef <em>Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField#getArrayRef()
	 * @see #getGSSFormatAIField()
	 * @generated
	 */
	EReference getGSSFormatAIField_ArrayRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatAIField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField#getSize()
	 * @see #getGSSFormatAIField()
	 * @generated
	 */
	EReference getGSSFormatAIField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.format.GSSFormatAIField#getLocalOffset <em>Local Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Offset</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatAIField#getLocalOffset()
	 * @see #getGSSFormatAIField()
	 * @generated
	 */
	EReference getGSSFormatAIField_LocalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatBytesBits <em>GSS Format Bytes Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Bytes Bits</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatBytesBits
	 * @generated
	 */
	EClass getGSSFormatBytesBits();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatBytesBits#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatBytesBits#getBytes()
	 * @see #getGSSFormatBytesBits()
	 * @generated
	 */
	EAttribute getGSSFormatBytesBits_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatBytesBits#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatBytesBits#getBits()
	 * @see #getGSSFormatBytesBits()
	 * @generated
	 */
	EAttribute getGSSFormatBytesBits_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatFormula <em>GSS Format Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Formula</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormula
	 * @generated
	 */
	EClass getGSSFormatFormula();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFormula#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormula#getSlope()
	 * @see #getGSSFormatFormula()
	 * @generated
	 */
	EAttribute getGSSFormatFormula_Slope();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFormula#getIntercept <em>Intercept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intercept</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormula#getIntercept()
	 * @see #getGSSFormatFormula()
	 * @generated
	 */
	EAttribute getGSSFormatFormula_Intercept();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatVariableSize <em>GSS Format Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Variable Size</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVariableSize
	 * @generated
	 */
	EClass getGSSFormatVariableSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatVariableSize#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVariableSize#getFidRef()
	 * @see #getGSSFormatVariableSize()
	 * @generated
	 */
	EAttribute getGSSFormatVariableSize_FidRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatVariableSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVariableSize#getUnit()
	 * @see #getGSSFormatVariableSize()
	 * @generated
	 */
	EAttribute getGSSFormatVariableSize_Unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatVariableSize#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatVariableSize#getPower()
	 * @see #getGSSFormatVariableSize()
	 * @generated
	 */
	EAttribute getGSSFormatVariableSize_Power();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatFloatingOffset <em>GSS Format Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Floating Offset</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFloatingOffset
	 * @generated
	 */
	EClass getGSSFormatFloatingOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFloatingOffset#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFloatingOffset#getFidRef()
	 * @see #getGSSFormatFloatingOffset()
	 * @generated
	 */
	EAttribute getGSSFormatFloatingOffset_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck <em>GSS Format Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Sorted Fields To Check</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck
	 * @generated
	 */
	EClass getGSSFormatSortedFieldsToCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck#getFieldToCheck <em>Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field To Check</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck#getFieldToCheck()
	 * @see #getGSSFormatSortedFieldsToCheck()
	 * @generated
	 */
	EReference getGSSFormatSortedFieldsToCheck_FieldToCheck();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatFieldToCheck <em>GSS Format Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Field To Check</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldToCheck
	 * @generated
	 */
	EClass getGSSFormatFieldToCheck();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatFieldToCheck#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldToCheck#getFidRef()
	 * @see #getGSSFormatFieldToCheck()
	 * @generated
	 */
	EAttribute getGSSFormatFieldToCheck_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatArrayDimension <em>GSS Format Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Array Dimension</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayDimension
	 * @generated
	 */
	EClass getGSSFormatArrayDimension();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatArrayDimension#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayDimension#getFidRef()
	 * @see #getGSSFormatArrayDimension()
	 * @generated
	 */
	EAttribute getGSSFormatArrayDimension_FidRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatArrayDimension#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayDimension#getMaxItems()
	 * @see #getGSSFormatArrayDimension()
	 * @generated
	 */
	EAttribute getGSSFormatArrayDimension_MaxItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.format.GSSFormatArrayRef <em>GSS Format Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Format Array Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayRef
	 * @generated
	 */
	EClass getGSSFormatArrayRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.format.GSSFormatArrayRef#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatArrayRef#getFidRef()
	 * @see #getGSSFormatArrayRef()
	 * @generated
	 */
	EAttribute getGSSFormatArrayRef_FidRef();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatFormatType <em>GSS Format Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format Format Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFormatType
	 * @generated
	 */
	EEnum getGSSFormatFormatType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatFieldType <em>GSS Format Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format Field Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldType
	 * @generated
	 */
	EEnum getGSSFormatFieldType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder <em>GSS Format Field Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format Field Byte Order</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder
	 * @generated
	 */
	EEnum getGSSFormatFieldByteOrder();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit <em>GSS Format SField First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format SField First Bit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit
	 * @generated
	 */
	EEnum getGSSFormatSFieldFirstBit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatCheckType <em>GSS Format Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format Check Type</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCheckType
	 * @generated
	 */
	EEnum getGSSFormatCheckType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatUnit <em>GSS Format Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format Unit</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatUnit
	 * @generated
	 */
	EEnum getGSSFormatUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.format.GSSFormatPower <em>GSS Format Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Format Power</em>'.
	 * @see es.uah.aut.srg.gss.format.GSSFormatPower
	 * @generated
	 */
	EEnum getGSSFormatPower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	formatFactory getformatFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl <em>GSS Format Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFormat()
		 * @generated
		 */
		EClass GSS_FORMAT_FORMAT = eINSTANCE.getGSSFormatFormat();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FORMAT__PROTOCOL = eINSTANCE.getGSSFormatFormat_Protocol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FORMAT__TYPE = eINSTANCE.getGSSFormatFormat_Type();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_FORMAT__FIELD = eINSTANCE.getGSSFormatFormat_Field();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFieldImpl <em>GSS Format Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatField()
		 * @generated
		 */
		EClass GSS_FORMAT_FIELD = eINSTANCE.getGSSFormatField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FIELD__FID = eINSTANCE.getGSSFormatField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FIELD__PFID = eINSTANCE.getGSSFormatField_Pfid();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatCSFieldImpl <em>GSS Format CS Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatCSFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatCSField()
		 * @generated
		 */
		EClass GSS_FORMAT_CS_FIELD = eINSTANCE.getGSSFormatCSField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_CS_FIELD__TYPE = eINSTANCE.getGSSFormatCSField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_CS_FIELD__BYTE_ORDER = eINSTANCE.getGSSFormatCSField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_CS_FIELD__FIRST_BIT = eINSTANCE.getGSSFormatCSField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_CS_FIELD__SIZE = eINSTANCE.getGSSFormatCSField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_CS_FIELD__GLOBAL_OFFSET = eINSTANCE.getGSSFormatCSField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatCSFormulaFieldImpl <em>GSS Format CS Formula Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatCSFormulaFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatCSFormulaField()
		 * @generated
		 */
		EClass GSS_FORMAT_CS_FORMULA_FIELD = eINSTANCE.getGSSFormatCSFormulaField();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_CS_FORMULA_FIELD__FORMULA = eINSTANCE.getGSSFormatCSFormulaField_Formula();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl <em>GSS Format VS Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatVSField()
		 * @generated
		 */
		EClass GSS_FORMAT_VS_FIELD = eINSTANCE.getGSSFormatVSField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_VS_FIELD__TYPE = eINSTANCE.getGSSFormatVSField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_VS_FIELD__BYTE_ORDER = eINSTANCE.getGSSFormatVSField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_VS_FIELD__FIRST_BIT = eINSTANCE.getGSSFormatVSField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Const Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_VS_FIELD__CONST_SIZE = eINSTANCE.getGSSFormatVSField_ConstSize();

		/**
		 * The meta object literal for the '<em><b>Variable Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_VS_FIELD__VARIABLE_SIZE = eINSTANCE.getGSSFormatVSField_VariableSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_VS_FIELD__MAX_SIZE = eINSTANCE.getGSSFormatVSField_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET = eINSTANCE.getGSSFormatVSField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatVRFieldSizeImpl <em>GSS Format VR Field Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatVRFieldSizeImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatVRFieldSize()
		 * @generated
		 */
		EClass GSS_FORMAT_VR_FIELD_SIZE = eINSTANCE.getGSSFormatVRFieldSize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFDICFieldImpl <em>GSS Format FDIC Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFDICFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFDICField()
		 * @generated
		 */
		EClass GSS_FORMAT_FDIC_FIELD = eINSTANCE.getGSSFormatFDICField();

		/**
		 * The meta object literal for the '<em><b>Check Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FDIC_FIELD__CHECK_TYPE = eINSTANCE.getGSSFormatFDICField_CheckType();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FDIC_FIELD__BYTE_ORDER = eINSTANCE.getGSSFormatFDICField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FDIC_FIELD__FIRST_BIT = eINSTANCE.getGSSFormatFDICField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_FDIC_FIELD__SIZE = eINSTANCE.getGSSFormatFDICField_Size();

		/**
		 * The meta object literal for the '<em><b>Floating Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_FDIC_FIELD__FLOATING_OFFSET = eINSTANCE.getGSSFormatFDICField_FloatingOffset();

		/**
		 * The meta object literal for the '<em><b>Sorted Fields To Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK = eINSTANCE.getGSSFormatFDICField_SortedFieldsToCheck();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatAFieldImpl <em>GSS Format AField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatAFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatAField()
		 * @generated
		 */
		EClass GSS_FORMAT_AFIELD = eINSTANCE.getGSSFormatAField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_AFIELD__TYPE = eINSTANCE.getGSSFormatAField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_AFIELD__BYTE_ORDER = eINSTANCE.getGSSFormatAField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_AFIELD__FIRST_BIT = eINSTANCE.getGSSFormatAField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Array Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_AFIELD__ARRAY_DIMENSION = eINSTANCE.getGSSFormatAField_ArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_AFIELD__SIZE = eINSTANCE.getGSSFormatAField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_AFIELD__GLOBAL_OFFSET = eINSTANCE.getGSSFormatAField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl <em>GSS Format AI Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatAIField()
		 * @generated
		 */
		EClass GSS_FORMAT_AI_FIELD = eINSTANCE.getGSSFormatAIField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_AI_FIELD__TYPE = eINSTANCE.getGSSFormatAIField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_AI_FIELD__BYTE_ORDER = eINSTANCE.getGSSFormatAIField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_AI_FIELD__FIRST_BIT = eINSTANCE.getGSSFormatAIField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Array Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_AI_FIELD__ARRAY_REF = eINSTANCE.getGSSFormatAIField_ArrayRef();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_AI_FIELD__SIZE = eINSTANCE.getGSSFormatAIField_Size();

		/**
		 * The meta object literal for the '<em><b>Local Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_AI_FIELD__LOCAL_OFFSET = eINSTANCE.getGSSFormatAIField_LocalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatBytesBitsImpl <em>GSS Format Bytes Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatBytesBitsImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatBytesBits()
		 * @generated
		 */
		EClass GSS_FORMAT_BYTES_BITS = eINSTANCE.getGSSFormatBytesBits();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_BYTES_BITS__BYTES = eINSTANCE.getGSSFormatBytesBits_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_BYTES_BITS__BITS = eINSTANCE.getGSSFormatBytesBits_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormulaImpl <em>GSS Format Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFormulaImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFormula()
		 * @generated
		 */
		EClass GSS_FORMAT_FORMULA = eINSTANCE.getGSSFormatFormula();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FORMULA__SLOPE = eINSTANCE.getGSSFormatFormula_Slope();

		/**
		 * The meta object literal for the '<em><b>Intercept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FORMULA__INTERCEPT = eINSTANCE.getGSSFormatFormula_Intercept();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl <em>GSS Format Variable Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatVariableSize()
		 * @generated
		 */
		EClass GSS_FORMAT_VARIABLE_SIZE = eINSTANCE.getGSSFormatVariableSize();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_VARIABLE_SIZE__FID_REF = eINSTANCE.getGSSFormatVariableSize_FidRef();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_VARIABLE_SIZE__UNIT = eINSTANCE.getGSSFormatVariableSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_VARIABLE_SIZE__POWER = eINSTANCE.getGSSFormatVariableSize_Power();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFloatingOffsetImpl <em>GSS Format Floating Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFloatingOffsetImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFloatingOffset()
		 * @generated
		 */
		EClass GSS_FORMAT_FLOATING_OFFSET = eINSTANCE.getGSSFormatFloatingOffset();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FLOATING_OFFSET__FID_REF = eINSTANCE.getGSSFormatFloatingOffset_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatSortedFieldsToCheckImpl <em>GSS Format Sorted Fields To Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatSortedFieldsToCheckImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatSortedFieldsToCheck()
		 * @generated
		 */
		EClass GSS_FORMAT_SORTED_FIELDS_TO_CHECK = eINSTANCE.getGSSFormatSortedFieldsToCheck();

		/**
		 * The meta object literal for the '<em><b>Field To Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK = eINSTANCE.getGSSFormatSortedFieldsToCheck_FieldToCheck();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatFieldToCheckImpl <em>GSS Format Field To Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatFieldToCheckImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFieldToCheck()
		 * @generated
		 */
		EClass GSS_FORMAT_FIELD_TO_CHECK = eINSTANCE.getGSSFormatFieldToCheck();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_FIELD_TO_CHECK__FID_REF = eINSTANCE.getGSSFormatFieldToCheck_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatArrayDimensionImpl <em>GSS Format Array Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatArrayDimensionImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatArrayDimension()
		 * @generated
		 */
		EClass GSS_FORMAT_ARRAY_DIMENSION = eINSTANCE.getGSSFormatArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_ARRAY_DIMENSION__FID_REF = eINSTANCE.getGSSFormatArrayDimension_FidRef();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS = eINSTANCE.getGSSFormatArrayDimension_MaxItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.impl.GSSFormatArrayRefImpl <em>GSS Format Array Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.impl.GSSFormatArrayRefImpl
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatArrayRef()
		 * @generated
		 */
		EClass GSS_FORMAT_ARRAY_REF = eINSTANCE.getGSSFormatArrayRef();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FORMAT_ARRAY_REF__FID_REF = eINSTANCE.getGSSFormatArrayRef_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatFormatType <em>GSS Format Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatFormatType
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFormatType()
		 * @generated
		 */
		EEnum GSS_FORMAT_FORMAT_TYPE = eINSTANCE.getGSSFormatFormatType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatFieldType <em>GSS Format Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatFieldType
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFieldType()
		 * @generated
		 */
		EEnum GSS_FORMAT_FIELD_TYPE = eINSTANCE.getGSSFormatFieldType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder <em>GSS Format Field Byte Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatFieldByteOrder()
		 * @generated
		 */
		EEnum GSS_FORMAT_FIELD_BYTE_ORDER = eINSTANCE.getGSSFormatFieldByteOrder();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit <em>GSS Format SField First Bit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatSFieldFirstBit()
		 * @generated
		 */
		EEnum GSS_FORMAT_SFIELD_FIRST_BIT = eINSTANCE.getGSSFormatSFieldFirstBit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatCheckType <em>GSS Format Check Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatCheckType
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatCheckType()
		 * @generated
		 */
		EEnum GSS_FORMAT_CHECK_TYPE = eINSTANCE.getGSSFormatCheckType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatUnit <em>GSS Format Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatUnit
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatUnit()
		 * @generated
		 */
		EEnum GSS_FORMAT_UNIT = eINSTANCE.getGSSFormatUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.format.GSSFormatPower <em>GSS Format Power</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.format.GSSFormatPower
		 * @see es.uah.aut.srg.gss.format.impl.formatPackageImpl#getGSSFormatPower()
		 * @generated
		 */
		EEnum GSS_FORMAT_POWER = eINSTANCE.getGSSFormatPower();

	}

} //formatPackage
