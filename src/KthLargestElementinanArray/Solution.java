package KthLargestElementinanArray;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(k+1);

        for (var num:nums) {
            minPQ.offer(num);
            if (minPQ.size()>k) {
                minPQ.poll();
            }
        }
        return minPQ.peek();
    }
}
