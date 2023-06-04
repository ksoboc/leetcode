package NumberofProvinces;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        final int n = isConnected.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1)
                    uf.union(i,j);
            }

        }
        return uf.getNrGroups();
    }
}

class UnionFind {
    private int nrGroups;
    private int[] val;
    private int[] size;

    public UnionFind(int n) {
        val = new int[n];
        size = new int[n];
        nrGroups = n;
        for (int i = 0; i < n; i++) {
            val[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        while (x != val[x]) {
            int tmp = x;
            x = val[x];
            val[tmp] = x;
        }
        return x;
    }

    public void union(int i, int j) {
        int fi = find(i);
        int fj = find(j);
        if (fi == fj)
            return;

        if (size[fi] >= size[fj]) {
            val[fj] = fi;
            size[fi] += size[fj];
        } else {
            val[fi] = fj;
            size[fj] += size[fi];
        }
        --nrGroups;
    }

    public int getNrGroups() {
        return nrGroups;
    }
}
