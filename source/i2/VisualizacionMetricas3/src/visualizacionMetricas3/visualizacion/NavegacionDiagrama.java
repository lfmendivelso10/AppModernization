/**
 */
package visualizacionMetricas3.visualizacion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navegacion Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama#getDiagrama <em>Diagrama</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getNavegacionDiagrama()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NavegacionDiagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrama</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrama</em>' reference.
	 * @see #setDiagrama(Contenedor)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getNavegacionDiagrama_Diagrama()
	 * @model
	 * @generated
	 */
	Contenedor getDiagrama();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama#getDiagrama <em>Diagrama</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagrama</em>' reference.
	 * @see #getDiagrama()
	 * @generated
	 */
	void setDiagrama(Contenedor value);

} // NavegacionDiagrama
