package KRadiusSubarrayAverages;

import java.util.Arrays;

public class Solution {
    public int[] getAverages(int[] nums, int k) {
        long sum = 0L;
        int l, r;
        long n = 2L * k + 1;
        if (k == 0) return nums;
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        if (n > nums.length) {
            return res;
        }
        for (int i = 0; i < Math.min(k, nums.length); i++) {
            res[i] = -1;
        }

        for (int i = 0; i < Math.min(n, nums.length) - 1; ++i) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length - k; i++) {
            l = i - k;
            r = i + k;
            if (l > 0)
                sum -= nums[l - 1];

            sum += nums[r];
            res[i] = (int) (sum / n);
        }
        return res;
    }
}
