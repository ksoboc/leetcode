package MaximumErasureValue;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int l = 0;
        int sum = 0;
        int max = 0;
        for (int r = 0; r < nums.length; r++) {
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                ++l;
            }

            sum += nums[r];
            max = Math.max(max, sum);
            set.add(nums[r]);


        }
        return max;
    }


}

