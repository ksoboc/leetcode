package EliminateMaximumNumberofMonsters;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] minuteReach = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {
            minuteReach[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }

        Arrays.sort(minuteReach);
        int res = 0;
        for (int minute = 0; minute < minuteReach.length; minute++) {
            if (minute >= minuteReach[minute]) {
                return res;
            }
            ++res;
        }
        return res;

    }

    public int eliminateMaximumHeap(int[] dist, int[] speed) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < dist.length; i++) {
            heap.add( (int) Math.ceil((double) dist[i] / speed[i]) );
        }


        int res = 0;
        int minute=0;
        while (!heap.isEmpty()) {
            if (minute >= heap.poll()) {
                return res;
            }
            ++minute;
            ++res;
        }
        return res;

    }
}
