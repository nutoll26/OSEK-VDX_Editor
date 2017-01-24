/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.oil.oil.AttributeName;
import org.xtext.example.oil.oil.DefaultEnum;
import org.xtext.example.oil.oil.ImplAttrIntDef;
import org.xtext.example.oil.oil.IntTypeEnum;
import org.xtext.example.oil.oil.OilPackage;
import org.xtext.example.oil.oil.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impl Attr Int Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplAttrIntDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplAttrIntDefImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplAttrIntDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplAttrIntDefImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplAttrIntDefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplAttrIntDefImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplAttrIntDefImpl extends ImplAttrDefImpl implements ImplAttrIntDef
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final IntTypeEnum TYPE_EDEFAULT = IntTypeEnum.UINT32;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected IntTypeEnum type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Range range;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected AttributeName name;

  /**
   * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final DefaultEnum DEFAULT_EDEFAULT = DefaultEnum.NO_DEFAULT;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected DefaultEnum default_ = DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplAttrIntDefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OilPackage.Literals.IMPL_ATTR_INT_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntTypeEnum getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(IntTypeEnum newType)
  {
    IntTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Range newRange, NotificationChain msgs)
  {
    Range oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(Range newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OilPackage.IMPL_ATTR_INT_DEF__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OilPackage.IMPL_ATTR_INT_DEF__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(AttributeName newName, NotificationChain msgs)
  {
    AttributeName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(AttributeName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OilPackage.IMPL_ATTR_INT_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OilPackage.IMPL_ATTR_INT_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(boolean newMultiple)
  {
    boolean oldMultiple = multiple;
    multiple = newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__MULTIPLE, oldMultiple, multiple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultEnum getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(DefaultEnum newDefault)
  {
    DefaultEnum oldDefault = default_;
    default_ = newDefault == null ? DEFAULT_EDEFAULT : newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_ATTR_INT_DEF__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_ATTR_INT_DEF__RANGE:
        return basicSetRange(null, msgs);
      case OilPackage.IMPL_ATTR_INT_DEF__NAME:
        return basicSetName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_ATTR_INT_DEF__TYPE:
        return getType();
      case OilPackage.IMPL_ATTR_INT_DEF__RANGE:
        return getRange();
      case OilPackage.IMPL_ATTR_INT_DEF__NAME:
        return getName();
      case OilPackage.IMPL_ATTR_INT_DEF__MULTIPLE:
        return isMultiple();
      case OilPackage.IMPL_ATTR_INT_DEF__VALUE:
        return getValue();
      case OilPackage.IMPL_ATTR_INT_DEF__DEFAULT:
        return getDefault();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_ATTR_INT_DEF__TYPE:
        setType((IntTypeEnum)newValue);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__RANGE:
        setRange((Range)newValue);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__NAME:
        setName((AttributeName)newValue);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__MULTIPLE:
        setMultiple((Boolean)newValue);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__VALUE:
        setValue((Integer)newValue);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__DEFAULT:
        setDefault((DefaultEnum)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_ATTR_INT_DEF__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__RANGE:
        setRange((Range)null);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__NAME:
        setName((AttributeName)null);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case OilPackage.IMPL_ATTR_INT_DEF__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_ATTR_INT_DEF__TYPE:
        return type != TYPE_EDEFAULT;
      case OilPackage.IMPL_ATTR_INT_DEF__RANGE:
        return range != null;
      case OilPackage.IMPL_ATTR_INT_DEF__NAME:
        return name != null;
      case OilPackage.IMPL_ATTR_INT_DEF__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
      case OilPackage.IMPL_ATTR_INT_DEF__VALUE:
        return value != VALUE_EDEFAULT;
      case OilPackage.IMPL_ATTR_INT_DEF__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", multiple: ");
    result.append(multiple);
    result.append(", value: ");
    result.append(value);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //ImplAttrIntDefImpl
