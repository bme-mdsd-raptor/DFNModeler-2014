/**
 */
package DFN.impl;

import DFN.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DFNFactoryImpl extends EFactoryImpl implements DFNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DFNFactory init() {
		try {
			DFNFactory theDFNFactory = (DFNFactory)EPackage.Registry.INSTANCE.getEFactory(DFNPackage.eNS_URI);
			if (theDFNFactory != null) {
				return theDFNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DFNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DFNPackage.DATA_FLOW_NETWORK: return (EObject)createDataFlowNetwork();
			case DFNPackage.NODE: return (EObject)createNode();
			case DFNPackage.CHANNEL: return (EObject)createChannel();
			case DFNPackage.STATE: return (EObject)createState();
			case DFNPackage.STRING_TOKEN: return (EObject)createStringToken();
			case DFNPackage.TRANSITION: return (EObject)createTransition();
			case DFNPackage.NAMED_ELEMENT: return (EObject)createNamedElement();
			case DFNPackage.INEQUALITY: return (EObject)createInequality();
			case DFNPackage.INT_TOKEN: return (EObject)createIntToken();
			case DFNPackage.STRING_TOKEN_LITERAL: return (EObject)createStringTokenLiteral();
			case DFNPackage.IN_PORT: return (EObject)createInPort();
			case DFNPackage.OUT_PORT: return (EObject)createOutPort();
			case DFNPackage.STRING_EQUATION: return (EObject)createStringEquation();
			case DFNPackage.INT_EQUATION: return (EObject)createIntEquation();
			case DFNPackage.APPLICATION: return (EObject)createApplication();
			case DFNPackage.IN_OUT_PORT: return (EObject)createInOutPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DFNPackage.RELATIONAL_SYMBOLS:
				return createRelationalSymbolsFromString(eDataType, initialValue);
			case DFNPackage.COMM_PROTOCOL:
				return createCommProtocolFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DFNPackage.RELATIONAL_SYMBOLS:
				return convertRelationalSymbolsToString(eDataType, instanceValue);
			case DFNPackage.COMM_PROTOCOL:
				return convertCommProtocolToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowNetwork createDataFlowNetwork() {
		DataFlowNetworkImpl dataFlowNetwork = new DataFlowNetworkImpl();
		return dataFlowNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToken createStringToken() {
		StringTokenImpl stringToken = new StringTokenImpl();
		return stringToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inequality createInequality() {
		InequalityImpl inequality = new InequalityImpl();
		return inequality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntToken createIntToken() {
		IntTokenImpl intToken = new IntTokenImpl();
		return intToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTokenLiteral createStringTokenLiteral() {
		StringTokenLiteralImpl stringTokenLiteral = new StringTokenLiteralImpl();
		return stringTokenLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort createInPort() {
		InPortImpl inPort = new InPortImpl();
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort createOutPort() {
		OutPortImpl outPort = new OutPortImpl();
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringEquation createStringEquation() {
		StringEquationImpl stringEquation = new StringEquationImpl();
		return stringEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntEquation createIntEquation() {
		IntEquationImpl intEquation = new IntEquationImpl();
		return intEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutPort createInOutPort() {
		InOutPortImpl inOutPort = new InOutPortImpl();
		return inOutPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSymbols createRelationalSymbolsFromString(EDataType eDataType, String initialValue) {
		RelationalSymbols result = RelationalSymbols.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalSymbolsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommProtocol createCommProtocolFromString(EDataType eDataType, String initialValue) {
		CommProtocol result = CommProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFNPackage getDFNPackage() {
		return (DFNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DFNPackage getPackage() {
		return DFNPackage.eINSTANCE;
	}

} //DFNFactoryImpl
