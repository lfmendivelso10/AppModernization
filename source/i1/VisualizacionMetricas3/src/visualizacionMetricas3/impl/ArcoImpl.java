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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import visualizacionMetricas3.Arco;
import visualizacionMetricas3.Elemento;
import visualizacionMetricas3.Metrica;
import visualizacionMetricas3.TipoRelacion;
import visualizacionMetricas3.VisualizacionMetricas3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.impl.ArcoImpl#getMetricas <em>Metricas</em>}</li>
 *   <li>{@link visualizacionMetricas3.impl.ArcoImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link visualizacionMetricas3.impl.ArcoImpl#getTipos <em>Tipos</em>}</li>
 *   <li>{@link visualizacionMetricas3.impl.ArcoImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcoImpl extends EObjectImpl implements Arco {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Elemento target;

	/**
	 * The cached value of the '{@link #getTipos() <em>Tipos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipos()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoRelacion> tipos;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Elemento source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionMetricas3Package.Literals.ARCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metrica> getMetricas() {
		if (metricas == null) {
			metricas = new EObjectContainmentEList<Metrica>(Metrica.class, this, VisualizacionMetricas3Package.ARCO__METRICAS);
		}
		return metricas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Elemento)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionMetricas3Package.ARCO__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Elemento newTarget) {
		Elemento oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionMetricas3Package.ARCO__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoRelacion> getTipos() {
		if (tipos == null) {
			tipos = new EObjectResolvingEList<TipoRelacion>(TipoRelacion.class, this, VisualizacionMetricas3Package.ARCO__TIPOS);
		}
		return tipos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Elemento)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionMetricas3Package.ARCO__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Elemento newSource) {
		Elemento oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionMetricas3Package.ARCO__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizacionMetricas3Package.ARCO__METRICAS:
				return ((InternalEList<?>)getMetricas()).basicRemove(otherEnd, msgs);
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
			case VisualizacionMetricas3Package.ARCO__METRICAS:
				return getMetricas();
			case VisualizacionMetricas3Package.ARCO__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case VisualizacionMetricas3Package.ARCO__TIPOS:
				return getTipos();
			case VisualizacionMetricas3Package.ARCO__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case VisualizacionMetricas3Package.ARCO__METRICAS:
				getMetricas().clear();
				getMetricas().addAll((Collection<? extends Metrica>)newValue);
				return;
			case VisualizacionMetricas3Package.ARCO__TARGET:
				setTarget((Elemento)newValue);
				return;
			case VisualizacionMetricas3Package.ARCO__TIPOS:
				getTipos().clear();
				getTipos().addAll((Collection<? extends TipoRelacion>)newValue);
				return;
			case VisualizacionMetricas3Package.ARCO__SOURCE:
				setSource((Elemento)newValue);
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
			case VisualizacionMetricas3Package.ARCO__METRICAS:
				getMetricas().clear();
				return;
			case VisualizacionMetricas3Package.ARCO__TARGET:
				setTarget((Elemento)null);
				return;
			case VisualizacionMetricas3Package.ARCO__TIPOS:
				getTipos().clear();
				return;
			case VisualizacionMetricas3Package.ARCO__SOURCE:
				setSource((Elemento)null);
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
			case VisualizacionMetricas3Package.ARCO__METRICAS:
				return metricas != null && !metricas.isEmpty();
			case VisualizacionMetricas3Package.ARCO__TARGET:
				return target != null;
			case VisualizacionMetricas3Package.ARCO__TIPOS:
				return tipos != null && !tipos.isEmpty();
			case VisualizacionMetricas3Package.ARCO__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcoImpl
