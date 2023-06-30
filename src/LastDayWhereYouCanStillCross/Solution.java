package LastDayWhereYouCanStillCross;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int l = 0, r = cells.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (canCross(cells, row, col, m)) {
                l = m+1;
            } else {
                r = m - 1;
            }
        }

        return l-1;

    }

    private final int[][] dirs = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    private boolean canCross(int[][] cells, final int row, final int col, final int m) {
        int[][] grid = new int[row][col];

        for (int i = 0; i < m; i++) {
            var cell = cells[i];
            grid[cell[0] - 1][cell[1] - 1] = 1;
            grid[cell[0] - 1][cell[1] - 1] = -1;
        }


        Queue<int[]> queue = new LinkedList<>();
        for (int c = 0; c < col; c++) {
            if (grid[0][c] == 0)
                queue.offer(new int[]{0, c});
        }
        while (!queue.isEmpty()) {
            var currPos = queue.poll();
            if (currPos[0] == row - 1)
                return true;

            for (var dir : dirs) {
                int nr = currPos[0] + dir[0];
                int nc = currPos[1] + dir[1];
                if (nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 0) {
                    queue.offer(new int[]{nr, nc});
                    grid[nr][nc] = -1;
                }
            }
        }
        return false;
    }
}
