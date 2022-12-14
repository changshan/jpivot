/**
 * <copyright>
 * </copyright>
 *
 * $Id: HierarchyType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getLevel <em>Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getAllMemberName <em>All Member Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getHasAll <em>Has All</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getMemberReaderClass <em>Member Reader Class</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKeyTable <em>Primary Key Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType()
 * @model 
 * @generated
 */
public interface HierarchyType extends EObject {
  /**
   * Returns the value of the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' containment reference.
   * @see #setView(ViewType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_View()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  ViewType getView();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getView <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' containment reference.
   * @see #getView()
   * @generated
   */
  void setView(ViewType value);

  /**
   * Returns the value of the '<em><b>Join</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join</em>' containment reference.
   * @see #setJoin(JoinType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_Join()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  JoinType getJoin();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getJoin <em>Join</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join</em>' containment reference.
   * @see #getJoin()
   * @generated
   */
  void setJoin(JoinType value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(TableType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_Table()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  TableType getTable();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableType value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.LevelType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_Level()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.LevelType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getLevel();

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_Parameter()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.ParameterType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getParameter();

  /**
   * Returns the value of the '<em><b>All Member Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Member Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Member Name</em>' attribute.
   * @see #setAllMemberName(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_AllMemberName()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getAllMemberName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getAllMemberName <em>All Member Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Member Name</em>' attribute.
   * @see #getAllMemberName()
   * @generated
   */
  void setAllMemberName(Object value);

  /**
   * Returns the value of the '<em><b>Default Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Member</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Member</em>' attribute.
   * @see #setDefaultMember(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_DefaultMember()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getDefaultMember();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getDefaultMember <em>Default Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Member</em>' attribute.
   * @see #getDefaultMember()
   * @generated
   */
  void setDefaultMember(Object value);

  /**
   * Returns the value of the '<em><b>Has All</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.HasAllType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has All</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has All</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.HasAllType
   * @see #isSetHasAll()
   * @see #unsetHasAll()
   * @see #setHasAll(HasAllType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_HasAll()
   * @model default="true" unique="false" unsettable="true" required="true"
   * @generated
   */
  HasAllType getHasAll();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getHasAll <em>Has All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has All</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.HasAllType
   * @see #isSetHasAll()
   * @see #unsetHasAll()
   * @see #getHasAll()
   * @generated
   */
  void setHasAll(HasAllType value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getHasAll <em>Has All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetHasAll()
   * @see #getHasAll()
   * @see #setHasAll(HasAllType)
   * @generated
   */
  void unsetHasAll();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getHasAll <em>Has All</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Has All</em>' attribute is set.
   * @see #unsetHasAll()
   * @see #getHasAll()
   * @see #setHasAll(HasAllType)
   * @generated
   */
  boolean isSetHasAll();

  /**
   * Returns the value of the '<em><b>Member Reader Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Reader Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Reader Class</em>' attribute.
   * @see #setMemberReaderClass(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_MemberReaderClass()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getMemberReaderClass();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getMemberReaderClass <em>Member Reader Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member Reader Class</em>' attribute.
   * @see #getMemberReaderClass()
   * @generated
   */
  void setMemberReaderClass(Object value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' attribute.
   * @see #setPrimaryKey(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_PrimaryKey()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getPrimaryKey();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKey <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' attribute.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(Object value);

  /**
   * Returns the value of the '<em><b>Primary Key Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key Table</em>' attribute.
   * @see #setPrimaryKeyTable(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyType_PrimaryKeyTable()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getPrimaryKeyTable();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKeyTable <em>Primary Key Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key Table</em>' attribute.
   * @see #getPrimaryKeyTable()
   * @generated
   */
  void setPrimaryKeyTable(Object value);

} // HierarchyType
