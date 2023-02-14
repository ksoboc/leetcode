package MinimumFuelCosttoReporttotheCapital;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private long fuel = 0;
    private int s;

    private int dfs(int node, int parent, List<Integer>[] graph) {
        int people = 1;
        for (int x : graph[node]) {
            if (x == parent) continue;
            people += dfs(x, node, graph);
        }
        if (node != 0) fuel += (people + s - 1) / s;
        return people;
    }

    public long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[] graph = new ArrayList[roads.length + 1];
        s = seats;
        for (int i = 0; i < roads.length + 1; ++i) graph[i] = new ArrayList<>();
        for (int[] r : roads) {
            graph[r[0]].add(r[1]);
            graph[r[1]].add(r[0]);
        }
        dfs(0, 0, graph);
        return fuel;
    }
}
