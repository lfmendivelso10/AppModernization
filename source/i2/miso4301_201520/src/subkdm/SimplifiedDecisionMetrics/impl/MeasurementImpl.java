/**
 */
package subkdm.SimplifiedDecisionMetrics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import subkdm.SimplifiedDecisionMetrics.Measurement;
import subkdm.SimplifiedDecisionMetrics.MofElement;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.impl.MeasurementImpl#getMeasurant <em>Measurant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends MinimalEObjectImpl.Container implements Measurement {
	/**
	 * The cached value of the '{@link #getMeasurant() <em>Measurant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurant()
	 * @generated
	 * @ordered
	 */
	protected MofElement measurant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedDecisionMetricsPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofElement getMeasurant() {
		if (measurant != null && measurant.eIsProxy()) {
			InternalEObject oldMeasurant = (InternalEObject)measurant;
			measurant = (MofElement)eResolveProxy(oldMeasurant);
			if (measurant != oldMeasurant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT, oldMeasurant, measurant));
			}
		}
		return measurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofElement basicGetMeasurant() {
		return measurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurant(MofElement newMeasurant, NotificationChain msgs) {
		MofElement oldMeasurant = measurant;
		measurant = newMeasurant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT, oldMeasurant, newMeasurant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurant(MofElement newMeasurant) {
		if (newMeasurant != measurant) {
			NotificationChain msgs = null;
			if (measurant != null)
				msgs = ((InternalEObject)measurant).eInverseRemove(this, SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT, MofElement.class, msgs);
			if (newMeasurant != null)
				msgs = ((InternalEObject)newMeasurant).eInverseAdd(this, SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT, MofElement.class, msgs);
			msgs = basicSetMeasurant(newMeasurant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT, newMeasurant, newMeasurant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT:
				if (measurant != null)
					msgs = ((InternalEObject)measurant).eInverseRemove(this, SimplifiedDecisionMetricsPackage.MOF_ELEMENT__MEASURANT, MofElement.class, msgs);
				return basicSetMeasurant((MofElement)otherEnd, msgs);
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
			case SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT:
				return basicSetMeasurant(null, msgs);
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
			case SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT:
				if (resolve) return getMeasurant();
				return basicGetMeasurant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT:
				setMeasurant((MofElement)newValue);
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
			case SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT:
				setMeasurant((MofElement)null);
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
			case SimplifiedDecisionMetricsPackage.MEASUREMENT__MEASURANT:
				return measurant != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
