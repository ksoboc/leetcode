package Searcha2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int nrows = matrix.length;
        final int ncols = matrix[0].length;

        int l = 0;
        int r = nrows * ncols - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            int row = mid / ncols;
            int col = mid % ncols;
            if (matrix[row][col] < target) {
                l = mid + 1;
            } else if (matrix[row][col] > target) {
                r = mid - 1;
            } else return true;
        }
        return false;

    }
}
