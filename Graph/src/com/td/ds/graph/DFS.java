package com.td.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	private Graph graph;

	public DFS(Graph graph) {
		this.graph = graph;
	}

	// prints DFS traversal from a given source s
	public void traverse(int s) {

		// Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[this.graph.getNuberOfVertices()];
        
        // Create a stack for DFS
        LinkedList<Integer> stack = new LinkedList<>();
        
        // Push the current source node
        stack.push(s);
        while(stack.size() != 0)
        {
            // Pop a vertex from stack and print it
            s = stack.peek();
            stack.pop();
             
            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            if(!visited[s])
            {
                System.out.print(s + " ");
                visited[s] = true;
            }
             
            // Get all adjacent vertices of the popped vertex s
            // If a adjacent has not been visited, then puah it
            // to the stack.
            Iterator<Integer> itr = this.graph.getAdjacencyList(s).listIterator();
             
            while (itr.hasNext()) 
            {
                int v = itr.next();
                if(!visited[v])
                    stack.push(v);
            }
             
        }
	}
}
