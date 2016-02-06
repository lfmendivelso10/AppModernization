/**
 */
package subkdm.kdmObjects.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import subkdm.kdmObjects.AbstractCodeElement;
import subkdm.kdmObjects.CommentUnit;
import subkdm.kdmObjects.KdmObjectsPackage;

import subkdm.kdmRelations.AbstractCodeRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Code Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.impl.AbstractCodeElementImpl#getCodeRelation <em>Code Relation</em>}</li>
 *   <li>{@link subkdm.kdmObjects.impl.AbstractCodeElementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link subkdm.kdmObjects.impl.AbstractCodeElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCodeElementImpl extends ModelElementImpl implements AbstractCodeElement {
	/**
	 * The cached value of the '{@link #getCodeRelation() <em>Code Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeRelationship> codeRelation;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentUnit> comment;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	protected AbstractCodeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmObjectsPackage.Literals.ABSTRACT_CODE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeRelationship> getCodeRelation() {
		if (codeRelation == null) {
			codeRelation = new EObjectContainmentEList<AbstractCodeRelationship>(AbstractCodeRelationship.class, this, KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION);
		}
		return codeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentUnit> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentUnit>(CommentUnit.class, this, KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__COMMENT);
		}
		return comment;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				return ((InternalEList<?>)getCodeRelation()).basicRemove(otherEnd, msgs);
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
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
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				return getCodeRelation();
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				return getComment();
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__NAME:
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
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				getCodeRelation().clear();
				getCodeRelation().addAll((Collection<? extends AbstractCodeRelationship>)newValue);
				return;
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentUnit>)newValue);
				return;
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__NAME:
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
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				getCodeRelation().clear();
				return;
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				getComment().clear();
				return;
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__NAME:
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
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				return codeRelation != null && !codeRelation.isEmpty();
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				return comment != null && !comment.isEmpty();
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT__NAME:
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

} //AbstractCodeElementImpl
