/**
 */
package visualizacionMetricas3.visualizacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Alineacion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getAlineacion()
 * @model
 * @generated
 */
public enum Alineacion implements Enumerator {
	/**
	 * The '<em><b>CENTRO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRO_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRO(0, "CENTRO", "CENTRO"),

	/**
	 * The '<em><b>IZQUIERDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IZQUIERDA_VALUE
	 * @generated
	 * @ordered
	 */
	IZQUIERDA(1, "IZQUIERDA", "IZQUIERDA"),

	/**
	 * The '<em><b>DERECHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERECHA_VALUE
	 * @generated
	 * @ordered
	 */
	DERECHA(2, "DERECHA", "DERECHA");

	/**
	 * The '<em><b>CENTRO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTRO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTRO_VALUE = 0;

	/**
	 * The '<em><b>IZQUIERDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IZQUIERDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IZQUIERDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IZQUIERDA_VALUE = 1;

	/**
	 * The '<em><b>DERECHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DERECHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERECHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DERECHA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Alineacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Alineacion[] VALUES_ARRAY =
		new Alineacion[] {
			CENTRO,
			IZQUIERDA,
			DERECHA,
		};

	/**
	 * A public read-only list of all the '<em><b>Alineacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Alineacion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Alineacion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Alineacion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Alineacion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alineacion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Alineacion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Alineacion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Alineacion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Alineacion get(int value) {
		switch (value) {
			case CENTRO_VALUE: return CENTRO;
			case IZQUIERDA_VALUE: return IZQUIERDA;
			case DERECHA_VALUE: return DERECHA;
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
	private Alineacion(int value, String name, String literal) {
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
	
} //Alineacion
