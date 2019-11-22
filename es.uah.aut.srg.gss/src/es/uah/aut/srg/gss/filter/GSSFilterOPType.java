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
package es.uah.aut.srg.gss.filter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSS Filter OP Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterOPType()
 * @model
 * @generated
 */
public enum GSSFilterOPType implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "equal", "equal"),

	/**
	 * The '<em><b>Different</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENT(1, "different", "different"),

	/**
	 * The '<em><b>Bigger than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGGER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	BIGGER_THAN(2, "bigger_than", "bigger_than"),

	/**
	 * The '<em><b>Smaller than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER_THAN(3, "smaller_than", "smaller_than"),

	/**
	 * The '<em><b>Bigger or equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGGER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIGGER_OR_EQUAL(4, "bigger_or_equal", "bigger_or_equal"),

	/**
	 * The '<em><b>Smaller or equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLER_OR_EQUAL(5, "smaller_or_equal", "smaller_or_equal");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>Different</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Different</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFFERENT
	 * @model name="different"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENT_VALUE = 1;

	/**
	 * The '<em><b>Bigger than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bigger than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGGER_THAN
	 * @model name="bigger_than"
	 * @generated
	 * @ordered
	 */
	public static final int BIGGER_THAN_VALUE = 2;

	/**
	 * The '<em><b>Smaller than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smaller than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLER_THAN
	 * @model name="smaller_than"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_THAN_VALUE = 3;

	/**
	 * The '<em><b>Bigger or equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bigger or equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGGER_OR_EQUAL
	 * @model name="bigger_or_equal"
	 * @generated
	 * @ordered
	 */
	public static final int BIGGER_OR_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>Smaller or equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smaller or equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLER_OR_EQUAL
	 * @model name="smaller_or_equal"
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_OR_EQUAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>GSS Filter OP Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSSFilterOPType[] VALUES_ARRAY =
		new GSSFilterOPType[] {
			EQUAL,
			DIFFERENT,
			BIGGER_THAN,
			SMALLER_THAN,
			BIGGER_OR_EQUAL,
			SMALLER_OR_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>GSS Filter OP Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSSFilterOPType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSS Filter OP Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSFilterOPType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSFilterOPType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Filter OP Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSFilterOPType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSFilterOPType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Filter OP Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSFilterOPType get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case DIFFERENT_VALUE: return DIFFERENT;
			case BIGGER_THAN_VALUE: return BIGGER_THAN;
			case SMALLER_THAN_VALUE: return SMALLER_THAN;
			case BIGGER_OR_EQUAL_VALUE: return BIGGER_OR_EQUAL;
			case SMALLER_OR_EQUAL_VALUE: return SMALLER_OR_EQUAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GSSFilterOPType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GSSFilterOPType
