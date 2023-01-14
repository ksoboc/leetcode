package UniquePathsIII;

public class Solution {
    public int uniquePathsIII(int[][] grid) {
        int numOfCells = 0;
        int sr = 0;
        int sc = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == 1) {
                    sr = r;
                    sc = c;
                }
                if (grid[r][c] == 0)
                    ++numOfCells;
            }

        }
        return dfs(grid, sr, sc, numOfCells);

    }

    private int dfs(int[][] grid, int r, int c, int numOfCells) {
        if (r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c] == -1)
            return 0;
        if (grid[r][c] == 2) {
            return (numOfCells == -1) ? 1 : 0;
        }
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int ans = 0;
        --numOfCells;
        grid[r][c] = -1;
        for (var move : moves) {
            ans += dfs(grid, r + move[0], c + move[1], numOfCells);
        }
        grid[r][c] = 0;
        return ans;
    }
}
