/**
 */
package DFN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DFN.DFNFactory
 * @model kind="package"
 * @generated
 */
public interface DFNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DFN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://DFN/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DFN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DFNPackage eINSTANCE = DFN.impl.DFNPackageImpl.init();

	/**
	 * The meta object id for the '{@link DFN.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.NamedElementImpl
	 * @see DFN.impl.DFNPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DFN.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.EndPointImpl
	 * @see DFN.impl.DFNPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.DataFlowNetworkImpl <em>Data Flow Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.DataFlowNetworkImpl
	 * @see DFN.impl.DFNPackageImpl#getDataFlowNetwork()
	 * @generated
	 */
	int DATA_FLOW_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__NAME = END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__PORTS = END_POINT__PORTS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__NODES = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__CHANNELS = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__TOKENS = END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned DF Ns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__OWNED_DF_NS = END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__NETWORK = END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Apps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__APPS = END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK__PROTOCOL = END_POINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Data Flow Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Data Flow Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_NETWORK_OPERATION_COUNT = END_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.NodeImpl
	 * @see DFN.impl.DFNPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORTS = END_POINT__PORTS;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NETWORK = END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STATES = END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INITIAL_STATE = END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TOKENS = END_POINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSITIONS = END_POINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MAPPINGS = END_POINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__APP = END_POINT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = END_POINT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = END_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.ChannelImpl
	 * @see DFN.impl.DFNPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NETWORK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TOKEN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.StateImpl
	 * @see DFN.impl.DFNPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.TokenImpl
	 * @see DFN.impl.DFNPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NETWORK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NODES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.StringTokenImpl <em>String Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.StringTokenImpl
	 * @see DFN.impl.DFNPackageImpl#getStringToken()
	 * @generated
	 */
	int STRING_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN__NAME = TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN__NETWORK = TOKEN__NETWORK;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN__NODES = TOKEN__NODES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN__LITERALS = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.TransitionImpl
	 * @see DFN.impl.DFNPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NODE = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = 2;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = 3;

	/**
	 * The feature id for the '<em><b>Sourcestate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCESTATE = 4;

	/**
	 * The feature id for the '<em><b>Targetstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGETSTATE = 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DFN.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.MappingImpl
	 * @see DFN.impl.DFNPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.InMappingImpl <em>In Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.InMappingImpl
	 * @see DFN.impl.DFNPackageImpl#getInMapping()
	 * @generated
	 */
	int IN_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MAPPING__NAME = MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MAPPING__NODE = MAPPING__NODE;

	/**
	 * The number of structural features of the '<em>In Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.OutMappingImpl <em>Out Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.OutMappingImpl
	 * @see DFN.impl.DFNPackageImpl#getOutMapping()
	 * @generated
	 */
	int OUT_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MAPPING__NAME = MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MAPPING__NODE = MAPPING__NODE;

	/**
	 * The number of structural features of the '<em>Out Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Out Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.EquationImpl
	 * @see DFN.impl.DFNPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__NAME = IN_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__NODE = IN_MAPPING__NODE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__PORT = IN_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = IN_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_OPERATION_COUNT = IN_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.InequalityImpl <em>Inequality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.InequalityImpl
	 * @see DFN.impl.DFNPackageImpl#getInequality()
	 * @generated
	 */
	int INEQUALITY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__NAME = IN_MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__NODE = IN_MAPPING__NODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__VALUE = IN_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__PORT = IN_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__KIND = IN_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_FEATURE_COUNT = IN_MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_OPERATION_COUNT = IN_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.IntTokenImpl <em>Int Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.IntTokenImpl
	 * @see DFN.impl.DFNPackageImpl#getIntToken()
	 * @generated
	 */
	int INT_TOKEN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TOKEN__NAME = TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TOKEN__NETWORK = TOKEN__NETWORK;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TOKEN__NODES = TOKEN__NODES;

	/**
	 * The number of structural features of the '<em>Int Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.StringTokenLiteralImpl <em>String Token Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.StringTokenLiteralImpl
	 * @see DFN.impl.DFNPackageImpl#getStringTokenLiteral()
	 * @generated
	 */
	int STRING_TOKEN_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Stringtoken</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN_LITERAL__STRINGTOKEN = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN_LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String Token Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String Token Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TOKEN_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DFN.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.PortImpl
	 * @see DFN.impl.DFNPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ENDPOINT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.InPortImpl
	 * @see DFN.impl.DFNPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__ENDPOINT = PORT__ENDPOINT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__IN = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.OutPortImpl
	 * @see DFN.impl.DFNPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__ENDPOINT = PORT__ENDPOINT;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__OUT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.StringEquationImpl <em>String Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.StringEquationImpl
	 * @see DFN.impl.DFNPackageImpl#getStringEquation()
	 * @generated
	 */
	int STRING_EQUATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUATION__NAME = EQUATION__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUATION__NODE = EQUATION__NODE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUATION__PORT = EQUATION__PORT;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUATION__LITERAL = EQUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUATION_FEATURE_COUNT = EQUATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EQUATION_OPERATION_COUNT = EQUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.IntEquationImpl <em>Int Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.IntEquationImpl
	 * @see DFN.impl.DFNPackageImpl#getIntEquation()
	 * @generated
	 */
	int INT_EQUATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EQUATION__NAME = EQUATION__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EQUATION__NODE = EQUATION__NODE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EQUATION__PORT = EQUATION__PORT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EQUATION__VALUE = EQUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EQUATION_FEATURE_COUNT = EQUATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EQUATION_OPERATION_COUNT = EQUATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.IntegerMappingImpl <em>Integer Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.IntegerMappingImpl
	 * @see DFN.impl.DFNPackageImpl#getIntegerMapping()
	 * @generated
	 */
	int INTEGER_MAPPING = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MAPPING__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Integer Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MAPPING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Integer Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DFN.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.ApplicationImpl
	 * @see DFN.impl.DFNPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NETWORK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NODES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.impl.InOutPortImpl <em>In Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.impl.InOutPortImpl
	 * @see DFN.impl.DFNPackageImpl#getInOutPort()
	 * @generated
	 */
	int IN_OUT_PORT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PORT__NAME = IN_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PORT__ENDPOINT = IN_PORT__ENDPOINT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PORT__IN = IN_PORT__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PORT__OUT = IN_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PORT_FEATURE_COUNT = IN_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_PORT_OPERATION_COUNT = IN_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DFN.RelationalSymbols <em>Relational Symbols</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.RelationalSymbols
	 * @see DFN.impl.DFNPackageImpl#getRelationalSymbols()
	 * @generated
	 */
	int RELATIONAL_SYMBOLS = 24;


	/**
	 * The meta object id for the '{@link DFN.CommProtocol <em>Comm Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DFN.CommProtocol
	 * @see DFN.impl.DFNPackageImpl#getCommProtocol()
	 * @generated
	 */
	int COMM_PROTOCOL = 25;


	/**
	 * Returns the meta object for class '{@link DFN.DataFlowNetwork <em>Data Flow Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Network</em>'.
	 * @see DFN.DataFlowNetwork
	 * @generated
	 */
	EClass getDataFlowNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.DataFlowNetwork#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see DFN.DataFlowNetwork#getNodes()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EReference getDataFlowNetwork_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.DataFlowNetwork#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see DFN.DataFlowNetwork#getChannels()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EReference getDataFlowNetwork_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.DataFlowNetwork#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see DFN.DataFlowNetwork#getTokens()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EReference getDataFlowNetwork_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.DataFlowNetwork#getOwnedDFNs <em>Owned DF Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned DF Ns</em>'.
	 * @see DFN.DataFlowNetwork#getOwnedDFNs()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EReference getDataFlowNetwork_OwnedDFNs();

	/**
	 * Returns the meta object for the container reference '{@link DFN.DataFlowNetwork#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see DFN.DataFlowNetwork#getNetwork()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EReference getDataFlowNetwork_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.DataFlowNetwork#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apps</em>'.
	 * @see DFN.DataFlowNetwork#getApps()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EReference getDataFlowNetwork_Apps();

	/**
	 * Returns the meta object for the attribute '{@link DFN.DataFlowNetwork#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see DFN.DataFlowNetwork#getProtocol()
	 * @see #getDataFlowNetwork()
	 * @generated
	 */
	EAttribute getDataFlowNetwork_Protocol();

	/**
	 * Returns the meta object for class '{@link DFN.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see DFN.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Node#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see DFN.Node#getNetwork()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.Node#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see DFN.Node#getStates()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_States();

	/**
	 * Returns the meta object for the reference '{@link DFN.Node#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see DFN.Node#getInitialState()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InitialState();

	/**
	 * Returns the meta object for the reference list '{@link DFN.Node#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see DFN.Node#getTokens()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.Node#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see DFN.Node#getTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.Node#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see DFN.Node#getMappings()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Mappings();

	/**
	 * Returns the meta object for the reference '{@link DFN.Node#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App</em>'.
	 * @see DFN.Node#getApp()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_App();

	/**
	 * Returns the meta object for class '{@link DFN.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see DFN.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Channel#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see DFN.Channel#getNetwork()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Network();

	/**
	 * Returns the meta object for the reference '{@link DFN.Channel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see DFN.Channel#getTarget()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Target();

	/**
	 * Returns the meta object for the reference '{@link DFN.Channel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see DFN.Channel#getSource()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Source();

	/**
	 * Returns the meta object for the reference '{@link DFN.Channel#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see DFN.Channel#getToken()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Token();

	/**
	 * Returns the meta object for class '{@link DFN.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see DFN.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link DFN.State#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see DFN.State#getNode()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Node();

	/**
	 * Returns the meta object for class '{@link DFN.StringToken <em>String Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Token</em>'.
	 * @see DFN.StringToken
	 * @generated
	 */
	EClass getStringToken();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.StringToken#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see DFN.StringToken#getLiterals()
	 * @see #getStringToken()
	 * @generated
	 */
	EReference getStringToken_Literals();

	/**
	 * Returns the meta object for class '{@link DFN.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see DFN.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Transition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see DFN.Transition#getNode()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Node();

	/**
	 * Returns the meta object for the attribute '{@link DFN.Transition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see DFN.Transition#getPriority()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Priority();

	/**
	 * Returns the meta object for the reference list '{@link DFN.Transition#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see DFN.Transition#getIn()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_In();

	/**
	 * Returns the meta object for the reference list '{@link DFN.Transition#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see DFN.Transition#getOut()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Out();

	/**
	 * Returns the meta object for the reference '{@link DFN.Transition#getSourcestate <em>Sourcestate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sourcestate</em>'.
	 * @see DFN.Transition#getSourcestate()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Sourcestate();

	/**
	 * Returns the meta object for the reference '{@link DFN.Transition#getTargetstate <em>Targetstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetstate</em>'.
	 * @see DFN.Transition#getTargetstate()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Targetstate();

	/**
	 * Returns the meta object for class '{@link DFN.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see DFN.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Mapping#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see DFN.Mapping#getNode()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Node();

	/**
	 * Returns the meta object for class '{@link DFN.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see DFN.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link DFN.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DFN.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link DFN.InMapping <em>In Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Mapping</em>'.
	 * @see DFN.InMapping
	 * @generated
	 */
	EClass getInMapping();

	/**
	 * Returns the meta object for class '{@link DFN.OutMapping <em>Out Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Mapping</em>'.
	 * @see DFN.OutMapping
	 * @generated
	 */
	EClass getOutMapping();

	/**
	 * Returns the meta object for class '{@link DFN.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see DFN.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the reference '{@link DFN.Equation#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see DFN.Equation#getPort()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Port();

	/**
	 * Returns the meta object for class '{@link DFN.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequality</em>'.
	 * @see DFN.Inequality
	 * @generated
	 */
	EClass getInequality();

	/**
	 * Returns the meta object for the reference '{@link DFN.Inequality#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see DFN.Inequality#getPort()
	 * @see #getInequality()
	 * @generated
	 */
	EReference getInequality_Port();

	/**
	 * Returns the meta object for the attribute '{@link DFN.Inequality#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see DFN.Inequality#getKind()
	 * @see #getInequality()
	 * @generated
	 */
	EAttribute getInequality_Kind();

	/**
	 * Returns the meta object for class '{@link DFN.IntToken <em>Int Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Token</em>'.
	 * @see DFN.IntToken
	 * @generated
	 */
	EClass getIntToken();

	/**
	 * Returns the meta object for class '{@link DFN.StringTokenLiteral <em>String Token Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Token Literal</em>'.
	 * @see DFN.StringTokenLiteral
	 * @generated
	 */
	EClass getStringTokenLiteral();

	/**
	 * Returns the meta object for the container reference '{@link DFN.StringTokenLiteral#getStringtoken <em>Stringtoken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stringtoken</em>'.
	 * @see DFN.StringTokenLiteral#getStringtoken()
	 * @see #getStringTokenLiteral()
	 * @generated
	 */
	EReference getStringTokenLiteral_Stringtoken();

	/**
	 * Returns the meta object for the attribute '{@link DFN.StringTokenLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DFN.StringTokenLiteral#getValue()
	 * @see #getStringTokenLiteral()
	 * @generated
	 */
	EAttribute getStringTokenLiteral_Value();

	/**
	 * Returns the meta object for class '{@link DFN.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see DFN.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link DFN.EndPoint#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see DFN.EndPoint#getPorts()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Ports();

	/**
	 * Returns the meta object for class '{@link DFN.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see DFN.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Port#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Endpoint</em>'.
	 * @see DFN.Port#getEndpoint()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Endpoint();

	/**
	 * Returns the meta object for class '{@link DFN.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see DFN.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for the reference '{@link DFN.InPort#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see DFN.InPort#getIn()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_In();

	/**
	 * Returns the meta object for class '{@link DFN.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see DFN.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for the reference '{@link DFN.OutPort#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see DFN.OutPort#getOut()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_Out();

	/**
	 * Returns the meta object for class '{@link DFN.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see DFN.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Token#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see DFN.Token#getNetwork()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Network();

	/**
	 * Returns the meta object for the reference list '{@link DFN.Token#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see DFN.Token#getNodes()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Nodes();

	/**
	 * Returns the meta object for class '{@link DFN.StringEquation <em>String Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Equation</em>'.
	 * @see DFN.StringEquation
	 * @generated
	 */
	EClass getStringEquation();

	/**
	 * Returns the meta object for the reference '{@link DFN.StringEquation#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see DFN.StringEquation#getLiteral()
	 * @see #getStringEquation()
	 * @generated
	 */
	EReference getStringEquation_Literal();

	/**
	 * Returns the meta object for class '{@link DFN.IntEquation <em>Int Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Equation</em>'.
	 * @see DFN.IntEquation
	 * @generated
	 */
	EClass getIntEquation();

	/**
	 * Returns the meta object for class '{@link DFN.IntegerMapping <em>Integer Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Mapping</em>'.
	 * @see DFN.IntegerMapping
	 * @generated
	 */
	EClass getIntegerMapping();

	/**
	 * Returns the meta object for the attribute '{@link DFN.IntegerMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DFN.IntegerMapping#getValue()
	 * @see #getIntegerMapping()
	 * @generated
	 */
	EAttribute getIntegerMapping_Value();

	/**
	 * Returns the meta object for class '{@link DFN.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see DFN.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the container reference '{@link DFN.Application#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see DFN.Application#getNetwork()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Network();

	/**
	 * Returns the meta object for the reference list '{@link DFN.Application#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see DFN.Application#getNodes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Nodes();

	/**
	 * Returns the meta object for class '{@link DFN.InOutPort <em>In Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Out Port</em>'.
	 * @see DFN.InOutPort
	 * @generated
	 */
	EClass getInOutPort();

	/**
	 * Returns the meta object for enum '{@link DFN.RelationalSymbols <em>Relational Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Symbols</em>'.
	 * @see DFN.RelationalSymbols
	 * @generated
	 */
	EEnum getRelationalSymbols();

	/**
	 * Returns the meta object for enum '{@link DFN.CommProtocol <em>Comm Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comm Protocol</em>'.
	 * @see DFN.CommProtocol
	 * @generated
	 */
	EEnum getCommProtocol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DFNFactory getDFNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DFN.impl.DataFlowNetworkImpl <em>Data Flow Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.DataFlowNetworkImpl
		 * @see DFN.impl.DFNPackageImpl#getDataFlowNetwork()
		 * @generated
		 */
		EClass DATA_FLOW_NETWORK = eINSTANCE.getDataFlowNetwork();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_NETWORK__NODES = eINSTANCE.getDataFlowNetwork_Nodes();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_NETWORK__CHANNELS = eINSTANCE.getDataFlowNetwork_Channels();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_NETWORK__TOKENS = eINSTANCE.getDataFlowNetwork_Tokens();

		/**
		 * The meta object literal for the '<em><b>Owned DF Ns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_NETWORK__OWNED_DF_NS = eINSTANCE.getDataFlowNetwork_OwnedDFNs();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_NETWORK__NETWORK = eINSTANCE.getDataFlowNetwork_Network();

		/**
		 * The meta object literal for the '<em><b>Apps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW_NETWORK__APPS = eINSTANCE.getDataFlowNetwork_Apps();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW_NETWORK__PROTOCOL = eINSTANCE.getDataFlowNetwork_Protocol();

		/**
		 * The meta object literal for the '{@link DFN.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.NodeImpl
		 * @see DFN.impl.DFNPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NETWORK = eINSTANCE.getNode_Network();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__STATES = eINSTANCE.getNode_States();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INITIAL_STATE = eINSTANCE.getNode_InitialState();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TOKENS = eINSTANCE.getNode_Tokens();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TRANSITIONS = eINSTANCE.getNode_Transitions();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MAPPINGS = eINSTANCE.getNode_Mappings();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__APP = eINSTANCE.getNode_App();

		/**
		 * The meta object literal for the '{@link DFN.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.ChannelImpl
		 * @see DFN.impl.DFNPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__NETWORK = eINSTANCE.getChannel_Network();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__TARGET = eINSTANCE.getChannel_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__SOURCE = eINSTANCE.getChannel_Source();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__TOKEN = eINSTANCE.getChannel_Token();

		/**
		 * The meta object literal for the '{@link DFN.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.StateImpl
		 * @see DFN.impl.DFNPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NODE = eINSTANCE.getState_Node();

		/**
		 * The meta object literal for the '{@link DFN.impl.StringTokenImpl <em>String Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.StringTokenImpl
		 * @see DFN.impl.DFNPackageImpl#getStringToken()
		 * @generated
		 */
		EClass STRING_TOKEN = eINSTANCE.getStringToken();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TOKEN__LITERALS = eINSTANCE.getStringToken_Literals();

		/**
		 * The meta object literal for the '{@link DFN.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.TransitionImpl
		 * @see DFN.impl.DFNPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NODE = eINSTANCE.getTransition_Node();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PRIORITY = eINSTANCE.getTransition_Priority();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__IN = eINSTANCE.getTransition_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUT = eINSTANCE.getTransition_Out();

		/**
		 * The meta object literal for the '<em><b>Sourcestate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCESTATE = eINSTANCE.getTransition_Sourcestate();

		/**
		 * The meta object literal for the '<em><b>Targetstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGETSTATE = eINSTANCE.getTransition_Targetstate();

		/**
		 * The meta object literal for the '{@link DFN.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.MappingImpl
		 * @see DFN.impl.DFNPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__NODE = eINSTANCE.getMapping_Node();

		/**
		 * The meta object literal for the '{@link DFN.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.NamedElementImpl
		 * @see DFN.impl.DFNPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link DFN.impl.InMappingImpl <em>In Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.InMappingImpl
		 * @see DFN.impl.DFNPackageImpl#getInMapping()
		 * @generated
		 */
		EClass IN_MAPPING = eINSTANCE.getInMapping();

		/**
		 * The meta object literal for the '{@link DFN.impl.OutMappingImpl <em>Out Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.OutMappingImpl
		 * @see DFN.impl.DFNPackageImpl#getOutMapping()
		 * @generated
		 */
		EClass OUT_MAPPING = eINSTANCE.getOutMapping();

		/**
		 * The meta object literal for the '{@link DFN.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.EquationImpl
		 * @see DFN.impl.DFNPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__PORT = eINSTANCE.getEquation_Port();

		/**
		 * The meta object literal for the '{@link DFN.impl.InequalityImpl <em>Inequality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.InequalityImpl
		 * @see DFN.impl.DFNPackageImpl#getInequality()
		 * @generated
		 */
		EClass INEQUALITY = eINSTANCE.getInequality();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INEQUALITY__PORT = eINSTANCE.getInequality_Port();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INEQUALITY__KIND = eINSTANCE.getInequality_Kind();

		/**
		 * The meta object literal for the '{@link DFN.impl.IntTokenImpl <em>Int Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.IntTokenImpl
		 * @see DFN.impl.DFNPackageImpl#getIntToken()
		 * @generated
		 */
		EClass INT_TOKEN = eINSTANCE.getIntToken();

		/**
		 * The meta object literal for the '{@link DFN.impl.StringTokenLiteralImpl <em>String Token Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.StringTokenLiteralImpl
		 * @see DFN.impl.DFNPackageImpl#getStringTokenLiteral()
		 * @generated
		 */
		EClass STRING_TOKEN_LITERAL = eINSTANCE.getStringTokenLiteral();

		/**
		 * The meta object literal for the '<em><b>Stringtoken</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TOKEN_LITERAL__STRINGTOKEN = eINSTANCE.getStringTokenLiteral_Stringtoken();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TOKEN_LITERAL__VALUE = eINSTANCE.getStringTokenLiteral_Value();

		/**
		 * The meta object literal for the '{@link DFN.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.EndPointImpl
		 * @see DFN.impl.DFNPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__PORTS = eINSTANCE.getEndPoint_Ports();

		/**
		 * The meta object literal for the '{@link DFN.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.PortImpl
		 * @see DFN.impl.DFNPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ENDPOINT = eINSTANCE.getPort_Endpoint();

		/**
		 * The meta object literal for the '{@link DFN.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.InPortImpl
		 * @see DFN.impl.DFNPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__IN = eINSTANCE.getInPort_In();

		/**
		 * The meta object literal for the '{@link DFN.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.OutPortImpl
		 * @see DFN.impl.DFNPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__OUT = eINSTANCE.getOutPort_Out();

		/**
		 * The meta object literal for the '{@link DFN.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.TokenImpl
		 * @see DFN.impl.DFNPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__NETWORK = eINSTANCE.getToken_Network();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__NODES = eINSTANCE.getToken_Nodes();

		/**
		 * The meta object literal for the '{@link DFN.impl.StringEquationImpl <em>String Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.StringEquationImpl
		 * @see DFN.impl.DFNPackageImpl#getStringEquation()
		 * @generated
		 */
		EClass STRING_EQUATION = eINSTANCE.getStringEquation();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EQUATION__LITERAL = eINSTANCE.getStringEquation_Literal();

		/**
		 * The meta object literal for the '{@link DFN.impl.IntEquationImpl <em>Int Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.IntEquationImpl
		 * @see DFN.impl.DFNPackageImpl#getIntEquation()
		 * @generated
		 */
		EClass INT_EQUATION = eINSTANCE.getIntEquation();

		/**
		 * The meta object literal for the '{@link DFN.impl.IntegerMappingImpl <em>Integer Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.IntegerMappingImpl
		 * @see DFN.impl.DFNPackageImpl#getIntegerMapping()
		 * @generated
		 */
		EClass INTEGER_MAPPING = eINSTANCE.getIntegerMapping();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_MAPPING__VALUE = eINSTANCE.getIntegerMapping_Value();

		/**
		 * The meta object literal for the '{@link DFN.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.ApplicationImpl
		 * @see DFN.impl.DFNPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__NETWORK = eINSTANCE.getApplication_Network();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__NODES = eINSTANCE.getApplication_Nodes();

		/**
		 * The meta object literal for the '{@link DFN.impl.InOutPortImpl <em>In Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.impl.InOutPortImpl
		 * @see DFN.impl.DFNPackageImpl#getInOutPort()
		 * @generated
		 */
		EClass IN_OUT_PORT = eINSTANCE.getInOutPort();

		/**
		 * The meta object literal for the '{@link DFN.RelationalSymbols <em>Relational Symbols</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.RelationalSymbols
		 * @see DFN.impl.DFNPackageImpl#getRelationalSymbols()
		 * @generated
		 */
		EEnum RELATIONAL_SYMBOLS = eINSTANCE.getRelationalSymbols();

		/**
		 * The meta object literal for the '{@link DFN.CommProtocol <em>Comm Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DFN.CommProtocol
		 * @see DFN.impl.DFNPackageImpl#getCommProtocol()
		 * @generated
		 */
		EEnum COMM_PROTOCOL = eINSTANCE.getCommProtocol();

	}

} //DFNPackage
