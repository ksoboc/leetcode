package IslandPerimeter;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private int nrRows;
    private int nrCols;
    private int[][] grid;
    private Set<Integer> visited;

    public int islandPerimeter(int[][] grid) {
        nrRows = grid.length;
        nrCols = grid[0].length;
        visited = new HashSet<>();
        var res = 0;
        this.grid = grid;

        outer:
        for (int i = 0; i < nrRows; i++) {
            for (int j = 0; j < nrCols; j++) {
                if (grid[i][j] == 1) {
                    res = dfs(i, j);
                    break outer;
                }

            }

        }
        return res;
    }

    private int dfs(int i, int j) {
        if (i < 0 || i >= nrRows || j < 0 || j >= nrCols || grid[i][j] == 0)
            return 1;
        if (visited.contains(i * nrCols + j))
            return 0;
        visited.add(i * nrCols + j);
        var perim = dfs(i - 1, j);
        perim += dfs(i + 1, j);
        perim += dfs(i, j - 1);
        perim += dfs(i, j + 1);

        return perim;

    }
}
