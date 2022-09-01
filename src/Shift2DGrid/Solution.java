package Shift2DGrid;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        var nrRows = grid.length;
        var nrCols = grid[0].length;

        int[][] grid2 = new int[nrRows][nrCols];

        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                var oneDimIndex = r * nrCols + c;
                var newOneDimIndex = (oneDimIndex + k) % (nrCols * nrRows);
                var nr = newOneDimIndex / nrCols;
                var nc = newOneDimIndex % nrCols;
                grid2[nr][nc] = grid[r][c];

            }

        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < nrRows; r++) {
            List<Integer> list = new ArrayList<>();
            for (int c = 0; c < nrCols; c++) {
                list.add(grid2[r][c]);

            }
            res.add(list);

        }
        return res;

    }
}
