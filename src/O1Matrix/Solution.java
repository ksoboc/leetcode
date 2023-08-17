package O1Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        final int nrows = mat.length;
        final int ncols = mat[0].length;


        int[][] res = new int[nrows][ncols];
        for (int r = 0; r < nrows; r++) {
            for (int c = 0; c < ncols; c++) {
                if (mat[r][c] == 0)
                    queue.offer(new int[]{r, c});
            }
        }

        int[][] neigs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int dist = 0;
        while (!queue.isEmpty()) {
            int qsize = queue.size();
            for (int i = 0; i < qsize; ++i) {
                var coor = queue.poll();
                int r = coor[0];
                int c = coor[1];
                res[r][c] = dist;
                for (var nei : neigs) {
                    int nr = r + nei[0];
                    int nc = c + nei[1];
                    if (nr >= 0 && nc >= 0 && nr < nrows && nc < ncols && mat[nr][nc] == 1) {
                        mat[nr][nc]=0;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
            ++dist;
        }
        return res;
    }
}
