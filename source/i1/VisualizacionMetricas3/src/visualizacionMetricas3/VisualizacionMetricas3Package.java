/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.VisualizacionMetricas3Factory
 * @model kind="package"
 * @generated
 */
public interface VisualizacionMetricas3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualizacionMetricas3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://visualizacionMetricas3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visualizacionMetricas3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizacionMetricas3Package eINSTANCE = visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl.init();

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.Medible <em>Medible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.Medible
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getMedible()
	 * @generated
	 */
	int MEDIBLE = 3;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIBLE__METRICAS = 0;

	/**
	 * The number of structural features of the '<em>Medible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIBLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.impl.ElementoImpl
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 0;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__METRICAS = MEDIBLE__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__RELACIONES = MEDIBLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO__NAME = MEDIBLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = MEDIBLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.Nodo <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.Nodo
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 1;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__METRICAS = ELEMENTO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__RELACIONES = ELEMENTO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__NAME = ELEMENTO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__HIJOS = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.Hoja <em>Hoja</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.Hoja
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getHoja()
	 * @generated
	 */
	int HOJA = 2;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA__METRICAS = ELEMENTO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA__RELACIONES = ELEMENTO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA__NAME = ELEMENTO__NAME;

	/**
	 * The number of structural features of the '<em>Hoja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOJA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.impl.ArcoImpl <em>Arco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.impl.ArcoImpl
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getArco()
	 * @generated
	 */
	int ARCO = 4;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__METRICAS = MEDIBLE__METRICAS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__TARGET = MEDIBLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__TIPOS = MEDIBLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO__SOURCE = MEDIBLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCO_FEATURE_COUNT = MEDIBLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.impl.MetricaImpl <em>Metrica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.impl.MetricaImpl
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getMetrica()
	 * @generated
	 */
	int METRICA = 5;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA__VALOR = 1;

	/**
	 * The number of structural features of the '<em>Metrica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.TipoRelacion <em>Tipo Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.TipoRelacion
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getTipoRelacion()
	 * @generated
	 */
	int TIPO_RELACION = 6;

	/**
	 * The number of structural features of the '<em>Tipo Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_RELACION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.Vinculo <em>Vinculo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.Vinculo
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getVinculo()
	 * @generated
	 */
	int VINCULO = 7;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINCULO__METRICAS = ELEMENTO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINCULO__RELACIONES = ELEMENTO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINCULO__NAME = ELEMENTO__NAME;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINCULO__ELEMENTOS = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vinculo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINCULO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.impl.MetricaRelacionImpl <em>Metrica Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.impl.MetricaRelacionImpl
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getMetricaRelacion()
	 * @generated
	 */
	int METRICA_RELACION = 8;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA_RELACION__TIPO = METRICA__TIPO;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA_RELACION__VALOR = METRICA__VALOR;

	/**
	 * The feature id for the '<em><b>Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA_RELACION__RELACION = METRICA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metrica Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICA_RELACION_FEATURE_COUNT = METRICA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.TipoMetrica <em>Tipo Metrica</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.TipoMetrica
	 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getTipoMetrica()
	 * @generated
	 */
	int TIPO_METRICA = 9;


	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see visualizacionMetricas3.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizacionMetricas3.Elemento#getRelaciones <em>Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones</em>'.
	 * @see visualizacionMetricas3.Elemento#getRelaciones()
	 * @see #getElemento()
	 * @generated
	 */
	EReference getElemento_Relaciones();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.Elemento#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizacionMetricas3.Elemento#getName()
	 * @see #getElemento()
	 * @generated
	 */
	EAttribute getElemento_Name();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see visualizacionMetricas3.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizacionMetricas3.Nodo#getHijos <em>Hijos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hijos</em>'.
	 * @see visualizacionMetricas3.Nodo#getHijos()
	 * @see #getNodo()
	 * @generated
	 */
	EReference getNodo_Hijos();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Hoja <em>Hoja</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hoja</em>'.
	 * @see visualizacionMetricas3.Hoja
	 * @generated
	 */
	EClass getHoja();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Medible <em>Medible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medible</em>'.
	 * @see visualizacionMetricas3.Medible
	 * @generated
	 */
	EClass getMedible();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizacionMetricas3.Medible#getMetricas <em>Metricas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metricas</em>'.
	 * @see visualizacionMetricas3.Medible#getMetricas()
	 * @see #getMedible()
	 * @generated
	 */
	EReference getMedible_Metricas();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Arco <em>Arco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arco</em>'.
	 * @see visualizacionMetricas3.Arco
	 * @generated
	 */
	EClass getArco();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.Arco#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see visualizacionMetricas3.Arco#getTarget()
	 * @see #getArco()
	 * @generated
	 */
	EReference getArco_Target();

	/**
	 * Returns the meta object for the reference list '{@link visualizacionMetricas3.Arco#getTipos <em>Tipos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tipos</em>'.
	 * @see visualizacionMetricas3.Arco#getTipos()
	 * @see #getArco()
	 * @generated
	 */
	EReference getArco_Tipos();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.Arco#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see visualizacionMetricas3.Arco#getSource()
	 * @see #getArco()
	 * @generated
	 */
	EReference getArco_Source();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Metrica <em>Metrica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrica</em>'.
	 * @see visualizacionMetricas3.Metrica
	 * @generated
	 */
	EClass getMetrica();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.Metrica#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see visualizacionMetricas3.Metrica#getTipo()
	 * @see #getMetrica()
	 * @generated
	 */
	EAttribute getMetrica_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.Metrica#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see visualizacionMetricas3.Metrica#getValor()
	 * @see #getMetrica()
	 * @generated
	 */
	EAttribute getMetrica_Valor();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.TipoRelacion <em>Tipo Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Relacion</em>'.
	 * @see visualizacionMetricas3.TipoRelacion
	 * @generated
	 */
	EClass getTipoRelacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.Vinculo <em>Vinculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vinculo</em>'.
	 * @see visualizacionMetricas3.Vinculo
	 * @generated
	 */
	EClass getVinculo();

	/**
	 * Returns the meta object for the reference list '{@link visualizacionMetricas3.Vinculo#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elementos</em>'.
	 * @see visualizacionMetricas3.Vinculo#getElementos()
	 * @see #getVinculo()
	 * @generated
	 */
	EReference getVinculo_Elementos();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.MetricaRelacion <em>Metrica Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metrica Relacion</em>'.
	 * @see visualizacionMetricas3.MetricaRelacion
	 * @generated
	 */
	EClass getMetricaRelacion();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.MetricaRelacion#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion</em>'.
	 * @see visualizacionMetricas3.MetricaRelacion#getRelacion()
	 * @see #getMetricaRelacion()
	 * @generated
	 */
	EReference getMetricaRelacion_Relacion();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.TipoMetrica <em>Tipo Metrica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Metrica</em>'.
	 * @see visualizacionMetricas3.TipoMetrica
	 * @generated
	 */
	EEnum getTipoMetrica();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizacionMetricas3Factory getVisualizacionMetricas3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.impl.ElementoImpl
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO__RELACIONES = eINSTANCE.getElemento_Relaciones();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO__NAME = eINSTANCE.getElemento_Name();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.Nodo <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.Nodo
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '<em><b>Hijos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODO__HIJOS = eINSTANCE.getNodo_Hijos();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.Hoja <em>Hoja</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.Hoja
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getHoja()
		 * @generated
		 */
		EClass HOJA = eINSTANCE.getHoja();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.Medible <em>Medible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.Medible
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getMedible()
		 * @generated
		 */
		EClass MEDIBLE = eINSTANCE.getMedible();

		/**
		 * The meta object literal for the '<em><b>Metricas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIBLE__METRICAS = eINSTANCE.getMedible_Metricas();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.impl.ArcoImpl <em>Arco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.impl.ArcoImpl
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getArco()
		 * @generated
		 */
		EClass ARCO = eINSTANCE.getArco();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__TARGET = eINSTANCE.getArco_Target();

		/**
		 * The meta object literal for the '<em><b>Tipos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__TIPOS = eINSTANCE.getArco_Tipos();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCO__SOURCE = eINSTANCE.getArco_Source();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.impl.MetricaImpl <em>Metrica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.impl.MetricaImpl
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getMetrica()
		 * @generated
		 */
		EClass METRICA = eINSTANCE.getMetrica();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICA__TIPO = eINSTANCE.getMetrica_Tipo();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRICA__VALOR = eINSTANCE.getMetrica_Valor();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.TipoRelacion <em>Tipo Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.TipoRelacion
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getTipoRelacion()
		 * @generated
		 */
		EClass TIPO_RELACION = eINSTANCE.getTipoRelacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.Vinculo <em>Vinculo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.Vinculo
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getVinculo()
		 * @generated
		 */
		EClass VINCULO = eINSTANCE.getVinculo();

		/**
		 * The meta object literal for the '<em><b>Elementos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINCULO__ELEMENTOS = eINSTANCE.getVinculo_Elementos();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.impl.MetricaRelacionImpl <em>Metrica Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.impl.MetricaRelacionImpl
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getMetricaRelacion()
		 * @generated
		 */
		EClass METRICA_RELACION = eINSTANCE.getMetricaRelacion();

		/**
		 * The meta object literal for the '<em><b>Relacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRICA_RELACION__RELACION = eINSTANCE.getMetricaRelacion_Relacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.TipoMetrica <em>Tipo Metrica</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.TipoMetrica
		 * @see visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl#getTipoMetrica()
		 * @generated
		 */
		EEnum TIPO_METRICA = eINSTANCE.getTipoMetrica();

	}

} //VisualizacionMetricas3Package
