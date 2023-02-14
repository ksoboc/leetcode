package ShortestPathwithAlternatingColors;

import java.util.*;

public class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        int[][] visited = new int[n][2];

        Map<Integer, Set<Integer>> redMap = createMap(redEdges);
        Map<Integer, Set<Integer>> blueMap = createMap(blueEdges);

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        queue.offer(new int[]{0, 1});
        int dist = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                var pair = queue.poll();
                int vert = pair[0];
                int color = pair[1];
                ++visited[vert][color];
                if (answer[vert]==-1)
                    answer[vert] = dist;


                if (visited[vert][color] < 2) {
                    if (color == 0 && redMap.containsKey(vert)) {
                        for (var vert2 : redMap.get(vert)) {
                            queue.offer(new int[]{vert2, 1});
                        }
                    } else if (color == 1 && blueMap.containsKey(vert)) {
                        for (var vert2 : blueMap.get(vert)) {
                            queue.offer(new int[]{vert2, 0});
                        }
                    }
                }

            }
            ++dist;
        }
        return answer;
    }

    private static Map<Integer, Set<Integer>> createMap(int[][] edges) {
        Map<Integer, Set<Integer>> map;
        map = new HashMap<>();
        for (var edge : edges) {
            map.computeIfAbsent(edge[0], x -> new HashSet<>()).add(edge[1]);
        }
        return map;
    }
}
