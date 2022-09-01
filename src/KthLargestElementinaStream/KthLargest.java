package KthLargestElementinaStream;

import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    private int k;
    public KthLargest(int k, int[] nums) {
        for (var num:nums)
            heap.offer(num);

        while (heap.size()>k)
            heap.poll();
        this.k=k;
    }

    public int add(int val) {

        if (heap.size()==k && val< heap.peek())
            return heap.peek();
        heap.add(val);
        if (heap.size()>k)
            heap.poll();
        return heap.peek();
    }
}
