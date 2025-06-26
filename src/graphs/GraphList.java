package graphs;
import java.util.*;

public class GraphList {
    static List<List<Integer>> li = new ArrayList<>();

    public GraphList(int vert) {
        for (int i = 0; i < vert; i++) {
            li.add(new ArrayList<>());
        }
    }
    public static void addedge(int src,int dest) {
    	li.get(src).add(dest);
    	li.get(dest).add(src);
    }
void displayGraph() {
	for(int i=0;i<li.size();i++) {
		System.out.print(i + ": ");
        for (int j = 0; j < li.get(i).size(); j++) {
            System.out.print(li.get(i).get(j) + " ");
        }
        
        System.out.println();
	}
}
	public static void main(String[] args) {
		GraphList g = new GraphList(4);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(0, 3);
        g.addedge(1, 1);
        g.addedge(2, 2);
        g.addedge(1,3);
        g.displayGraph();

	}

}
