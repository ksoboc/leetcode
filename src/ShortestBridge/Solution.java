package ShortestBridge;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int shortestBridge(int[][] grid) {
        int n = grid.length;

        int x = 0, y = 0;
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                    break outer;
                }
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        addIsland(grid, x, y, queue, visited);

        int bridgeLen = 0;
        boolean[][] visited2 = new boolean[n][n];


        boolean found=false;
        while (!found && !queue.isEmpty()) {
            int qsize = queue.size();

            for (int i = 0; i < qsize; i++) {
                var point = queue.poll();
                if (visited2[point[0]][point[1]])
                    continue;
                if (grid[point[0]][point[1]] == 1 && !visited[point[0]][point[1]]) {
                    found = true;
                    break;
                }
                visited2[point[0]][point[1]] = true;

                for (var dir : dirs) {
                    int nx = point[0] + dir[0];
                    int ny = point[1] + dir[1];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                        queue.offer(new int[]{nx, ny});
                    }
                }

            }
            if (!found)
                ++bridgeLen;
        }
        return bridgeLen-1;
    }

    private void addIsland(int[][] grid, int x, int y, Queue<int[]> queue, boolean[][] visited) {
        if (grid[x][y] == 0 || visited[x][y])
            return;
        visited[x][y] = true;
        queue.offer(new int[]{x, y});
        for (var dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid.length) {
                addIsland(grid, nx, ny, queue, visited);
            }
        }
    }
}
