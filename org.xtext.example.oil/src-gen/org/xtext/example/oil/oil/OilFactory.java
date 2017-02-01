/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.oil.oil.OilPackage
 * @generated
 */
public interface OilFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OilFactory eINSTANCE = org.xtext.example.oil.oil.impl.OilFactoryImpl.init();

  /**
   * Returns a new object of class '<em>OIL File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OIL File</em>'.
   * @generated
   */
  OILFile createOILFile();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>OIL Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OIL Version</em>'.
   * @generated
   */
  OILVersion createOILVersion();

  /**
   * Returns a new object of class '<em>Implementation Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implementation Definition</em>'.
   * @generated
   */
  ImplementationDefinition createImplementationDefinition();

  /**
   * Returns a new object of class '<em>Implementation Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implementation Spec</em>'.
   * @generated
   */
  ImplementationSpec createImplementationSpec();

  /**
   * Returns a new object of class '<em>Imp Task Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imp Task Rule</em>'.
   * @generated
   */
  ImpTaskRule createImpTaskRule();

  /**
   * Returns a new object of class '<em>Imp Task Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imp Task Param</em>'.
   * @generated
   */
  ImpTaskParam createImpTaskParam();

  /**
   * Returns a new object of class '<em>Imp Os Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imp Os Rule</em>'.
   * @generated
   */
  ImpOsRule createImpOsRule();

  /**
   * Returns a new object of class '<em>Imp Os Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imp Os Param</em>'.
   * @generated
   */
  ImpOsParam createImpOsParam();

  /**
   * Returns a new object of class '<em>Imp Counter Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imp Counter Rule</em>'.
   * @generated
   */
  ImpCounterRule createImpCounterRule();

  /**
   * Returns a new object of class '<em>Imp Counter Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imp Counter Param</em>'.
   * @generated
   */
  ImpCounterParam createImpCounterParam();

  /**
   * Returns a new object of class '<em>Application Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Rule</em>'.
   * @generated
   */
  ApplicationRule createApplicationRule();

  /**
   * Returns a new object of class '<em>App Sub Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>App Sub Container</em>'.
   * @generated
   */
  AppSubContainer createAppSubContainer();

  /**
   * Returns a new object of class '<em>Application Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Param</em>'.
   * @generated
   */
  ApplicationParam createApplicationParam();

  /**
   * Returns a new object of class '<em>Has Restart Task Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Restart Task Rule</em>'.
   * @generated
   */
  HasRestartTaskRule createHasRestartTaskRule();

  /**
   * Returns a new object of class '<em>Restart Task Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restart Task Rule</em>'.
   * @generated
   */
  RestartTaskRule createRestartTaskRule();

  /**
   * Returns a new object of class '<em>Trusted Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trusted Rule</em>'.
   * @generated
   */
  TrustedRule createTrustedRule();

  /**
   * Returns a new object of class '<em>Trusted Fuc Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trusted Fuc Rule</em>'.
   * @generated
   */
  TrustedFucRule createTrustedFucRule();

  /**
   * Returns a new object of class '<em>Isr Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Isr Rule</em>'.
   * @generated
   */
  IsrRule createIsrRule();

  /**
   * Returns a new object of class '<em>Isr Sub Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Isr Sub Container</em>'.
   * @generated
   */
  IsrSubContainer createIsrSubContainer();

  /**
   * Returns a new object of class '<em>Timing Protection Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timing Protection Rule</em>'.
   * @generated
   */
  TimingProtectionRule createTimingProtectionRule();

  /**
   * Returns a new object of class '<em>Timing Protection Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timing Protection Param</em>'.
   * @generated
   */
  TimingProtectionParam createTimingProtectionParam();

  /**
   * Returns a new object of class '<em>Isr Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Isr Param</em>'.
   * @generated
   */
  IsrParam createIsrParam();

  /**
   * Returns a new object of class '<em>Memory Protection Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Memory Protection Rule</em>'.
   * @generated
   */
  MemoryProtectionRule createMemoryProtectionRule();

  /**
   * Returns a new object of class '<em>Implementation Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implementation Def</em>'.
   * @generated
   */
  ImplementationDef createImplementationDef();

  /**
   * Returns a new object of class '<em>Impl Attr Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr Def</em>'.
   * @generated
   */
  ImplAttrDef createImplAttrDef();

  /**
   * Returns a new object of class '<em>Impl Attr Int Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr Int Def</em>'.
   * @generated
   */
  ImplAttrIntDef createImplAttrIntDef();

  /**
   * Returns a new object of class '<em>Impl Attr Float Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr Float Def</em>'.
   * @generated
   */
  ImplAttrFloatDef createImplAttrFloatDef();

  /**
   * Returns a new object of class '<em>Impl Attr Enum Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr Enum Def</em>'.
   * @generated
   */
  ImplAttrEnumDef createImplAttrEnumDef();

  /**
   * Returns a new object of class '<em>Impl Attr String Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr String Def</em>'.
   * @generated
   */
  ImplAttrStringDef createImplAttrStringDef();

  /**
   * Returns a new object of class '<em>Impl Attr Boolean Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr Boolean Def</em>'.
   * @generated
   */
  ImplAttrBooleanDef createImplAttrBooleanDef();

  /**
   * Returns a new object of class '<em>Impl Attr Identi Fier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Attr Identi Fier</em>'.
   * @generated
   */
  ImplAttrIdentiFier createImplAttrIdentiFier();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Enumerator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumerator</em>'.
   * @generated
   */
  Enumerator createEnumerator();

  /**
   * Returns a new object of class '<em>Impl Ref Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Ref Def</em>'.
   * @generated
   */
  ImplRefDef createImplRefDef();

  /**
   * Returns a new object of class '<em>Application Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Definition</em>'.
   * @generated
   */
  ApplicationDefinition createApplicationDefinition();

  /**
   * Returns a new object of class '<em>Object Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Definition</em>'.
   * @generated
   */
  ObjectDefinition createObjectDefinition();

  /**
   * Returns a new object of class '<em>Ipdu Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ipdu Rule</em>'.
   * @generated
   */
  IpduRule createIpduRule();

  /**
   * Returns a new object of class '<em>Ipdu Sub Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ipdu Sub Container</em>'.
   * @generated
   */
  IpduSubContainer createIpduSubContainer();

  /**
   * Returns a new object of class '<em>Ipdu Property Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ipdu Property Rule</em>'.
   * @generated
   */
  IpduPropertyRule createIpduPropertyRule();

  /**
   * Returns a new object of class '<em>Ipdu Prop Sub Con</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ipdu Prop Sub Con</em>'.
   * @generated
   */
  IpduPropSubCon createIpduPropSubCon();

  /**
   * Returns a new object of class '<em>Transmission Mode Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transmission Mode Rule</em>'.
   * @generated
   */
  TransmissionModeRule createTransmissionModeRule();

  /**
   * Returns a new object of class '<em>Transmisson Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transmisson Param</em>'.
   * @generated
   */
  TransmissonParam createTransmissonParam();

  /**
   * Returns a new object of class '<em>Ipdu Prop Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ipdu Prop Param</em>'.
   * @generated
   */
  IpduPropParam createIpduPropParam();

  /**
   * Returns a new object of class '<em>Ipdu Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ipdu Param</em>'.
   * @generated
   */
  IpduParam createIpduParam();

  /**
   * Returns a new object of class '<em>Network Message Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Message Rule</em>'.
   * @generated
   */
  NetworkMessageRule createNetworkMessageRule();

  /**
   * Returns a new object of class '<em>Network Msg Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Msg Param</em>'.
   * @generated
   */
  NetworkMsgParam createNetworkMsgParam();

  /**
   * Returns a new object of class '<em>Network Msg Sub</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Msg Sub</em>'.
   * @generated
   */
  NetworkMsgSub createNetworkMsgSub();

  /**
   * Returns a new object of class '<em>Network Msg Property Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Msg Property Rule</em>'.
   * @generated
   */
  NetworkMsgPropertyRule createNetworkMsgPropertyRule();

  /**
   * Returns a new object of class '<em>Msg Property Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Msg Property Param</em>'.
   * @generated
   */
  MsgPropertyParam createMsgPropertyParam();

  /**
   * Returns a new object of class '<em>Event Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Rule</em>'.
   * @generated
   */
  EventRule createEventRule();

  /**
   * Returns a new object of class '<em>Appmode Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Appmode Rule</em>'.
   * @generated
   */
  AppmodeRule createAppmodeRule();

  /**
   * Returns a new object of class '<em>Counter Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Counter Rule</em>'.
   * @generated
   */
  CounterRule createCounterRule();

  /**
   * Returns a new object of class '<em>Counterattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Counterattribute</em>'.
   * @generated
   */
  Counterattribute createCounterattribute();

  /**
   * Returns a new object of class '<em>Message Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Rule</em>'.
   * @generated
   */
  MessageRule createMessageRule();

  /**
   * Returns a new object of class '<em>Messageattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Messageattribute</em>'.
   * @generated
   */
  Messageattribute createMessageattribute();

  /**
   * Returns a new object of class '<em>Messageattribute3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Messageattribute3</em>'.
   * @generated
   */
  Messageattribute3 createMessageattribute3();

  /**
   * Returns a new object of class '<em>Message SETEVENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message SETEVENT</em>'.
   * @generated
   */
  MessageSETEVENT createMessageSETEVENT();

  /**
   * Returns a new object of class '<em>Message COMCALLBACK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message COMCALLBACK</em>'.
   * @generated
   */
  MessageCOMCALLBACK createMessageCOMCALLBACK();

  /**
   * Returns a new object of class '<em>Messageattribute2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Messageattribute2</em>'.
   * @generated
   */
  Messageattribute2 createMessageattribute2();

  /**
   * Returns a new object of class '<em>Message SEND STATIC EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message SEND STATIC EXTERNAL</em>'.
   * @generated
   */
  Message_SEND_STATIC_EXTERNAL createMessage_SEND_STATIC_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message SEND DYNAMIC EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message SEND DYNAMIC EXTERNAL</em>'.
   * @generated
   */
  Message_SEND_DYNAMIC_EXTERNAL createMessage_SEND_DYNAMIC_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message SEND ZERO EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message SEND ZERO EXTERNAL</em>'.
   * @generated
   */
  Message_SEND_ZERO_EXTERNAL createMessage_SEND_ZERO_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE ZERO INTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE ZERO INTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_ZERO_INTERNAL createMessage_RECEIVE_ZERO_INTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE ZERO EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE ZERO EXTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_ZERO_EXTERNAL createMessage_RECEIVE_ZERO_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE UNQUEUED INTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE UNQUEUED INTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_UNQUEUED_INTERNAL createMessage_RECEIVE_UNQUEUED_INTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE QUEUED INTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE QUEUED INTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_QUEUED_INTERNAL createMessage_RECEIVE_QUEUED_INTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE UNQUEUED EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE UNQUEUED EXTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_UNQUEUED_EXTERNAL createMessage_RECEIVE_UNQUEUED_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE QUEUED EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE QUEUED EXTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_QUEUED_EXTERNAL createMessage_RECEIVE_QUEUED_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE DYNAMIC EXTERNAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE DYNAMIC EXTERNAL</em>'.
   * @generated
   */
  Message_RECEIVE_DYNAMIC_EXTERNAL createMessage_RECEIVE_DYNAMIC_EXTERNAL();

  /**
   * Returns a new object of class '<em>Message RECEIVE ZERO SENDERS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message RECEIVE ZERO SENDERS</em>'.
   * @generated
   */
  Message_RECEIVE_ZERO_SENDERS createMessage_RECEIVE_ZERO_SENDERS();

  /**
   * Returns a new object of class '<em>Message CDATATYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message CDATATYPE</em>'.
   * @generated
   */
  MessageCDATATYPE createMessageCDATATYPE();

  /**
   * Returns a new object of class '<em>Message TRANSFERPROPERTY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message TRANSFERPROPERTY</em>'.
   * @generated
   */
  MessageTRANSFERPROPERTY createMessageTRANSFERPROPERTY();

  /**
   * Returns a new object of class '<em>Message NETWORKORDERCALLOUT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message NETWORKORDERCALLOUT</em>'.
   * @generated
   */
  MessageNETWORKORDERCALLOUT createMessageNETWORKORDERCALLOUT();

  /**
   * Returns a new object of class '<em>Message CPUORDERCALLOUT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message CPUORDERCALLOUT</em>'.
   * @generated
   */
  MessageCPUORDERCALLOUT createMessageCPUORDERCALLOUT();

  /**
   * Returns a new object of class '<em>Message INITIALVALUE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message INITIALVALUE</em>'.
   * @generated
   */
  MessageINITIALVALUE createMessageINITIALVALUE();

  /**
   * Returns a new object of class '<em>Message NETWORKMESSAGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message NETWORKMESSAGE</em>'.
   * @generated
   */
  MessageNETWORKMESSAGE createMessageNETWORKMESSAGE();

  /**
   * Returns a new object of class '<em>Message SENDINGMESSAGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message SENDINGMESSAGE</em>'.
   * @generated
   */
  MessageSENDINGMESSAGE createMessageSENDINGMESSAGE();

  /**
   * Returns a new object of class '<em>Message QUEUESIZE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message QUEUESIZE</em>'.
   * @generated
   */
  MessageQUEUESIZE createMessageQUEUESIZE();

  /**
   * Returns a new object of class '<em>Messagefilter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Messagefilter</em>'.
   * @generated
   */
  Messagefilter createMessagefilter();

  /**
   * Returns a new object of class '<em>Message LINK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message LINK</em>'.
   * @generated
   */
  MessageLINK createMessageLINK();

  /**
   * Returns a new object of class '<em>Librayattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Librayattribute</em>'.
   * @generated
   */
  Librayattribute createLibrayattribute();

  /**
   * Returns a new object of class '<em>Com Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Com Rule</em>'.
   * @generated
   */
  ComRule createComRule();

  /**
   * Returns a new object of class '<em>Comattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comattribute</em>'.
   * @generated
   */
  Comattribute createComattribute();

  /**
   * Returns a new object of class '<em>Task Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Rule</em>'.
   * @generated
   */
  TaskRule createTaskRule();

  /**
   * Returns a new object of class '<em>Taskattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Taskattribute</em>'.
   * @generated
   */
  Taskattribute createTaskattribute();

  /**
   * Returns a new object of class '<em>Task Timing Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Timing Attribute</em>'.
   * @generated
   */
  TaskTimingAttribute createTaskTimingAttribute();

  /**
   * Returns a new object of class '<em>Task Autostart Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Autostart Attribute</em>'.
   * @generated
   */
  TaskAutostartAttribute createTaskAutostartAttribute();

  /**
   * Returns a new object of class '<em>Resource Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Rule</em>'.
   * @generated
   */
  ResourceRule createResourceRule();

  /**
   * Returns a new object of class '<em>Resourceattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resourceattribute</em>'.
   * @generated
   */
  Resourceattribute createResourceattribute();

  /**
   * Returns a new object of class '<em>Cpu Os Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cpu Os Rule</em>'.
   * @generated
   */
  CpuOsRule createCpuOsRule();

  /**
   * Returns a new object of class '<em>Os Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Os Attribute</em>'.
   * @generated
   */
  OsAttribute createOsAttribute();

  /**
   * Returns a new object of class '<em>Time Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Attribute</em>'.
   * @generated
   */
  TimeAttribute createTimeAttribute();

  /**
   * Returns a new object of class '<em>Os Withorti Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Os Withorti Attribute</em>'.
   * @generated
   */
  OsWithortiAttribute createOsWithortiAttribute();

  /**
   * Returns a new object of class '<em>Os Memmap Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Os Memmap Attribute</em>'.
   * @generated
   */
  OsMemmapAttribute createOsMemmapAttribute();

  /**
   * Returns a new object of class '<em>Os Build Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Os Build Attribute</em>'.
   * @generated
   */
  OsBuildAttribute createOsBuildAttribute();

  /**
   * Returns a new object of class '<em>Alarm Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alarm Rule</em>'.
   * @generated
   */
  AlarmRule createAlarmRule();

  /**
   * Returns a new object of class '<em>Alarm Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alarm Attribute</em>'.
   * @generated
   */
  AlarmAttribute createAlarmAttribute();

  /**
   * Returns a new object of class '<em>Alarm Action Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alarm Action Attribute</em>'.
   * @generated
   */
  AlarmActionAttribute createAlarmActionAttribute();

  /**
   * Returns a new object of class '<em>Alarm Autostart Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alarm Autostart Attribute</em>'.
   * @generated
   */
  AlarmAutostartAttribute createAlarmAutostartAttribute();

  /**
   * Returns a new object of class '<em>Schedule Table Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule Table Rule</em>'.
   * @generated
   */
  ScheduleTableRule createScheduleTableRule();

  /**
   * Returns a new object of class '<em>Schedule Table Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule Table Attribute</em>'.
   * @generated
   */
  ScheduleTableAttribute createScheduleTableAttribute();

  /**
   * Returns a new object of class '<em>Schedule Auto Start Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule Auto Start Attribute</em>'.
   * @generated
   */
  ScheduleAutoStartAttribute createScheduleAutoStartAttribute();

  /**
   * Returns a new object of class '<em>Schdule Syn Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schdule Syn Attribute</em>'.
   * @generated
   */
  SchduleSynAttribute createSchduleSynAttribute();

  /**
   * Returns a new object of class '<em>Expiry Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expiry Attribute</em>'.
   * @generated
   */
  ExpiryAttribute createExpiryAttribute();

  /**
   * Returns a new object of class '<em>Schdule Action Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schdule Action Attribute</em>'.
   * @generated
   */
  SchduleActionAttribute createSchduleActionAttribute();

  /**
   * Returns a new object of class '<em>Ioc Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ioc Rule</em>'.
   * @generated
   */
  IocRule createIocRule();

  /**
   * Returns a new object of class '<em>Ioc Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ioc Attribute</em>'.
   * @generated
   */
  IocAttribute createIocAttribute();

  /**
   * Returns a new object of class '<em>Ioc Sender</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ioc Sender</em>'.
   * @generated
   */
  IocSender createIocSender();

  /**
   * Returns a new object of class '<em>Ioc Receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ioc Receiver</em>'.
   * @generated
   */
  IocReceiver createIocReceiver();

  /**
   * Returns a new object of class '<em>Ioc Data Type Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ioc Data Type Attr</em>'.
   * @generated
   */
  IocDataTypeAttr createIocDataTypeAttr();

  /**
   * Returns a new object of class '<em>Ioc Semantics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ioc Semantics</em>'.
   * @generated
   */
  IocSemantics createIocSemantics();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Name</em>'.
   * @generated
   */
  AttributeName createAttributeName();

  /**
   * Returns a new object of class '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value</em>'.
   * @generated
   */
  AttributeValue createAttributeValue();

  /**
   * Returns a new object of class '<em>Name Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Attribute Value</em>'.
   * @generated
   */
  NameAttributeValue createNameAttributeValue();

  /**
   * Returns a new object of class '<em>Boolean Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Attribute Value</em>'.
   * @generated
   */
  BooleanAttributeValue createBooleanAttributeValue();

  /**
   * Returns a new object of class '<em>Number Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Attribute Value</em>'.
   * @generated
   */
  NumberAttributeValue createNumberAttributeValue();

  /**
   * Returns a new object of class '<em>Float Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Attribute Value</em>'.
   * @generated
   */
  FloatAttributeValue createFloatAttributeValue();

  /**
   * Returns a new object of class '<em>String Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Attribute Value</em>'.
   * @generated
   */
  StringAttributeValue createStringAttributeValue();

  /**
   * Returns a new object of class '<em>Auto Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auto Attribute Value</em>'.
   * @generated
   */
  AutoAttributeValue createAutoAttributeValue();

  /**
   * Returns a new object of class '<em>Os Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Os Rule</em>'.
   * @generated
   */
  OsRule createOsRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OilPackage getOilPackage();

} //OilFactory
