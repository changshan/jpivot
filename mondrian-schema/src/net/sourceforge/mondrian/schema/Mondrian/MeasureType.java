/**
 * <copyright>
 * </copyright>
 *
 * $Id: MeasureType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getFormatString <em>Format String</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getMeasureType()
 * @model 
 * @generated
 */
public interface MeasureType extends EObject {
  /**
   * Returns the value of the '<em><b>Aggregator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregator</em>' attribute.
   * @see #setAggregator(String)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getMeasureType_Aggregator()
   * @model unique="false" dataType="net.sourceforge.mondrian.schema.Mondrian.AggregatorType" required="true"
   * @generated
   */
  String getAggregator();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getAggregator <em>Aggregator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregator</em>' attribute.
   * @see #getAggregator()
   * @generated
   */
  void setAggregator(String value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getMeasureType_Column()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getColumn <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' attribute.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Object value);

  /**
   * Returns the value of the '<em><b>Format String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format String</em>' attribute.
   * @see #setFormatString(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getMeasureType_FormatString()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getFormatString();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getFormatString <em>Format String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format String</em>' attribute.
   * @see #getFormatString()
   * @generated
   */
  void setFormatString(Object value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getMeasureType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // MeasureType
