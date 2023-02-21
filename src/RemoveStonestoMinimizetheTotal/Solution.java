package RemoveStonestoMinimizetheTotal;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (var pile:piles) {
            pq.offer(pile);
        }

        for (int i = 0; i < k; i++) {
            var pile = pq.poll();
            int floor = (int)Math.floor(pile/2.0);
            pile-=floor;
            pq.offer(pile);
        }
        int total = 0;
        for (var pile:pq)
            total+=pile;

        return total;
    }
}
