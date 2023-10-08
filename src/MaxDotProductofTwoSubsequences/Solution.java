package MaxDotProductofTwoSubsequences;

public class Solution {
    private Integer[][] dp;
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num: nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }

        for (int num: nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }

        if (firstMax < 0 && secondMin > 0) {
            return firstMax * secondMin;
        }

        if (firstMin > 0 && secondMax < 0) {
            return firstMin * secondMax;
        }

        dp=new Integer[nums1.length][nums2.length];

        return helper(0, 0,  nums1, nums2);
    }

    private int helper(int i, int j,  int[] nums1, int[] nums2) {
        if (i >= nums1.length || j >= nums2.length) {
            return 0;
        }


        if (dp[i][j]!=null)
            return dp[i][j];
        int max = nums1[i]*nums2[j] + helper(i + 1, j + 1,  nums1, nums2);
        max = Math.max(max,helper(i+1,j,nums1,nums2));
        max = Math.max(max,helper(i,j+1,nums1,nums2));

        dp[i][j]=max;
        return max;

    }
}
