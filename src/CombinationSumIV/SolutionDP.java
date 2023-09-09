package CombinationSumIV;

import java.util.Arrays;

public class SolutionDP {

    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        dp[0]=1;
        for (int val = 1; val <= target ; val++) {
            for (var n:nums) {
                if (n<=val)
                    dp[val] += dp[val-n];
            }
        }
        return dp[target];
    }

}
