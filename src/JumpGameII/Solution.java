package JumpGameII;

public class Solution {
    public int jump(int[] nums) {
        var l = 0;
        var r = 0;
        var numSteps = 0;

        while (r < nums.length - 1) {
            var farthest = l;
            for (var i = l; i <= r; ++i) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            ++numSteps;
        }
        return numSteps;
    }

    public int jumpDP(int[] nums) {
        int[] dp = new int[nums.length];
        for (var i = nums.length - 2; i >= 0; --i) {
            var min = Integer.MAX_VALUE - 1;
            for (var j = i + 1; j <= Math.min(i + nums[i], nums.length - 1); ++j) {
                min = Math.min(min, dp[j]);
            }
            dp[i] = 1 + min;
        }
        return dp[0];
    }
}
