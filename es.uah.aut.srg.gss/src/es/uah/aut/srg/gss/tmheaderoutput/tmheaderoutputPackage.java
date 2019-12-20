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
package es.uah.aut.srg.gss.tmheaderoutput;

import es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputFactory
 * @model kind="package"
 * @generated
 */
public interface tmheaderoutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmheaderoutput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tmheaderoutput";

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
	tmheaderoutputPackage eINSTANCE = es.uah.aut.srg.gss.tmheaderoutput.impl.tmheaderoutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputImpl <em>GSSTM Header Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputImpl
	 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.tmheaderoutputPackageImpl#getGSSTMHeaderOutput()
	 * @generated
	 */
	int GSSTM_HEADER_OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT__NAME = tmheaderPackage.TMTCIFTM_HEADER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT__FIELDS = tmheaderPackage.TMTCIFTM_HEADER__FIELDS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT__FORMAT = tmheaderPackage.TMTCIFTM_HEADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gss Header Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT__GSS_HEADER_FIELDS = tmheaderPackage.TMTCIFTM_HEADER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSSTM Header Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_FEATURE_COUNT = tmheaderPackage.TMTCIFTM_HEADER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSSTM Header Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_OPERATION_COUNT = tmheaderPackage.TMTCIFTM_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputFieldImpl <em>GSSTM Header Output Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputFieldImpl
	 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.tmheaderoutputPackageImpl#getGSSTMHeaderOutputField()
	 * @generated
	 */
	int GSSTM_HEADER_OUTPUT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_FIELD__NAME = tmheaderPackage.TMTCIFTM_HEADER_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_FIELD__FIELD_VALUE = tmheaderPackage.TMTCIFTM_HEADER_FIELD__FIELD_VALUE;

	/**
	 * The feature id for the '<em><b>Gss Header Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_FIELD__GSS_HEADER_FIELD = tmheaderPackage.TMTCIFTM_HEADER_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTM Header Output Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_FIELD_FEATURE_COUNT = tmheaderPackage.TMTCIFTM_HEADER_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTM Header Output Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_HEADER_OUTPUT_FIELD_OPERATION_COUNT = tmheaderPackage.TMTCIFTM_HEADER_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput <em>GSSTM Header Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Header Output</em>'.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput
	 * @generated
	 */
	EClass getGSSTMHeaderOutput();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Format</em>'.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput#getFormat()
	 * @see #getGSSTMHeaderOutput()
	 * @generated
	 */
	EReference getGSSTMHeaderOutput_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput#getGssHeaderFields <em>Gss Header Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gss Header Fields</em>'.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput#getGssHeaderFields()
	 * @see #getGSSTMHeaderOutput()
	 * @generated
	 */
	EReference getGSSTMHeaderOutput_GssHeaderFields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField <em>GSSTM Header Output Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Header Output Field</em>'.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField
	 * @generated
	 */
	EClass getGSSTMHeaderOutputField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField#getGssHeaderField <em>Gss Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Header Field</em>'.
	 * @see es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField#getGssHeaderField()
	 * @see #getGSSTMHeaderOutputField()
	 * @generated
	 */
	EReference getGSSTMHeaderOutputField_GssHeaderField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmheaderoutputFactory gettmheaderoutputFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputImpl <em>GSSTM Header Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputImpl
		 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.tmheaderoutputPackageImpl#getGSSTMHeaderOutput()
		 * @generated
		 */
		EClass GSSTM_HEADER_OUTPUT = eINSTANCE.getGSSTMHeaderOutput();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_HEADER_OUTPUT__FORMAT = eINSTANCE.getGSSTMHeaderOutput_Format();

		/**
		 * The meta object literal for the '<em><b>Gss Header Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_HEADER_OUTPUT__GSS_HEADER_FIELDS = eINSTANCE.getGSSTMHeaderOutput_GssHeaderFields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputFieldImpl <em>GSSTM Header Output Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.GSSTMHeaderOutputFieldImpl
		 * @see es.uah.aut.srg.gss.tmheaderoutput.impl.tmheaderoutputPackageImpl#getGSSTMHeaderOutputField()
		 * @generated
		 */
		EClass GSSTM_HEADER_OUTPUT_FIELD = eINSTANCE.getGSSTMHeaderOutputField();

		/**
		 * The meta object literal for the '<em><b>Gss Header Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_HEADER_OUTPUT_FIELD__GSS_HEADER_FIELD = eINSTANCE.getGSSTMHeaderOutputField_GssHeaderField();

	}

} //tmheaderoutputPackage
