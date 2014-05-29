package hu.bme.mit.raptor.graphgenerator.templates

import DFN.DataFlowNetwork
import DFN.Node
import hu.bme.mit.raptor.graphgenerator.helper.GeneratorHelper
import java.util.HashMap
import DFN.NamedElement
import DFN.Channel
import DFN.Token
import DFN.State
import DFN.Transition
import DFN.Application
import DFN.Port
import DFN.OutPort
import DFN.InPort
import DFN.InOutPort

/**
 * 
 */
class GraphMLGenerator {
	private HashMap<String,Double> stateSizeForNode;
	private boolean is_yEd;
	private int titleSize = 20;
	
	def generateGraphML(DataFlowNetwork dataModel, boolean is_yEd) {
		this.is_yEd=is_yEd;
		stateSizeForNode = new HashMap<String, Double>();
		stateSizeCalculator(dataModel)
		
		GeneratorHelper::createGraphMLFile(dataModel.eResource, dataModel.name, true, is_yEd, dataModel.compile)
	}
	
	private def stateSizeCalculator(DataFlowNetwork dataModel) {
		for(node : dataModel.nodes) {
			var length = 0 as double
			for(state : node.states) {
				if(state.name.toCharArray.size>length)
					length = state.name.toCharArray.size
			}
			if(length*6.5>30) {
				stateSizeForNode.put(node.fullyQualifiedName,length*6.5)
			}
			else {
				stateSizeForNode.put(node.fullyQualifiedName,30.0);
			}
		}
		for(network : dataModel.ownedDFNs) {
			stateSizeCalculator(network);
		}
	}
	
	private def String fullyQualifiedName(NamedElement element) {
		if (element instanceof DataFlowNetwork) {
			return '''«(element as DataFlowNetwork).network.fullyQualifiedName»_«(element as DataFlowNetwork).name»'''
		}
		if (element instanceof Node) {
			return '''«(element as Node).network.fullyQualifiedName»_«(element as Node).name»'''
		}
		if (element instanceof Channel) {
			return '''«(element as Channel).network.fullyQualifiedName»_«(element as Channel).name»'''
		}
		if (element instanceof State) {
			return '''«(element as State).node.fullyQualifiedName»_«(element as State).name»'''
		}
		if (element instanceof Token) {
			return '''«(element as Token).network.fullyQualifiedName»_«(element as Token).name»'''
		}
		if (element instanceof Application) {
			return '''«(element as Application).network.fullyQualifiedName»_«(element as Application).name»'''
		}
		if (element instanceof InOutPort) {
			return '''«(element as InOutPort).endpoint.fullyQualifiedName»«(element as InOutPort).eClass.name»_«(element as InOutPort).name»'''
		}
		if (element instanceof OutPort) {
			return '''«(element as OutPort).endpoint.fullyQualifiedName»«(element as OutPort).eClass.name»_«(element as OutPort).name»'''
		}
		if (element instanceof InPort) {
			return '''«(element as InPort).endpoint.fullyQualifiedName»«(element as InPort).eClass.name»_«(element as InPort).name»'''
		}
	}
	
