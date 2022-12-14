/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getPropertyType()
 * @model 
 * @generated
 */
public interface PropertyType extends EObject {
  /**
   * Returns the value of the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' attribute.
   * @see #setColumn(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getPropertyType_Column()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getColumn <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' attribute.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Object value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getPropertyType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"String"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.TypeType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType1
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(TypeType1)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getPropertyType_Type()
   * @model default="String" unique="false" unsettable="true"
   * @generated
   */
  TypeType1 getType();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType1
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(TypeType1 value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(TypeType1)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(TypeType1)
   * @generated
   */
  boolean isSetType();

} // PropertyType
