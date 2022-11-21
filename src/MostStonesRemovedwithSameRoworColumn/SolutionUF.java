package MostStonesRemovedwithSameRoworColumn;

public class SolutionUF {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        if (n<2)
            return 0;
        UnionFind uf = new UnionFind(20_001);
        for (int[] edge : stones) {
            uf.union(edge[0] + 10001, edge[1]);
        }

        return n - uf.getCount();
    }
}

class UnionFind {
    int[] parents;
    int[] size;
    int count;

    public UnionFind(int capacity) {
        parents = new int[capacity];
        size = new int[capacity];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public int find(int x) {
        if (size[x] == 0) {
            parents[x] = x;
            size[x] = 1;
            count++;
        }

        while (x != parents[x]) {
            parents[x] = parents[parents[x]];
            x = parents[x];
        }

        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) {
            return;
        }

        int sizex = size[rootX];
        int sizey = size[rootY];
        if (sizex > sizey) {
            parents[rootY] = rootX;
            size[rootX] = sizex + sizey;
        } else {
            parents[rootX] = rootY;
            size[rootY] = sizex + sizey;
        }
        count--;
    }
}