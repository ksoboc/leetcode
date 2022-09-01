package RangeSumQuery2D;

public class NumMatrix {

    private final int[][] prefMatrix;

    public NumMatrix(int[][] matrix) {
        int nrRows = matrix.length;
        int nrCols = matrix[0].length;
        prefMatrix = new int[nrRows + 1][nrCols + 1];
        for (int r = 0; r < nrRows; r++) {
            int prefix = 0;
            for (int c = 0; c < nrCols; c++) {
                prefix += matrix[r][c];
                prefMatrix[r + 1][c + 1] = prefix + prefMatrix[r][c + 1];
            }

        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        ++row1;
        ++col1;
        ++row2;
        ++col2;
        int bottomRight = prefMatrix[row2][col2];
        int above = prefMatrix[row1 - 1][col2];
        int left = prefMatrix[row2][col1 - 1];
        int leftTop = prefMatrix[row1 - 1][col1 - 1];

        return bottomRight - above - left + leftTop;
    }
}
