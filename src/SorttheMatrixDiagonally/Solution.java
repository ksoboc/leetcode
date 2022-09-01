package SorttheMatrixDiagonally;

public class Solution {
    private int nrRows;
    private int nrCols;

    public int[][] diagonalSort(int[][] mat) {
        nrRows = mat.length;
        nrCols = mat[0].length;
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
        int[] mp = new int[101];
        while (i < nrRows && j < nrCols) {
            mp[mat[i][j]]++;
            i++;
            j++;
        }
        i = r;
        j = c;
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
