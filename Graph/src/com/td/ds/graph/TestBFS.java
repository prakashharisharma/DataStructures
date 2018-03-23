package com.td.ds.graph;

public class TestBFS {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		 
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		
		graph.addEdge(1, 0);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		
		graph.addEdge(3, 2);
		graph.addEdge(3, 1);
		graph.addEdge(3, 4);
		
		graph.addEdge(4, 0);
		graph.addEdge(4, 1);
		graph.addEdge(4, 3);
		
		graph.print();
		
        BFS bfs = new BFS(graph);
        
        bfs.traverse(0);
	}
}
