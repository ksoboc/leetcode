package SubarraySumsDivisiblebyK;

public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainders = new int[k];
        remainders[0] = 1;
        int curRemainder = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            curRemainder = (curRemainder + nums[i] % k + k) % k;

            result += remainders[curRemainder];
            ++remainders[curRemainder];
        }
        return result;
    }
}
