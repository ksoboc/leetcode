package CourseSchedule;

import java.util.*;

public class Solution {
    Map<Integer, List<Integer>> preMap = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (var pre : prerequisites) {
            var course = pre[1];
            var prereq = pre[0];

            if (!preMap.containsKey(course)) {
                preMap.put(course, new ArrayList<>());
            }

            preMap.get(course).add(prereq);
        }

        for (var course = 0; course < numCourses; ++course) {
            if (!dfs(course))
                return false;
        }
        return true;

    }

    private boolean dfs(int course) {
        var prereq = preMap.get(course);
        if (prereq == null)
            return true;

        visited.add(course);
        for (var pre : prereq) {
            if (visited.contains(pre))
                return false;
            if (!dfs(pre))
                return false;
        }
        visited.remove(course);
        preMap.remove(course);
        return true;
    }


}
