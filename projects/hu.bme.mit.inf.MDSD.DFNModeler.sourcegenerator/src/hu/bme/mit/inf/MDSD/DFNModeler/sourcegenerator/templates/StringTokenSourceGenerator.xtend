package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.NamedElement
import DFN.StringToken
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.SourceGenerator

class StringTokenSourceGenerator extends SourceGenerator {

	new(NamedElement element, String projectName) {
		super(element, projectName)
	}

	override compile() {
		if (sourceElement instanceof StringToken) {
			return compileStringToken(sourceElement);
		}

	}

	def compileStringToken(StringToken element) '''
		package «element.fullPackageName»;
		
		public enum «element.generatedName»{
			«listLiterals(element)»
		}
		
	'''

	def listLiterals(StringToken token) {
		var result = ""
		var first = true;
		for (literal : (token).literals) {
			if (first != true) {
				result = result + ", "
			} else {
				first = false
			}

			result = result + literal.value.sanitize
		}
		result
	}

}
