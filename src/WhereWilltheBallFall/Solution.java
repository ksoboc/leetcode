package WhereWilltheBallFall;

public class Solution {
    private int nrCols;

    public int[] findBall(int[][] grid) {
        nrCols = grid[0].length;
        int nrRows = grid.length;
        int[] res = new int[grid[0].length];

        for (int c = 0; c < nrCols; c++) {
            int cr = 0;
            int cc = c;
            while (cr < nrRows) {

                if (isStuck(grid, cr, cc)) {
                    res[c] = -1;
                    break;
                }
                cc += grid[cr][cc];
                ++cr;
            }
            if (cr == nrRows)
                res[c] = cc;
        }
        return res;
    }

    private boolean isStuck(int[][] grid, int r, int c) {
        if (grid[r][c] == -1 && c == 0 || grid[r][c] == 1 && c == nrCols - 1)
            return true;
        if (c < nrCols - 1 && grid[r][c] == 1 && grid[r][c + 1] == -1 || c > 0 && grid[r][c - 1] == 1 && grid[r][c] == -1)
            return true;
        return false;
    }
}
