/**
 */
package subkdm.kdmRelations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import subkdm.kdmObjects.Cluster;
import subkdm.kdmObjects.CodeItem;

import subkdm.kdmObjects.impl.ModelElementImpl;

import subkdm.kdmRelations.ClusterRelation;
import subkdm.kdmRelations.KdmRelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.kdmRelations.impl.ClusterRelationImpl#getTo <em>To</em>}</li>
 *   <li>{@link subkdm.kdmRelations.impl.ClusterRelationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link subkdm.kdmRelations.impl.ClusterRelationImpl#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClusterRelationImpl extends ModelElementImpl implements ClusterRelation {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Cluster to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Cluster from;

	/**
	 * The cached value of the '{@link #getCodeElement() <em>Code Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeItem> codeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmRelationsPackage.Literals.CLUSTER_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Cluster)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KdmRelationsPackage.CLUSTER_RELATION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Cluster newTo) {
		Cluster oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmRelationsPackage.CLUSTER_RELATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Cluster)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KdmRelationsPackage.CLUSTER_RELATION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Cluster newFrom) {
		Cluster oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KdmRelationsPackage.CLUSTER_RELATION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeItem> getCodeElement() {
		if (codeElement == null) {
			codeElement = new EObjectResolvingEList<CodeItem>(CodeItem.class, this, KdmRelationsPackage.CLUSTER_RELATION__CODE_ELEMENT);
		}
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KdmRelationsPackage.CLUSTER_RELATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case KdmRelationsPackage.CLUSTER_RELATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case KdmRelationsPackage.CLUSTER_RELATION__CODE_ELEMENT:
				return getCodeElement();
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
			case KdmRelationsPackage.CLUSTER_RELATION__TO:
				setTo((Cluster)newValue);
				return;
			case KdmRelationsPackage.CLUSTER_RELATION__FROM:
				setFrom((Cluster)newValue);
				return;
			case KdmRelationsPackage.CLUSTER_RELATION__CODE_ELEMENT:
				getCodeElement().clear();
				getCodeElement().addAll((Collection<? extends CodeItem>)newValue);
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
			case KdmRelationsPackage.CLUSTER_RELATION__TO:
				setTo((Cluster)null);
				return;
			case KdmRelationsPackage.CLUSTER_RELATION__FROM:
				setFrom((Cluster)null);
				return;
			case KdmRelationsPackage.CLUSTER_RELATION__CODE_ELEMENT:
				getCodeElement().clear();
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
			case KdmRelationsPackage.CLUSTER_RELATION__TO:
				return to != null;
			case KdmRelationsPackage.CLUSTER_RELATION__FROM:
				return from != null;
			case KdmRelationsPackage.CLUSTER_RELATION__CODE_ELEMENT:
				return codeElement != null && !codeElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClusterRelationImpl
