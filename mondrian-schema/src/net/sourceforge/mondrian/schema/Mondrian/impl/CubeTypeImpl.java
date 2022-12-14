/**
 * <copyright>
 * </copyright>
 *
 * $Id: CubeTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.CubeType;
import net.sourceforge.mondrian.schema.Mondrian.JoinType;
import net.sourceforge.mondrian.schema.Mondrian.MeasureType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.TableType;
import net.sourceforge.mondrian.schema.Mondrian.ViewType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getCubeDimension <em>Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getDimensionUsage <em>Dimension Usage</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CubeTypeImpl extends EObjectImpl implements CubeType {
  /**
   * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected ViewType view = null;

  /**
   * The cached value of the '{@link #getJoin() <em>Join</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoin()
   * @generated
   * @ordered
   */
  protected JoinType join = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected TableType table = null;

  /**
   * The cached value of the '{@link #getCubeDimension() <em>Cube Dimension</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCubeDimension()
   * @generated
   * @ordered
   */
  protected FeatureMap cubeDimension = null;

  /**
   * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
  protected EList measure = null;

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
  protected CubeTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getCubeType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType getView() {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetView(ViewType newView, NotificationChain msgs) {
    ViewType oldView = view;
    view = newView;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__VIEW, oldView, newView);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(ViewType newView) {
    if (newView != view) {
      NotificationChain msgs = null;
      if (view != null)
        msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.CUBE_TYPE__VIEW, null, msgs);
      if (newView != null)
        msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.CUBE_TYPE__VIEW, null, msgs);
      msgs = basicSetView(newView, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__VIEW, newView, newView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinType getJoin() {
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoin(JoinType newJoin, NotificationChain msgs) {
    JoinType oldJoin = join;
    join = newJoin;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__JOIN, oldJoin, newJoin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoin(JoinType newJoin) {
    if (newJoin != join) {
      NotificationChain msgs = null;
      if (join != null)
        msgs = ((InternalEObject)join).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.CUBE_TYPE__JOIN, null, msgs);
      if (newJoin != null)
        msgs = ((InternalEObject)newJoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.CUBE_TYPE__JOIN, null, msgs);
      msgs = basicSetJoin(newJoin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__JOIN, newJoin, newJoin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableType getTable() {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
    TableType oldTable = table;
    table = newTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__TABLE, oldTable, newTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(TableType newTable) {
    if (newTable != table) {
      NotificationChain msgs = null;
      if (table != null)
        msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.CUBE_TYPE__TABLE, null, msgs);
      if (newTable != null)
        msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.CUBE_TYPE__TABLE, null, msgs);
      msgs = basicSetTable(newTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__TABLE, newTable, newTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getCubeDimension() {
    if (cubeDimension == null) {
      cubeDimension = new BasicFeatureMap(this, MondrianPackage.CUBE_TYPE__CUBE_DIMENSION);
    }
    return cubeDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getVirtualCubeDimension() {
    return ((FeatureMap)getCubeDimension()).list(MondrianPackage.eINSTANCE.getCubeType_VirtualCubeDimension());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDimensionUsage() {
    return ((FeatureMap)getCubeDimension()).list(MondrianPackage.eINSTANCE.getCubeType_DimensionUsage());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDimension() {
    return ((FeatureMap)getCubeDimension()).list(MondrianPackage.eINSTANCE.getCubeType_Dimension());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getMeasure() {
    if (measure == null) {
      measure = new EObjectContainmentEList(MeasureType.class, this, MondrianPackage.CUBE_TYPE__MEASURE);
    }
    return measure;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.CUBE_TYPE__VIEW:
          return basicSetView(null, msgs);
        case MondrianPackage.CUBE_TYPE__JOIN:
          return basicSetJoin(null, msgs);
        case MondrianPackage.CUBE_TYPE__TABLE:
          return basicSetTable(null, msgs);
        case MondrianPackage.CUBE_TYPE__CUBE_DIMENSION:
          return ((InternalEList)getCubeDimension()).basicRemove(otherEnd, msgs);
        case MondrianPackage.CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
          return ((InternalEList)getVirtualCubeDimension()).basicRemove(otherEnd, msgs);
        case MondrianPackage.CUBE_TYPE__DIMENSION_USAGE:
          return ((InternalEList)getDimensionUsage()).basicRemove(otherEnd, msgs);
        case MondrianPackage.CUBE_TYPE__DIMENSION:
          return ((InternalEList)getDimension()).basicRemove(otherEnd, msgs);
        case MondrianPackage.CUBE_TYPE__MEASURE:
          return ((InternalEList)getMeasure()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.CUBE_TYPE__VIEW:
        return getView();
      case MondrianPackage.CUBE_TYPE__JOIN:
        return getJoin();
      case MondrianPackage.CUBE_TYPE__TABLE:
        return getTable();
      case MondrianPackage.CUBE_TYPE__CUBE_DIMENSION:
        return getCubeDimension();
      case MondrianPackage.CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        return getVirtualCubeDimension();
      case MondrianPackage.CUBE_TYPE__DIMENSION_USAGE:
        return getDimensionUsage();
      case MondrianPackage.CUBE_TYPE__DIMENSION:
        return getDimension();
      case MondrianPackage.CUBE_TYPE__MEASURE:
        return getMeasure();
      case MondrianPackage.CUBE_TYPE__NAME:
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
      case MondrianPackage.CUBE_TYPE__VIEW:
        setView((ViewType)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__JOIN:
        setJoin((JoinType)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__TABLE:
        setTable((TableType)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__CUBE_DIMENSION:
        getCubeDimension().clear();
        getCubeDimension().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        getVirtualCubeDimension().clear();
        getVirtualCubeDimension().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__DIMENSION_USAGE:
        getDimensionUsage().clear();
        getDimensionUsage().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__DIMENSION:
        getDimension().clear();
        getDimension().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__MEASURE:
        getMeasure().clear();
        getMeasure().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_TYPE__NAME:
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
      case MondrianPackage.CUBE_TYPE__VIEW:
        setView((ViewType)null);
        return;
      case MondrianPackage.CUBE_TYPE__JOIN:
        setJoin((JoinType)null);
        return;
      case MondrianPackage.CUBE_TYPE__TABLE:
        setTable((TableType)null);
        return;
      case MondrianPackage.CUBE_TYPE__CUBE_DIMENSION:
        getCubeDimension().clear();
        return;
      case MondrianPackage.CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        getVirtualCubeDimension().clear();
        return;
      case MondrianPackage.CUBE_TYPE__DIMENSION_USAGE:
        getDimensionUsage().clear();
        return;
      case MondrianPackage.CUBE_TYPE__DIMENSION:
        getDimension().clear();
        return;
      case MondrianPackage.CUBE_TYPE__MEASURE:
        getMeasure().clear();
        return;
      case MondrianPackage.CUBE_TYPE__NAME:
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
      case MondrianPackage.CUBE_TYPE__VIEW:
        return view != null;
      case MondrianPackage.CUBE_TYPE__JOIN:
        return join != null;
      case MondrianPackage.CUBE_TYPE__TABLE:
        return table != null;
      case MondrianPackage.CUBE_TYPE__CUBE_DIMENSION:
        return cubeDimension != null && !cubeDimension.isEmpty();
      case MondrianPackage.CUBE_TYPE__VIRTUAL_CUBE_DIMENSION:
        return !getVirtualCubeDimension().isEmpty();
      case MondrianPackage.CUBE_TYPE__DIMENSION_USAGE:
        return !getDimensionUsage().isEmpty();
      case MondrianPackage.CUBE_TYPE__DIMENSION:
        return !getDimension().isEmpty();
      case MondrianPackage.CUBE_TYPE__MEASURE:
        return measure != null && !measure.isEmpty();
      case MondrianPackage.CUBE_TYPE__NAME:
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
    result.append(" (cubeDimension: ");
    result.append(cubeDimension);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CubeTypeImpl
