package IsGraphBipartite;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBFS {


    public boolean isBipartite(int[][] graph) {
        final int n = graph.length;
        int[] colors = new int[n];


        for (int node = 0; node < n; node++) {
            if (colors[node]!=0)
                continue;

            if (!bfs(graph, colors, node))
                return false;

        }
        return true;
    }

    private boolean bfs(int[][] graph, int[] colors, int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        int color = 1;
        colors[startNode] = color;

        while (!queue.isEmpty()) {
            int qsize = queue.size();
            for (int cnt = 0; cnt < qsize; cnt++) {
                int node = queue.poll();
                for (var neighbour : graph[node]) {
                    if (colors[neighbour] == color)
                        return false;
                    if (colors[neighbour] == 0) {
                        colors[neighbour] = -color;
                        queue.offer(neighbour);
                    }
                }
            }
            color = -color;
        }
        return true;
    }

}
