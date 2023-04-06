package NumberofClosedIslands;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    private boolean[][] visited;
    private int[][] grid;

    public int closedIsland(int[][] grid) {
        int nrRows = grid.length;
        int nrCols = grid[0].length;
        this.grid = grid;
        visited = new boolean[nrRows][nrCols];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int c = 0; c < nrCols; c++) {
            if (grid[0][c] == 0)
                queue.offer(new int[]{0, c});
            if (grid[nrRows - 1][c] == 0)
                queue.offer(new int[]{nrRows - 1, c});
        }
        for (int r = 1; r < nrRows - 1; r++) {
            if (grid[r][0] == 0)
                queue.offer(new int[]{r, 0});
            if (grid[r][nrCols - 1] == 0)
                queue.offer(new int[]{r, nrCols - 1});
        }
        bfs(nrRows, nrCols, queue);
        int nrSeaLockedIslands = 0;
        for (int r = 1; r < nrRows - 1; r++) {
            for (int c = 1; c < nrCols - 1; c++) {
                if (grid[r][c] == 0 && !visited[r][c]) {
                    ++nrSeaLockedIslands;
                    queue.offer(new int[]{r, c});
                    bfs(nrRows, nrCols, queue);
                }
            }

        }
        return nrSeaLockedIslands;
    }

    private void bfs(int nrRows, int nrCols, Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            var coord = queue.poll();
            int x = coord[0];
            int y = coord[1];
            if (x < 0 || x >= nrRows || y < 0 || y >= nrCols || grid[x][y] != 0 || visited[x][y])
                continue;
            visited[x][y] = true;
            queue.offer(new int[]{x + 1, y});
            queue.offer(new int[]{x - 1, y});
            queue.offer(new int[]{x, y - 1});
            queue.offer(new int[]{x, y + 1});
        }
    }
}
