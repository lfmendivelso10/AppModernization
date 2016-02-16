/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.Medible#getMetricas <em>Metricas</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getMedible()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Medible extends EObject {
	/**
	 * Returns the value of the '<em><b>Metricas</b></em>' containment reference list.
	 * The list contents are of type {@link visualizacionMetricas3.Metrica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metricas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metricas</em>' containment reference list.
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getMedible_Metricas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metrica> getMetricas();

} // Medible
