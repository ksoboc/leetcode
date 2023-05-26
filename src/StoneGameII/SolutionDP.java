package StoneGameII;

class SolutionDP {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][][] dp = new int[n + 1][n + 1][2];


        for (int pileNr = n - 1; pileNr >= 0; pileNr--) {
            for (int m = 1; m <= n; m++) {
                for (int player = 0; player < 2; player++) {
                    int step = Math.min(2 * m, n - pileNr);
                    int nrStones = 0;
                    boolean aliceMove = player == 0;
                    int res = aliceMove ? 0 : Integer.MAX_VALUE;

                    for (int i = 1; i <= step; i++) {
                        int newM = Math.max(i, m);
                        nrStones += piles[pileNr + i - 1];

                        if (aliceMove) {
                            res = Math.max(res, nrStones + dp[pileNr + i][newM][1]);
                        } else {
                            res = Math.min(res, dp[pileNr + i][newM][0]);
                        }
                    }

                    dp[pileNr][m][player] = res;
                }
            }
        }

        return dp[0][1][0];
    }
}
