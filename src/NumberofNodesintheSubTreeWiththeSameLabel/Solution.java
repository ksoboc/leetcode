package NumberofNodesintheSubTreeWiththeSameLabel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (var edge : edges) {
            adj.computeIfAbsent(edge[0], x -> new ArrayList<Integer>()).add(edge[1]);
            adj.computeIfAbsent(edge[1], x -> new ArrayList<Integer>()).add(edge[0]);
        }
        int[] ans = new int[n];
        char[] label = labels.toCharArray();
        dfs(0, -1, adj, label, ans);
        return ans;
    }

    private int[] dfs(int node, int parent, Map<Integer, List<Integer>> adj, char[] label, int[] ans) {
        int[] nodeCounts = new int[26];
        nodeCounts[label[node] - 'a'] = 1;
        if (!adj.containsKey(node))
            return nodeCounts;
        for (var child : adj.get(node)) {
            if (child == parent)
                continue;
            var childCounts = dfs(child, node, adj, label, ans);
            for (int i = 0; i < childCounts.length; i++) {
                nodeCounts[i] += childCounts[i];
            }
        }
        ans[node] = nodeCounts[label[node] - 'a'];
        return nodeCounts;
    }
}
