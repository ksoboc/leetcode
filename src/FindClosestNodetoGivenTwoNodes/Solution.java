package FindClosestNodetoGivenTwoNodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        final int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        dist1[node1] = 0;
        dist2[node2] = 0;
//        boolean[] visit1 = new boolean[n];
//        boolean[] visit2 = new boolean[n];

//        dfs(node1, edges, dist1, visit1);
//        dfs(node2, edges, dist2, visit2);
        bfs(node1, edges, dist1);
        bfs(node2, edges, dist2);
        int minDistNode = -1, minDistTillNow = Integer.MAX_VALUE;
        for (int currNode = 0; currNode < n; currNode++) {
            if (minDistTillNow > Math.max(dist1[currNode], dist2[currNode])) {
                minDistTillNow = Math.max(dist1[currNode], dist2[currNode]);
                minDistNode = currNode;
            }
        }
        return minDistNode;
    }

    private void dfs(int node, int[] edges, int[] dist, boolean[] visit) {
        visit[node] = true;
        int neighbor = edges[node];
        if (neighbor != -1 && !visit[neighbor]) {
            dist[neighbor] = 1 + dist[node];
            dfs(neighbor, edges, dist, visit);
        }
    }

    public void bfs(int startNode, int[] edges, int[] dist) {
        final int n = edges.length;
        boolean[] visit = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        dist[startNode]=0;
        while (!queue.isEmpty()) {
            int node=queue.poll();
            if (visit[node])
                continue;
            visit[node]=true;
            int neighbor=edges[node];
            if (neighbor!=-1 && !visit[neighbor]) {
                dist[neighbor]=dist[node]+1;
                queue.offer(neighbor);
            }
        }
    }
}
