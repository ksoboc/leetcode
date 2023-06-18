package NumberofIncreasingPathsinaGrid;

public class Solution {
    int[][] dp;
    final int mod = 1_000_000_007;
    public int countPaths(int[][] grid) {

        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;

        dp = new int[n][m];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {

                ans = (ans + dfs(grid,r,c, grid[r][c])) % mod;
            }
        }
        return ans;
    }

    private int dfs(int[][] grid,  int r, int c, int prev) {
        if (dp[r][c]!=0)
            return dp[r][c];
        int cnt = 1;
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        for (var dir:dirs) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (nr>=0 && nr< grid.length && nc>=0 && nc<grid[0].length  && grid[nr][nc] > prev) {
                cnt = (cnt + dfs(grid,nr,nc,grid[nr][nc])) % mod;
            }
        }
        dp[r][c] = cnt;
        return cnt;
    }
}
