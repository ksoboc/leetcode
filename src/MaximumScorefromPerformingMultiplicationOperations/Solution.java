package MaximumScorefromPerformingMultiplicationOperations;

import java.util.Arrays;

public class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int n = nums.length;
        int m = multipliers.length;

        int[] dp1 = new int[m + 1];
        int[] dp2 = new int[m + 1];
        int[] dp = dp1;
        int[] dpPrev;

        for (int r = m - 1; r >= 0; --r) {
            if (r % 2 == 1) {
                dp = dp2;
                dpPrev = dp1;
            } else {
                dp = dp1;
                dpPrev = dp2;
            }

            for (int c = r; c >= 0; --c) {
                int rIndex = n - 1 - r + c;
                dp[c] = Math.max(dpPrev[c] + multipliers[r] * nums[rIndex], dpPrev[c + 1] + multipliers[r] * nums[c]);
            }

        }
        return dp[0];
    }
}
