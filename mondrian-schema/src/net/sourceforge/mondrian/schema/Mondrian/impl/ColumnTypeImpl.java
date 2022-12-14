/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColumnTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.ColumnType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.ColumnTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.ColumnTypeImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnTypeImpl extends EObjectImpl implements ColumnType {
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
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected static final Object TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected Object table = TABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getColumnType();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.COLUMN_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getTable() {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(Object newTable) {
    Object oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.COLUMN_TYPE__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.COLUMN_TYPE__NAME:
        return getName();
      case MondrianPackage.COLUMN_TYPE__TABLE:
        return getTable();
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
      case MondrianPackage.COLUMN_TYPE__NAME:
        setName((Object)newValue);
        return;
      case MondrianPackage.COLUMN_TYPE__TABLE:
        setTable((Object)newValue);
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
      case MondrianPackage.COLUMN_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MondrianPackage.COLUMN_TYPE__TABLE:
        setTable(TABLE_EDEFAULT);
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
      case MondrianPackage.COLUMN_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MondrianPackage.COLUMN_TYPE__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
    result.append(", table: ");
    result.append(table);
    result.append(')');
    return result.toString();
  }

} //ColumnTypeImpl
