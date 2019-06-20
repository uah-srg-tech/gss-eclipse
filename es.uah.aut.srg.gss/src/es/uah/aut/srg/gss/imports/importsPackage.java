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
package es.uah.aut.srg.gss.imports;

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
 * @see es.uah.aut.srg.gss.imports.importsFactory
 * @model kind="package"
 * @generated
 */
public interface importsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imports";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/imports";

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
	importsPackage eINSTANCE = es.uah.aut.srg.gss.imports.impl.importsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl <em>GSS Import Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl
	 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportImport()
	 * @generated
	 */
	int GSS_IMPORT_IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__FROM = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__TO = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__DATA_SOURCE = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT__VIRTUAL_SIZE = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSS Import Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSS Import Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_IMPORT_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.imports.impl.GSSImportDataSourceImpl <em>GSS Import Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.imports.impl.GSSImportDataSourceImpl
	 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportDataSource()
	 * @generated
	 */
	int GSS_IMPORT_DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_DATA_SOURCE__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_DATA_SOURCE__LEFT_TRIM = 1;

	/**
	 * The feature id for the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM = 2;

	/**
	 * The number of structural features of the '<em>GSS Import Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_DATA_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Import Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl <em>GSS Import Virtual Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl
	 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportVirtualSize()
	 * @generated
	 */
	int GSS_IMPORT_VIRTUAL_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_VIRTUAL_SIZE__TO = 1;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_VIRTUAL_SIZE__UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Import Virtual Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_VIRTUAL_SIZE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Import Virtual Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IMPORT_VIRTUAL_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.imports.GSSImportUnit <em>GSS Import Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.imports.GSSImportUnit
	 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportUnit()
	 * @generated
	 */
	int GSS_IMPORT_UNIT = 3;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.imports.GSSImportImport <em>GSS Import Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Import Import</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportImport
	 * @generated
	 */
	EClass getGSSImportImport();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.imports.GSSImportImport#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportImport#getFrom()
	 * @see #getGSSImportImport()
	 * @generated
	 */
	EReference getGSSImportImport_From();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.imports.GSSImportImport#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportImport#getTo()
	 * @see #getGSSImportImport()
	 * @generated
	 */
	EReference getGSSImportImport_To();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.imports.GSSImportImport#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Source</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportImport#getDataSource()
	 * @see #getGSSImportImport()
	 * @generated
	 */
	EReference getGSSImportImport_DataSource();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.imports.GSSImportImport#getVirtualSize <em>Virtual Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Size</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportImport#getVirtualSize()
	 * @see #getGSSImportImport()
	 * @generated
	 */
	EReference getGSSImportImport_VirtualSize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.imports.GSSImportDataSource <em>GSS Import Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Import Data Source</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportDataSource
	 * @generated
	 */
	EClass getGSSImportDataSource();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.imports.GSSImportDataSource#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportDataSource#getFieldRef()
	 * @see #getGSSImportDataSource()
	 * @generated
	 */
	EReference getGSSImportDataSource_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.imports.GSSImportDataSource#getLeftTrim <em>Left Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Trim</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportDataSource#getLeftTrim()
	 * @see #getGSSImportDataSource()
	 * @generated
	 */
	EAttribute getGSSImportDataSource_LeftTrim();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.imports.GSSImportDataSource#getRightTrim <em>Right Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Trim</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportDataSource#getRightTrim()
	 * @see #getGSSImportDataSource()
	 * @generated
	 */
	EAttribute getGSSImportDataSource_RightTrim();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.imports.GSSImportVirtualSize <em>GSS Import Virtual Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Import Virtual Size</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportVirtualSize
	 * @generated
	 */
	EClass getGSSImportVirtualSize();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getFieldRef()
	 * @see #getGSSImportVirtualSize()
	 * @generated
	 */
	EReference getGSSImportVirtualSize_FieldRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getTo()
	 * @see #getGSSImportVirtualSize()
	 * @generated
	 */
	EReference getGSSImportVirtualSize_To();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getAddSize <em>Add Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Size</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getAddSize()
	 * @see #getGSSImportVirtualSize()
	 * @generated
	 */
	EAttribute getGSSImportVirtualSize_AddSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportVirtualSize#getUnit()
	 * @see #getGSSImportVirtualSize()
	 * @generated
	 */
	EAttribute getGSSImportVirtualSize_Unit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.imports.GSSImportUnit <em>GSS Import Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Import Unit</em>'.
	 * @see es.uah.aut.srg.gss.imports.GSSImportUnit
	 * @generated
	 */
	EEnum getGSSImportUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	importsFactory getimportsFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl <em>GSS Import Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.imports.impl.GSSImportImportImpl
		 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportImport()
		 * @generated
		 */
		EClass GSS_IMPORT_IMPORT = eINSTANCE.getGSSImportImport();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_IMPORT__FROM = eINSTANCE.getGSSImportImport_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_IMPORT__TO = eINSTANCE.getGSSImportImport_To();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_IMPORT__DATA_SOURCE = eINSTANCE.getGSSImportImport_DataSource();

		/**
		 * The meta object literal for the '<em><b>Virtual Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_IMPORT__VIRTUAL_SIZE = eINSTANCE.getGSSImportImport_VirtualSize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.imports.impl.GSSImportDataSourceImpl <em>GSS Import Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.imports.impl.GSSImportDataSourceImpl
		 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportDataSource()
		 * @generated
		 */
		EClass GSS_IMPORT_DATA_SOURCE = eINSTANCE.getGSSImportDataSource();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_DATA_SOURCE__FIELD_REF = eINSTANCE.getGSSImportDataSource_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Left Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IMPORT_DATA_SOURCE__LEFT_TRIM = eINSTANCE.getGSSImportDataSource_LeftTrim();

		/**
		 * The meta object literal for the '<em><b>Right Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM = eINSTANCE.getGSSImportDataSource_RightTrim();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl <em>GSS Import Virtual Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl
		 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportVirtualSize()
		 * @generated
		 */
		EClass GSS_IMPORT_VIRTUAL_SIZE = eINSTANCE.getGSSImportVirtualSize();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF = eINSTANCE.getGSSImportVirtualSize_FieldRef();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IMPORT_VIRTUAL_SIZE__TO = eINSTANCE.getGSSImportVirtualSize_To();

		/**
		 * The meta object literal for the '<em><b>Add Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE = eINSTANCE.getGSSImportVirtualSize_AddSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IMPORT_VIRTUAL_SIZE__UNIT = eINSTANCE.getGSSImportVirtualSize_Unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.imports.GSSImportUnit <em>GSS Import Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.imports.GSSImportUnit
		 * @see es.uah.aut.srg.gss.imports.impl.importsPackageImpl#getGSSImportUnit()
		 * @generated
		 */
		EEnum GSS_IMPORT_UNIT = eINSTANCE.getGSSImportUnit();

	}

} //importsPackage
