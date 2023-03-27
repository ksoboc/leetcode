package MinimizeDeviationinArray;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> qmax = new PriorityQueue<>(Collections.reverseOrder());

        int min = Integer.MAX_VALUE;
        for (var num : nums) {
            num = (num & 1) == 1 ? num << 1 : num;
            min = Math.min(min, num);
            qmax.offer(num);
        }

        int minDif = Integer.MAX_VALUE;
        while (!qmax.isEmpty()) {
            int max = qmax.poll();
            minDif = Math.min(minDif, max - min);
            if ((max & 1) == 1)
                return minDif;

            max >>= 1;

            min = Math.min(min, max);
            qmax.offer(max);

        }
        return 0;
    }
}
