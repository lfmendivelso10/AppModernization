/**
 */
package visualizacionMetricas3.visualizacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Flecha</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getTipoFlecha()
 * @model
 * @generated
 */
public enum TipoFlecha implements Enumerator {
	/**
	 * The '<em><b>NO TIENE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TIENE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TIENE(0, "NO_TIENE", "NO_TIENE"),

	/**
	 * The '<em><b>SENCILLA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENCILLA_VALUE
	 * @generated
	 * @ordered
	 */
	SENCILLA(1, "SENCILLA", "SENCILLA"),

	/**
	 * The '<em><b>TRIANGULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGULAR(2, "TRIANGULAR", "TRIANGULAR"),

	/**
	 * The '<em><b>TRIANGULAR RELLENA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_RELLENA_VALUE
	 * @generated
	 * @ordered
	 */
	TRIANGULAR_RELLENA(3, "TRIANGULAR_RELLENA", "TRIANGULAR_RELLENA"),

	/**
	 * The '<em><b>DIAMANTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMANTE_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMANTE(4, "DIAMANTE", "DIAMANTE"),

	/**
	 * The '<em><b>DIAMANTE RELLENA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMANTE_RELLENA_VALUE
	 * @generated
	 * @ordered
	 */
	DIAMANTE_RELLENA(5, "DIAMANTE_RELLENA", "DIAMANTE_RELLENA"),

	/**
	 * The '<em><b>FLECHA DIAMANTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLECHA_DIAMANTE_VALUE
	 * @generated
	 * @ordered
	 */
	FLECHA_DIAMANTE(6, "FLECHA_DIAMANTE", "FLECHA_DIAMANTE"),

	/**
	 * The '<em><b>FLECHA DIAMANTE RELLENA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLECHA_DIAMANTE_RELLENA_VALUE
	 * @generated
	 * @ordered
	 */
	FLECHA_DIAMANTE_RELLENA(7, "FLECHA_DIAMANTE_RELLENA", "FLECHA_DIAMANTE_RELLENA"),

	/**
	 * The '<em><b>PATA GALLINA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATA_GALLINA_VALUE
	 * @generated
	 * @ordered
	 */
	PATA_GALLINA(8, "PATA_GALLINA", "PATA_GALLINA"),

	/**
	 * The '<em><b>PATA GALLINA TRIANGULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATA_GALLINA_TRIANGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	PATA_GALLINA_TRIANGULAR(9, "PATA_GALLINA_TRIANGULAR", "PATA_GALLINA_TRIANGULAR"),

	/**
	 * The '<em><b>PATA GALLINA RELLENA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATA_GALLINA_RELLENA_VALUE
	 * @generated
	 * @ordered
	 */
	PATA_GALLINA_RELLENA(10, "PATA_GALLINA_RELLENA", "PATA_GALLINA_RELLENA");

	/**
	 * The '<em><b>NO TIENE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO TIENE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_TIENE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_TIENE_VALUE = 0;

	/**
	 * The '<em><b>SENCILLA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SENCILLA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENCILLA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENCILLA_VALUE = 1;

	/**
	 * The '<em><b>TRIANGULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIANGULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGULAR_VALUE = 2;

	/**
	 * The '<em><b>TRIANGULAR RELLENA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIANGULAR RELLENA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIANGULAR_RELLENA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGULAR_RELLENA_VALUE = 3;

	/**
	 * The '<em><b>DIAMANTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAMANTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMANTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAMANTE_VALUE = 4;

	/**
	 * The '<em><b>DIAMANTE RELLENA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAMANTE RELLENA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMANTE_RELLENA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAMANTE_RELLENA_VALUE = 5;

	/**
	 * The '<em><b>FLECHA DIAMANTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLECHA DIAMANTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLECHA_DIAMANTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLECHA_DIAMANTE_VALUE = 6;

	/**
	 * The '<em><b>FLECHA DIAMANTE RELLENA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLECHA DIAMANTE RELLENA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLECHA_DIAMANTE_RELLENA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLECHA_DIAMANTE_RELLENA_VALUE = 7;

	/**
	 * The '<em><b>PATA GALLINA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATA GALLINA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATA_GALLINA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATA_GALLINA_VALUE = 8;

	/**
	 * The '<em><b>PATA GALLINA TRIANGULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATA GALLINA TRIANGULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATA_GALLINA_TRIANGULAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATA_GALLINA_TRIANGULAR_VALUE = 9;

	/**
	 * The '<em><b>PATA GALLINA RELLENA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATA GALLINA RELLENA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATA_GALLINA_RELLENA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATA_GALLINA_RELLENA_VALUE = 10;

	/**
	 * An array of all the '<em><b>Tipo Flecha</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoFlecha[] VALUES_ARRAY =
		new TipoFlecha[] {
			NO_TIENE,
			SENCILLA,
			TRIANGULAR,
			TRIANGULAR_RELLENA,
			DIAMANTE,
			DIAMANTE_RELLENA,
			FLECHA_DIAMANTE,
			FLECHA_DIAMANTE_RELLENA,
			PATA_GALLINA,
			PATA_GALLINA_TRIANGULAR,
			PATA_GALLINA_RELLENA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Flecha</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoFlecha> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Flecha</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoFlecha get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoFlecha result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Flecha</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoFlecha getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoFlecha result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Flecha</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoFlecha get(int value) {
		switch (value) {
			case NO_TIENE_VALUE: return NO_TIENE;
			case SENCILLA_VALUE: return SENCILLA;
			case TRIANGULAR_VALUE: return TRIANGULAR;
			case TRIANGULAR_RELLENA_VALUE: return TRIANGULAR_RELLENA;
			case DIAMANTE_VALUE: return DIAMANTE;
			case DIAMANTE_RELLENA_VALUE: return DIAMANTE_RELLENA;
			case FLECHA_DIAMANTE_VALUE: return FLECHA_DIAMANTE;
			case FLECHA_DIAMANTE_RELLENA_VALUE: return FLECHA_DIAMANTE_RELLENA;
			case PATA_GALLINA_VALUE: return PATA_GALLINA;
			case PATA_GALLINA_TRIANGULAR_VALUE: return PATA_GALLINA_TRIANGULAR;
			case PATA_GALLINA_RELLENA_VALUE: return PATA_GALLINA_RELLENA;
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
	private TipoFlecha(int value, String name, String literal) {
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
	
} //TipoFlecha
