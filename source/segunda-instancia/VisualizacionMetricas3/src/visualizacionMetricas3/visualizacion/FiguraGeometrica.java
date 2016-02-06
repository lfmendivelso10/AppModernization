/**
 */
package visualizacionMetricas3.visualizacion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figura Geometrica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getColor <em>Color</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getLargo <em>Largo</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getAlto <em>Alto</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getFiguraGeometrica()
 * @model abstract="true"
 * @generated
 */
public interface FiguraGeometrica extends ElementoDiagrama {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"gray"</code>.
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
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getFiguraGeometrica_Color()
	 * @model default="gray"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Largo</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largo</em>' attribute.
	 * @see #setLargo(int)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getFiguraGeometrica_Largo()
	 * @model default="3" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getLargo();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getLargo <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largo</em>' attribute.
	 * @see #getLargo()
	 * @generated
	 */
	void setLargo(int value);

	/**
	 * Returns the value of the '<em><b>Alto</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alto</em>' attribute.
	 * @see #setAlto(int)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getFiguraGeometrica_Alto()
	 * @model default="3" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getAlto();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getAlto <em>Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alto</em>' attribute.
	 * @see #getAlto()
	 * @generated
	 */
	void setAlto(int value);

} // FiguraGeometrica
