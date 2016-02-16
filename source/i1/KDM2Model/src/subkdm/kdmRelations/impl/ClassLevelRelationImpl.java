/**
 */
package subkdm.kdmRelations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import subkdm.kdmObjects.DataType;

import subkdm.kdmObjects.impl.ModelElementImpl;

import subkdm.kdmRelations.ClassLevelRelation;
import subkdm.kdmRelations.KdmRelationsPackage;
import subkdm.kdmRelations.TypeRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Level Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.kdmRelations.impl.ClassLevelRelationImpl#getTo <em>To</em>}</li>
 *   <li>{@link subkdm.kdmRelations.impl.ClassLevelRelationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link subkdm.kdmRelations.impl.ClassLevelRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link subkdm.kdmRelations.impl.ClassLevelRelationImpl#getTypeRelations <em>Type Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassLevelRelationImpl extends ModelElementImpl implements ClassLevelRelation {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DataType to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DataType from;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeRelations() <em>Type Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRelation> typeRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassLevelRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmRelationsPackage.Literals.CLASS_LEVEL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (DataType)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KdmRelationsPackage.CLASS_LEVEL_RELATION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(DataType newTo) {
		DataType oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmRelationsPackage.CLASS_LEVEL_RELATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DataType)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KdmRelationsPackage.CLASS_LEVEL_RELATION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DataType newFrom) {
		DataType oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmRelationsPackage.CLASS_LEVEL_RELATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRelation> getTypeRelations() {
		if (typeRelations == null) {
			typeRelations = new EObjectContainmentEList<TypeRelation>(TypeRelation.class, this, KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE_RELATIONS);
		}
		return typeRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE_RELATIONS:
				return ((InternalEList<?>)getTypeRelations()).basicRemove(otherEnd, msgs);
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
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE:
				return getType();
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE_RELATIONS:
				return getTypeRelations();
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
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TO:
				setTo((DataType)newValue);
				return;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__FROM:
				setFrom((DataType)newValue);
				return;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE:
				setType((String)newValue);
				return;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE_RELATIONS:
				getTypeRelations().clear();
				getTypeRelations().addAll((Collection<? extends TypeRelation>)newValue);
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
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TO:
				setTo((DataType)null);
				return;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__FROM:
				setFrom((DataType)null);
				return;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE_RELATIONS:
				getTypeRelations().clear();
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
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TO:
				return to != null;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__FROM:
				return from != null;
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case KdmRelationsPackage.CLASS_LEVEL_RELATION__TYPE_RELATIONS:
				return typeRelations != null && !typeRelations.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ClassLevelRelationImpl
