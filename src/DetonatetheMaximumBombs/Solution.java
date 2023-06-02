package DetonatetheMaximumBombs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int maximumDetonation(int[][] bombs) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < bombs.length - 1; i++) {
            for (int j = i + 1; j < bombs.length; j++) {
                long dist = ((long) bombs[i][0] - bombs[j][0]) * (bombs[i][0] - bombs[j][0])
                        + ((long) bombs[i][1] - bombs[j][1]) * (bombs[i][1] - bombs[j][1]);
                if ((long) bombs[i][2] * bombs[i][2] >= dist) {
                    adj.computeIfAbsent(i, x -> new ArrayList<>()).add(j);
                }
                if ((long) bombs[j][2] * bombs[j][2] >= dist) {
                    adj.computeIfAbsent(j, x -> new ArrayList<>()).add(i);
                }
            }
        }
        int maxBombs = 0;
        for (int i = 0; i < bombs.length; i++) {
            boolean[] visited = new boolean[bombs.length];
            int nrBombs = dfs(i, adj, visited);
            maxBombs = Math.max(maxBombs, nrBombs);
        }
        return maxBombs;
    }

    private int dfs(int node, Map<Integer, List<Integer>> adj, boolean[] visited) {
        if (visited[node])
            return 0;
        int nrBombs = 1;
        visited[node] = true;
        if (!adj.containsKey(node))
            return nrBombs;
        for (var nei : adj.get(node)) {
            nrBombs += dfs(nei, adj, visited);
        }
        return nrBombs;
    }
}
