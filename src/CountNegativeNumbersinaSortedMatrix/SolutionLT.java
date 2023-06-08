package CountNegativeNumbersinaSortedMatrix;

public class SolutionLT {
    public int countNegatives(int[][] grid) {
        int nrRows = grid.length;
        int nrCols = grid[0].length;
        int firstNonNegativeCol = nrCols - 1;

        int total = 0;
        for (int r = 0; r < nrRows; r++) {
            while (firstNonNegativeCol >= 0 && grid[r][firstNonNegativeCol] < 0)
                --firstNonNegativeCol;
            total += nrCols - (firstNonNegativeCol + 1);
        }

        return total;
    }
}
