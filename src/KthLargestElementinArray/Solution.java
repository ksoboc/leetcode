package KthLargestElementinArray;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (var num:nums) {
            pq.add(num);
            if (pq.size()>k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
