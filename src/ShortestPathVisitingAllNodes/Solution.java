package ShortestPathVisitingAllNodes;

import java.util.*;

public class Solution {
    class Pair {
        int mask;
        int node;

        public Pair(int mask, int node) {
            this.mask = mask;
            this.node = node;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return mask == pair.mask && node == pair.node;
        }

        @Override
        public int hashCode() {
            return Objects.hash(mask, node);
        }
    }
    public int shortestPathLength(int[][] graph) {
        Queue<int[]> queue = new LinkedList<>();
        int n = graph.length;
        int allNodes = (1 << n) - 1;

        Set<Pair> bitmaskNode2Len = new HashSet<>();

        // int[3] - length, bitmask, last node
        for (int start = 0; start < n; ++start) {
            queue.offer(new int[]{0, 1 << start, start});
        }
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int current = pos[2];
            if (pos[1] == allNodes)
                return pos[0];
            for (int node : graph[current]) {
                int[] nPos = new int[3];
                nPos[0] = pos[0] + 1;
                nPos[1] = pos[1] | (1 << node);
                nPos[2] = node;

                Pair bitmaskNode = new Pair(nPos[1],nPos[2]);
                if (bitmaskNode2Len.contains(bitmaskNode) )
                    continue;

                bitmaskNode2Len.add(bitmaskNode);
                queue.offer(nPos);
            }
        }
        return Integer.MIN_VALUE;
    }


}
