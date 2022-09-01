package PaintHouse;

public class Solution {
    public int minCost(int[][] costs) {
        // write your code here
        int[] dp = {0,0,0};

        for (int i = 0; i < costs.length; i++) {
            int dp0=costs[i][0] + Math.min(dp[1],dp[2]);
            int dp1=costs[i][1] + Math.min(dp[0],dp[2]);
            int dp2=costs[i][2] + Math.min(dp[0],dp[1]);
            dp = new int[]{dp0,dp1,dp2};
        }

        return Math.min(dp[0], Math.min(dp[1],dp[2]));

    }
}
