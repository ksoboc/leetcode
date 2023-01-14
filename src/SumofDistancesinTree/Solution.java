package SumofDistancesinTree;

import java.util.*;

public class Solution {
    int [] ans, count;
    Map<Integer, List<Integer>> graph;
    int N;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.N = n;
        graph = new HashMap<>();
        ans=new int[n];
        count=new int[n];

        Arrays.fill(count, 1);
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (var edge:edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        dfs(0,-1);
        dfs2(0,-1);

        return ans;
    }

    private void dfs2(int node, int parent) {
        for (int child: graph.get(node))
            if (child != parent) {
                ans[child] = ans[node] - count[child] + N - count[child];
                dfs2(child, node);
            }
    }

    private void dfs(int node, int parent) {
        for (int child: graph.get(node))
            if (child != parent) {
                dfs(child, node);
                count[node] += count[child];
                ans[node] += ans[child] + count[child];
            }
    }
}
