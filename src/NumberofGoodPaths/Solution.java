package NumberofGoodPaths;

import java.util.*;

public class Solution {
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (var edge : edges) {
            adj.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1], x -> new ArrayList<>()).add(edge[0]);
        }
        int n = vals.length;
        Map<Integer, List<Integer>> valuesToNodes = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            valuesToNodes.computeIfAbsent(vals[i], x -> new ArrayList<>()).add(i);
        }

        UnionFind dsu = new UnionFind(n);
        int goodPaths = 0;
        for (var value : valuesToNodes.keySet()) {
            for (var node : valuesToNodes.get(value)) {
                if (!adj.containsKey(node))
                    continue;
                for (var neighbor : adj.get(node)) {
                    if (vals[node] >= vals[neighbor]) {
                        dsu.union_set(node, neighbor);
                    }
                }
            }
            Map<Integer, Integer> group = new HashMap<>();
            for (var u : valuesToNodes.get(value)) {
                var grpId = dsu.find(u);
                group.put(grpId, group.getOrDefault(grpId, 0) + 1);
            }
            for (var key : group.keySet()) {
                int size = group.get(key);
                goodPaths += (size + 1) * size / 2;
            }
        }
        return goodPaths;
    }
}

class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++)
            parent[i] = i;
        rank = new int[size];
    }

    public int find(int x) {
        int p = parent[x];
        while (p != x) {
            x = p;
            p = parent[p];
            parent[x] = p;
        }
        return parent[x];
    }

    public void union_set(int x, int y) {
        int xset = find(x), yset = find(y);
        if (xset == yset) {
            return;
        }
        if (rank[xset] < rank[yset]) {
            parent[xset] = yset;
        } else if (rank[xset] > rank[yset]) {
            parent[yset] = xset;
        } else {
            parent[yset] = xset;
            rank[xset]++;
        }
    }
}
