package ConstrainedSubsequenceSum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionMonotonicQueue {


    public int constrainedSubsetSum(int[] nums, int k) {
        Deque<int[]> monoDeque = new ArrayDeque<>();

        if (nums[0]>0)
            monoDeque.add(new int[]{nums[0],0});

        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (!monoDeque.isEmpty()&& i-monoDeque.peekFirst()[1]>k) {
                monoDeque.pollFirst();
            }
            int curr = (monoDeque.isEmpty() ? 0 : monoDeque.peek()[0]) + nums[i];
            max=Math.max(max,curr);
            while (!monoDeque.isEmpty() && monoDeque.peekLast()[0]<curr) {
                monoDeque.pollLast();
            }
            if (curr>0) {
                monoDeque.offer(new int[]{curr, i});
            }
        }
        return max;

    }


}
