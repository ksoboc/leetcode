package SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rs = 0, re = n - 1;
        int cs = 0, ce = n - 1;
        int val = 1;
        while (re >= rs && ce >= cs) {
            for (int c = cs; c <= ce; c++) {
                matrix[rs][c] = val++;
            }
            for (int r = rs + 1; r <= re; r++) {
                matrix[r][ce] = val++;
            }

            if (re > rs) {
                for (int c = ce - 1; c >= cs; c--) {
                    matrix[re][c] = val++;
                }
            }
            if (ce > cs) {
                for (int r = re - 1; r >= rs + 1; r--) {
                    matrix[r][cs] = val++;
                }
            }
            rs++;
            re--;
            cs++;
            ce--;
        }

        return matrix;
    }
}
