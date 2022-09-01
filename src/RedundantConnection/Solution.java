package RedundantConnection;

public class Solution {
    int[] parents;
    int[] ranks;

    public int[] findRedundantConnection(int[][] edges) {
        int[] res = new int[2];
        parents = new int[edges.length + 1];
        ranks = new int[edges.length + 1];

        for (int i = 1; i <= edges.length; i++) {
            parents[i] = i;
        }

        for (var edge : edges) {
            if (!union(edge[0], edge[1]))
                return edge;
        }
        return new int[]{-1, -1};
    }

    private int findParent(int node) {
        var parent = parents[node];
        while (parents[parent] != parent) {
            parents[parent] = parents[parents[parent]];
            parent = parents[parent];

        }
        return parent;
    }

    private boolean union(int n1, int n2) {
        var p1 = findParent(n1);
        var p2 = findParent(n2);

        if (p1 == p2) return false;
        if (ranks[p1] > ranks[p2]) {
            parents[p2] = p1;
            ranks[p1] += ranks[p2];

        } else {
            parents[p1] = p2;
            ranks[p2] += ranks[p1];
        }
        return true;
    }
}
