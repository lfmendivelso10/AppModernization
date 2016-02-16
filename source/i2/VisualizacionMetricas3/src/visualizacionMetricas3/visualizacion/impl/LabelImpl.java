/**
 */
package visualizacionMetricas3.visualizacion.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import visualizacionMetricas3.visualizacion.Alineacion;
import visualizacionMetricas3.visualizacion.Color;
import visualizacionMetricas3.visualizacion.Label;
import visualizacionMetricas3.visualizacion.Posicion;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.LabelImpl#isIsBold <em>Is Bold</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.LabelImpl#isIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.LabelImpl#getAlineacion <em>Alineacion</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.LabelImpl#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.LabelImpl#getColor <em>Color</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.LabelImpl#getTamanio <em>Tamanio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends EObjectImpl implements Label {
	/**
	 * The default value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBold()
	 * @generated
	 * @ordered
	 */
	protected boolean isBold = IS_BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean isItalic = IS_ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlineacion() <em>Alineacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlineacion()
	 * @generated
	 * @ordered
	 */
	protected static final Alineacion ALINEACION_EDEFAULT = Alineacion.CENTRO;

	/**
	 * The cached value of the '{@link #getAlineacion() <em>Alineacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlineacion()
	 * @generated
	 * @ordered
	 */
	protected Alineacion alineacion = ALINEACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosicion() <em>Posicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosicion()
	 * @generated
	 * @ordered
	 */
	protected static final Posicion POSICION_EDEFAULT = Posicion.BORDE;

	/**
	 * The cached value of the '{@link #getPosicion() <em>Posicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosicion()
	 * @generated
	 * @ordered
	 */
	protected Posicion posicion = POSICION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTamanio() <em>Tamanio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanio()
	 * @generated
	 * @ordered
	 */
	protected static final int TAMANIO_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getTamanio() <em>Tamanio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanio()
	 * @generated
	 * @ordered
	 */
	protected int tamanio = TAMANIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBold() {
		return isBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBold(boolean newIsBold) {
		boolean oldIsBold = isBold;
		isBold = newIsBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.LABEL__IS_BOLD, oldIsBold, isBold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsItalic() {
		return isItalic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItalic(boolean newIsItalic) {
		boolean oldIsItalic = isItalic;
		isItalic = newIsItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.LABEL__IS_ITALIC, oldIsItalic, isItalic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alineacion getAlineacion() {
		return alineacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlineacion(Alineacion newAlineacion) {
		Alineacion oldAlineacion = alineacion;
		alineacion = newAlineacion == null ? ALINEACION_EDEFAULT : newAlineacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.LABEL__ALINEACION, oldAlineacion, alineacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Posicion getPosicion() {
		return posicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosicion(Posicion newPosicion) {
		Posicion oldPosicion = posicion;
		posicion = newPosicion == null ? POSICION_EDEFAULT : newPosicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.LABEL__POSICION, oldPosicion, posicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.LABEL__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamanio(int newTamanio) {
		int oldTamanio = tamanio;
		tamanio = newTamanio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.LABEL__TAMANIO, oldTamanio, tamanio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizacionPackage.LABEL__IS_BOLD:
				return isIsBold();
			case VisualizacionPackage.LABEL__IS_ITALIC:
				return isIsItalic();
			case VisualizacionPackage.LABEL__ALINEACION:
				return getAlineacion();
			case VisualizacionPackage.LABEL__POSICION:
				return getPosicion();
			case VisualizacionPackage.LABEL__COLOR:
				return getColor();
			case VisualizacionPackage.LABEL__TAMANIO:
				return getTamanio();
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
			case VisualizacionPackage.LABEL__IS_BOLD:
				setIsBold((Boolean)newValue);
				return;
			case VisualizacionPackage.LABEL__IS_ITALIC:
				setIsItalic((Boolean)newValue);
				return;
			case VisualizacionPackage.LABEL__ALINEACION:
				setAlineacion((Alineacion)newValue);
				return;
			case VisualizacionPackage.LABEL__POSICION:
				setPosicion((Posicion)newValue);
				return;
			case VisualizacionPackage.LABEL__COLOR:
				setColor((Color)newValue);
				return;
			case VisualizacionPackage.LABEL__TAMANIO:
				setTamanio((Integer)newValue);
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
			case VisualizacionPackage.LABEL__IS_BOLD:
				setIsBold(IS_BOLD_EDEFAULT);
				return;
			case VisualizacionPackage.LABEL__IS_ITALIC:
				setIsItalic(IS_ITALIC_EDEFAULT);
				return;
			case VisualizacionPackage.LABEL__ALINEACION:
				setAlineacion(ALINEACION_EDEFAULT);
				return;
			case VisualizacionPackage.LABEL__POSICION:
				setPosicion(POSICION_EDEFAULT);
				return;
			case VisualizacionPackage.LABEL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VisualizacionPackage.LABEL__TAMANIO:
				setTamanio(TAMANIO_EDEFAULT);
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
			case VisualizacionPackage.LABEL__IS_BOLD:
				return isBold != IS_BOLD_EDEFAULT;
			case VisualizacionPackage.LABEL__IS_ITALIC:
				return isItalic != IS_ITALIC_EDEFAULT;
			case VisualizacionPackage.LABEL__ALINEACION:
				return alineacion != ALINEACION_EDEFAULT;
			case VisualizacionPackage.LABEL__POSICION:
				return posicion != POSICION_EDEFAULT;
			case VisualizacionPackage.LABEL__COLOR:
				return color != COLOR_EDEFAULT;
			case VisualizacionPackage.LABEL__TAMANIO:
				return tamanio != TAMANIO_EDEFAULT;
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
		result.append(" (isBold: ");
		result.append(isBold);
		result.append(", isItalic: ");
		result.append(isItalic);
		result.append(", alineacion: ");
		result.append(alineacion);
		result.append(", posicion: ");
		result.append(posicion);
		result.append(", color: ");
		result.append(color);
		result.append(", tamanio: ");
		result.append(tamanio);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
