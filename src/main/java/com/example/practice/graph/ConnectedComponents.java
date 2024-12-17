package com.example.practice.graph;

import java.util.*;

	public class ConnectedComponents {
	    private int V; // Number of vertices
	    private LinkedList<Integer>[] adj; // Adjacency list

	    // Constructor
	    ConnectedComponents(int v) {
	        V = v;
	        adj = new LinkedList[v];
	        for (int i = 0; i < v; ++i)
	            adj[i] = new LinkedList();
	    }

	    // Function to add an edge into the graph
	    void addEdge(int v, int w) {
	        adj[v].add(w);
	        adj[w].add(v); // Since the graph is undirected
	    }

	    // A function used by DFS
	    void DFSUtil(int v, boolean[] visited) {
	        visited[v] = true;
	        for (int n : adj[v]) {
	            if (!visited[n])
	                DFSUtil(n, visited);
	        }
	    }

	    // Method to count connected components
	    int countConnectedComponents() {
	        boolean[] visited = new boolean[V];
	        int count = 0;
	        for (int v = 0; v < V; ++v) {
	            if (!visited[v]) {
	                DFSUtil(v, visited);
	                count++;
	            }
	        }
	        return count;
	    }

	    // Main method to test the code
	    public static void main(String[] args) {
	        ConnectedComponents g = new ConnectedComponents(5);

	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(3, 4);

	        System.out.println("Number of connected components: " + g.countConnectedComponents());
	    }
	}


//	Sure! Let’s break down the code step by step:
//
//		1. Class Definition and Constructor Java
//
//		public class ConnectedComponents {
//		    private int V; // Number of vertices
//		    private LinkedList<Integer>[] adj; // Adjacency list
//
//		    // Constructor
//		    ConnectedComponents(int v) {
//		        V = v;
//		        adj = new LinkedList[v];
//		        for (int i = 0; i < v; ++i)
//		            adj[i] = new LinkedList();
//		    }
//		}

//		Class Definition: The class ConnectedComponents represents the graph.
//		Variables: V is the number of vertices, and adj is an array of linked lists to store the adjacency list of each vertex.
//		Constructor: Initializes the number of vertices and creates an empty adjacency list for each vertex.
//		2. Adding Edges Java
//
//		void addEdge(int v, int w) {
//		    adj[v].add(w);
//		    adj[w].add(v); // Since the graph is undirected
//		}
//		
//		addEdge Method: Adds an edge between vertices v and w. Since the graph is undirected, it adds w to the adjacency list of v and v to the adjacency list of w.
//		3. Depth-First Search (DFS) Utility
//		Java
//
//		void DFSUtil(int v, boolean[] visited) {
//		    visited[v] = true;
//		    for (int n : adj[v]) {
//		        if (!visited[n])
//		            DFSUtil(n, visited);
//		    }
//		}
//		
//		DFSUtil Method: A recursive method that marks the current node as visited and then recursively 
	//visits all its adjacent nodes that haven’t been visited yet.
//		4. Counting Connected Components
//		Java
//
//		int countConnectedComponents() {
//		    boolean[] visited = new boolean[V];
//		    int count = 0;
//		    for (int v = 0; v < V; ++v) {
//		        if (!visited[v]) {
//		            DFSUtil(v, visited);
//		            count++;
//		        }
//		    }
//		    return count;
//		}
//		
//		countConnectedComponents Method:
//		Initializes a visited array to keep track of visited vertices.
//		Iterates through all vertices. For each unvisited vertex, it calls DFSUtil to visit all vertices 
//	in that component and increments the count of connected components.
//		5. Main Method
//		Java
//
//		public static void main(String[] args) {
//		    ConnectedComponents g = new ConnectedComponents(5);
//
//		    g.addEdge(0, 1);
//		    g.addEdge(0, 2);
//		    g.addEdge(3, 4);
//
//		    System.out.println("Number of connected components: " + g.countConnectedComponents());
//		}
//		
//		main Method:
//		Creates a graph with 5 vertices.
//		Adds edges to the graph.
//		Prints the number of connected components in the graph.
//		Example
//		In the example provided:
//
//		Vertices 0, 1, and 2 form one connected component.
//		Vertices 3 and 4 form another connected component.
//		Therefore, the output will be 2.
