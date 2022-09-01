package SorttheMatrixDiagonally;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public int[][] diagonalSort(int[][] mat) {
        int nrRows = mat.length;
        int nrCols = mat[0].length;

        class Diag {
            int pos;
            List<Integer> values = new ArrayList<>();
        }

        int shift = nrCols - 1;
        Diag[] diags = new Diag[nrRows+nrCols-1];
        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                int diagIdx = r-c+shift;
                if (diags[diagIdx]==null)
                    diags[diagIdx]=new Diag();
                diags[diagIdx].values.add(mat[r][c]);
            }
        }

        for (var diag:diags
             ) {
            Collections.sort(diag.values);
        }

        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                int diagIdx = r-c+shift;
                mat[r][c] = diags[diagIdx].values.get(diags[diagIdx].pos);
                diags[diagIdx].pos+=1;
            }

        }

        return mat;

    }
}
