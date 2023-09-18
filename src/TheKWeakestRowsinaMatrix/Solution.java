package TheKWeakestRowsinaMatrix;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];

        int[][] rows = new int[mat.length][2];

        for (int r = 0; r < mat.length; r++) {
            int nrSoldiers = 0;
            while (nrSoldiers<mat[r].length && mat[r][nrSoldiers]==1) {
                ++nrSoldiers;
            }
            rows[r][0]=nrSoldiers;
            rows[r][1]=r;
        }

        Arrays.sort(rows, Comparator.comparingInt((int[] x)->x[0]).thenComparing(y->y[1]));

        for (int i = 0; i < k; i++) {
            res[i] = rows[i][1];
        }
        return res;
    }
}
