package RemoveMaxNumberofEdgestoKeepGraphFullyTraversable;

public class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {

        int nrToRemove = 0;
        UnionFind aliceUF = new UnionFind(n);
        UnionFind bobUF = new UnionFind(n);
        for (var edge : edges) {
            if (edge[0] != 3) continue;
            --edge[1];
            --edge[2];
            boolean connBob = bobUF.connected(edge[1], edge[2]);
            boolean connAlice = aliceUF.connected(edge[1], edge[2]);
            if (connBob && connAlice) {
                ++nrToRemove;
                continue;
            }
            bobUF.join(edge[1], edge[2]);
            aliceUF.join(edge[1], edge[2]);
        }
        for (var edge : edges) {
            if (edge[0] == 3) continue;
            --edge[1];
            --edge[2];
            switch (edge[0]) {
                case 2:
                    if (bobUF.connected(edge[1], edge[2])) {
                        ++nrToRemove;
                        continue;
                    }
                    bobUF.join(edge[1], edge[2]);
                    break;
                case 1:
                    if (aliceUF.connected(edge[1], edge[2])) {
                        ++nrToRemove;
                        continue;
                    }
                    aliceUF.join(edge[1], edge[2]);
            }
        }
        if (bobUF.getNrGroups() != 1 || aliceUF.getNrGroups() != 1)
            return -1;
        return nrToRemove;
    }
}

class UnionFind {
    private final int[] parent;
    private final int[] rank;

    private int nrGroups;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        nrGroups = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    private int find(int p) {
        while (p != parent[p]) {
            while (parent[p] != parent[parent[p]]) {
                // Two-pass implementation of path compression, pointing to the root
                parent[p] = parent[parent[p]];
            }

            p = parent[p];
        }
        return p;
    }

    public void join(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY)
            return;
        if (rank[rootX] >= rank[rootY]) {
            parent[rootY] = rootX;
            rank[rootX] += rank[rootY];
        } else {
            parent[rootX] = rootY;
            rank[rootY] += rank[rootX];
        }
        --nrGroups;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int getNrGroups() {
        return nrGroups;
    }
}
