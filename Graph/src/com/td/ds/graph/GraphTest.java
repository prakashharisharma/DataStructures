package com.td.ds.graph;

public class GraphTest {

	public static void main(String[] args) {
		Graph graph = new Graph(3);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 11);
		graph.addEdge(1, 12);
		graph.addEdge(2, 21);
		graph.addEdge(2, 22);
		
		graph.print();
	}
}
