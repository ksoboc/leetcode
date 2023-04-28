package SimilarStringGroups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int numSimilarGroups(String[] strs) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        final int n = strs.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSimilar(strs[i], strs[j])) {
                    adj.computeIfAbsent(i, x -> new ArrayList<>()).add(j);
                    adj.computeIfAbsent(j, x -> new ArrayList<>()).add(i);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ++count;
                dfs(i, adj, visited);
            }
        }
        return count;
    }

    private void dfs(int i, Map<Integer, List<Integer>> adj, boolean[] visited) {
        visited[i] = true;
        if (adj.get(i) == null)
            return;
        for (var node : adj.get(i)) {
            if (!visited[node]) {
                dfs(node, adj, visited);
            }
        }
    }

    private boolean isSimilar(String str1, String str2) {
        int nrDiff = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                ++nrDiff;
                if (nrDiff > 2)
                    return false;
            }
        }
        return nrDiff == 0 || nrDiff == 2;
    }
}
