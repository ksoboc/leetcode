package FindifPathExistsinGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private boolean[] visited;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        visited=new boolean[n];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
        }
        return dfs(source,destination, graph);

    }

    private boolean dfs(int source, int destination, Map<Integer,List<Integer>> graph) {
        if (source==destination)
            return true;

        if (visited[source])
            return false;

        visited[source]=true;
        for (int edge:graph.get(source)) {
            if (dfs(edge,destination,graph))
                return true;
        }
        return false;
    }
}
