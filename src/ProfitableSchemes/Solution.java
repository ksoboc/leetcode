package ProfitableSchemes;

import java.util.Arrays;

public class Solution {
    private int[][][] dp ;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        dp = new int[group.length][minProfit+1][n];
        for (int g = 0; g < dp.length; g++) {
            for (int p = 0; p < dp[g].length; p++) {
                Arrays.fill(dp[g][p], -1);
            }
        }
        return profitableSchemes(n, minProfit, group, profit, 0, 0, 0);
    }


    private int profitableSchemes(int n, int minProfit, int[] group, int[] profit, int groupNr, int profitSoFar, int crimSoFar) {
        if (groupNr >= group.length || crimSoFar >= n)
            return profitSoFar >= minProfit ? 1 : 0;

        int profIndex = Math.min(minProfit,profitSoFar);
        if (dp[groupNr][profIndex][crimSoFar]!=-1)
            return dp[groupNr][profIndex][crimSoFar];

        int res = profitableSchemes(n, minProfit, group, profit, groupNr + 1, profitSoFar, crimSoFar);
        if (crimSoFar + group[groupNr] <= n)
            res += profitableSchemes(n, minProfit, group, profit, groupNr + 1, profitSoFar + profit[groupNr], crimSoFar + group[groupNr]);
        res %= 1_000_000_007;
        dp[groupNr][profIndex][crimSoFar] = res;
        return res;
    }
}
