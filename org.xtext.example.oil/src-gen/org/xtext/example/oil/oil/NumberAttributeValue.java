/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.NumberAttributeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getNumberAttributeValue()
 * @model
 * @generated
 */
public interface NumberAttributeValue extends AttributeValue
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
   * @see #setValue(int)
   * @see org.xtext.example.oil.oil.OilPackage#getNumberAttributeValue_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.NumberAttributeValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // NumberAttributeValue
