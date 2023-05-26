package StoneGameII;

import java.util.Arrays;

public class Solution {
    int[][][] dp;

    public int stoneGameII(int[] piles) {
        dp = new int[piles.length + 1][piles.length + 1][2];
        for (int i = 0; i < piles.length + 1; i++) {
            for (int j = 0; j < piles.length + 1; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return stoneGameII(piles, 0, 1, 0);
    }

    private int stoneGameII(int[] piles, int pileNr, int m, int player) {
        if (pileNr >= piles.length)
            return 0;

        int step = Math.min(2 * m, piles.length - pileNr);
        if (dp[pileNr][step][player] != -1)
            return dp[pileNr][step][player];

        int nrStones = 0;
        boolean aliceMove = player == 0;
        int res = aliceMove ? 0 : Integer.MAX_VALUE;
        for (int i = 1; i < step + 1; i++) {
            int newM = Math.max(i, m);
            nrStones += piles[pileNr + i - 1];
            if (aliceMove) {
                res = Math.max(res, nrStones + stoneGameII(piles, pileNr + i, newM, 1));
            } else {
                res = Math.min(res, stoneGameII(piles, pileNr + i, newM, 0));
            }
        }
        dp[pileNr][step][player]=res;
        return res;
    }
}
