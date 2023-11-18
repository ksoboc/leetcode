package FrequencyoftheMostFrequentElement;

import java.util.Arrays;

public class Solution2 {
    public int maxFrequency(int[] nums, int k) {


        Arrays.sort(nums);
        int l=0;

        long curr = 0;
        for (int r = 0; r < nums.length; r++) {
            int target = nums[r];
            curr += target;
            if (curr+k<target*(r-l+1)) {
                curr-=nums[l];
                ++l;
            }

        }
        return nums.length-l;
    }
}
