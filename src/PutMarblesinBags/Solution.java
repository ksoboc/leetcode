package PutMarblesinBags;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public long putMarbles(int[] weights, int k) {

        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.<Integer>naturalOrder().reversed());
        for (int i = 0; i < weights.length - 1; i++) {
            int cost = weights[i] + weights[i + 1];
            minQueue.offer(cost);
            maxQueue.offer(cost);
        }

        long costMin = 0;
        long costMax = 0;

        for (int i = 0; i < k - 1; i++) {
            int min = minQueue.poll();
            costMin += min;
            int max = maxQueue.poll();
            costMax += max;
        }

        return costMax - costMin;
    }
}
