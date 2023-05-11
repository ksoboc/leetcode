package UncrossedLines;

public class Solution {
    private Integer[][] dp;

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        dp = new Integer[nums1.length][nums2.length];
        return maxUncrossedLines(nums1, nums2, nums1.length - 1, nums2.length - 1);
    }

    private int maxUncrossedLines(int[] nums1, int[] nums2, int i, int j) {
        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != null)
            return dp[i][j];

        int res;
        if (nums1[i] == nums2[j])
            res = 1 + maxUncrossedLines(nums1, nums2, i - 1, j - 1);
        else res = Math.max(maxUncrossedLines(nums1, nums2, i - 1, j),
                maxUncrossedLines(nums1, nums2, i, j - 1));
        dp[i][j] = res;
        return res;
    }
}
