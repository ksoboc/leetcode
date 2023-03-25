package CountUnreachablePairsofNodesinanUndirectedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionDFS {

    public long countPairs(int n, int[][] edges) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (var edge:edges) {
            adj.computeIfAbsent(edge[0],x->new ArrayList<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1],x->new ArrayList<>()).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        long numberOfPaths = 0;
        long remainingNodes=n;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = dfs(i,visited,adj);
                remainingNodes-=count;
                numberOfPaths +=  remainingNodes * count;
            }
        }

        return numberOfPaths;
    }

    private int dfs(int node, boolean[] visited, Map<Integer,List<Integer>> adj) {
        visited[node]=true;
        if (adj.get(node)==null)
            return 1;
        int count = 1;
        for (var n:adj.get(node)) {
            if (!visited[n]) {
                count += dfs(n, visited, adj);
            }
        }
        return count;
    }
}
