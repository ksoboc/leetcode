package FrequencyOfTheMostFrequentElement;

import java.util.Arrays;

public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        var res = 0;
        var l = 0;
        var r = 0;
        long total = 0;

        while (r < nums.length) {
            total += nums[r];
            while (total + k < nums[r] * (r - l + 1)) {
                total -= nums[l];
                l += 1;
            }
            res = Math.max(res, r - l + 1);
            r += 1;
        }

        return res;

    }
}
