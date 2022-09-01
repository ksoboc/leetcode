package MaximumProductSubarray;

import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {

        int curMin=1, curMax=1;
        int max = Arrays.stream(nums).max().orElse(0);

        for (int num : nums) {
            if (num == 0) {
                curMin = curMax = 1;
                continue;
            }
            int prod = curMax * num;
            curMax = Math.max(Math.max(curMin * num, prod), num);
            curMin = Math.min(Math.min(curMin * num, prod), num);

            max = Math.max(max, curMax);
        }
        return max;
    }
}