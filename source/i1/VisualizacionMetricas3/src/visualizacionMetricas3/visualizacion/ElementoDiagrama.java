/**
 */
package visualizacionMetricas3.visualizacion;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getName <em>Name</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getLabel <em>Label</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getBorde <em>Borde</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getConectores <em>Conectores</em>}</li>
 * </ul>
 * </p>
 *
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getElementoDiagrama()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementoDiagrama extends NavegacionDiagrama {
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
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getElementoDiagrama_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getElementoDiagrama_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borde</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borde</em>' containment reference.
	 * @see #setBorde(Borde)
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getElementoDiagrama_Borde()
	 * @model containment="true"
	 * @generated
	 */
	Borde getBorde();

	/**
	 * Sets the value of the '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getBorde <em>Borde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borde</em>' containment reference.
	 * @see #getBorde()
	 * @generated
	 */
	void setBorde(Borde value);

	/**
	 * Returns the value of the '<em><b>Conectores</b></em>' containment reference list.
	 * The list contents are of type {@link visualizacionMetricas3.visualizacion.Conector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conectores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conectores</em>' containment reference list.
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getElementoDiagrama_Conectores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conector> getConectores();

} // ElementoDiagrama
