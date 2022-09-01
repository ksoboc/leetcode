package MinimumDifferenceBetweenHighestandLowestofKScores;

import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int res=Integer.MAX_VALUE;
        for (int r = k-1; r < nums.length; ++r,++l) {
            res=Math.min(res,nums[r]-nums[l]);

        }
        return res;
    }
}
