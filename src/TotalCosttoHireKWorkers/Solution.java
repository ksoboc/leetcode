package TotalCosttoHireKWorkers;

import java.util.PriorityQueue;

public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();

        int n = costs.length;
        for (int i = 0; i < candidates; i++) {
            left.offer(costs[i]);
        }
        for (int i = Math.max(candidates,n-candidates); i < n; i++) {
            right.offer(costs[i]);
        }

        long total = 0;
        int nextLeft = candidates;
        int nextRight = n-1-candidates;
        for (int s = 0; s < k ; s++) {

            if ((right.isEmpty() && !left.isEmpty()) ||
                    (!right.isEmpty() && !left.isEmpty() && left.peek() <= right.peek())) {
                total+=left.poll();
                if (nextLeft<=nextRight) {
                    left.offer(costs[nextLeft]);
                    ++nextLeft;
                }
            } else if (!right.isEmpty()){
                total+=right.poll();
                if (nextLeft<=nextRight) {
                    right.offer(costs[nextRight]);
                    --nextRight;
                }

            }

        }
        return total;
    }

}
