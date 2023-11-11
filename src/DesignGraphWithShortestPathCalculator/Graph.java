package DesignGraphWithShortestPathCalculator;

import java.util.*;

public class Graph {
    private static class Pair {
        int to;
        int cost;

        public Pair(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    private final Map<Integer, List<Pair>> adj;
    private final int nrNodes;

    public Graph(int n, int[][] edges) {
        nrNodes = n;
        adj = new HashMap<>();
        for (var edge : edges) {
            addEdge(edge);
        }
    }

    public void addEdge(int[] edge) {

        adj.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(new Pair(edge[1], edge[2]));
    }

    public int shortestPath(int node1, int node2) {
        Comparator<Pair> comparator = Comparator.comparingInt(a -> a.cost);
        PriorityQueue<Pair> pq = new PriorityQueue<>(comparator);
        pq.offer(new Pair(node1, 0));
        int[] nodeCost = new int[nrNodes];
        Arrays.fill(nodeCost, Integer.MAX_VALUE);
        nodeCost[node1] = 0;

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int node = pair.to;
            int cost = pair.cost;
            if (cost>nodeCost[node])
                continue;
            if (node==node2)
                return cost;
            if (adj.get(node) == null)
                continue;
            for (var nei : adj.get(node)) {
                if (nodeCost[nei.to] > nei.cost + cost) {
                    nodeCost[nei.to] = nei.cost + cost;
                    pq.offer(new Pair(nei.to, nodeCost[nei.to]));
                }
            }
        }
        return nodeCost[node2] == Integer.MAX_VALUE ? -1 : nodeCost[node2];
    }
}
