package CountNegativeNumbersinaSortedMatrix;

public class Solution {
    public int countNegatives(int[][] grid) {
        int nrRows = grid.length;
        int nrCols = grid[0].length;

        int total=0;
        for (int col = 0; col < nrCols; col++) {
            int l=0, r=nrRows-1;
            while (l<=r) {
                int m = l+(r-l)/2;
                if (grid[m][col]>=0) {
                    l=m+1;
                } else {
                    r=m-1;
                }
            }
            total+=nrRows-l;
        }
        return total;



    }
}
