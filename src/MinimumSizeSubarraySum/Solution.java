package MinimumSizeSubarraySum;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int l=0;
        int minLen = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum+=nums[r];

            if (sum>=target) {
                while (sum >= target) {
                    sum -= nums[l];
                    ++l;
                }
                minLen = Math.min(minLen, r - l + 2);
            }
        }

        return minLen==Integer.MAX_VALUE ? 0 : minLen;
    }
}
