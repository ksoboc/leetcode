package KClosestPointstoOrigin;

import java.util.PriorityQueue;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(k, (b,a)->Integer.valueOf(a[0]*a[0]+a[1]*a[1]).compareTo(b[0]*b[0]+b[1]*b[1]));
        for (var point:points) {
            heap.add(point);

            if (heap.size()>k)
                heap.poll();
        }

        int[][] res = new int[k][];

        for (var i=k-1;i>=0;--i) {
            res[i] = heap.poll();
        }
        return res;
    }
}
