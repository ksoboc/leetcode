package JumpGameVI;

import java.util.PriorityQueue;

public class Solution {
    public int maxResult(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> Integer.valueOf(y[0]).compareTo(x[0]));
        int n = nums.length;

        pq.offer(new int[]{0, n + k});

        int[] dp = new int[n];
        int max;
        for (int i = n - 1; i >= 0; i--) {
            max = pq.peek()[0];
            dp[i] = max + nums[i];

            pq.offer(new int[]{dp[i], i});
            while (pq.peek()[1] >= i + k) {
                pq.poll();
            }

        }
        return dp[0];

    }
}
