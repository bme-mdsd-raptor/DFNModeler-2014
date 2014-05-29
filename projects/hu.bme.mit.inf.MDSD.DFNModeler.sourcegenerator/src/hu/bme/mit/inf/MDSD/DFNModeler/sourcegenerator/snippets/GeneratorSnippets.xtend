package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets

import DFN.Application
import DFN.Channel
import DFN.DataFlowNetwork
import DFN.EndPoint
import DFN.InOutPort
import DFN.InPort
import DFN.Mapping
import DFN.NamedElement
import DFN.Node
import DFN.OutPort
import DFN.Port
import DFN.StringTokenLiteral
import DFN.Token
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet

abstract class GeneratorSnippets {

	def String classPostFix(NamedElement element) { //the postfix from classname

		if (element instanceof DataFlowNetwork) {
			return "DFN"
		}
		if (element instanceof Token) {
			return "Token"
		}
		if (element instanceof Node) {
			return "Node"
		}
		if (element instanceof Channel) {
			return "Channel"
		}
		if (element instanceof InPort) {
			return "InPort"
		}
		if (element instanceof OutPort) {
			return "OutPort"
		}
		""
	}

	def sanitize(String str) {
		str.replaceAll("[^a-zA-Z0-9]", "")
	}

	def compileClass(NamedElement element,String packageName, String content, Collection<NamedElement> imps) '''	
		package «packageName»;
			
		«compileImports(element, imps)»
		
		public class «element.generatedName»
		{
			«content»
		}
	'''

	def compileImports(NamedElement node, Collection<NamedElement> imps) '''
		«FOR imp : imps»
			«IF imp.fullPackageName != node.fullPackageName»
				import «imp.fullPackageName».«imp.generatedName»;
			«ENDIF»
		«ENDFOR»
	'''

	def String instanceName(NamedElement element) { // the name used when naming an instance, which is an entity in the instancemodel
		element.generatedName + "Instance"
	}

	def String fullPackageName(NamedElement element) { // renders the full package name of an element
		var name = element.generatedName + "Package"

		if (element instanceof Channel) {
			return element.getNetwork().fullPackageName()
		} else if (element instanceof Node) {
			return element.getNetwork().fullPackageName()
		} else if (element instanceof Mapping) {
			return element.getNode().fullPackageName()
		} else if (element instanceof Token) {
			return element.getNetwork().fullPackageName()
		}

		return name
	}

	def String declarationName(NamedElement element, HashSet<NamedElement> imps) { //used only for declaration, also populates the imports
		imps.add(element)
		generatedName(element)
	}

	def Application getApp(NamedElement element) {
		if (element instanceof Application) {
			return element;
		} else if (element instanceof Node) {
			return element.app;
		} else if (element instanceof Channel) {
			return element.target.endpoint.getApp;
		}
		return null
	}

	def String generatedName(NamedElement element) { //general name for an instancemodel entity 
		element.name.sanitize + element.classPostFix
	}

	def String literalName(StringTokenLiteral element) { // the full name of a literal 
		"" + element.stringtoken.generatedName + "." + element.value.sanitize;
	}

	def Node getTo(Channel c) {
		var endpoint = c.target.endpoint
		if (endpoint instanceof Node) {
			return endpoint
		}
		var target = c.target
		if (target instanceof InOutPort) {
			return getTo(target.out)
		}

		return null;

	}

	def Node getFrom(Channel c) {
		var endpoint = c.source.endpoint
		if (endpoint instanceof Node) {
			return endpoint
		}
		var source = c.source
		if (source instanceof InOutPort) {
			return getTo(source.in)
		}
		return null;

	}

	def Application getToApp(Channel c) {
		var node = getTo(c)
		if (node == null) {
			return null
		}
		return node.app;

	}

	def Application getFromApp(Channel c) {
		var node = getFrom(c)
		if (node == null) {
			return null
		}
		return node.app;

	}

	def boolean inApp(Application app, NamedElement element) {
		if (element instanceof Channel) {
			return app == element.target.endpoint.getApp || app == element.source.endpoint.getApp ||
				element.target.endpoint instanceof Channel || element.source.endpoint instanceof Channel
		}
		return app == element.getApp
	}

	def Channel getChannel(Port port) {
		if (port instanceof OutPort)
			return port.out
		else if (port instanceof InPort)
			return port.in
	}
	def getInPorts(EndPoint element) {
		var list = new ArrayList<InPort>
		for (port : element.ports)
			if (port instanceof InPort)
				if (inApp(element.getApp(), port.channel))
					list.add(port)
		list
	}
}
