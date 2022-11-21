package ShortestPathinaGridwithObstaclesElimination;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {
    public int shortestPath(int[][] grid, int k) {

        if (k >= grid.length + grid[0].length - 2) return grid.length + grid[0].length - 2;
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int[][] visited = new int[grid.length][grid[0].length];
        for (int r = 0; r < grid.length; r++) {
            Arrays.fill(visited[r], -1);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        int pathLen = 0;
        queue.offer(new int[]{0, 0, k});
        while (!queue.isEmpty()) {
            var qsize = queue.size();

            for (int i = 0; i < qsize; i++) {
                var p = queue.poll();
                int r = p[0];
                int c = p[1];
                int rk = p[2];
                if (visited[r][c] >= rk) continue;
                visited[r][c] = rk;
                if (r == grid.length - 1 && c == grid[0].length - 1)
                    return pathLen;
                for (var move : moves) {
                    int nr = r + move[0];
                    int nc = c + move[1];
                    if (nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length)
                        continue;
                    if (grid[nr][nc] == 1) {
                        if (rk > 0)
                            queue.offer(new int[]{nr, nc, rk - 1});
                    } else
                        queue.offer(new int[]{nr, nc, rk});
                }
            }
            ++pathLen;
        }
        return -1;
    }
}
