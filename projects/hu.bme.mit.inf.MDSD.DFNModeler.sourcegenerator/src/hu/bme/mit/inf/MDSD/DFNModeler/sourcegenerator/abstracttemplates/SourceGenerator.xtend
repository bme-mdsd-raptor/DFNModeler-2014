package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates

import DFN.NamedElement
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.helper.GeneratorHelper
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.GeneratorSnippets
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.MQTTSnippets
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.NetworkSnippets
import java.util.HashSet

abstract class SourceGenerator extends GeneratorSnippets{

	protected String projectName;
	protected HashSet<NamedElement> imps;
	protected NamedElement sourceElement
    protected NetworkSnippets network = new MQTTSnippets();

	new(NamedElement element, String projectName) {
		this.sourceElement = element
		this.imps = new HashSet<NamedElement>()
		this.projectName = projectName;
	}

	def void generateSources() {

		GeneratorHelper::createJava2File(projectName, null, sourceElement.fullPackageName,
			sourceElement.generatedName + ".java", true, compile)

	}

	def CharSequence compile()


}
