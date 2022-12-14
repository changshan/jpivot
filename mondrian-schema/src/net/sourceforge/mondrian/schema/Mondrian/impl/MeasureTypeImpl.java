/**
 * <copyright>
 * </copyright>
 *
 * $Id: MeasureTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.MeasureType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.MeasureTypeImpl#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.MeasureTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.MeasureTypeImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.MeasureTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureTypeImpl extends EObjectImpl implements MeasureType {
  /**
   * The default value of the '{@link #getAggregator() <em>Aggregator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregator()
   * @generated
   * @ordered
   */
  protected static final String AGGREGATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAggregator() <em>Aggregator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregator()
   * @generated
   * @ordered
   */
  protected String aggregator = AGGREGATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected static final Object COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected Object column = COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatString()
   * @generated
   * @ordered
   */
  protected static final Object FORMAT_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatString()
   * @generated
   * @ordered
   */
  protected Object formatString = FORMAT_STRING_EDEFAULT;

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
  protected MeasureTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getMeasureType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAggregator() {
    return aggregator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregator(String newAggregator) {
    String oldAggregator = aggregator;
    aggregator = newAggregator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.MEASURE_TYPE__AGGREGATOR, oldAggregator, aggregator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getColumn() {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(Object newColumn) {
    Object oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.MEASURE_TYPE__COLUMN, oldColumn, column));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getFormatString() {
    return formatString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormatString(Object newFormatString) {
    Object oldFormatString = formatString;
    formatString = newFormatString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.MEASURE_TYPE__FORMAT_STRING, oldFormatString, formatString));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.MEASURE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.MEASURE_TYPE__AGGREGATOR:
        return getAggregator();
      case MondrianPackage.MEASURE_TYPE__COLUMN:
        return getColumn();
      case MondrianPackage.MEASURE_TYPE__FORMAT_STRING:
        return getFormatString();
      case MondrianPackage.MEASURE_TYPE__NAME:
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
      case MondrianPackage.MEASURE_TYPE__AGGREGATOR:
        setAggregator((String)newValue);
        return;
      case MondrianPackage.MEASURE_TYPE__COLUMN:
        setColumn((Object)newValue);
        return;
      case MondrianPackage.MEASURE_TYPE__FORMAT_STRING:
        setFormatString((Object)newValue);
        return;
      case MondrianPackage.MEASURE_TYPE__NAME:
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
      case MondrianPackage.MEASURE_TYPE__AGGREGATOR:
        setAggregator(AGGREGATOR_EDEFAULT);
        return;
      case MondrianPackage.MEASURE_TYPE__COLUMN:
        setColumn(COLUMN_EDEFAULT);
        return;
      case MondrianPackage.MEASURE_TYPE__FORMAT_STRING:
        setFormatString(FORMAT_STRING_EDEFAULT);
        return;
      case MondrianPackage.MEASURE_TYPE__NAME:
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
      case MondrianPackage.MEASURE_TYPE__AGGREGATOR:
        return AGGREGATOR_EDEFAULT == null ? aggregator != null : !AGGREGATOR_EDEFAULT.equals(aggregator);
      case MondrianPackage.MEASURE_TYPE__COLUMN:
        return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
      case MondrianPackage.MEASURE_TYPE__FORMAT_STRING:
        return FORMAT_STRING_EDEFAULT == null ? formatString != null : !FORMAT_STRING_EDEFAULT.equals(formatString);
      case MondrianPackage.MEASURE_TYPE__NAME:
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
    result.append(" (aggregator: ");
    result.append(aggregator);
    result.append(", column: ");
    result.append(column);
    result.append(", formatString: ");
    result.append(formatString);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MeasureTypeImpl
