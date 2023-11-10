package RestoretheArrayFromAdjacentPairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionIter {
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

        int prev = Integer.MAX_VALUE;
        int node = start;
        int i=0;
        while (i<n) {
            arr[i++]=node;
            for (var nei:adj.get(node)) {
                if (nei!=prev) {
                    prev=node;
                    node = nei;
                    break;
                }
            }
        }
        return arr;
    }

}
