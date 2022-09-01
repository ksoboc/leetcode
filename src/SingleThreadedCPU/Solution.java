package SingleThreadedCPU;

import java.util.*;

import static java.util.Comparator.comparing;

public class Solution {
    public int[] getOrder(int[][] tasks) {
        Map<int[], Integer> indexes = new HashMap<>();
        int[] res = new int[tasks.length];
        for (var i = 0; i < tasks.length; ++i) {
            indexes.put(tasks[i], i);
        }

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                var res = Integer.compare(o1[0], o2[0]);
                if (res == 0)
                    return Integer.compare(o1[1], o2[1]);
                return res;

            }
        };
        Arrays.sort(tasks, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> heap = new PriorityQueue<>(tasks.length, comparator);

        var curTime = 0;
        var i = 0;
        var j = 0;
        while (!heap.isEmpty() || i < tasks.length) {
            while (i < tasks.length && curTime >= tasks[i][0]) {
                heap.add(new int[]{tasks[i][1], indexes.get(tasks[i])});
                ++i;
            }

            if (!heap.isEmpty()) {
                var nextTask = heap.poll();
                var duration = nextTask[0];
                var index = nextTask[1];
                curTime += duration;
                res[j++] = index;
            } else if (i<tasks.length) {
                curTime = tasks[i][0];
            }
        }

        return res;

    }
}
