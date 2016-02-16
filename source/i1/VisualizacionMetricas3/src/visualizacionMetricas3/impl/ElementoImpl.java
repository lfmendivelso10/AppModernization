/**
 */
package visualizacionMetricas3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import visualizacionMetricas3.Arco;
import visualizacionMetricas3.Elemento;
import visualizacionMetricas3.Metrica;
import visualizacionMetricas3.VisualizacionMetricas3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.impl.ElementoImpl#getMetricas <em>Metricas</em>}</li>
 *   <li>{@link visualizacionMetricas3.impl.ElementoImpl#getRelaciones <em>Relaciones</em>}</li>
 *   <li>{@link visualizacionMetricas3.impl.ElementoImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementoImpl extends EObjectImpl implements Elemento {
	/**
	 * The cached value of the '{@link #getMetricas() <em>Metricas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricas()
	 * @generated
	 * @ordered
	 */
	protected EList<Metrica> metricas;

	/**
	 * The cached value of the '{@link #getRelaciones() <em>Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Arco> relaciones;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionMetricas3Package.Literals.ELEMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metrica> getMetricas() {
		if (metricas == null) {
			metricas = new EObjectContainmentEList<Metrica>(Metrica.class, this, VisualizacionMetricas3Package.ELEMENTO__METRICAS);
		}
		return metricas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arco> getRelaciones() {
		if (relaciones == null) {
			relaciones = new EObjectContainmentEList<Arco>(Arco.class, this, VisualizacionMetricas3Package.ELEMENTO__RELACIONES);
		}
		return relaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionMetricas3Package.ELEMENTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizacionMetricas3Package.ELEMENTO__METRICAS:
				return ((InternalEList<?>)getMetricas()).basicRemove(otherEnd, msgs);
			case VisualizacionMetricas3Package.ELEMENTO__RELACIONES:
				return ((InternalEList<?>)getRelaciones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizacionMetricas3Package.ELEMENTO__METRICAS:
				return getMetricas();
			case VisualizacionMetricas3Package.ELEMENTO__RELACIONES:
				return getRelaciones();
			case VisualizacionMetricas3Package.ELEMENTO__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizacionMetricas3Package.ELEMENTO__METRICAS:
				getMetricas().clear();
				getMetricas().addAll((Collection<? extends Metrica>)newValue);
				return;
			case VisualizacionMetricas3Package.ELEMENTO__RELACIONES:
				getRelaciones().clear();
				getRelaciones().addAll((Collection<? extends Arco>)newValue);
				return;
			case VisualizacionMetricas3Package.ELEMENTO__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualizacionMetricas3Package.ELEMENTO__METRICAS:
				getMetricas().clear();
				return;
			case VisualizacionMetricas3Package.ELEMENTO__RELACIONES:
				getRelaciones().clear();
				return;
			case VisualizacionMetricas3Package.ELEMENTO__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualizacionMetricas3Package.ELEMENTO__METRICAS:
				return metricas != null && !metricas.isEmpty();
			case VisualizacionMetricas3Package.ELEMENTO__RELACIONES:
				return relaciones != null && !relaciones.isEmpty();
			case VisualizacionMetricas3Package.ELEMENTO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementoImpl
