package ProfitableSchemes;

public class SolutionDP {


    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][][] dp = new int[group.length+1][n+1][minProfit + 1];
        int mod = 1_000_000_007;
        for (int count = 0; count <= n; count++) {
            dp[group.length][count][minProfit] = 1;
        }
        for (int grp = group.length - 1; grp >= 0; --grp) {
            for (int nrCrim = 0; nrCrim <= n; ++nrCrim) {
                for (int prof = 0; prof <= minProfit; prof++) {
                    int res = dp[grp + 1][nrCrim][prof];
                    if (nrCrim + group[grp] <= n) {
                        int profRestr = Math.min(minProfit, prof + profit[grp]);
                        res += dp[grp + 1][nrCrim + group[grp]][profRestr];
                        res %= mod;
                    }
                    dp[grp][nrCrim][prof]=res;
                }
            }
        }
        return dp[0][0][0];
    }


}
