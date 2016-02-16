/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.Metrica#getTipo <em>Tipo</em>}</li>
 *   <li>{@link visualizacionMetricas3.Metrica#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getMetrica()
 * @model
 * @generated
 */
public interface Metrica extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link visualizacionMetricas3.TipoMetrica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see visualizacionMetricas3.TipoMetrica
	 * @see #setTipo(TipoMetrica)
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getMetrica_Tipo()
	 * @model
	 * @generated
	 */
	TipoMetrica getTipo();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.Metrica#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see visualizacionMetricas3.TipoMetrica
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoMetrica value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(double)
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getMetrica_Valor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getValor();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.Metrica#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(double value);

} // Metrica
