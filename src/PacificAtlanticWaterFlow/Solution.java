package PacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private int nrRows;
    private int nrCols;


    private int[][] heights;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        nrRows = heights.length;
        nrCols = heights[0].length;
        this.heights = heights;

        Set<Integer> atl = new HashSet<>();
        Set<Integer> pac = new HashSet<>();

        for (int c = 0; c < nrCols; ++c) {
            dfs(0, c, pac, heights[0][c]);
            dfs(nrRows - 1, c, atl, heights[nrRows - 1][c]);
        }

        for (int r = 0; r < nrRows; ++r) {
            dfs(r, 0, pac, heights[r][0]);
            dfs(r, nrCols - 1, atl, heights[r][nrCols - 1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        atl.retainAll(pac);

        for (var cellNumVal : atl) {
            res.add(intToCell(cellNumVal));
        }
        return res;
    }

    private void dfs(int r, int c, Set<Integer> set, int prevHeight) {
        if (r < 0 || r >= nrRows ||
                c < 0 || c >= nrCols ||
                set.contains(cellToInt(r, c)) ||
                heights[r][c] < prevHeight)
            return;

        set.add(cellToInt(r, c));

        dfs(r + 1, c, set, heights[r][c]);
        dfs(r - 1, c, set, heights[r][c]);
        dfs(r, c + 1, set, heights[r][c]);
        dfs(r, c - 1, set, heights[r][c]);
    }

    private int cellToInt(int r, int c) {
        return r * nrCols + c;
    }

    private List<Integer> intToCell(int n) {
        return List.of(n / nrCols, n % nrCols);
    }
}
