package CarPooling;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        //trips[i] = [numPassengersi, fromi, toi]

        Arrays.sort(trips, (a, b) -> Integer.valueOf(a[1]).compareTo(b[1]));

        // [to,numPassengers]
        PriorityQueue<int[]> heap = new PriorityQueue<>(trips.length, (a, b) -> Integer.valueOf(a[0]).compareTo(b[0]));
        var currPass = 0;
        for (var i = 0; i < trips.length; ++i) {
            var numPass = trips[i][0];
            var from = trips[i][1];
            var to = trips[i][2];

            while (!heap.isEmpty() && heap.peek()[0] <= from) {
                currPass -= heap.poll()[1];
            }
            currPass += trips[i][0];
            if (currPass > capacity)
                return false;
            heap.add(new int[]{to, numPass});
        }
        return true;
    }

    public boolean carPoolingBF(int[][] trips, int capacity) {
        int[] numPassChangeAtStop = new int[1001];

        var max = 0;
        for (var i=0;i<trips.length;++i) {
            numPassChangeAtStop[trips[i][1]] += trips[i][0];
            numPassChangeAtStop[trips[i][2]] -= trips[i][0];
            max = Math.max(max, trips[i][2] );
        }

        var numPass = 0;
        for (var i=0;i<max;++i) {
            numPass += numPassChangeAtStop[i];
            if (numPass>capacity)
                return false;
        }
        return true;
    }
}
