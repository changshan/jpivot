/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRelation <em>Relation</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftAlias <em>Left Alias</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftKey <em>Left Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightAlias <em>Right Alias</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightKey <em>Right Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType()
 * @model 
 * @generated
 */
public interface JoinType extends EObject{
  /**
   * Returns the value of the '<em><b>Relation</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' attribute list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_Relation()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   * @generated
   */
  FeatureMap getRelation();

  /**
   * Returns the value of the '<em><b>View</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.ViewType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_View()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.ViewType" containment="true" resolveProxies="false" upper="2" transient="true" volatile="true" derived="true"
   * @generated
   */
  EList getView();

  /**
   * Returns the value of the '<em><b>Join</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.JoinType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_Join()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.JoinType" containment="true" resolveProxies="false" upper="2" transient="true" volatile="true" derived="true"
   * @generated
   */
  EList getJoin();

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.TableType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_Table()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.TableType" containment="true" resolveProxies="false" upper="2" transient="true" volatile="true" derived="true"
   * @generated
   */
  EList getTable();

  /**
   * Returns the value of the '<em><b>Left Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Alias</em>' attribute.
   * @see #setLeftAlias(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_LeftAlias()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getLeftAlias();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftAlias <em>Left Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Alias</em>' attribute.
   * @see #getLeftAlias()
   * @generated
   */
  void setLeftAlias(Object value);

  /**
   * Returns the value of the '<em><b>Left Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Key</em>' attribute.
   * @see #setLeftKey(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_LeftKey()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getLeftKey();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftKey <em>Left Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Key</em>' attribute.
   * @see #getLeftKey()
   * @generated
   */
  void setLeftKey(Object value);

  /**
   * Returns the value of the '<em><b>Right Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Alias</em>' attribute.
   * @see #setRightAlias(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_RightAlias()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getRightAlias();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightAlias <em>Right Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Alias</em>' attribute.
   * @see #getRightAlias()
   * @generated
   */
  void setRightAlias(Object value);

  /**
   * Returns the value of the '<em><b>Right Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Key</em>' attribute.
   * @see #setRightKey(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getJoinType_RightKey()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getRightKey();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightKey <em>Right Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Key</em>' attribute.
   * @see #getRightKey()
   * @generated
   */
  void setRightKey(Object value);

} // JoinType
