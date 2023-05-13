package CountWaysToBuildGoodStrings;

import java.util.Arrays;

public class Solution {
    private final int mod = 1_000_000_007;
    private int[] dp;

    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high + 1];
        Arrays.fill(dp, -1);
        return countGoodStrings(low, high, zero, one, 0);
    }

    private int countGoodStrings(int low, int high, int zero, int one, int length) {
        if (length > high)
            return 0;

        if (dp[length] != -1)
            return dp[length];

        int res = length >= low ? 1 : 0;
        if (length + zero <= high)
            res += countGoodStrings(low, high, zero, one, length + zero);
        if (length + one <= high)
            res += countGoodStrings(low, high, zero, one, length + one);

        res %= mod;
        dp[length] = res;

        return res;

    }
}
