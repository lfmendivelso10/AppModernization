package clusterer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import subkdm.kdmObjects.Cluster;
import subkdm.kdmObjects.CodeItem;
import subkdm.kdmObjects.KdmObjectsFactory;
import subkdm.kdmRelations.ClassLevelRelation;
import subkdm.kdmRelations.TypeRelation;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.DirectedGraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;

public class EJBClusterer {
	
	DirectedGraph<CodeItem, ClassLevelRelation> graph;
	KdmObjectsFactory factory;
	
	public EJBClusterer(){
		graph = new DirectedSparseMultigraph<CodeItem, ClassLevelRelation>();
		factory = KdmObjectsFactory.eINSTANCE;
	}
	
	public void constructGraph(Set<CodeItem> classes, Set<ClassLevelRelation> relations){

		for(CodeItem c : classes){
			graph.addVertex(c);
		}
		
		for(ClassLevelRelation clr : relations){
			graph.addEdge(clr, clr.getFrom(), clr.getTo());
		}
	}
	
	
	public Set<Cluster> makeCluster(Set<CodeItem> ejbs, Set<CodeItem> entities){
		
		Set<Cluster> firstclusters = new HashSet<Cluster>();
		
		DijkstraShortestPath<CodeItem, ClassLevelRelation> sp = 
				new DijkstraShortestPath<CodeItem, ClassLevelRelation>(graph, true);
		
		Set<Set<CodeItem>> allEntityHt = constructHeritageTree(entities);
		
		
		for(CodeItem ejb : ejbs){
			Cluster mod = factory.createCluster();
			mod.setName(ejb.getName());
			
			Set<CodeItem> elementos = new HashSet<CodeItem>();
			
			for(CodeItem elem : getHeritageTree(ejb)){
				elementos.add(elem);
				for(Set<CodeItem> entityHt : allEntityHt)
				{
					for(CodeItem entHtElem : entityHt)
					{
						if(!sp.getPath(elem, entHtElem).isEmpty()){
							elementos.addAll(entityHt);
							for(ClassLevelRelation clr : sp.getPath(elem, entHtElem)){
								elementos.add(clr.getFrom());
								elementos.add(clr.getTo());
							}
						}
					}
				}
			}
			
			List<CodeItem> allNodes = new ArrayList<CodeItem>(graph.getVertices());
			allNodes.removeAll(elementos);
			
			Set<CodeItem> extras = new HashSet<CodeItem>();
			for (CodeItem elem : elementos){
				for(CodeItem item : allNodes)
				{
					for(ClassLevelRelation clr : sp.getPath(elem, item)){
						extras.add(clr.getFrom());
						extras.add(clr.getTo());
					}
						
					for(ClassLevelRelation clr : sp.getPath(item, elem)){
						extras.add(clr.getFrom());
						extras.add(clr.getTo());
					}
				}
			}
			
			elementos.addAll(extras);
			
			mod.getCodeElement().addAll(elementos);
			firstclusters.add(mod);
		}
		
		return firstclusters;
	}
	
	public Set<Set<CodeItem>> constructHeritageTree(Set<CodeItem> ejbs){
		Set<Set<CodeItem>> heritageTrees = new HashSet<Set<CodeItem>>();
		for(CodeItem ejb : ejbs){
			Set<CodeItem> ht = new HashSet<CodeItem>();
			ht = getHeritageTree(ejb);
			heritageTrees.add(ht);
		}
		return heritageTrees;
	}
	
	public Set<CodeItem> getHeritageTree(CodeItem item){
		Set<CodeItem> set = new HashSet<CodeItem>();
		Collection<ClassLevelRelation> allclr = graph.getOutEdges(item);
		
		for(ClassLevelRelation clr: allclr){
			if(isExtensionOrImplementation(clr)){
				System.out.println("-----relación: " + clr.getFrom() + " a " + clr.getTo());
				set.add(clr.getFrom());
				set.addAll(getHeritageTree(clr.getTo()));
			}
		}
		return set;
	}
	
	public boolean isExtensionOrImplementation(ClassLevelRelation clr){
		for(TypeRelation tr: clr.getTypeRelations()){
			if(tr.getName().equalsIgnoreCase("Extends") || tr.getName().equalsIgnoreCase("Implements")){
				return true;
			}
		}
		return false;
	}
	
}
