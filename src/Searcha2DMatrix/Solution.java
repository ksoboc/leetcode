package Searcha2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nrRows = matrix.length;
        int nrCols = matrix[0].length;

        int l = 0;
        int r = nrRows - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;

            if (matrix[mid][nrCols - 1] < target) {
                l = mid + 1;
            } else if (matrix[mid][0] > target) {
                r = mid - 1;
            } else {
                l = mid;
                break;
            }

        }

        if (r < l)
            return false;
        int row = mid;
        l = 0;
        r = nrCols - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (matrix[row][mid] > target) {
                r = mid - 1;
            } else if (matrix[row][mid] < target) {
                l = mid + 1;

            } else return true;
        }
        return false;
    }

    public boolean searchMatrixSingleBinSearch(int[][] matrix, int target) {
        int l = 0;
        int nrCols = matrix[0].length;
        int r = matrix.length * nrCols - 1;


        while (l <= r) {
            int mid = (l + r) / 2;
            int row = mid / nrCols;
            int col = mid % nrCols;

            if (matrix[row][col] > target) {
                r = mid - 1;
            } else if (matrix[row][col] < target) {
                l = mid + 1;
            } else return true;
        }
        return false;

    }

}
