package SorttheMatrixDiagonally;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution3 {
    private int nrRows;
    private int nrCols;
    private int[][] diags;
    private int shift;

    public int[][] diagonalSort(int[][] mat) {
        nrRows = mat.length;
        nrCols = mat[0].length;


        shift = nrCols - 1;
        diags = new int[nrRows + nrCols - 1][101];
        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                int diagIdx = r - c + shift;

                ++diags[diagIdx][mat[r][c]];
            }
        }

        for (int i = 0; i < nrRows; i++) {
            countSort(mat, i, 0);
        }
        for (int j = 1; j < nrCols; j++) {
            countSort(mat, 0, j);
        }

        return mat;

    }

    private void countSort(int[][] mat, int r, int c) {

        int i = r, j = c;
        int nrDiag = r-c + shift;
        int[] mp = diags[nrDiag];
        for (int k = 1; k < mp.length; k++) {
            while (mp[k] > 0) {
                mat[i][j] = k;
                mp[k]--;
                i++;
                j++;
            }
        }
    }
}
