package clusterer;

import graph.WeightedGraph;

import java.util.HashSet;
import java.util.Set;

import subkdm.kdmObjects.CodeItem;
import subkdm.kdmRelations.ClassLevelRelation;


public class MSTCluesterCalculation {
	
	WeightedGraph<CodeItem> graph = new WeightedGraph<CodeItem>();
	
	public MSTCluesterCalculation(){
		
	}
	
	public void constructGraph(Set<CodeItem> codeItems){
		for(CodeItem ci:codeItems){
			graph.addVertex(ci);
		}
	}
	
	public void addClassLevelRelation(ClassLevelRelation clr, int peso){
		graph.addEdge(clr.getFrom(), clr.getTo(), 1/peso);
	}
	
	public Set<Set<CodeItem>> getClusters(int k){
		Set<Set<CodeItem>> clusters = new HashSet<Set<CodeItem>>();
		Set<WeightedGraph<CodeItem>> prims = graph.primSubGraphs();
		for(WeightedGraph<CodeItem> subgraph : prims){
			subgraph.removeKMostWeightedEdges(k);
			Set<WeightedGraph<CodeItem>> subprims = subgraph.primSubGraphs();
			for(WeightedGraph<CodeItem> subsub :subprims){
				clusters.add(subsub.getVerticesValues());
			}
		}
		return clusters;
	}
}
