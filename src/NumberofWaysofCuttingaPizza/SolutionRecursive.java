package NumberofWaysofCuttingaPizza;

import java.util.Arrays;

public class SolutionRecursive {
    private int mod = 1_000_000_007;
    private int nrRows ;
    private int nrCols ;
    private int[][][] dp;
    public int ways(String[] pizza, int k) {
        nrRows = pizza.length;
        nrCols = pizza[0].length();
        int[][] apples = new int[nrRows + 1][nrCols + 1];
        dp = new int[k][nrRows][nrCols];
        for (int remain = 0; remain < k; remain++) {
            for (int r = 0; r < nrRows; r++) {
                Arrays.fill(dp[remain][r],-1);

            }

        }
        for (int r = nrRows - 1; r >= 0; r--) {
            for (int c = nrCols - 1; c >= 0; c--) {
                apples[r][c] = (pizza[r].charAt(c) == 'A' ? 1 : 0) + apples[r + 1][c] + apples[r][c + 1] - apples[r + 1][c + 1];
                dp[0][r][c] = apples[r][c] > 0 ? 1 : 0;
            }
        }

        return dfs(apples,0,0,k-1);

    }

    private int dfs(int[][] apples, int r, int c, int nrCuts) {
        if (apples[r][c]==0)
            return 0;
        if (nrCuts==0)
            return 1;

        int res = 0;

        for (int cutRow = r+1; cutRow < nrRows; cutRow++) {
            if (apples[r][c] - apples[cutRow][c]>0) {
                res+= dfs(apples,cutRow,c,nrCuts-1)%mod;
            }

        }
        for (int cutCol = c+1; cutCol < nrCols; cutCol++) {
            if (apples[r][c] - apples[r][cutCol]>0) {
                res+= dfs(apples,r,cutCol,nrCuts-1)%mod;
            }

        }
        return res;
    }
}
