package RestoretheArrayFromAdjacentPairs;

import java.util.*;

public class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (var pair:adjacentPairs) {
            adj.computeIfAbsent(pair[0],x->new ArrayList<>()).add(pair[1]);
            adj.computeIfAbsent(pair[1],x->new ArrayList<>()).add(pair[0]);
        }
        int start=0;
        for (var node:adj.keySet()) {
            if (adj.get(node).size()==1)
                start = node;
        }
        int n = adj.keySet().size();
        int[] arr = new int[n];

        if (n>0)
            dfs(start,Integer.MAX_VALUE,adj,arr,0);
        return arr;
    }

    private void dfs(int node, int prev, Map<Integer, List<Integer>> adj, int[] arr, int i) {
        arr[i] = node;

        for (var nei:adj.get(node)) {
            if (nei!=prev)
                dfs(nei,node,adj,arr,++i);
        }
    }
}
