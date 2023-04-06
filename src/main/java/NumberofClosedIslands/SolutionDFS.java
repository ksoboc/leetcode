package NumberofClosedIslands;

import java.util.ArrayDeque;
import java.util.Queue;

public class SolutionDFS {

    private int[][] grid;


    private int nrRows;
    private int nrCols;

    public int closedIsland(int[][] grid) {
        nrRows = grid.length;
        nrCols = grid[0].length;
        this.grid = grid;

        for (int r = 0; r < nrRows; r++) {
            dfs(r, 0);
            dfs(r, nrCols - 1);

        }

        for (int c = 1; c < nrCols - 1; c++) {
            dfs(0, c);
            dfs(nrRows - 1, c);
        }

        int nrSeaLockedIslands = 0;
        for (int r = 1; r < nrRows - 1; r++) {
            for (int c = 1; c < nrCols - 1; c++) {
                if (grid[r][c] == 0) {
                    ++nrSeaLockedIslands;
                    dfs(r, c);
                }
            }
        }
        return nrSeaLockedIslands;
    }

    private void dfs(int r, int c) {
        if (r < 0 || r >= nrRows || c < 0 || c >= nrCols || grid[r][c] != 0)
            return;

        grid[r][c] = -1;
        dfs(r + 1, c);
        dfs(r - 1, c);
        dfs(r, c - 1);
        dfs(r, c + 1);

    }
}
