package PerfectSquares;

public class Solution {
    Integer[] dp;

    public int numSquares(int n) {
        dp = new Integer[n+1];
        return numSquaresR(n);
    }

    private int numSquaresR(int n) {
        if (n == 0) return 0;
        if (dp[n] != null)
            return dp[n];

        int minSquares = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            minSquares = Math.min(minSquares, 1 + numSquaresR(n - i * i));
        }
        dp[n] = minSquares;
        return minSquares;
    }
}
