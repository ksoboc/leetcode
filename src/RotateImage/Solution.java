package RotateImage;

class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    public void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }

    public void rotate2(int[][] matrix) {
        var l = 0;
        var r = matrix[0].length-1;
        var t = 0;
        var b = matrix.length-1;

        while (r > l) {
            for (var i = 0; i < r - l; ++i) {
                var tmp = matrix[l + i][t];
                matrix[l + i][t] = matrix[r][t + i];
                matrix[r][t + i] = matrix[r - i][b];
                matrix[r - i][b] = matrix[l][b - i];
                matrix[l][b - i] = tmp;
            }
            r = r - 1;
            l = l + 1;
            t = t + 1;
            b = b - 1;
        }
    }
}