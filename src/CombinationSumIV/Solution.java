package CombinationSumIV;

import java.util.Arrays;

public class Solution {
    private int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp=new int[target+1];
        Arrays.fill(dp,-1);
        return helper(nums,target);
    }
    private int helper(int[] nums, int target) {

        if (target==0)
            return 1;
        if (dp[target]!=-1)
            return dp[target];
        int count = 0;
        for (var n:nums) {
            if (n<=target)
                count+=helper(nums,target-n);

        }
        dp[target]=count;
        return count;
    }
}
