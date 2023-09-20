package MinimumOperationstoReduceXtoZero;

public class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (var n : nums)
            sum += n;
        int rest = sum - x;

        int l = 0;

        sum = 0;
        int min = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; ++r) {
            sum += nums[r];
            while (l <= r && sum > rest) {
                sum -= nums[l];
                l++;
            }
            if (sum == rest) {
                int len = r - l + 1;
                min = Math.min(min, nums.length - len);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
