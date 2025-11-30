// 8) Implement a graph data structure in Java using either an adjacency matrix or an adjacency list. The graph should have methods for adding and removing vertices and edges, and for traversing the graph.

import java.util.*;

public class Q8 {
    static class Graph {
        private Map<Integer, List<Integer>> adj = new HashMap<>();

        public void addVertex(int v) {
            adj.putIfAbsent(v, new ArrayList<>());
        }

        public void removeVertex(int v) {
            adj.remove(v);
            for (List<Integer> list : adj.values()) {
                list.remove(Integer.valueOf(v));
            }
        }

        public void addEdge(int v1, int v2) {
            addVertex(v1);
            addVertex(v2);
            adj.get(v1).add(v2);
            adj.get(v2).add(v1); // undirected
        }

        public void removeEdge(int v1, int v2) {
            List<Integer> l1 = adj.get(v1);
            List<Integer> l2 = adj.get(v2);
            if (l1 != null) l1.remove(Integer.valueOf(v2));
            if (l2 != null) l2.remove(Integer.valueOf(v1));
        }

        public void bfs(int start) {
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();
            visited.add(start);
            q.add(start);

            System.out.print("BFS: ");
            while (!q.isEmpty()) {
                int v = q.poll();
                System.out.print(v + " ");
                for (int nei : adj.getOrDefault(v, Collections.emptyList())) {
                    if (!visited.contains(nei)) {
                        visited.add(nei);
                        q.add(nei);
                    }
                }
            }
            System.out.println();
        }

        public void dfs(int start) {
            Set<Integer> visited = new HashSet<>();
            System.out.print("DFS: ");
            dfsRec(start, visited);
            System.out.println();
        }

        private void dfsRec(int v, Set<Integer> visited) {
            if (visited.contains(v)) return;
            visited.add(v);
            System.out.print(v + " ");
            for (int nei : adj.getOrDefault(v, Collections.emptyList())) {
                dfsRec(nei, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.bfs(1);
        g.dfs(1);
    }
}
