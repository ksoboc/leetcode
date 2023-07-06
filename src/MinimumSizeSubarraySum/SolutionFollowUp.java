package MinimumSizeSubarraySum;

import java.util.Arrays;

public class SolutionFollowUp {
    public int minSubArrayLen(int target, int[] nums) {
        int[] sums = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            sums[i] = nums[i-1] + sums[i - 1];
        }

        int minLen = Integer.MAX_VALUE;
        for (int l = 0; l < nums.length; l++) {
            int t = target + sums[l];
            int r = Arrays.binarySearch(sums, t);
            if (r < 0) {
                r = -r - 1;
            }
            if (r<= nums.length)
                minLen = Math.min(minLen, r - l);
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}
