/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualCubeMeasureTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Cube Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeMeasureTypeImpl#getCubeName <em>Cube Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeMeasureTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualCubeMeasureTypeImpl extends EObjectImpl implements VirtualCubeMeasureType {
  /**
   * The default value of the '{@link #getCubeName() <em>Cube Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCubeName()
   * @generated
   * @ordered
   */
  protected static final Object CUBE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCubeName() <em>Cube Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCubeName()
   * @generated
   * @ordered
   */
  protected Object cubeName = CUBE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final Object NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Object name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VirtualCubeMeasureTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getVirtualCubeMeasureType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getCubeName() {
    return cubeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCubeName(Object newCubeName) {
    Object oldCubeName = cubeName;
    cubeName = newCubeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME, oldCubeName, cubeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Object newName) {
    Object oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME:
        return getCubeName();
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__NAME:
        return getName();
    }
    return eDynamicGet(eFeature, resolve);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(EStructuralFeature eFeature, Object newValue) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME:
        setCubeName((Object)newValue);
        return;
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__NAME:
        setName((Object)newValue);
        return;
    }
    eDynamicSet(eFeature, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(EStructuralFeature eFeature) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME:
        setCubeName(CUBE_NAME_EDEFAULT);
        return;
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    eDynamicUnset(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(EStructuralFeature eFeature) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME:
        return CUBE_NAME_EDEFAULT == null ? cubeName != null : !CUBE_NAME_EDEFAULT.equals(cubeName);
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return eDynamicIsSet(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (cubeName: ");
    result.append(cubeName);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VirtualCubeMeasureTypeImpl
