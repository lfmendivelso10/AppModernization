/**
 */
package visualizacionMetricas3.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import visualizacionMetricas3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.VisualizacionMetricas3Package
 * @generated
 */
public class VisualizacionMetricas3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizacionMetricas3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionMetricas3Switch() {
		if (modelPackage == null) {
			modelPackage = VisualizacionMetricas3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VisualizacionMetricas3Package.ELEMENTO: {
				Elemento elemento = (Elemento)theEObject;
				T result = caseElemento(elemento);
				if (result == null) result = caseMedible(elemento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.NODO: {
				Nodo nodo = (Nodo)theEObject;
				T result = caseNodo(nodo);
				if (result == null) result = caseElemento(nodo);
				if (result == null) result = caseMedible(nodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.HOJA: {
				Hoja hoja = (Hoja)theEObject;
				T result = caseHoja(hoja);
				if (result == null) result = caseElemento(hoja);
				if (result == null) result = caseMedible(hoja);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.MEDIBLE: {
				Medible medible = (Medible)theEObject;
				T result = caseMedible(medible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.ARCO: {
				Arco arco = (Arco)theEObject;
				T result = caseArco(arco);
				if (result == null) result = caseMedible(arco);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.METRICA: {
				Metrica metrica = (Metrica)theEObject;
				T result = caseMetrica(metrica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.TIPO_RELACION: {
				TipoRelacion tipoRelacion = (TipoRelacion)theEObject;
				T result = caseTipoRelacion(tipoRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.VINCULO: {
				Vinculo vinculo = (Vinculo)theEObject;
				T result = caseVinculo(vinculo);
				if (result == null) result = caseElemento(vinculo);
				if (result == null) result = caseMedible(vinculo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionMetricas3Package.METRICA_RELACION: {
				MetricaRelacion metricaRelacion = (MetricaRelacion)theEObject;
				T result = caseMetricaRelacion(metricaRelacion);
				if (result == null) result = caseMetrica(metricaRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodo(Nodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hoja</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hoja</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoja(Hoja object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedible(Medible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arco</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arco</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArco(Arco object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metrica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metrica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetrica(Metrica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoRelacion(TipoRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vinculo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vinculo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVinculo(Vinculo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metrica Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metrica Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricaRelacion(MetricaRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VisualizacionMetricas3Switch
