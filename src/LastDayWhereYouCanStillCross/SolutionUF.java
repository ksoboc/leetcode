package LastDayWhereYouCanStillCross;


public class SolutionUF {
    public int latestDayToCross(int row, int col, int[][] cells) {
        final int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}};
        int[][] grid = new int[row][col];

        UnionFind uf = new UnionFind(cells.length + 2);
        int d = 0;
        while (d < cells.length) {
            int r = cells[d][0] - 1;
            int c = cells[d][1] - 1;
            grid[r][c] = 1;
            int idx1 = r * col + c;
            if (c == 0)
                uf.union(idx1, cells.length);
            if (c == col - 1)
                uf.union(idx1, cells.length + 1);

            for (var dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1) {
                    int idx2 = nr * col + nc;
                    uf.union(idx1, idx2);
                }
            }

            if (uf.connected(cells.length, cells.length + 1))
                return d;
            ++d;
        }
        return d;
    }


}

class UnionFind {

    private int[] val;
    private int[] size;

    public UnionFind(int n) {
        val = new int[n];
        size = new int[n];

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

    }

    public boolean connected(int i, int j) {
        int fi = find(i);
        int fj = find(j);
        return fi == fj;
    }


}
