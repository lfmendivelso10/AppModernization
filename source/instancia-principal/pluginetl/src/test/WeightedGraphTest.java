package test;

import java.util.Set;
import graph.WeightedGraph;
import junit.framework.TestCase;

public class WeightedGraphTest extends TestCase {

	WeightedGraph<String> wg;
	
	private void setupScenario1(){
		wg = new WeightedGraph<String>();
		wg.addVertex("A");
		wg.addVertex("B");
		wg.addVertex("C");
		wg.addVertex("D");
		wg.addVertex("E");
		
		wg.addEdge("A", "B", 4);
		wg.addEdge("A", "D", 5);
		wg.addEdge("A", "C", 6);
		wg.addEdge("C", "B", 5);
		wg.addEdge("D", "B", 2);
		wg.addEdge("C", "D", 1);
		wg.addEdge("B", "E", 4);
		wg.addEdge("D", "E", 3);
	}
	
	private void setupScenario2(){
		wg = new WeightedGraph<String>();
		wg.addVertex("A");
		wg.addVertex("B");
		wg.addVertex("C");
		wg.addVertex("D");
		wg.addVertex("E");
		
		wg.addEdge("A", "B", 4);
		wg.addEdge("A", "D", 5);
		wg.addEdge("A", "C", 6);
		wg.addEdge("C", "B", 5);
		wg.addEdge("D", "B", 2);
		wg.addEdge("C", "D", 1);
		wg.addEdge("B", "E", 4);
		wg.addEdge("D", "E", 3);
		
		wg.addVertex("F");
		wg.addVertex("G");
		wg.addVertex("H");
		wg.addVertex("I");
		wg.addVertex("J");
		
		wg.addEdge("F", "G", 3);
		wg.addEdge("F", "H", 4);
		wg.addEdge("F", "I", 5);
		wg.addEdge("H", "G", 4);
		wg.addEdge("I", "G", 2);
		wg.addEdge("H", "I", 1);
		wg.addEdge("G", "J", 3);
		wg.addEdge("I", "J", 2);
	}
	
	public void testPrim(){
		setupScenario1();
		System.out.println(wg.getEdgeList().size()==8);
		assertTrue(wg.getEdgeList().size()==8);
		System.out.println(wg.getVertexList().size()==5);
		assertTrue(wg.getVertexList().size()==5);
		System.out.println("inicia prim");
		Set<WeightedGraph<String>> result = wg.primSubGraphs();
		System.out.println("finaliza prim");
		assertTrue(result.size()==1);
		WeightedGraph<String> prim = result.iterator().next();
		assertTrue(prim.getEdgeList().size()==4);
		assertTrue(prim.getVertexList().size()==5);
		System.out.println(prim.DepthFirstSearch());
		assertTrue(prim.DepthFirstSearch());
		
		prim.removeKMostWeightedEdges(2);
		
		Set<WeightedGraph<String>> sub = prim.primSubGraphs();
		assertTrue(sub.size()==3);
		for(WeightedGraph<String> a : sub){
			System.out.println(a.getVerticesValues());
		}
	}
	
	public void testPrim2(){
		setupScenario2();
		System.out.println(wg.getEdgeList().size()==16);
		assertTrue(wg.getEdgeList().size()==16);
		System.out.println(wg.getVertexList().size()==10);
		assertTrue(wg.getVertexList().size()==10);
		System.out.println("inicia prim");
		Set<WeightedGraph<String>> result = wg.primSubGraphs();
		System.out.println("finaliza prim");
		assertTrue(result.size()==2);
		WeightedGraph<String> prim = result.iterator().next();
		assertTrue(prim.getEdgeList().size()==4);
		assertTrue(prim.getVertexList().size()==5);
		System.out.println(prim.DepthFirstSearch());
		assertTrue(prim.DepthFirstSearch());
		

		WeightedGraph<String> prim2 = result.iterator().next();
		assertTrue(prim2.getEdgeList().size()==4);
		assertTrue(prim2.getVertexList().size()==5);
		System.out.println(prim2.DepthFirstSearch());
		assertTrue(prim2.DepthFirstSearch());
	}
}
