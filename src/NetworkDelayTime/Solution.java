package NetworkDelayTime;

import java.util.*;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer, List<int[]>> neighbours = new HashMap<>();
        for (var time : times) {
            var start = time[0];
            var end = time[1];
            var t = time[2];

            if (!neighbours.containsKey(start))
                neighbours.put(start, new ArrayList<>());
            neighbours.get(start).add(new int[]{end, t});
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.valueOf(a[0]).compareTo(b[0]));
        heap.add(new int[]{0, k});
        Set<Integer> visited = new HashSet<>();

        var time = 0;
        while (!heap.isEmpty()) {
            var nextPair = heap.poll();
            var node = nextPair[1];
            var t1 = nextPair[0];
            if (visited.contains(node))
                continue;
            visited.add(node);
            time = Math.max(time, t1);

            if (!neighbours.containsKey(node))
                continue;
            for (var neighbour : neighbours.get(node)) {
                var nei = neighbour[0];
                var t2 = neighbour[1];
                if (visited.contains(nei))
                    continue;
                heap.offer(new int[]{t1 + t2, nei});
            }

        }
        return (visited.size()==n)?time:-1;
    }
}
