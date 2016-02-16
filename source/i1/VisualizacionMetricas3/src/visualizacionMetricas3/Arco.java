/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arco</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.Arco#getTarget <em>Target</em>}</li>
 *   <li>{@link visualizacionMetricas3.Arco#getTipos <em>Tipos</em>}</li>
 *   <li>{@link visualizacionMetricas3.Arco#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getArco()
 * @model
 * @generated
 */
public interface Arco extends Medible {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Elemento)
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getArco_Target()
	 * @model required="true"
	 * @generated
	 */
	Elemento getTarget();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.Arco#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Elemento value);

	/**
	 * Returns the value of the '<em><b>Tipos</b></em>' reference list.
	 * The list contents are of type {@link visualizacionMetricas3.TipoRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos</em>' reference list.
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getArco_Tipos()
	 * @model required="true"
	 * @generated
	 */
	EList<TipoRelacion> getTipos();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Elemento)
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getArco_Source()
	 * @model required="true"
	 * @generated
	 */
	Elemento getSource();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.Arco#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Elemento value);

} // Arco
