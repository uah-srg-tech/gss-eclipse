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
package es.uah.aut.srg.gss.scenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSS Scenario Interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterfaceType()
 * @model
 * @generated
 */
public enum GSSScenarioInterfaceType implements Enumerator {
	/**
	 * The '<em><b>Sp W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_W_VALUE
	 * @generated
	 * @ordered
	 */
	SP_W(0, "SpW", "SpW"),

	/**
	 * The '<em><b>Sp WTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_WTC_VALUE
	 * @generated
	 * @ordered
	 */
	SP_WTC(1, "SpW_TC", "SpW_TC"),

	/**
	 * The '<em><b>Sp WError</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_WERROR_VALUE
	 * @generated
	 * @ordered
	 */
	SP_WERROR(2, "SpW_Error", "SpW_Error"),

	/**
	 * The '<em><b>Uart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UART_VALUE
	 * @generated
	 * @ordered
	 */
	UART(3, "uart", "uart"),

	/**
	 * The '<em><b>Dummy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUMMY_VALUE
	 * @generated
	 * @ordered
	 */
	DUMMY(4, "dummy", "dummy");

	/**
	 * The '<em><b>Sp W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sp W</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SP_W
	 * @model name="SpW"
	 * @generated
	 * @ordered
	 */
	public static final int SP_W_VALUE = 0;

	/**
	 * The '<em><b>Sp WTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sp WTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SP_WTC
	 * @model name="SpW_TC"
	 * @generated
	 * @ordered
	 */
	public static final int SP_WTC_VALUE = 1;

	/**
	 * The '<em><b>Sp WError</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sp WError</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SP_WERROR
	 * @model name="SpW_Error"
	 * @generated
	 * @ordered
	 */
	public static final int SP_WERROR_VALUE = 2;

	/**
	 * The '<em><b>Uart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UART
	 * @model name="uart"
	 * @generated
	 * @ordered
	 */
	public static final int UART_VALUE = 3;

	/**
	 * The '<em><b>Dummy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dummy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUMMY
	 * @model name="dummy"
	 * @generated
	 * @ordered
	 */
	public static final int DUMMY_VALUE = 4;

	/**
	 * An array of all the '<em><b>GSS Scenario Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSSScenarioInterfaceType[] VALUES_ARRAY =
		new GSSScenarioInterfaceType[] {
			SP_W,
			SP_WTC,
			SP_WERROR,
			UART,
			DUMMY,
		};

	/**
	 * A public read-only list of all the '<em><b>GSS Scenario Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSSScenarioInterfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSS Scenario Interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSScenarioInterfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSScenarioInterfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Scenario Interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSScenarioInterfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSScenarioInterfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Scenario Interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSScenarioInterfaceType get(int value) {
		switch (value) {
			case SP_W_VALUE: return SP_W;
			case SP_WTC_VALUE: return SP_WTC;
			case SP_WERROR_VALUE: return SP_WERROR;
			case UART_VALUE: return UART;
			case DUMMY_VALUE: return DUMMY;
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
	private GSSScenarioInterfaceType(int value, String name, String literal) {
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
	
} //GSSScenarioInterfaceType
