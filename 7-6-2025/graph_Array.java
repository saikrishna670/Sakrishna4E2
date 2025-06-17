import java.util.ArrayList;
import java.util.HashSet;
public class graph_Array{
	public static void main(String[] args) {
		Graph graph=new Graph(4);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(0,3);
		graph.addEdge(1,0);
		graph.addEdge(1,2);
		graph.addEdge(2,0);
		graph.addEdge(2,1);
		graph.addEdge(3,0);
		graph.print();
	}
}
class graph_Array{
	ArrayList<HashSet<Integer>>graph;
	int vertices;
	Graph(int vertices) {
		this.vertices=vertices;
		this.graph=new ArrayList<HashSet<Integer>>();
		for(int i=0; i<vertices; i++) {
			graph.add(new HashSet<Integer>());
		}
	}

	void addEdge(int src,int dest) {
		if(isvalid(src,dest)) {
			graph.get(src).add(dest);
			graph.get(dest).add(src);
		}
		else {
			System.out.println("invalid source");
		}

	}
	void removeEdge(int src,int dest) {
		if(isvalid(src,dest)) {
			graph.get(src).remove(dest);
			graph.get(dest).remove(src);
		}
		else {
			System.out.println("invalid source");

		}
	}
	public HashSet<Integer>neibours(int node) {
		return graph.get(node);
	}
	boolean isvalid(int src,int dest) {
		return src>=0&&dest>=0&&src<vertices&&dest<vertices&&src!=dest;
	}
	boolean isHavingEdge(int src,int dest) {
		if(isvalid(src,dest)) {
			var arr=graph.get(src);
			for(int i:arr) {
				if(i==dest) {
					return true;
				}
			}
			return false;
		} else {
			System.out.println("invalid source");
			return false;
		}

	}
	void print() {
		for (int i=0; i<vertices; i++) {
			System.out.println(i+":"+graph.get(i));
		}
	}
}

