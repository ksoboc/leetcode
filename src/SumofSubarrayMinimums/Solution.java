package SumofSubarrayMinimums;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int sumSubarrayMins(int[] arr) {
        final int MOD = 1_000_000_007;
        int[] dp = new int[arr.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            if (stack.isEmpty()) {
                dp[i] = (i + 1) * arr[i];
            } else {
                int j = stack.peek();
                dp[i] = dp[j] + (i - j) * arr[i];
            }
            stack.push(i);
        }
        long total = 0;
        for (int j : dp) {
            total += j % MOD;
            total %= MOD;
        }
        return (int)total;
    }
}
