package LargestColorValueinaDirectedGraph;

import java.util.*;

public class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] incoming = new int[n];
        for (var edge : edges) {
            adj.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
            ++incoming[edge[1]];
        }

        Queue<Integer> queue = new LinkedList<>();
        int maxColor = 0;
        int minColor = 26;
        for (int i = 0; i < n; ++i) {
            if (incoming[i] == 0)
                queue.offer(i);
            int color = colors.charAt(i) - 'a';
            maxColor = Math.max(maxColor, color);
            minColor = Math.min(minColor, color);
        }
        int[][] count = new int[n][maxColor + 1];
        int nodesSeen = 0;
        int answer = 1;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ++nodesSeen;
            answer = Math.max(answer, ++count[node][colors.charAt(node) - 'a']);
            if (!adj.containsKey(node))
                continue;
            for (var neighbour : adj.get(node)) {
                for (int i = minColor; i <= maxColor; i++) {
                    count[neighbour][i] = Math.max(count[neighbour][i], count[node][i]);
                }
                if (--incoming[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }

        }

        return nodesSeen >= n ? answer : -1;
    }
}
