/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim10.model.shim10.ShimPackage
 * @generated
 */
public interface ShimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShimFactory eINSTANCE = org.multicore_association.shim10.model.shim10.impl.ShimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accessor</em>'.
	 * @generated
	 */
	Accessor createAccessor();

	/**
	 * Returns a new object of class '<em>Access Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Type</em>'.
	 * @generated
	 */
	AccessType createAccessType();

	/**
	 * Returns a new object of class '<em>Access Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Type Set</em>'.
	 * @generated
	 */
	AccessTypeSet createAccessTypeSet();

	/**
	 * Returns a new object of class '<em>Address Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Space</em>'.
	 * @generated
	 */
	AddressSpace createAddressSpace();

	/**
	 * Returns a new object of class '<em>Address Space Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Space Set</em>'.
	 * @generated
	 */
	AddressSpaceSet createAddressSpaceSet();

	/**
	 * Returns a new object of class '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache</em>'.
	 * @generated
	 */
	Cache createCache();

	/**
	 * Returns a new object of class '<em>Clock Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Frequency</em>'.
	 * @generated
	 */
	ClockFrequency createClockFrequency();

	/**
	 * Returns a new object of class '<em>Common Instruction Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Instruction Set</em>'.
	 * @generated
	 */
	CommonInstructionSet createCommonInstructionSet();

	/**
	 * Returns a new object of class '<em>Communication Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Set</em>'.
	 * @generated
	 */
	CommunicationSet createCommunicationSet();

	/**
	 * Returns a new object of class '<em>Component Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Set</em>'.
	 * @generated
	 */
	ComponentSet createComponentSet();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Connection Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Set</em>'.
	 * @generated
	 */
	ConnectionSet createConnectionSet();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Event Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Communication</em>'.
	 * @generated
	 */
	EventCommunication createEventCommunication();

	/**
	 * Returns a new object of class '<em>FIFO Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FIFO Communication</em>'.
	 * @generated
	 */
	FIFOCommunication createFIFOCommunication();

	/**
	 * Returns a new object of class '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction</em>'.
	 * @generated
	 */
	Instruction createInstruction();

	/**
	 * Returns a new object of class '<em>Interrupt Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupt Communication</em>'.
	 * @generated
	 */
	InterruptCommunication createInterruptCommunication();

	/**
	 * Returns a new object of class '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency</em>'.
	 * @generated
	 */
	Latency createLatency();

	/**
	 * Returns a new object of class '<em>Master Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Component</em>'.
	 * @generated
	 */
	MasterComponent createMasterComponent();

	/**
	 * Returns a new object of class '<em>Master Slave Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Slave Binding</em>'.
	 * @generated
	 */
	MasterSlaveBinding createMasterSlaveBinding();

	/**
	 * Returns a new object of class '<em>Master Slave Binding Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Slave Binding Set</em>'.
	 * @generated
	 */
	MasterSlaveBindingSet createMasterSlaveBindingSet();

	/**
	 * Returns a new object of class '<em>Memory Consistency Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Consistency Model</em>'.
	 * @generated
	 */
	MemoryConsistencyModel createMemoryConsistencyModel();

	/**
	 * Returns a new object of class '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance</em>'.
	 * @generated
	 */
	Performance createPerformance();

	/**
	 * Returns a new object of class '<em>Performance Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Set</em>'.
	 * @generated
	 */
	PerformanceSet createPerformanceSet();

	/**
	 * Returns a new object of class '<em>Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pitch</em>'.
	 * @generated
	 */
	Pitch createPitch();

	/**
	 * Returns a new object of class '<em>Shared Memory Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Memory Communication</em>'.
	 * @generated
	 */
	SharedMemoryCommunication createSharedMemoryCommunication();

	/**
	 * Returns a new object of class '<em>Shared Register Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Register Communication</em>'.
	 * @generated
	 */
	SharedRegisterCommunication createSharedRegisterCommunication();

	/**
	 * Returns a new object of class '<em>Slave Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slave Component</em>'.
	 * @generated
	 */
	SlaveComponent createSlaveComponent();

	/**
	 * Returns a new object of class '<em>Sub Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Space</em>'.
	 * @generated
	 */
	SubSpace createSubSpace();

	/**
	 * Returns a new object of class '<em>System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Configuration</em>'.
	 * @generated
	 */
	SystemConfiguration createSystemConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ShimPackage getShimPackage();

} //ShimFactory
