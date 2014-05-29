/**
 */
package DFN.impl;

import DFN.Channel;
import DFN.DFNPackage;
import DFN.DataFlowNetwork;
import DFN.InPort;
import DFN.OutPort;
import DFN.Token;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.ChannelImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.impl.ChannelImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link DFN.impl.ChannelImpl#getSource <em>Source</em>}</li>
 *   <li>{@link DFN.impl.ChannelImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends NamedElementImpl implements Channel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowNetwork getNetwork() {
		return (DataFlowNetwork)eGet(DFNPackage.Literals.CHANNEL__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(DataFlowNetwork newNetwork) {
		eSet(DFNPackage.Literals.CHANNEL__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getTarget() {
		return (InPort)eGet(DFNPackage.Literals.CHANNEL__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InPort newTarget) {
		eSet(DFNPackage.Literals.CHANNEL__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getSource() {
		return (OutPort)eGet(DFNPackage.Literals.CHANNEL__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutPort newSource) {
		eSet(DFNPackage.Literals.CHANNEL__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getToken() {
		return (Token)eGet(DFNPackage.Literals.CHANNEL__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(Token newToken) {
		eSet(DFNPackage.Literals.CHANNEL__TOKEN, newToken);
	}

} //ChannelImpl
