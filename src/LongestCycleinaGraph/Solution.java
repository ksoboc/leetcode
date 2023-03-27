package LongestCycleinaGraph;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int longestCycle(int[] edges) {
        int n = edges.length;
        int longest = -1;
        boolean[] visited = new boolean[n];
        for (int node = 0; node < n; node++) {
            if (visited[node])
                continue;
            Map<Integer, Integer> steps = new HashMap<>();

            int next = node;

            int step = 0;
            while (next != -1) {
                visited[next] = true;

                ++step;
                steps.put(next, step);
                next = edges[next];
                if (next > 0 && visited[next]) {
                    if (steps.containsKey(next)) {
                        longest = Math.max(longest, step - steps.get(next) + 1);
                    }
                    break;
                }
            }
        }
        return longest;
    }

}
