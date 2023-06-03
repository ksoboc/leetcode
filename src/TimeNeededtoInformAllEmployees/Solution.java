package TimeNeededtoInformAllEmployees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] == -1)
                continue;
            adj[manager[i]].add(i);
        }
        return dfs(headID, adj, informTime);
    }

    private int dfs(int empNr, List<Integer>[] adj, int[] informTime) {
        int infTime = informTime[empNr];

        int max = 0;
        for (var subNr : adj[empNr]) {
            max = Math.max(max, dfs(subNr, adj, informTime));
        }
        infTime += max;

        return infTime;
    }
}
