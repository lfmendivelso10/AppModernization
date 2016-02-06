/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vinculo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.Vinculo#getElementos <em>Elementos</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getVinculo()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Vinculo extends Elemento {
	/**
	 * Returns the value of the '<em><b>Elementos</b></em>' reference list.
	 * The list contents are of type {@link visualizacionMetricas3.Elemento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' reference list.
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getVinculo_Elementos()
	 * @model
	 * @generated
	 */
	EList<Elemento> getElementos();

} // Vinculo
