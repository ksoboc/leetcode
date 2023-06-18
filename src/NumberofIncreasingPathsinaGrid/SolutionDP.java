package NumberofIncreasingPathsinaGrid;

import java.util.Arrays;

public class SolutionDP {


    public int countPaths(int[][] grid) {

        final int mod = 1_000_000_007;

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        int[][] cells = new int[n * m][2];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                cells[r * m + c][0] = r;
                cells[r * m + c][1] = c;
            }

        }

        Arrays.sort(cells, (a, b) -> Integer.compare(grid[b[0]][b[1]], grid[a[0]][a[1]]));
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (var cell : cells) {
            int r = cell[0];
            int c = cell[1];
            dp[r][c] = 1;
            for (var dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] > grid[r][c]) {
                    dp[r][c] = (dp[r][c] + dp[nr][nc]) % mod;
                }
            }

        }
        int ans = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                ans = (ans + dp[r][c]) % mod;
            }
        }
        return ans;
    }


}
