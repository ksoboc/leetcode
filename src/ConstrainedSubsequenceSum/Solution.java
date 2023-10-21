package ConstrainedSubsequenceSum;

import java.util.PriorityQueue;

public class Solution {


    public int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));

        maxHeap.add(new int[]{nums[0],0});

        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (i-maxHeap.peek()[1]>k) {
                maxHeap.poll();
            }
            int curr = Math.max(0, maxHeap.peek()[0]) + nums[i];
            max=Math.max(max,curr);
            maxHeap.offer(new int[]{curr,i});
        }
        return max;

    }


}
