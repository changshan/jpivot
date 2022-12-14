/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualCubeTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Cube Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeTypeImpl#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeTypeImpl#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualCubeTypeImpl extends EObjectImpl implements VirtualCubeType {
  /**
   * The cached value of the '{@link #getVirtualCubeDimension() <em>Virtual Cube Dimension</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtualCubeDimension()
   * @generated
   * @ordered
   */
  protected EList virtualCubeDimension = null;

  /**
   * The cached value of the '{@link #getVirtualCubeMeasure() <em>Virtual Cube Measure</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtualCubeMeasure()
   * @generated
   * @ordered
   */
  protected EList virtualCubeMeasure = null;

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
  protected VirtualCubeTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getVirtualCubeType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getVirtualCubeDimension() {
    if (virtualCubeDimension == null) {
      virtualCubeDimension = new EObjectContainmentEList(VirtualCubeDimensionType.class, this, MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION);
    }
    return virtualCubeDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getVirtualCubeMeasure() {
    if (virtualCubeMeasure == null) {
      virtualCubeMeasure = new EObjectContainmentEList(VirtualCubeMeasureType.class, this, MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE);
    }
    return virtualCubeMeasure;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.VIRTUAL_CUBE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
          return ((InternalEList)getVirtualCubeDimension()).basicRemove(otherEnd, msgs);
        case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE:
          return ((InternalEList)getVirtualCubeMeasure()).basicRemove(otherEnd, msgs);
        default:
          return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        return getVirtualCubeDimension();
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE:
        return getVirtualCubeMeasure();
      case MondrianPackage.VIRTUAL_CUBE_TYPE__NAME:
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
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        getVirtualCubeDimension().clear();
        getVirtualCubeDimension().addAll((Collection)newValue);
        return;
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE:
        getVirtualCubeMeasure().clear();
        getVirtualCubeMeasure().addAll((Collection)newValue);
        return;
      case MondrianPackage.VIRTUAL_CUBE_TYPE__NAME:
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
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        getVirtualCubeDimension().clear();
        return;
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE:
        getVirtualCubeMeasure().clear();
        return;
      case MondrianPackage.VIRTUAL_CUBE_TYPE__NAME:
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
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        return virtualCubeDimension != null && !virtualCubeDimension.isEmpty();
      case MondrianPackage.VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE:
        return virtualCubeMeasure != null && !virtualCubeMeasure.isEmpty();
      case MondrianPackage.VIRTUAL_CUBE_TYPE__NAME:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VirtualCubeTypeImpl
