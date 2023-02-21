package MinimumFallingPathSum;

public class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for (int r = matrix.length - 2; r >= 0; --r) {
            for (int c = 0; c < matrix[r].length; c++) {
                int min = matrix[r + 1][c];
                if (c < matrix[r].length - 1)
                    min = Math.min(min, matrix[r + 1][c + 1]);
                if (c > 0)
                    min = Math.min(min, matrix[r + 1][c - 1]);
                matrix[r][c] += min;
            }
        }

        int minPath = Integer.MAX_VALUE;
        for (int c = 0; c < matrix[0].length; c++) {
            minPath = Math.min(minPath, matrix[0][c]);
        }

        return minPath;
    }
}
