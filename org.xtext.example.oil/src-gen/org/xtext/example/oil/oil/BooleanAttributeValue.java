/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.BooleanAttributeValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.BooleanAttributeValue#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getBooleanAttributeValue()
 * @model
 * @generated
 */
public interface BooleanAttributeValue extends AttributeValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.oil.oil.OilPackage#getBooleanAttributeValue_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.BooleanAttributeValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getBooleanAttributeValue_ParameterList()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getParameterList();

} // BooleanAttributeValue
