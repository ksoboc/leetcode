package MaximalSquare;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        var nrRows = matrix.length;
        var nrCols = matrix[0].length;

        var row = nrRows - 1;
        var col = nrCols - 1;

        int[][] cache = new int[nrRows][nrCols];

        while (row>=0 && col>=0) {
            for (var c = col; c >= 0; --c) {
                if (matrix[row][c] > '0')
                    cache[row][c] = 1 + Math.min(cache[row + 1][c], Math.min(cache[row + 1][c + 1], cache[row][c + 1]));
                else
                    cache[row][c] = 0;
            }

            for (var r = row - 1; r >= 0; --r) {

            }
            row -= 1;
            col -= 1;
        }




        return 0;

    }
}
