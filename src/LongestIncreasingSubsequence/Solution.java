package LongestIncreasingSubsequence;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        var lis = new int[nums.length];

        for (var i=0;i<lis.length;++i)
            lis[i] = 1;

        for (var i = nums.length - 1; i >= 0; --i) {
            for (var j = i + 1; j < nums.length; ++j) {
                if (nums[i] < nums[j]) {
                    lis[i] = Math.max(lis[i], 1 + lis[j]);
                }
            }
        }

        return Arrays.stream(lis).max().orElse(1);

    }
}