/**
 */
package visualizacionMetricas3.visualizacion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dibujable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.Dibujable#getGrosor <em>Grosor</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Dibujable#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getDibujable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Dibujable extends EObject {
	/**
	 * Returns the value of the '<em><b>Grosor</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grosor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grosor</em>' attribute.
	 * @see #setGrosor(int)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getDibujable_Grosor()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getGrosor();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Dibujable#getGrosor <em>Grosor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grosor</em>' attribute.
	 * @see #getGrosor()
	 * @generated
	 */
	void setGrosor(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Color
	 * @see #setColor(Color)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getDibujable_Color()
	 * @model default="black"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Dibujable#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Dibujable
