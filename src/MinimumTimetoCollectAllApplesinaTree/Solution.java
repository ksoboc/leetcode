package MinimumTimetoCollectAllApplesinaTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer,List<Integer>> adj = new HashMap<>();
        for (var edge:edges) {
            adj.computeIfAbsent(edge[0], x->new ArrayList<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1], x->new ArrayList<>()).add(edge[0]);
        }

        return dfs(0,-1,adj,hasApple);

    }

    private int dfs(int node, int parent, Map<Integer, List<Integer>> adj, List<Boolean> hasApple) {
        int totalTime = 0;
        int childTime = 0;

        if (adj.get(node)!=null) {
            for (var child : adj.get(node)) {
                if (child==parent)
                    continue;
                childTime = dfs(child, node, adj, hasApple);
                if (childTime > 0 || hasApple.get(child)) {
                    totalTime += childTime + 2;
                }
            }
        }
        return totalTime;
    }
}
