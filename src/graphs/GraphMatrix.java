package graphs;
import java.util.*;
public class GraphMatrix {
	static int[][] adjmatrix;
	static int vertices;
	GraphMatrix(int vertices){
		 GraphMatrix.vertices=vertices;
		 GraphMatrix.adjmatrix=new int[vertices][vertices];
		}
	     
	     public static void addEdge(int sor,int dest) {
	    	 adjmatrix[sor][dest]=1;  //if only sor,des it is directed graph
	    	 adjmatrix[dest][sor]=1;
	     }
	     
	     public void display() {
	    	 System.out.println("Adjacency Matrix:");
	    	 for (int i = 0; i < vertices; i++) {
	    		 for (int j = 0; j < vertices; j++) {
	    			 System.out.print(adjmatrix[i][j] + " ");
	    		 }
	    		 System.out.println();
	    	 }
	    	 System.out.println();
	     }
	public static void main(String[] args) {
		  GraphMatrix graph = new GraphMatrix(5);

	       addEdge(0, 1);
	       addEdge(0, 2);
	       addEdge(0,3);
	       addEdge(0,4);
	       addEdge(1, 3);
	       addEdge(3, 4);

	        graph.display();

	}

}
