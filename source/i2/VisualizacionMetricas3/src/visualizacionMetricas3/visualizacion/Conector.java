/**
 */
package visualizacionMetricas3.visualizacion;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getName <em>Name</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getEstilo <em>Estilo</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getEnrutamiento <em>Enrutamiento</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getFlecha_source <em>Flecha source</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getFlecha_target <em>Flecha target</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getSource <em>Source</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getTarget <em>Target</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getNameSource <em>Name Source</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.Conector#getNameTarget <em>Name Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector()
 * @model abstract="true"
 * @generated
 */
public interface Conector extends NavegacionDiagrama, Dibujable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Estilo</b></em>' attribute.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.EstiloLinea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilo</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.EstiloLinea
	 * @see #setEstilo(EstiloLinea)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Estilo()
	 * @model
	 * @generated
	 */
	EstiloLinea getEstilo();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getEstilo <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.EstiloLinea
	 * @see #getEstilo()
	 * @generated
	 */
	void setEstilo(EstiloLinea value);

	/**
	 * Returns the value of the '<em><b>Enrutamiento</b></em>' attribute.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.TipoEnrutamiento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrutamiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrutamiento</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.TipoEnrutamiento
	 * @see #setEnrutamiento(TipoEnrutamiento)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Enrutamiento()
	 * @model
	 * @generated
	 */
	TipoEnrutamiento getEnrutamiento();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getEnrutamiento <em>Enrutamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrutamiento</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.TipoEnrutamiento
	 * @see #getEnrutamiento()
	 * @generated
	 */
	void setEnrutamiento(TipoEnrutamiento value);

	/**
	 * Returns the value of the '<em><b>Flecha source</b></em>' attribute.
	 * The default value is <code>"NO_TIENE"</code>.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.TipoFlecha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flecha source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flecha source</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.TipoFlecha
	 * @see #setFlecha_source(TipoFlecha)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Flecha_source()
	 * @model default="NO_TIENE"
	 * @generated
	 */
	TipoFlecha getFlecha_source();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getFlecha_source <em>Flecha source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flecha source</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.TipoFlecha
	 * @see #getFlecha_source()
	 * @generated
	 */
	void setFlecha_source(TipoFlecha value);

	/**
	 * Returns the value of the '<em><b>Flecha target</b></em>' attribute.
	 * The default value is <code>"SENCILLA"</code>.
	 * The literals are from the enumeration {@link visualizacionMetricas3.visualizacion.TipoFlecha}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flecha target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flecha target</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.TipoFlecha
	 * @see #setFlecha_target(TipoFlecha)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Flecha_target()
	 * @model default="SENCILLA"
	 * @generated
	 */
	TipoFlecha getFlecha_target();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getFlecha_target <em>Flecha target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flecha target</em>' attribute.
	 * @see visualizacionMetricas3.visualizacion.TipoFlecha
	 * @see #getFlecha_target()
	 * @generated
	 */
	void setFlecha_target(TipoFlecha value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ElementoDiagrama)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Source()
	 * @model required="true"
	 * @generated
	 */
	ElementoDiagrama getSource();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ElementoDiagrama value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ElementoDiagrama)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_Target()
	 * @model required="true"
	 * @generated
	 */
	ElementoDiagrama getTarget();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ElementoDiagrama value);

	/**
	 * Returns the value of the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Source</em>' attribute.
	 * @see #setNameSource(String)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_NameSource()
	 * @model
	 * @generated
	 */
	String getNameSource();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getNameSource <em>Name Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Source</em>' attribute.
	 * @see #getNameSource()
	 * @generated
	 */
	void setNameSource(String value);

	/**
	 * Returns the value of the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Target</em>' attribute.
	 * @see #setNameTarget(String)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getConector_NameTarget()
	 * @model
	 * @generated
	 */
	String getNameTarget();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.Conector#getNameTarget <em>Name Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Target</em>' attribute.
	 * @see #getNameTarget()
	 * @generated
	 */
	void setNameTarget(String value);

} // Conector
