package LastStoneWeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone :
                stones) {
            queue.add(stone);
        }

        while (queue.size() >= 2) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();

            if (stone1 > stone2) {
                queue.offer(stone1 - stone2);
            }
        }
        queue.offer(0);
        return queue.poll();

    }
}
