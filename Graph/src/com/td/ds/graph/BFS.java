package com.td.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS<T> {

	private Graph graph;
	
	public BFS(Graph graph){
		this.graph = graph;
	}
	
	// prints BFS traversal from a given source s
	public void traverse(int s) {

        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[this.graph.getNuberOfVertices()];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        
        queue.add(s);
        
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = this.graph.getAdjacencyList(s).listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
	}
		
}
