/**
 */
package DFN.impl;

import DFN.Application;
import DFN.DFNPackage;
import DFN.DataFlowNetwork;
import DFN.Mapping;
import DFN.Node;
import DFN.State;
import DFN.Token;
import DFN.Transition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.NodeImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.impl.NodeImpl#getStates <em>States</em>}</li>
 *   <li>{@link DFN.impl.NodeImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link DFN.impl.NodeImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link DFN.impl.NodeImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link DFN.impl.NodeImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link DFN.impl.NodeImpl#getApp <em>App</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EndPointImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowNetwork getNetwork() {
		return (DataFlowNetwork)eGet(DFNPackage.Literals.NODE__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(DataFlowNetwork newNetwork) {
		eSet(DFNPackage.Literals.NODE__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<State> getStates() {
		return (EList<State>)eGet(DFNPackage.Literals.NODE__STATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		return (State)eGet(DFNPackage.Literals.NODE__INITIAL_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		eSet(DFNPackage.Literals.NODE__INITIAL_STATE, newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Token> getTokens() {
		return (EList<Token>)eGet(DFNPackage.Literals.NODE__TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eGet(DFNPackage.Literals.NODE__TRANSITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Mapping> getMappings() {
		return (EList<Mapping>)eGet(DFNPackage.Literals.NODE__MAPPINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApp() {
		return (Application)eGet(DFNPackage.Literals.NODE__APP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(Application newApp) {
		eSet(DFNPackage.Literals.NODE__APP, newApp);
	}

} //NodeImpl
