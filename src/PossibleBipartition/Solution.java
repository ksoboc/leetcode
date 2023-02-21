package PossibleBipartition;

import java.util.*;

public class Solution {
    private Map<Integer, List<Integer>> adj = new HashMap<>();
    private int[] colors;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        for (var pair:dislikes) {
            adj.computeIfAbsent(pair[0], v->new ArrayList<Integer>()).add(pair[1]);
            adj.computeIfAbsent(pair[1], v->new ArrayList<Integer>()).add(pair[0]);
        }
        colors = new int[n+1];
        Arrays.fill(colors,-1);

        for (int v=1;v<=n;++v) {
            if (colors[v]==-1) {
                if (!dfs(v,0))
                    return false;
            }

        }
        return true;

    }

    private boolean dfs(int v, int color) {
        colors[v] = color;
        if (!adj.containsKey(v))
            return true;
        for (var nei:adj.get(v)) {
            if (colors[nei]==color)
                return false;
            else if (colors[nei]==-1) {
                dfs(nei,1-color);
            }
        }
        return true;
    }
}
