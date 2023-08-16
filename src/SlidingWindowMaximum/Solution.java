package SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        var l = 0;

        var resIdx = 0;

        int[] resArr = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int r=0; r < nums.length;++r) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r]) {
                deque.pollLast();
            }
            deque.offer(r);

            if (l > deque.peekFirst())
                deque.pollFirst();

            if (r + 1 >= k) {
                resArr[resIdx++] = nums[deque.peekFirst()];
                ++l;
            }
        }

        return resArr;
    }
}
