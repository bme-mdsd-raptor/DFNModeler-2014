/**
 */
package DFN.impl;

import DFN.Application;
import DFN.Channel;
import DFN.CommProtocol;
import DFN.DFNPackage;
import DFN.DataFlowNetwork;
import DFN.Node;
import DFN.Token;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getOwnedDFNs <em>Owned DF Ns</em>}</li>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getApps <em>Apps</em>}</li>
 *   <li>{@link DFN.impl.DataFlowNetworkImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataFlowNetworkImpl extends EndPointImpl implements DataFlowNetwork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.DATA_FLOW_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getNodes() {
		return (EList<Node>)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Channel> getChannels() {
		return (EList<Channel>)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__CHANNELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Token> getTokens() {
		return (EList<Token>)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__TOKENS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataFlowNetwork> getOwnedDFNs() {
		return (EList<DataFlowNetwork>)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__OWNED_DF_NS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowNetwork getNetwork() {
		return (DataFlowNetwork)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(DataFlowNetwork newNetwork) {
		eSet(DFNPackage.Literals.DATA_FLOW_NETWORK__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Application> getApps() {
		return (EList<Application>)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__APPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommProtocol getProtocol() {
		return (CommProtocol)eGet(DFNPackage.Literals.DATA_FLOW_NETWORK__PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(CommProtocol newProtocol) {
		eSet(DFNPackage.Literals.DATA_FLOW_NETWORK__PROTOCOL, newProtocol);
	}

} //DataFlowNetworkImpl
