package NumberofDiceRollsWithTargetSum;

public class Solution {

    private static final int LEETCODE_CONSTANT = 1_000_000_007;

    public int numRollsToTargetDP(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + k];
        dp[n][target] = 1;

        for (int moveNr = n - 1; moveNr >= 0; --moveNr) {
            for (int sum = target - 1; sum > moveNr - 1; --sum) {
                int res = 0;
                for (int j = 1; j <= k; j++) {
                    res = (res + dp[moveNr + 1][sum + j]) % LEETCODE_CONSTANT;
                }
                dp[moveNr][sum] = res;
            }

        }
        return dp[0][0];
    }
    Integer[][] dp;
    public int numRollsToTarget(int n, int k, int target) {
        dp=new Integer[n][target+1];
        return roll(0, 0, target, n, k);
    }


    private int roll(int moveNr, int sum, int target, int n, int k) {
        if (moveNr >= n) {
            return sum == target ? 1 : 0;
        }
        if (sum>=target)
            return 0;
        if (dp[moveNr][sum]!=null) {
            return dp[moveNr][sum];
        }
        int res = 0;
        for (int j = 1; j < k + 1; j++) {
            res = (res + roll(moveNr + 1, sum + j, target, n, k)) % LEETCODE_CONSTANT;
        }
        dp[moveNr][sum]=res;
        return res;
    }
}
