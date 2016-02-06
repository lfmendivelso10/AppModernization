package clusterer;


import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import subkdm.kdmObjects.CodeItem;
import subkdm.kdmRelations.ClassLevelRelation;
import edu.uci.ics.jung.algorithms.cluster.EdgeBetweennessClusterer;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
public class ClusterCalculation {

	protected EObject segment;
	
	protected Set<CodeItem> classes;
	
	protected Set<ClassLevelRelation> relations;
	
	public Set<CodeItem> getClasses() {
		return classes;
	}

	public void setClasses(Set<CodeItem> classes) {
		this.classes = classes;
	}

	public Set<ClassLevelRelation> getRelations() {
		return relations;
	}

	public void setRelations(Set<ClassLevelRelation> relations) {
		this.relations = relations;
	}

	
	public EObject getSegment() {
		return segment;
	}
	
	public void setSegment(EObject segment) {
		System.out.println(segment.toString());
		this.segment = segment;
	}

	public String sayHello(){
		System.out.println("HOLA DESDE CLUSTERTOOL con print");
		return "HOLA DESDE CLUSTERTOOL";
	}
	
	
	public Set<Set<CodeItem>> clusteringAlgorithm(Set<ClassLevelRelation> rel) {
		Graph<CodeItem, ClassLevelRelation> grp = new SparseMultigraph<CodeItem, ClassLevelRelation>();
		for (CodeItem c : classes) {
			grp.addVertex(c);
		}

		for (ClassLevelRelation clr : rel ) {
			grp.addEdge(clr, (CodeItem) clr.getFrom(),
					(CodeItem) clr.getTo());
		}

		EdgeBetweennessClusterer<CodeItem, ClassLevelRelation> clusterer = 
				new EdgeBetweennessClusterer<CodeItem, ClassLevelRelation>(
						rel.size() / 8);
		
		Set<Set<CodeItem>> clusterSet = clusterer.transform(grp);

		return clusterSet;
	}
}
