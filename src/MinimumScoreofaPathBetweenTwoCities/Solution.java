package MinimumScoreofaPathBetweenTwoCities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private int min = Integer.MAX_VALUE;


    public int minScore(int n, int[][] roads) {
        Map<Integer, List<int[]>> edges = new HashMap<>();
        for (var road : roads) {
            edges.computeIfAbsent(road[0], k -> new ArrayList<>()).add(new int[]{road[1], road[2]});
            edges.computeIfAbsent(road[1], k -> new ArrayList<>()).add(new int[]{road[0], road[2]});
        }
        boolean[] visited = new boolean[n];
        helper(1, edges, visited);
        return min;
    }

    private void helper(int start, Map<Integer, List<int[]>> edges, boolean[] visited) {
        if (!visited[start-1] && edges.containsKey(start)) {
            visited[start-1] = true;
            for (var vertice : edges.get(start)) {
                min = Math.min(min, vertice[1]);
                helper(vertice[0], edges, visited);
            }
        }
    }
}
