package RottingOranges;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int orangesRotting(int[][] grid) {
        var time = 0;
        var fresh = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        var nRows = grid.length;
        var nCols = grid[0].length;

        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                if (grid[r][c] == 2)
                    deque.offer(new int[]{r, c});
                if (grid[r][c] == 1)
                    fresh += 1;

            }

        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!deque.isEmpty() && fresh > 0) {
            var len = deque.size();
            for (int i = 0; i < len; i++) {
                var next = deque.poll();
                var r = next[0];
                var c = next[1];
                for (var dir : directions) {
                    var r1 = r + dir[0];
                    var c1 = c + dir[1];
                    if (r1 < 0 || r1 >= nRows || c1 < 0 || c1 >= nCols || grid[r1][c1] != 1)
                        continue;
                    grid[r1][c1] = 2;
                    fresh -= 1;
                    deque.offer(new int[]{r1, c1});
                }
            }
            time += 1;


        }


        return fresh > 0 ? -1 : time;
    }
}
