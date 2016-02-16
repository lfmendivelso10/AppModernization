/**
 */
package visualizacionMetricas3.visualizacion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.Label#isIsBold <em>Is Bold</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Label#isIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Label#getAlineacion <em>Alineacion</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Label#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Label#getColor <em>Color</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Label#getTamanio <em>Tamanio</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bold</em>' attribute.
	 * @see #setIsBold(boolean)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel_IsBold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsBold();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Label#isIsBold <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bold</em>' attribute.
	 * @see #isIsBold()
	 * @generated
	 */
	void setIsBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Italic</em>' attribute.
	 * @see #setIsItalic(boolean)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel_IsItalic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsItalic();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Label#isIsItalic <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Italic</em>' attribute.
	 * @see #isIsItalic()
	 * @generated
	 */
	void setIsItalic(boolean value);

	/**
	 * Returns the value of the '<em><b>Alineacion</b></em>' attribute.
	 * The default value is <code>"CENTRO"</code>.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.Alineacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alineacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alineacion</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Alineacion
	 * @see #setAlineacion(Alineacion)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel_Alineacion()
	 * @model default="CENTRO"
	 * @generated
	 */
	Alineacion getAlineacion();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Label#getAlineacion <em>Alineacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alineacion</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Alineacion
	 * @see #getAlineacion()
	 * @generated
	 */
	void setAlineacion(Alineacion value);

	/**
	 * Returns the value of the '<em><b>Posicion</b></em>' attribute.
	 * The default value is <code>"BORDE"</code>.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.Posicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posicion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posicion</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Posicion
	 * @see #setPosicion(Posicion)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel_Posicion()
	 * @model default="BORDE"
	 * @generated
	 */
	Posicion getPosicion();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Label#getPosicion <em>Posicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posicion</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Posicion
	 * @see #getPosicion()
	 * @generated
	 */
	void setPosicion(Posicion value);

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
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel_Color()
	 * @model default="black"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Label#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Tamanio</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamanio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamanio</em>' attribute.
	 * @see #setTamanio(int)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getLabel_Tamanio()
	 * @model default="8" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getTamanio();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Label#getTamanio <em>Tamanio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamanio</em>' attribute.
	 * @see #getTamanio()
	 * @generated
	 */
	void setTamanio(int value);

} // Label
