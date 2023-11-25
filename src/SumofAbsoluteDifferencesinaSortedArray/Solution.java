package SumofAbsoluteDifferencesinaSortedArray;

public class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        final int n = nums.length;
        int[] sums = new int[n + 1];

        for (int i = 0; i < n; i++)
            sums[i + 1] = sums[i] + nums[i];

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int left = i * nums[i] - sums[i];
            int right = (sums[n] - sums[i + 1]) - (n - i - 1) * nums[i];
            res[i] = left + right;
        }
        return res;
    }
}
