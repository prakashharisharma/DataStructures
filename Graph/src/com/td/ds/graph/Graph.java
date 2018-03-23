package com.td.ds.graph;

import java.util.LinkedList;

//This class represents a directed graph using adjacency list
//representation
public class Graph {

	private int V; // No. of vertices

	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	@SuppressWarnings("unchecked")
	Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<Integer>();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list.
	}
	
	public int getNuberOfVertices() {
		return this.V;
	}
	
	public LinkedList<Integer> getAdjacencyList(int n){
		return adj[n];
	}
	
	public void print() {
		int i=0;
		for(LinkedList<Integer> verTices : adj) {
			System.out.print(i +" -> ");
			for(Integer t : verTices) {
				System.out.print(t + " ");
			}
			i++;
			System.out.println();
		}
	}
	
}
