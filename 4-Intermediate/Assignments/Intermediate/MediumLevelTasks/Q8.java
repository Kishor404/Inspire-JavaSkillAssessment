// Implement a graph data structure in Java using either an adjacency matrix or an adjacency list. The graph should have methods for adding and removing vertices and edges, and for traversing the graph.

// File: Medium/Q8.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Graph {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    public void addVertex(int v) {
        adj.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int v1, int v2) {
        addVertex(v1);
        addVertex(v2);
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    public void removeEdge(int v1, int v2) {
        List<Integer> l1 = adj.get(v1);
        List<Integer> l2 = adj.get(v2);
        if (l1 != null) l1.remove((Integer) v2);
        if (l2 != null) l2.remove((Integer) v1);
    }

    public void removeVertex(int v) {
        List<Integer> neighbors = adj.get(v);
        if (neighbors != null) {
            for (int n : neighbors) {
                adj.get(n).remove((Integer) v);
            }
        }
        adj.remove(v);
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            for (int n : adj.getOrDefault(v, Collections.emptyList())) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }
}

public class Q8 {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        System.out.print("BFS from 1: ");
        g.bfs(1);
    }
}