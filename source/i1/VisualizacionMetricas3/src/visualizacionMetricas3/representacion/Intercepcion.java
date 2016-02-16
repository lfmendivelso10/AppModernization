/**
 */
package visualizacionMetricas3.representacion;

import visualizacionMetricas3.Arco;
import visualizacionMetricas3.Vinculo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercepcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.representacion.Intercepcion#getArco <em>Arco</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.representacion.RepresentacionPackage#getIntercepcion()
 * @model
 * @generated
 */
public interface Intercepcion extends Vinculo {
	/**
	 * Returns the value of the '<em><b>Arco</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arco</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arco</em>' reference.
	 * @see #setArco(Arco)
	 * @see visualizacionMetricas3.representacion.RepresentacionPackage#getIntercepcion_Arco()
	 * @model required="true"
	 * @generated
	 */
	Arco getArco();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.representacion.Intercepcion#getArco <em>Arco</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arco</em>' reference.
	 * @see #getArco()
	 * @generated
	 */
	void setArco(Arco value);

} // Intercepcion
