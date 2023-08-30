package MinimumReplacementstoSorttheArray;


public class Solution {

    public long minimumReplacement(int[] nums) {
        final int n = nums.length;
        long count = 0;
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i + 1] >= nums[i])
                continue;

            long numElems = ((long) nums[i] + nums[i + 1] - 1) / (long) nums[i + 1];
            count += numElems - 1;
            nums[i] = nums[i] / (int) numElems;
        }
        return count;
    }
}
