/**
 */
package visualizacionMetricas3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import visualizacionMetricas3.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizacionMetricas3FactoryImpl extends EFactoryImpl implements VisualizacionMetricas3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualizacionMetricas3Factory init() {
		try {
			VisualizacionMetricas3Factory theVisualizacionMetricas3Factory = (VisualizacionMetricas3Factory)EPackage.Registry.INSTANCE.getEFactory(VisualizacionMetricas3Package.eNS_URI);
			if (theVisualizacionMetricas3Factory != null) {
				return theVisualizacionMetricas3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualizacionMetricas3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionMetricas3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisualizacionMetricas3Package.ARCO: return createArco();
			case VisualizacionMetricas3Package.METRICA: return createMetrica();
			case VisualizacionMetricas3Package.METRICA_RELACION: return createMetricaRelacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizacionMetricas3Package.TIPO_METRICA:
				return createTipoMetricaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizacionMetricas3Package.TIPO_METRICA:
				return convertTipoMetricaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arco createArco() {
		ArcoImpl arco = new ArcoImpl();
		return arco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrica createMetrica() {
		MetricaImpl metrica = new MetricaImpl();
		return metrica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricaRelacion createMetricaRelacion() {
		MetricaRelacionImpl metricaRelacion = new MetricaRelacionImpl();
		return metricaRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMetrica createTipoMetricaFromString(EDataType eDataType, String initialValue) {
		TipoMetrica result = TipoMetrica.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoMetricaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionMetricas3Package getVisualizacionMetricas3Package() {
		return (VisualizacionMetricas3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualizacionMetricas3Package getPackage() {
		return VisualizacionMetricas3Package.eINSTANCE;
	}

} //VisualizacionMetricas3FactoryImpl
