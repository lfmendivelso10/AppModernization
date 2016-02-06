/**
 */
package visualizacionMetricas3.representacion.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import visualizacionMetricas3.Elemento;
import visualizacionMetricas3.Hoja;
import visualizacionMetricas3.Medible;
import visualizacionMetricas3.Nodo;
import visualizacionMetricas3.TipoRelacion;
import visualizacionMetricas3.Vinculo;

import visualizacionMetricas3.representacion.*;

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
 * @see visualizacionMetricas3.representacion.RepresentacionPackage
 * @generated
 */
public class RepresentacionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RepresentacionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionSwitch() {
		if (modelPackage == null) {
			modelPackage = RepresentacionPackage.eINSTANCE;
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
			case RepresentacionPackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = caseVinculo(cluster);
				if (result == null) result = caseElemento(cluster);
				if (result == null) result = caseMedible(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.PAQUETE: {
				Paquete paquete = (Paquete)theEObject;
				T result = casePaquete(paquete);
				if (result == null) result = caseNodo(paquete);
				if (result == null) result = caseElemento(paquete);
				if (result == null) result = caseMedible(paquete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.MODULO: {
				Modulo modulo = (Modulo)theEObject;
				T result = caseModulo(modulo);
				if (result == null) result = caseNodo(modulo);
				if (result == null) result = caseElemento(modulo);
				if (result == null) result = caseMedible(modulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.CLASE: {
				Clase clase = (Clase)theEObject;
				T result = caseClase(clase);
				if (result == null) result = caseNodo(clase);
				if (result == null) result = caseElemento(clase);
				if (result == null) result = caseMedible(clase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.ARCHIVO: {
				Archivo archivo = (Archivo)theEObject;
				T result = caseArchivo(archivo);
				if (result == null) result = caseNodo(archivo);
				if (result == null) result = caseElemento(archivo);
				if (result == null) result = caseMedible(archivo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.SERVICIO: {
				Servicio servicio = (Servicio)theEObject;
				T result = caseServicio(servicio);
				if (result == null) result = caseVinculo(servicio);
				if (result == null) result = caseElemento(servicio);
				if (result == null) result = caseMedible(servicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.TABLA: {
				Tabla tabla = (Tabla)theEObject;
				T result = caseTabla(tabla);
				if (result == null) result = caseNodo(tabla);
				if (result == null) result = caseElemento(tabla);
				if (result == null) result = caseMedible(tabla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseNodo(form);
				if (result == null) result = caseElemento(form);
				if (result == null) result = caseMedible(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.APLICACION: {
				Aplicacion aplicacion = (Aplicacion)theEObject;
				T result = caseAplicacion(aplicacion);
				if (result == null) result = caseNodo(aplicacion);
				if (result == null) result = caseElemento(aplicacion);
				if (result == null) result = caseMedible(aplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.DEPENDENCIA: {
				Dependencia dependencia = (Dependencia)theEObject;
				T result = caseDependencia(dependencia);
				if (result == null) result = caseTipoRelacion(dependencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.ASOCIACION: {
				Asociacion asociacion = (Asociacion)theEObject;
				T result = caseAsociacion(asociacion);
				if (result == null) result = caseTipoRelacion(asociacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.COMPOSICION: {
				Composicion composicion = (Composicion)theEObject;
				T result = caseComposicion(composicion);
				if (result == null) result = caseTipoRelacion(composicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.AGREGACION: {
				Agregacion agregacion = (Agregacion)theEObject;
				T result = caseAgregacion(agregacion);
				if (result == null) result = caseTipoRelacion(agregacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.GENERALIZACION: {
				Generalizacion generalizacion = (Generalizacion)theEObject;
				T result = caseGeneralizacion(generalizacion);
				if (result == null) result = caseTipoRelacion(generalizacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.METODO: {
				Metodo metodo = (Metodo)theEObject;
				T result = caseMetodo(metodo);
				if (result == null) result = caseHoja(metodo);
				if (result == null) result = caseElemento(metodo);
				if (result == null) result = caseMedible(metodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = caseHoja(atributo);
				if (result == null) result = caseElemento(atributo);
				if (result == null) result = caseMedible(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepresentacionPackage.INTERCEPCION: {
				Intercepcion intercepcion = (Intercepcion)theEObject;
				T result = caseIntercepcion(intercepcion);
				if (result == null) result = caseVinculo(intercepcion);
				if (result == null) result = caseElemento(intercepcion);
				if (result == null) result = caseMedible(intercepcion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaquete(Paquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClase(Clase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archivo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archivo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchivo(Archivo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicio(Servicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabla(Tabla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAplicacion(Aplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencia(Dependencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asociacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsociacion(Asociacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposicion(Composicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agregacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgregacion(Agregacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalizacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalizacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizacion(Generalizacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetodo(Metodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercepcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercepcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercepcion(Intercepcion object) {
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

} //RepresentacionSwitch
