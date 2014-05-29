/**
 */
package DFN.impl;

import DFN.DFNPackage;
import DFN.InMapping;
import DFN.Node;
import DFN.OutMapping;
import DFN.State;
import DFN.Transition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.TransitionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link DFN.impl.TransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link DFN.impl.TransitionImpl#getIn <em>In</em>}</li>
 *   <li>{@link DFN.impl.TransitionImpl#getOut <em>Out</em>}</li>
 *   <li>{@link DFN.impl.TransitionImpl#getSourcestate <em>Sourcestate</em>}</li>
 *   <li>{@link DFN.impl.TransitionImpl#getTargetstate <em>Targetstate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends CDOObjectImpl implements Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return (Node)eGet(DFNPackage.Literals.TRANSITION__NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		eSet(DFNPackage.Literals.TRANSITION__NODE, newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return (Integer)eGet(DFNPackage.Literals.TRANSITION__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		eSet(DFNPackage.Literals.TRANSITION__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InMapping> getIn() {
		return (EList<InMapping>)eGet(DFNPackage.Literals.TRANSITION__IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OutMapping> getOut() {
		return (EList<OutMapping>)eGet(DFNPackage.Literals.TRANSITION__OUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSourcestate() {
		return (State)eGet(DFNPackage.Literals.TRANSITION__SOURCESTATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcestate(State newSourcestate) {
		eSet(DFNPackage.Literals.TRANSITION__SOURCESTATE, newSourcestate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetstate() {
		return (State)eGet(DFNPackage.Literals.TRANSITION__TARGETSTATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetstate(State newTargetstate) {
		eSet(DFNPackage.Literals.TRANSITION__TARGETSTATE, newTargetstate);
	}

} //TransitionImpl
