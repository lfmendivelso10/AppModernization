/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.Nodo#getHijos <em>Hijos</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getNodo()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Nodo extends Elemento {
	/**
	 * Returns the value of the '<em><b>Hijos</b></em>' containment reference list.
	 * The list contents are of type {@link visualizacionMetricas3.Elemento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hijos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hijos</em>' containment reference list.
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getNodo_Hijos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elemento> getHijos();

} // Nodo
