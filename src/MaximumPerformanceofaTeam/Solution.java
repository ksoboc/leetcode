package MaximumPerformanceofaTeam;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] effSpd = new int[n][2];

        for (int i = 0; i < n; i++) {
            effSpd[i][0] = efficiency[i];
            effSpd[i][1] = speed[i];
        }
        Arrays.sort(effSpd, (a, b) -> Integer.compare(b[0], a[0]));
        PriorityQueue<Integer> speeds = new PriorityQueue<>();

        long res = 0L;
        int curSpeed = 0;
        for (int i = 0; i < n; i++) {
            if (speeds.size() >= k) {
                curSpeed -= speeds.poll();
            }
            int eff = effSpd[i][0];
            curSpeed += effSpd[i][1];
            speeds.offer(effSpd[i][1]);

            res = Math.max(res, (long) eff * curSpeed);
        }
        return (int)(res % 1_000_000_007L);
    }
}