	private def compile(DataFlowNetwork network) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<graphml xmlns="http://graphml.graphdrawing.org/xmlns" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				«IF is_yEd»
				xmlns:y="http://www.yworks.com/xml/graphml"
				«ENDIF»
				xsi:schemaLocation="http://graphml.graphdrawing.org/xmlns http://graphml.graphdrawing.org/xmlns/1.0/graphml.xsd">
			«IF is_yEd»
			<key id="d0" for="node" yfiles.type="nodegraphics"/>
			<key id="d1" for="node" attr.name="description" attr.type="string"/>
			<key id="d2" for="edge" yfiles.type="edgegraphics"/>
			<key id="d3" for="node" attr.name="ip:port" attr.type="string"/>
			«ENDIF»
			<graph id="Root «network.fullyQualifiedName»" edgedefault="directed">
			«network.writeOutDFN»
			</graph>
		</graphml>
	'''
	
	private def writeOutDFN(DataFlowNetwork network)'''
			<node id="«network.fullyQualifiedName»">
				«IF is_yEd»
				<data key="d0">
					<y:ShapeNode>
						<y:Fill color="#33FF3344" transparent="false"/>
						<y:NodeLabel alignment="center" autoSizePolicy="content" modelName="internal" modelPosition="tl" fontSize="«titleSize»">«network.name»</y:NodeLabel>
					</y:ShapeNode>
				</data>
				«ENDIF»
				«FOR nport : network.ports»
					<port name="«nport.fullyQualifiedName»"/>
				«ENDFOR»
				<graph id="Graph «network.fullyQualifiedName»">
					«FOR node : network.nodes»
						«node.writeOutNode»
					«ENDFOR»
					«FOR dfn : network.ownedDFNs»
						«dfn.writeOutDFN»
					«ENDFOR»
					«FOR app : network.apps»
						«app.writeOutApp»
					«ENDFOR»
					«FOR channel : network.channels»
						<edge id="«channel.fullyQualifiedName»" source="«channel.source.endpoint.fullyQualifiedName»" target="«channel.target.endpoint.fullyQualifiedName»"
								sourceport="«channel.source.fullyQualifiedName»" targetport="«channel.target.fullyQualifiedName»">
							«IF is_yEd»
							<data key="d2">
								<y:PolyLineEdge>
									<y:EdgeLabel>«channel.token.name»</y:EdgeLabel>
									<y:LineStyle color="#000000" type="line" width="5.0"/>
									<y:Arrows source="none" target="delta"/>
								</y:PolyLineEdge>
							</data>
							«ENDIF»
						</edge>
					«ENDFOR»
				</graph>
			</node>
	'''
	
	private def writeOutApp(Application app)'''
						<node id="«app.fullyQualifiedName»">
							«IF is_yEd»
							<data key="d0">
								<y:ShapeNode>
									<y:Fill color="#FF5555FF" transparent="false"/>
									<y:Geometry width="«app.name.length*6.3+20»" height="60"/>
									<y:NodeLabel alignment="center" autoSizePolicy="content" modelName="internal" modelPosition="t" visible="true" underlinedText="true">«app.name»</y:NodeLabel>
«««									<y:NodeLabel alignment="left" autoSizePolicy="content" modelName="internal" modelPosition="l" hasBackgroundColor="false" visible="true">ip: «app.IP»</y:NodeLabel>
«««									<y:NodeLabel alignment="left" autoSizePolicy="content" modelName="internal" modelPosition="bl" hasBackgroundColor="false" visible="true">port: «app.port»</y:NodeLabel>
								</y:ShapeNode>
							</data>
«««							<data key="d3"><![CDATA[«app.IP»:«app.port»]]></data>
							«ENDIF»
						</node>
						«FOR nodeInApp: app.nodes»
						<edge source="«app.fullyQualifiedName»" target="«nodeInApp.fullyQualifiedName»">
							«IF is_yEd»
							<data key="d2">
								<y:PolyLineEdge>
									<y:LineStyle color="#000000" type="line" width="1.0"/>
									<y:Arrows source="diamond" target="none"/>
								</y:PolyLineEdge>
							</data>
							«ENDIF»
						</edge>
						«ENDFOR»
	'''
	
	private def writeOutNode(Node node)'''
						<node id="«node.fullyQualifiedName»">
							«IF is_yEd»
							<data key="d0">
								<y:ShapeNode>
									<y:Fill color="#FFFFFF" transparent="false"/>
									<y:NodeLabel alignment="center" autoSizePolicy="content" modelName="internal" modelPosition="tl">«node.name»</y:NodeLabel>
								</y:ShapeNode>
							</data>
							<data key="d1"><![CDATA[Tokens:«FOR token : node.tokens» «token.name»«IF node.tokens.last!=token»,«ENDIF»«ENDFOR»]]></data>
							«ENDIF»
							«FOR port : node.ports»
								<port name="«port.fullyQualifiedName»"/>
							«ENDFOR»
							<graph id="Graph «node.fullyQualifiedName»">
								«FOR state : node.states»
									<node id="«state.fullyQualifiedName»">
										«IF is_yEd»
										<data key="d0">
											<y:ShapeNode>
												<y:Geometry height="«(stateSizeForNode.get(node.fullyQualifiedName)).intValue+2».0" width="«(stateSizeForNode.get(node.fullyQualifiedName)).intValue+2».0"/>
												<y:NodeLabel alignment="center" autoSizePolicy="content" modelName="internal" modelPosition="c">«state.name»</y:NodeLabel>
												<y:Shape type="ellipse"/>
												«IF node.initialState==state»
												<y:BorderStyle color="#000000" type="line" width="3.0"/>
												«ENDIF»
											</y:ShapeNode>
										</data>
										«ENDIF»
									</node>
								«ENDFOR»
								«FOR transition : node.transitions»
									<edge source="«transition.sourcestate.fullyQualifiedName»" target="«transition.targetstate.fullyQualifiedName»">
«««	Túl hosszúak a kiírások, átláthatatlan lesz
«««										<data key="d1">
«««											<y:PolyLineEdge>
«««												<y:EdgeLabel>«FOR in : transition.in»«IF in instanceof StringEquation»«(in as StringEquation).literal.value»«ELSEIF in instanceof Inequality»«(in as Inequality).value»«ENDIF»«IF transition.in.last!=in»,«ENDIF»«ENDFOR»/«FOR out : transition.out»«out.name»«IF transition.out.last!=out»,«ENDIF»«ENDFOR»</y:EdgeLabel>
«««												<y:Arrows source="none" target="standard"/>
«««											</y:PolyLineEdge>
«««										</data>
									</edge>
								«ENDFOR»
							</graph>
						</node>
	'''

	
}