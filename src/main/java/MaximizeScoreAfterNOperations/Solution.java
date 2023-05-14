package MaximizeScoreAfterNOperations;

import java.util.Arrays;

public class Solution {
    public int maxScore(int[] nums) {
        int[] dp = new int[1<<nums.length];
        Arrays.fill(dp,-1);
        return backtrack(nums, 0, 0, dp);
    }

    private int backtrack(int[] nums, int mask, int pairsPicked, int[] dp) {
        int maxsc = 0;
        int n = nums.length;
        if (pairsPicked<<1 == n)
            return maxsc;
        if (dp[mask]!=-1)
            return dp[mask];
        for (int firstInPair = 0; firstInPair < n-1; firstInPair++) {
            if ((mask >> firstInPair & 1) == 1)
                continue;
            for (int secondInPair = firstInPair+1; secondInPair < n; secondInPair++) {
                if ((mask >> secondInPair & 1) == 1)
                    continue;
                int score = gcd(nums[firstInPair],nums[secondInPair]) * (pairsPicked + 1);
                int newMask = mask | (1 << firstInPair) | (1 << secondInPair);
                score += backtrack(nums, newMask, pairsPicked+1, dp);
                maxsc = Math.max(maxsc,score);
            }
        }
        dp[mask]=maxsc;
        return maxsc;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
