/**
 */
package visualizacionMetricas3.visualizacion.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import visualizacionMetricas3.visualizacion.*;

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
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage
 * @generated
 */
public class VisualizacionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizacionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionSwitch() {
		if (modelPackage == null) {
			modelPackage = VisualizacionPackage.eINSTANCE;
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
			case VisualizacionPackage.ELIPSE: {
				Elipse elipse = (Elipse)theEObject;
				T result = caseElipse(elipse);
				if (result == null) result = caseFiguraGeometrica(elipse);
				if (result == null) result = caseElementoDiagrama(elipse);
				if (result == null) result = caseNavegacionDiagrama(elipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.CUADRILATERO: {
				Cuadrilatero cuadrilatero = (Cuadrilatero)theEObject;
				T result = caseCuadrilatero(cuadrilatero);
				if (result == null) result = caseFiguraGeometrica(cuadrilatero);
				if (result == null) result = caseElementoDiagrama(cuadrilatero);
				if (result == null) result = caseNavegacionDiagrama(cuadrilatero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.CONTENEDOR: {
				Contenedor contenedor = (Contenedor)theEObject;
				T result = caseContenedor(contenedor);
				if (result == null) result = caseElementoDiagrama(contenedor);
				if (result == null) result = caseNavegacionDiagrama(contenedor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.CLASE: {
				Clase clase = (Clase)theEObject;
				T result = caseClase(clase);
				if (result == null) result = caseContenedor(clase);
				if (result == null) result = caseElementoDiagrama(clase);
				if (result == null) result = caseNavegacionDiagrama(clase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.FIGURA_GEOMETRICA: {
				FiguraGeometrica figuraGeometrica = (FiguraGeometrica)theEObject;
				T result = caseFiguraGeometrica(figuraGeometrica);
				if (result == null) result = caseElementoDiagrama(figuraGeometrica);
				if (result == null) result = caseNavegacionDiagrama(figuraGeometrica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.ROMBO: {
				Rombo rombo = (Rombo)theEObject;
				T result = caseRombo(rombo);
				if (result == null) result = caseFiguraGeometrica(rombo);
				if (result == null) result = caseElementoDiagrama(rombo);
				if (result == null) result = caseNavegacionDiagrama(rombo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.TRIANGULO: {
				Triangulo triangulo = (Triangulo)theEObject;
				T result = caseTriangulo(triangulo);
				if (result == null) result = caseFiguraGeometrica(triangulo);
				if (result == null) result = caseElementoDiagrama(triangulo);
				if (result == null) result = caseNavegacionDiagrama(triangulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.PAQUETE: {
				Paquete paquete = (Paquete)theEObject;
				T result = casePaquete(paquete);
				if (result == null) result = caseContenedor(paquete);
				if (result == null) result = caseElementoDiagrama(paquete);
				if (result == null) result = caseNavegacionDiagrama(paquete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.DIAGRAMA: {
				Diagrama diagrama = (Diagrama)theEObject;
				T result = caseDiagrama(diagrama);
				if (result == null) result = caseContenedor(diagrama);
				if (result == null) result = caseElementoDiagrama(diagrama);
				if (result == null) result = caseNavegacionDiagrama(diagrama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.ELEMENTO_DIAGRAMA: {
				ElementoDiagrama elementoDiagrama = (ElementoDiagrama)theEObject;
				T result = caseElementoDiagrama(elementoDiagrama);
				if (result == null) result = caseNavegacionDiagrama(elementoDiagrama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.NAVEGACION_DIAGRAMA: {
				NavegacionDiagrama navegacionDiagrama = (NavegacionDiagrama)theEObject;
				T result = caseNavegacionDiagrama(navegacionDiagrama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.BORDE: {
				Borde borde = (Borde)theEObject;
				T result = caseBorde(borde);
				if (result == null) result = caseDibujable(borde);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.CONECTOR: {
				Conector conector = (Conector)theEObject;
				T result = caseConector(conector);
				if (result == null) result = caseNavegacionDiagrama(conector);
				if (result == null) result = caseDibujable(conector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.PUNTO: {
				Punto punto = (Punto)theEObject;
				T result = casePunto(punto);
				if (result == null) result = caseFiguraGeometrica(punto);
				if (result == null) result = caseElementoDiagrama(punto);
				if (result == null) result = caseNavegacionDiagrama(punto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.HERENCIA: {
				Herencia herencia = (Herencia)theEObject;
				T result = caseHerencia(herencia);
				if (result == null) result = caseConector(herencia);
				if (result == null) result = caseNavegacionDiagrama(herencia);
				if (result == null) result = caseDibujable(herencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.IMPLEMENTACION: {
				Implementacion implementacion = (Implementacion)theEObject;
				T result = caseImplementacion(implementacion);
				if (result == null) result = caseConector(implementacion);
				if (result == null) result = caseNavegacionDiagrama(implementacion);
				if (result == null) result = caseDibujable(implementacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.DEPENDENCIA: {
				Dependencia dependencia = (Dependencia)theEObject;
				T result = caseDependencia(dependencia);
				if (result == null) result = caseConector(dependencia);
				if (result == null) result = caseNavegacionDiagrama(dependencia);
				if (result == null) result = caseDibujable(dependencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.ASOCIACION: {
				Asociacion asociacion = (Asociacion)theEObject;
				T result = caseAsociacion(asociacion);
				if (result == null) result = caseConector(asociacion);
				if (result == null) result = caseNavegacionDiagrama(asociacion);
				if (result == null) result = caseDibujable(asociacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.AGREGACION: {
				Agregacion agregacion = (Agregacion)theEObject;
				T result = caseAgregacion(agregacion);
				if (result == null) result = caseConector(agregacion);
				if (result == null) result = caseNavegacionDiagrama(agregacion);
				if (result == null) result = caseDibujable(agregacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.COMPOSICION: {
				Composicion composicion = (Composicion)theEObject;
				T result = caseComposicion(composicion);
				if (result == null) result = caseConector(composicion);
				if (result == null) result = caseNavegacionDiagrama(composicion);
				if (result == null) result = caseDibujable(composicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseElementoDiagrama(item);
				if (result == null) result = caseNavegacionDiagrama(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizacionPackage.DIBUJABLE: {
				Dibujable dibujable = (Dibujable)theEObject;
				T result = caseDibujable(dibujable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElipse(Elipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuadrilatero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuadrilatero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuadrilatero(Cuadrilatero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenedor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenedor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenedor(Contenedor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Figura Geometrica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figura Geometrica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiguraGeometrica(FiguraGeometrica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rombo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rombo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRombo(Rombo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangulo(Triangulo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagrama(Diagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoDiagrama(ElementoDiagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navegacion Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navegacion Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavegacionDiagrama(NavegacionDiagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Borde</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Borde</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorde(Borde object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConector(Conector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunto(Punto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHerencia(Herencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementacion(Implementacion object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dibujable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dibujable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDibujable(Dibujable object) {
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

} //VisualizacionSwitch
