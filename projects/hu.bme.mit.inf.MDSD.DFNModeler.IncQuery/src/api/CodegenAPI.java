package api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import DFN.DataFlowNetwork;
import DFN.InPort;
import DFN.Inequality;
import DFN.IntEquation;
import DFN.Node;
import DFN.OutPort;
import DFN.State;
import DFN.StringEquation;
import DFN.Transition;
import codegen.GetDFNSMatch;
import codegen.GetDFNSMatcher;
import codegen.GetInPortIntEquationByTransitionMatch;
import codegen.GetInPortIntEquationByTransitionMatcher;
import codegen.GetInPortStringEquationByTransitionMatch;
import codegen.GetInPortStringEquationByTransitionMatcher;
import codegen.GetInequalityByTransitionMatch;
import codegen.GetInequalityByTransitionMatcher;
import codegen.GetNodesMatch;
import codegen.GetNodesMatcher;
import codegen.GetNodesStateMatch;
import codegen.GetNodesStateMatcher;
import codegen.GetOutPortIntEquationByTransitionMatch;
import codegen.GetOutPortIntEquationByTransitionMatcher;
import codegen.GetOutPortStringEquationByTransitionMatch;
import codegen.GetOutPortStringEquationByTransitionMatcher;
import codegen.GetOutPortsByNodeMatch;
import codegen.GetOutPortsByNodeMatcher;
import codegen.GetTransitionsByPortMatch;
import codegen.GetTransitionsByPortMatcher;



public class CodegenAPI {
	
	public static List<DataFlowNetwork> getDFNs(Resource res){
		List<DataFlowNetwork> dfns = new ArrayList<DataFlowNetwork>();
		
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetDFNSMatcher matcher = GetDFNSMatcher.on(engine);
			
			Collection<GetDFNSMatch> allMatches = matcher.getAllMatches();
			
			for (GetDFNSMatch dfnMatch : allMatches) {
				//get the parameter from the match
				dfns.add(dfnMatch.getD());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		
		
		return dfns;
	}
	
	
	public static List<Node> getNodes(Resource res){
		List<Node> nodes = new ArrayList<Node>();
		
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetNodesMatcher matcher = GetNodesMatcher.on(engine);
			
			Collection<GetNodesMatch> allMatches = matcher.getAllMatches();
			
			for (GetNodesMatch dfnMatch : allMatches) {
				//get the parameter from the match
				nodes.add(dfnMatch.getN());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return nodes;
	}
	
	public static Map<State, Node> getNodeStatePairs(Resource res){
		Map<State, Node> pairs = new HashMap<State, Node>();
		
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetNodesStateMatcher matcher = GetNodesStateMatcher.on(engine);
			
			Collection<GetNodesStateMatch> allMatches = matcher.getAllMatches();
			
			for (GetNodesStateMatch pairmatch : allMatches) {
				//number of the parameter in the pattern parameter list
				pairs.put(pairmatch.getS(), pairmatch.getN());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return pairs;
	}

	
	public static List<Transition> getTransitionsByInPort(Resource res, InPort port){
		List<Transition> transitions = new ArrayList<Transition>();
		
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetTransitionsByPortMatcher matcher = GetTransitionsByPortMatcher.on(engine);
			
			Collection<GetTransitionsByPortMatch> allMatches = matcher.getAllMatches(port, null);
			
			
			for (GetTransitionsByPortMatch dfnMatch : allMatches) {
				//get the parameter from the match
				transitions.add(dfnMatch.getT());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return transitions;
	}

	public static List<StringEquation> getInPortStringEquationByTransition(Resource res, Transition trans){
		List<StringEquation> equations = new ArrayList<StringEquation>();
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetInPortStringEquationByTransitionMatcher matcher = GetInPortStringEquationByTransitionMatcher.on(engine);
			
			Collection<GetInPortStringEquationByTransitionMatch> allMatches = matcher.getAllMatches(trans, null);
			
			
			for (GetInPortStringEquationByTransitionMatch dfnMatch : allMatches) {
				//get the parameter from the match
				equations.add((StringEquation)dfnMatch.getS());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return equations;
	}
	public static List<IntEquation> getInPortIntEquationByTransition(Resource res, Transition trans){
		List<IntEquation> equations = new ArrayList<IntEquation>();
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetInPortIntEquationByTransitionMatcher matcher = GetInPortIntEquationByTransitionMatcher.on(engine);
			
			Collection<GetInPortIntEquationByTransitionMatch> allMatches = matcher.getAllMatches(trans, null);
			
			
			for (GetInPortIntEquationByTransitionMatch dfnMatch : allMatches) {
				//get the parameter from the match
				equations.add((IntEquation)dfnMatch.getS());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return equations;
	}

	public static List<Inequality> getInequalityByTransition(Resource res, Transition trans){
		List<Inequality> equations = new ArrayList<Inequality>();
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetInequalityByTransitionMatcher matcher = GetInequalityByTransitionMatcher.on(engine);
			
			Collection<GetInequalityByTransitionMatch> allMatches = matcher.getAllMatches(trans, null);
			
			
			for (GetInequalityByTransitionMatch dfnMatch : allMatches) {
				//get the parameter from the match
				equations.add((Inequality)dfnMatch.getS());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return equations;
	}
	
	public static List<OutPort> getOutPortsByNode(Resource res, Node node){
		List<OutPort> ports = new ArrayList<OutPort>();
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetOutPortsByNodeMatcher matcher = GetOutPortsByNodeMatcher.on(engine);
			
			Collection<GetOutPortsByNodeMatch> allMatches = matcher.getAllMatches(node, null);
			
			
			for (GetOutPortsByNodeMatch dfnMatch : allMatches) {
				//get the parameter from the match
				ports.add((OutPort)dfnMatch.getO());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return ports;
	}
	
	
	public static List<StringEquation> getOutPortStringEquationByTransition(Resource res, Transition trans){
		List<StringEquation> equations = new ArrayList<StringEquation>();
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetOutPortStringEquationByTransitionMatcher matcher = GetOutPortStringEquationByTransitionMatcher.on(engine);
			
			Collection<GetOutPortStringEquationByTransitionMatch> allMatches = matcher.getAllMatches(trans, null);
			
			
			for (GetOutPortStringEquationByTransitionMatch dfnMatch : allMatches) {
				//get the parameter from the match
				equations.add((StringEquation)dfnMatch.getS());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return equations;
	}
	public static List<IntEquation> getOutPortIntEquationByTransition(Resource res, Transition trans){
		List<IntEquation> equations = new ArrayList<IntEquation>();
		try {
			IncQueryEngine engine = IncQueryEngine.on(res);
			
			GetOutPortIntEquationByTransitionMatcher matcher = GetOutPortIntEquationByTransitionMatcher.on(engine);
			
			Collection<GetOutPortIntEquationByTransitionMatch> allMatches = matcher.getAllMatches(trans, null);
			
			
			for (GetOutPortIntEquationByTransitionMatch dfnMatch : allMatches) {
				//get the parameter from the match
				equations.add((IntEquation)dfnMatch.getS());
			}
		} catch (IncQueryException e) {
			System.err.println("Could not initiate incquery engine on the given resource");
			e.printStackTrace();
		}
		
		return equations;
	}

	
	
}
