package NumberofSubsequencesThatSatisfytheGivenSumCondition;

import java.util.Arrays;

public class Solution {
    public int numSubseq(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        int r = nums.length - 1;

        int[] pow = new int[nums.length];
        pow[0] = 1;
        for (int k = 1; k < nums.length; k++)
            pow[k] = (pow[k - 1] * 2) % 1_000_000_007;
        for (int i = 0; i < nums.length; i++) {
            while (i <= r && nums[i] + nums[r] > target)
                --r;

            if (r >= i) {
                System.out.println(r - i);
                res += pow[r - i];
                res %= 1_000_000_007L;
            }

        }
        return res;

    }
}
