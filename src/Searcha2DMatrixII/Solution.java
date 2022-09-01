package Searcha2DMatrixII;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nrRows = matrix.length;
        int nrCols = matrix[0].length;

        int rightRow = nrRows-1, leftRow = 0;

        while (leftRow <= rightRow) {
            int mid = (rightRow + leftRow) / 2;
            if (matrix[mid][0] > target) {
                rightRow = mid - 1;
            } else if (matrix[mid][nrCols - 1] < target) {
                leftRow = mid + 1;
            } else break;
        }
        if (leftRow > rightRow)
            return false;

        for (int i = leftRow; i <= rightRow; i++) {
            int r = nrCols-1, l = 0;
            while (l <= r) {
                int mid = (r + l) / 2;
                if (matrix[i][mid] > target) {
                    r = mid - 1;
                } else if (matrix[i][mid] < target) {
                    l = mid + 1;
                } else return true;
            }

        }
        return false;

    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int nrRows = matrix.length;
        int nrCols = matrix[0].length;

        int r=nrRows-1;
        int c=0;
        while (r>=0 && r<nrRows && c>=0 && c<nrCols) {
            if (matrix[r][c]>target) {
                --r;
            } else if (matrix[r][c]<target) {
                ++c;
            } else return true;
        }
        return false;
    }
}
