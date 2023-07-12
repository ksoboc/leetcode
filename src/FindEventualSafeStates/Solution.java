package FindEventualSafeStates;

import java.util.*;

public class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n= graph.length;
        int[] outgoing = new int[n];
        List<Integer>[] incoming = new List[n];
        for (int i = 0; i < n ; i++) {
            incoming[i] = new ArrayList<>();
        }

        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            var vertices=graph[i];
            outgoing[i] = vertices.length;
            if (vertices.length==0)
                queue.offer(i);
            for (int v:vertices) {
                incoming[v].add(i);
            }
        }

        List<Integer> res=new ArrayList<>();
        while (!queue.isEmpty()) {
            int i=queue.poll();
            res.add(i);
            for (var v:incoming[i]) {
                --outgoing[v];
                if (outgoing[v]==0)
                    queue.offer(v);
            }
        }
        Collections.sort(res);
        return res;
    }
}
