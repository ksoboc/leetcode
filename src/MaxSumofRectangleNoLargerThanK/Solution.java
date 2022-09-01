package MaxSumofRectangleNoLargerThanK;

public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int nrRows = matrix.length;
        int nrCols = matrix[0].length;
        int[][] sum = new int[nrRows+1][nrCols+1];
        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                if (matrix[r][c]==k)
                    return k;
                sum[r+1][c+1] = sum[r][c+1] + sum[r+1][c] - sum[r][c] + matrix[r][c];
            }
        }
        int res = Integer.MIN_VALUE;
        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                for (int r2 = r; r2 < nrRows; r2++) {
                    for (int c2 = c; c2 < nrCols; c2++) {
                        int areaSum = sum[r2+1][c2+1] - sum[r2+1][c] - sum[r][c2+1] + sum[r][c];
                        if (areaSum==k) return k;
                        if (areaSum<k)
                            res=Math.max(res,areaSum);
                    }

                }
            }

        }
        return res;
    }
}
