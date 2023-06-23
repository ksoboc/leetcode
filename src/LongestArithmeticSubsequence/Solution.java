package LongestArithmeticSubsequence;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer>[] dp = new HashMap[n];

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int currVal = nums[i];
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; ++j) {
                int diff = currVal - nums[j];
                int len = 1 + dp[j].getOrDefault(diff, 1);
                maxLen = Math.max(maxLen,len);
                dp[i].put(diff, len);
            }
        }
        return maxLen;
    }
}
