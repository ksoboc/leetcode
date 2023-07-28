package PredicttheWinner;

public class Solution {

    private Integer[][] dp;

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];
        return maxDiff(nums, 0, n - 1) >= 0;
    }

    private int maxDiff(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        if (dp[start][end] != null)
            return dp[start][end];

        int res;
        res = Math.max(nums[start] - maxDiff(nums,  start + 1, end), nums[end] - maxDiff(nums, start, end - 1));
        dp[start][end] = res;
        return res;
    }

}
