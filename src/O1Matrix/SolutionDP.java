package O1Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionDP {
    public int[][] updateMatrix(int[][] mat) {

        final int nrows = mat.length;
        final int ncols = mat[0].length;

        int[][] res = new int[nrows][ncols];
        for (int r = 0; r < nrows; r++) {
            for (int c = 0; c < ncols; c++) {
                if (mat[r][c] == 1)
                    res[r][c] = 9999;
            }
        }

        for (int r = 0; r < nrows; r++) {
            for (int c = 0; c < ncols; c++) {
                if (mat[r][c]==0)
                    continue;
                if (r > 0 && c > 0) {
                    res[r][c] = Math.min(res[r - 1][c], res[r][c - 1]) + 1;
                } else if (r > 0) {
                    res[r][c] = res[r - 1][c] + 1;
                } else if (c > 0) {
                    res[r][c] = res[r][c - 1] + 1;
                }
            }
        }

        for (int r = nrows - 1; r >= 0; r--) {
            for (int c = ncols-1; c >= 0; c--) {
                if (mat[r][c]==0)
                    continue;
                if (r < nrows - 1 && c < ncols - 1) {
                    res[r][c] = Math.min(res[r][c], Math.min(res[r + 1][c], res[r][c + 1]) + 1);
                } else if (r < nrows - 1) {
                    res[r][c] = Math.min(res[r][c], res[r + 1][c] + 1);
                } else if (c < ncols - 1) {
                    res[r][c] = Math.min(res[r][c], res[r][c + 1] + 1);
                }

            }

        }
        return res;
    }
}
