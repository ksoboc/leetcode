package MinimumSizeSubarraySum;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        var total = 0;
        var l = 0;
        var res = nums.length + 1;

        for (var r = 0; r < nums.length; ++r) {
            total += nums[r];
            while (total >= target) {
                res = Math.min(res, r - l + 1);
                total -= nums[l];
                ++l;
            }
        }
        return res > nums.length ? 0 : res;
    }
}
