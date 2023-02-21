package AsFarfromLandasPossible;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int maxDistance(int[][] grid) {
        final int n = grid.length;
        final int m = grid[0].length;

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    queue.add(new int[]{i, j});
            }

        }

        // If there's no land or water, return -1
        if (queue.isEmpty() || queue.size() == n * m) {
            return -1;
        }
        int maxDist = -1;
        int dist = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                var point = queue.poll();
                --size;
                int x = point[0];
                int y = point[1];
                if (x < 0 || y < 0 || x >= n || y >= n || visited[x][y])
                    continue;
                visited[x][y] = true;
                if (grid[x][y] == 0)
                    maxDist = Math.max(maxDist, dist);

                queue.offer(new int[]{x - 1, y});
                queue.offer(new int[]{x + 1, y});
                queue.offer(new int[]{x, y - 1});
                queue.offer(new int[]{x, y + 1});
            }
            ++dist;
        }
        return maxDist;
    }
}
