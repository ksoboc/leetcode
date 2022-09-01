package GridGame;

import java.util.Arrays;

public class Solution {
    public long gridGame(int[][] grid) {
        int nrCols = grid[0].length;

        long[] prefix1 = new long[nrCols];
        long[] prefix2 = new long[nrCols];

        for (int i = 0; i < nrCols; i++) {
            prefix1[i]=grid[0][i];
            prefix2[i]=grid[1][i];
        }

        for (int i = 1; i < nrCols; i++) {
            prefix1[i]+=prefix1[i-1];
            prefix2[i]+=prefix2[i-1];
        }

        long res = Long.MAX_VALUE;
        for (int i = 0; i < nrCols; i++) {
            long top = prefix1[nrCols-1] - prefix1[i];
            long bottom = (i>0) ? prefix2[i-1]:0;
            long secondRobot = Math.max(top,bottom);
            res = Math.min(res,secondRobot);
        }
        return res;
    }
}
