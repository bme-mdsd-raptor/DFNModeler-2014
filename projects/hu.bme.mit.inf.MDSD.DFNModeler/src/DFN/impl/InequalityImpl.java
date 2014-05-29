/**
 */
package DFN.impl;

import DFN.DFNPackage;
import DFN.InPort;
import DFN.Inequality;
import DFN.IntegerMapping;
import DFN.RelationalSymbols;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inequality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.InequalityImpl#getValue <em>Value</em>}</li>
 *   <li>{@link DFN.impl.InequalityImpl#getPort <em>Port</em>}</li>
 *   <li>{@link DFN.impl.InequalityImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InequalityImpl extends InMappingImpl implements Inequality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InequalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.INEQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return (Integer)eGet(DFNPackage.Literals.INTEGER_MAPPING__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		eSet(DFNPackage.Literals.INTEGER_MAPPING__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getPort() {
		return (InPort)eGet(DFNPackage.Literals.INEQUALITY__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(InPort newPort) {
		eSet(DFNPackage.Literals.INEQUALITY__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalSymbols getKind() {
		return (RelationalSymbols)eGet(DFNPackage.Literals.INEQUALITY__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(RelationalSymbols newKind) {
		eSet(DFNPackage.Literals.INEQUALITY__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IntegerMapping.class) {
			switch (derivedFeatureID) {
				case DFNPackage.INEQUALITY__VALUE: return DFNPackage.INTEGER_MAPPING__VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IntegerMapping.class) {
			switch (baseFeatureID) {
				case DFNPackage.INTEGER_MAPPING__VALUE: return DFNPackage.INEQUALITY__VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InequalityImpl
