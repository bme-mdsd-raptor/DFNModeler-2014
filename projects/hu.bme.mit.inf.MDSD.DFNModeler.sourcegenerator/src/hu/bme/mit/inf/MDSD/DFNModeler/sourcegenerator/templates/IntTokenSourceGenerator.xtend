package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.IntToken
import DFN.NamedElement
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.SourceGenerator

/**
 * 
 */
class IntTokenSourceGenerator extends SourceGenerator {

	new(NamedElement element, String projectName) {
		super(element, projectName)
	}

	override compile() {
		if (sourceElement instanceof IntToken) {
			return compileIntToken(sourceElement);
		}

	}

	def compileIntToken(IntToken element) '''
		package «element.fullPackageName»;
		
		
		public class «element.generatedName»
		{
				int value;
				
				public int getValue() {
					return value;
				}
		
		
				public void setValue(int value) {
					this.value = value;
				}
				
				public «element.generatedName»(int value) {
					this.value = value;
				}
		}
	'''
}
