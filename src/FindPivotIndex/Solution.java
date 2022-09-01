package FindPivotIndex;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        var totalSum = 0;
        for (var n:nums)
            totalSum+=n;

        var leftSum = 0;

        for (var i=0;i< nums.length;++i) {
            var rightSum = totalSum - nums[i] - leftSum;
            if (leftSum==rightSum)
                return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
