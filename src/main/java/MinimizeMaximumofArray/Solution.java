package MinimizeMaximumofArray;

public class Solution {
    public int minimizeArrayValue(int[] nums) {
        long answer = 0;
        long prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            answer = (long)Math.max(answer, Math.ceil((double)prefixSum/ (i + 1)));
        }
        return (int) answer;
    }
}
