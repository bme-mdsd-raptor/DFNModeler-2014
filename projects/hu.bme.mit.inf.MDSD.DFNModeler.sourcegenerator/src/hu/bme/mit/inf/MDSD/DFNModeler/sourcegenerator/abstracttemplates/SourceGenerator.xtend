package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates

import DFN.NamedElement
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.helper.GeneratorHelper
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.GeneratorSnippets
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.NetworkSnippets
import java.util.HashSet

abstract class SourceGenerator extends GeneratorSnippets{

	protected String projectName;
	protected HashSet<NamedElement> imps;
	protected NamedElement sourceElement
    protected NetworkSnippets network;

	new(NamedElement element, String projectName, NetworkSnippets network) {
		this.sourceElement = element
		this.imps = new HashSet<NamedElement>()
		this.projectName = projectName;
		this.network = network;
		
	}

	def void generateSources() {

		GeneratorHelper::createJava2File(projectName, null, sourceElement.fullPackageName,
			sourceElement.generatedName + ".java", true, compile, network)

	}

	def CharSequence compile()


}
