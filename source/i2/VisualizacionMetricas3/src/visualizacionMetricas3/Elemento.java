/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.Elemento#getRelaciones <em>Relaciones</em>}</li>
 *   <li>{@link visualizacionMetricas3.Elemento#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getElemento()
 * @model abstract="true"
 * @generated
 */
public interface Elemento extends Medible {
	/**
	 * Returns the value of the '<em><b>Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link visualizacionMetricas3.Arco}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones</em>' containment reference list.
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getElemento_Relaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arco> getRelaciones();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getElemento_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.Elemento#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Elemento
