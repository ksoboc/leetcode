package CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionF {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (var prereq : prerequisites) {
            adj.computeIfAbsent(prereq[0], x -> new ArrayList<>()).add(prereq[1]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] inStack = new boolean[numCourses];
        for (int node = 0; node < numCourses; ++node) {
            if (!visited[node]) {
                if (dfs(adj, visited, inStack, node))
                    return false;
            }
        }
        return true;
    }


    private boolean dfs(Map<Integer, List<Integer>> adj, boolean[] visited, boolean[] inStack, Integer node) {
        if (inStack[node])
            return true;
        if (visited[node])
            return false;
        visited[node] = true;
        if (adj.get(node) == null)
            return false;
        inStack[node] = true;
        for (var child : adj.get(node)) {
            if (dfs(adj, visited, inStack, child))
                return true;
        }
        inStack[node] = false;
        return false;
    }
}
