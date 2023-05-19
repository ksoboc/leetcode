package IsGraphBipartite;

public class Solution {
    private int[] colors;

    public boolean isBipartite(int[][] graph) {
        final int n = graph.length;
        colors = new int[n];
        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !canColor(i, graph, 1))
                return false;
        }
        return true;
    }

    private boolean canColor(int node, int[][] graph, int color) {
        if (colors[node] == -color)
            return false;
        colors[node] = color;
        for (int neighbour : graph[node]) {
            if (colors[neighbour] == color)
                return false;
            if (colors[neighbour] == 0 && !canColor(neighbour, graph, -color))
                return false;
        }
        return true;
    }
}
