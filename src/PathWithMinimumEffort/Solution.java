package PathWithMinimumEffort;

import java.util.*;

public class Solution {
    public int minimumEffortPath(int[][] heights) {
        final int nrRows = heights.length;
        final int nrCols = heights[0].length;

        final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        final int[][] verticesMin = new int[nrRows][nrCols];
        for (var r:verticesMin)
            Arrays.fill(r, Integer.MAX_VALUE);
        verticesMin[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(x->x[0]));
        pq.offer(new int[]{0,0,0});

        while (!pq.isEmpty()) {
            int[] next = pq.poll();
            int xv = next[1];
            int yv = next[2];
            int vEffort = next[0];
            if (vEffort>verticesMin[xv][yv])
                continue;

            for (var dir : dirs) {
                int xn = xv + dir[0];
                int yn = yv + dir[1];

                if (xn<0||xn>=nrRows||yn<0||yn>=nrCols)
                    continue;
                int newNeiEffort = Math.max(vEffort, Math.abs(heights[xv][yv] - heights[xn][yn]));
                if (newNeiEffort < verticesMin[xn][yn]) {
                    verticesMin[xn][yn] = newNeiEffort;
                    pq.offer(new int[]{newNeiEffort,xn,yn});
                }
            }
        }
        return verticesMin[nrRows-1][nrCols-1];
    }
}
