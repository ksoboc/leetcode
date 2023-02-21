package SumofSubarrayMinimums;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {
    public int sumSubarrayMins(int[] arr) {
        final int MOD = 1_000_000_007;

        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        long total = 0;
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();

                long count = ((long)mid - leftBoundary) * (i - mid) % MOD;

                total += (count * arr[mid]) % MOD;
                total %= MOD;
            }
            stack.push(i);
        }
        return (int) total;

    }
}
