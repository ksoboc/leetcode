package LargestColorValueinaDirectedGraph;

import java.util.*;

public class SolutionDPS {

    private int maxColor;
    private int minColor;

    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (var edge : edges) {
            adj.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
        }

        maxColor = 0;
        minColor = 26;
        for (int i = 0; i < n; ++i) {
            int color = colors.charAt(i) - 'a';
            maxColor = Math.max(maxColor, color);
            minColor = Math.min(minColor, color);
        }
        int[][] count = new int[n][maxColor+1];
        boolean[] visited = new boolean[n];
        boolean[] inStack = new boolean[n];

        int answer = 0;

        for (int node = 0; node < n; node++) {
            answer = Math.max(answer, dfs(node, colors, adj, count, visited, inStack));
        }


        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private int dfs(int node, String colors, Map<Integer, List<Integer>> adj, int[][] count, boolean[] visited, boolean[] inStack) {
        if (inStack[node])
            return Integer.MAX_VALUE;
        if (visited[node])
            return count[node][colors.charAt(node) - 'a'];
        visited[node] = true;
        inStack[node] = true;
        if (adj.containsKey(node)) {
            for (var neighbour : adj.get(node)) {
                if (dfs(neighbour, colors, adj, count, visited, inStack) == Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                for (int i = minColor; i <= maxColor; i++) {
                    count[node][i] = Math.max(count[node][i], count[neighbour][i]);
                }
            }
        }
        ++count[node][colors.charAt(node) - 'a'];
        inStack[node] = false;

        return count[node][colors.charAt(node) - 'a'];
    }
}
