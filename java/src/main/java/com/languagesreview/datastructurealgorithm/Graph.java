package com.languagesreview.datastructurealgorithm;

import java.util.*;

/**
 * Graph implementation using adjacency list with DFS and BFS
 */
public class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list
    
    @SuppressWarnings("unchecked")
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // For undirected graph
    }
    
    public void printGraph() {
        for (int v = 0; v < V; v++) {
            System.out.print("Vertex " + v + ": ");
            for (Integer neighbor : adj[v]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    public List<Integer> dfs(int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited, result);
        return result;
    }
    
    private void dfsUtil(int v, boolean[] visited, List<Integer> result) {
        visited[v] = true;
        result.add(v);
        
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited, result);
            }
        }
    }
    
    public List<Integer> bfs(int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        
        visited[start] = true;
        queue.offer(start);
        
        while (!queue.isEmpty()) {
            int v = queue.poll();
            result.add(v);
            
            for (Integer neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        
        return result;
    }
    
    public boolean hasCycle() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (hasCycleUtil(i, visited, recStack, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean hasCycleUtil(int v, boolean[] visited, boolean[] recStack, int parent) {
        visited[v] = true;
        recStack[v] = true;
        
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                if (hasCycleUtil(neighbor, visited, recStack, v)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        
        recStack[v] = false;
        return false;
    }
    
    public List<Integer> topologicalSort() {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }
        
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        
        return result;
    }
    
    private void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack);
            }
        }
        
        stack.push(v);
    }
    
    public int[] shortestPath(int start) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        pq.offer(new Node(start, 0));
        
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            
            for (Integer neighbor : adj[current.vertex]) {
                int newDist = dist[current.vertex] + 1; // Assuming unit weight
                if (newDist < dist[neighbor]) {
                    dist[neighbor] = newDist;
                    pq.offer(new Node(neighbor, newDist));
                }
            }
        }
        
        return dist;
    }
    
    private static class Node {
        int vertex, distance;
        
        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
} 