package MaximumSubarrayMinProduct;

import java.util.Stack;

public class Solution {
    public int maxSumMinProduct(int[] nums) {
        var values = new Stack<Integer>();
        var indexes = new Stack<Integer>();
        long res = 0;

        var prefixSum = new long[nums.length + 1];
        prefixSum[0] = 0L;
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            var newStart = i;
            while (!values.isEmpty() && values.peek() > nums[i]) {
                var value = values.pop();
                var index = indexes.pop();
                newStart = index;
                var total = prefixSum[i] - prefixSum[index];
                res = Math.max(res, total * value);
            }
            values.push(nums[i]);
            indexes.push(newStart);

        }

        while (!values.isEmpty()) {
            var value = values.pop();
            var index = indexes.pop();
            var total = prefixSum[nums.length] - prefixSum[index];
            res = Math.max(res, total * value);
        }

        return (int) (res % 1_000_000_007);
    }
}
