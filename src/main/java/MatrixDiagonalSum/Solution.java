package MatrixDiagonalSum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        final int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += mat[i][i] + mat[n - 1 - i][i];
        }
        if (n % 2 == 1)
            sum -= mat[n / 2][n / 2];
        return sum;

    }
}
