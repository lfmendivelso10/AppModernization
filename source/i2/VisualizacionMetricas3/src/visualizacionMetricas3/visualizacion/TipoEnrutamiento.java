/**
 */
package visualizacionMetricas3.visualizacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Enrutamiento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getTipoEnrutamiento()
 * @model
 * @generated
 */
public enum TipoEnrutamiento implements Enumerator {
	/**
	 * The '<em><b>DIRECTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECTO_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTO(0, "DIRECTO", "DIRECTO"),

	/**
	 * The '<em><b>RECTILINEO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTILINEO_VALUE
	 * @generated
	 * @ordered
	 */
	RECTILINEO(1, "RECTILINEO", "RECTILINEO"),

	/**
	 * The '<em><b>ARBOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARBOL_VALUE
	 * @generated
	 * @ordered
	 */
	ARBOL(2, "ARBOL", "ARBOL");

	/**
	 * The '<em><b>DIRECTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIRECTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTO_VALUE = 0;

	/**
	 * The '<em><b>RECTILINEO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECTILINEO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTILINEO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECTILINEO_VALUE = 1;

	/**
	 * The '<em><b>ARBOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARBOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARBOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARBOL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tipo Enrutamiento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoEnrutamiento[] VALUES_ARRAY =
		new TipoEnrutamiento[] {
			DIRECTO,
			RECTILINEO,
			ARBOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Enrutamiento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoEnrutamiento> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Enrutamiento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoEnrutamiento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoEnrutamiento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Enrutamiento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoEnrutamiento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoEnrutamiento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Enrutamiento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoEnrutamiento get(int value) {
		switch (value) {
			case DIRECTO_VALUE: return DIRECTO;
			case RECTILINEO_VALUE: return RECTILINEO;
			case ARBOL_VALUE: return ARBOL;
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
	private TipoEnrutamiento(int value, String name, String literal) {
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
	
} //TipoEnrutamiento
