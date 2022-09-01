package NumberofLongestIncreasingSubsequence;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int maxLIS = 0;
        int res = 0;

        int[] dpLen = new int[nums.length];
        int[] dpCnt = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int maxLen = 1;
            int maxCnt = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    if (maxLen < dpLen[j] + 1) {
                        maxLen = dpLen[j] + 1;
                        maxCnt = dpCnt[j];
                    } else if (maxLen == dpLen[j] + 1) {
                        maxCnt += dpCnt[j];
                    }
                }
            }
            dpLen[i] = maxLen;
            dpCnt[i] = maxCnt;
            if (maxLen > maxLIS) {
                maxLIS = maxLen;
                res = maxCnt;

            } else if (maxLen == maxLIS) {
                res += maxCnt;
            }
        }
        return res;
    }
}
