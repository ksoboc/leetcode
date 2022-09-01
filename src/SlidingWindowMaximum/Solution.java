package SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        var l = 0;
        var r = 0;

        var resIdx = 0;

        List<Integer> res = new ArrayList<>();
        int[] resArr = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        while (r < nums.length) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r]) {
                deque.pollLast();
            }
            deque.offer(r);

            if (l > deque.peekFirst())
                deque.pollFirst();

            if (r + 1 >= k) {
                //res.add(nums[deque.peekFirst()]);
                resArr[resIdx++] = nums[deque.peekFirst()];
                ++l;
            }
            ++r;


        }

        return resArr;
        //return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
