package AllPathsFromSourcetoTarget;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        if (graph.length==0)
            return res;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, res, path, 0);
        return res;
    }

    private void dfs(int[][] graph, List<List<Integer>> res, List<Integer> path, int n) {
        if (n==graph.length-1) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int node:graph[n]) {
            path.add(node);
            dfs(graph,res,path,node);
            path.remove(path.size()-1);
        }
    }
}
