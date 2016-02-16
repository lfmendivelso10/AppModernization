package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WeightedGraph<T> {
	// an enum for the three stated used by the Depth first search
    public enum State { UNVISITED, VISITED, COMPLETE };

    // a list to hold all the vertices
    private ArrayList<Vertex> vertexList;

    // list to hold the edges 
    // not really used for anything
    // but display purposes
    private ArrayList<Edge> edgeList;

    public WeightedGraph()
    {
        vertexList = new ArrayList<>();
        edgeList = new ArrayList<>();
    }

    public Set<T> getVerticesValues(){
    	Set<T> values = new HashSet<T>();
    	for(Vertex v: vertexList){
    		values.add(v.getValue());
    	}
    	return values;
    }
    
    public void removeKMostWeightedEdges(int k){
    	if (k < edgeList.size()){
    		while(k>0){
    			removeMostWeightedEdge();
    			k--;
    		}
    	}
    	else{
    		edgeList.clear();
    		/*for(Edge e: edgeList){
    			edgeList.remove(e);
    		}*/
    	}
    }
    
    public void removeMostWeightedEdge(){
    	Edge e = edgeList.get(0);
    	for(Edge ej:edgeList){
    		if(ej.getCost()>e.getCost()){
    			e = ej;
    		}
    	}
    	System.out.println(e.cost);
    	edgeList.remove(e);
    }

    public void addEdge(T x, T y, double cost)
    {
        Edge e = new Edge(x, y, cost);
        edgeList.add(e);
    }
    
    public void addVertex(T x){
    	if(findVertex(x)==null){
	    	Vertex v = new Vertex(x);
	    	vertexList.add(v);
    	}
    }

    public Vertex findVertex(T v)
    {
        for (Vertex each : vertexList)
        {
            if (each.getValue().equals(v))
                return each;
        }
        return null;
    }

    public String toString()
    {
        String retval = "";
        for (Vertex each : vertexList)
        {
            retval += each.toString() + "\n";
        }
        return retval;
    }

    public String edgesToString()
    {
        String retval = "";
        for (Edge each : edgeList)
        {
            retval += each;
        }
        return retval;
    }

    // get first node and call recursive method
    // check if is graph is connected
    public boolean DepthFirstSearch()
    {
    	setAllUnvisited();
        if (vertexList.isEmpty()) return false;

        // get first node
        Vertex root = vertexList.get(0);
        if (root==null) return false;

        // call recursive function
        DepthFirstSearch(root);
        return isConnected();
    }
    

    // recurse through nodes
    private void DepthFirstSearch(Vertex v)
    {
        v.setState(State.VISITED);

        // loop through neighbors
        for (Vertex each : v.getAdjacentList())
        {
            if (each.getState()==State.UNVISITED)
            {
                DepthFirstSearch(each);
            }
        }
        v.setState(State.COMPLETE);
    }

     //test if DFS returned a connected graph
    public boolean isConnected()
    {
        for (Vertex each : vertexList)
        {
            if (each.getState() != State.COMPLETE)
                return false;
        }
        return true;
    }

    // vertex class
    class Vertex
    {
        T value;
        ArrayList<Vertex> adjacent;
        State state;

        public Vertex(T v)
        {
            value = v;
            adjacent = new ArrayList<>();
            state = State.UNVISITED;
        }

        public State getState()
        {
            return state;
        }

        public void setState(State s)
        {
            state = s;
        }

        public T getValue()
        {
            return value;
        }

        public void addNeighbor(Vertex n)
        {
            adjacent.add(n);
        }

        public ArrayList<Vertex> getAdjacentList()
        {
            return adjacent;
        }

        public String toString()
        {
            String retval = "";
            retval += "Vertex: " + value + ":";
            for (Vertex each : adjacent)
            {
                retval += each.getValue() + " ";
            }
            return retval;
        }


    }

    // edge class
    class Edge
    {
        private Vertex x;
		private Vertex y;
        private double cost;
        
        public Vertex getX() {
			return x;
		}


		public void setX(Vertex x) {
			this.x = x;
		}


		public Vertex getY() {
			return y;
		}


		public void setY(Vertex y) {
			this.y = y;
		}


		public double getCost() {
			return cost;
		}


		public void setCost(double cost) {
			this.cost = cost;
		}

        public Edge(T v1, T v2, double cost)
        {
            // check to see if first vertex exists
            x = findVertex(v1);
            if (x == null) 
            {
                // doesn't exist, add new
                x = new Vertex(v1);
                // and add to master list
                vertexList.add(x);
            }
            // same for second vertex
            y = findVertex(v2);
            if (y == null) 
            {
                y = new Vertex(v2);
                vertexList.add(y);
            }
            // add each vertex to the adjacent list for the other
            x.addNeighbor(y);
            y.addNeighbor(x);
            this.cost = cost;

        }


        public String toString()
        {
            return "Edge X:" + x.getValue() + " Y:" + y.getValue() + "\n";
        }


    }
    
    public Set<WeightedGraph<T>> primSubGraphs(){
    	
    	setAllUnvisited();
    	
    	Set<WeightedGraph<T>> primGraphs = new HashSet<WeightedGraph<T>>();
    	ArrayList<Vertex> unvisited = this.vertexList;
    	ArrayList<Vertex> visited = new ArrayList<Vertex>();
    	while(!unvisited.isEmpty()){
    		Vertex initial = unvisited.get(0);
    		visited.add(initial);
    		unvisited.remove(initial);
    		initial.state= State.VISITED;
    		
    		WeightedGraph<T> wg = new WeightedGraph<T>();
    		wg.addVertex(initial.getValue());
    		
    		ArrayList<Edge> visitable = getVisitableEdges(visited);
    		while(!visitable.isEmpty()){
    			Edge e = getLeastCostEdge(visitable);
    			wg.addEdge(e.getX().getValue(), e.getY().getValue(), e.getCost());
    			if(unvisited.contains(e.getX())){
    				visited.add(e.getX());
    				unvisited.remove(e.getX());
    				e.getX().setState(State.VISITED);
    			}
    			else{
    				visited.add(e.getY());
    				unvisited.remove(e.getY());
    				e.getY().setState(State.VISITED);
    			}
    			visitable= getVisitableEdges(visited);
    		}
    		primGraphs.add(wg);
    		
    	}
		return primGraphs;
    }
    
    public ArrayList<Edge> getVisitableEdges(ArrayList<Vertex> visited){
    	ArrayList<Edge> visitable = new ArrayList<Edge>();
    	for(Vertex v :visited ){
    		visitable.addAll(getEdgesVisitable(v));
    	}
    	return visitable;
    }
    
    public ArrayList<Edge> getEdgesVisitable(Vertex v){
    	ArrayList<Edge> es = new ArrayList<Edge>();
    	for(Edge e:edgeList){
    		if(e.getX().equals(v)){
    			if(e.getY().getState().equals(State.UNVISITED)){
    				es.add(e);
    			}
    		}
    		else if (e.getY().equals(v)) {
    			if(e.getX().getState().equals(State.UNVISITED)){
    				es.add(e);
    			}
			}
    	}
    	return es;
    }
    
    public Edge getLeastCostEdge(ArrayList<Edge> edges ){

    	Edge e = edges.get(0);
    	for(Edge ej:edges){
    		if(ej.getCost()<e.getCost()){
    			e = ej;
    		}
    	}
    	
    	return e;
    }
    
    private void setAllUnvisited(){
    	for (Vertex v : vertexList){
    		v.setState(State.UNVISITED);
    	}
    }

	public ArrayList<Vertex> getVertexList() {
		return vertexList;
	}

	public ArrayList<Edge> getEdgeList() {
		return edgeList;
	}
    
    
}
