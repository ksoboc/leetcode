package CountUnreachablePairsofNodesinanUndirectedGraph;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static class UnionFind {
        private int[] parent;
        private int[] rank;
        private int numGroups;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
            numGroups = n;
        }

        public int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public void join(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px == py)
                return;
            if (rank[px] >= rank[py]) {
                parent[py] = parent[px];
                rank[px] += rank[py];
            } else if (rank[px] < rank[py]) {
                parent[px] = parent[py];
                rank[py] += rank[px];
            }
            --numGroups;
        }

        public int getNumGroups() {
            return numGroups;
        }
    }

    public long countPairs(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        for (var edge : edges) {
            uf.join(edge[0], edge[1]);
        }

        Map<Integer, Integer> groups = new HashMap<>();
        for (int node = 0; node < n; node++) {
            int key = uf.find(node);
            groups.put(key, groups.getOrDefault(key, 0) + 1);
        }

        long numberOfPaths = 0;
        long remainingNodes=n;

        for (var value : groups.values()) {
            remainingNodes-=value;
            numberOfPaths +=  remainingNodes * value;

        }
        return numberOfPaths;
    }
}
