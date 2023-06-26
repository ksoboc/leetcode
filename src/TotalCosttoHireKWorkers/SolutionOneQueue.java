package TotalCosttoHireKWorkers;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SolutionOneQueue {
    public long totalCost(int[] costs, int k, int candidates) {
        Comparator<int[]> comparator = Comparator.comparingInt((int[] a) -> a[1]).thenComparing(a -> a[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<>(comparator);

        int n = costs.length;
        for (int i = 0; i < candidates; i++) {
            queue.offer(new int[]{0, costs[i]});
        }
        for (int i = Math.max(candidates, n - candidates); i < n; i++) {
            queue.offer(new int[]{1, costs[i]});
        }

        long total = 0;
        int nextLeft = candidates;
        int nextRight = n - 1 - candidates;
        for (int s = 0; s < k; s++) {

            var chosen = queue.poll();
            total += chosen[1];

            if (nextLeft <= nextRight) {
                if (chosen[1] == 0) {
                    queue.offer(new int[]{0, costs[nextLeft]});
                    ++nextLeft;
                } else {
                    queue.offer(new int[]{1, costs[nextRight]});
                    --nextRight;
                }
            }

        }
        return total;
    }

}
