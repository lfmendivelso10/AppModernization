/**
 */
package subkdm.SimplifiedDecisionMetrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import subkdm.SimplifiedDecisionMetrics.Measurement;
import subkdm.SimplifiedDecisionMetrics.MofElement;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

import subkdm.kdmObjects.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mof Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.impl.MofElementImpl#getMeasurant <em>Measurant</em>}</li>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.impl.MofElementImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MofElementImpl extends MinimalEObjectImpl.Container implements MofElement {
	/**
	 * The cached value of the '{@link #getMeasurant() <em>Measurant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurant()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurant;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ModelElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MofElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedDecisionMetricsPackage.Literals.MOF_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurant() {
		if (measurant == null) {
			measurant = new EObjectWithInverseResolvingEList<Measurement>(Measurement.class, this, SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT, SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT);
		}
		return measurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (ModelElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedDecisionMetricsPackage.MOF_ELEMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ModelElement newElement) {
		ModelElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedDecisionMetricsPackage.MOF_ELEMENT__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurant()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT:
				return ((InternalEList<?>)getMeasurant()).basicRemove(otherEnd, msgs);
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
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT:
				return getMeasurant();
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT:
				getMeasurant().clear();
				getMeasurant().addAll((Collection<? extends Measurement>)newValue);
				return;
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__ELEMENT:
				setElement((ModelElement)newValue);
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
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT:
				getMeasurant().clear();
				return;
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__ELEMENT:
				setElement((ModelElement)null);
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
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT:
				return measurant != null && !measurant.isEmpty();
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

} //MofElementImpl
