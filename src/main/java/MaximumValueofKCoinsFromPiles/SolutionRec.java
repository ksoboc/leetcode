package MaximumValueofKCoinsFromPiles;

import java.util.List;

class SolutionRec {
    int[][] dp;

    private int f(List<List<Integer>> piles, int pileNr, int coinsToTake) {
        if (pileNr == 0) {
            return 0;
        }
        if (dp[pileNr][coinsToTake] != 0) {
            return dp[pileNr][coinsToTake];
        }
        int currentSum = 0;
        int max = f(piles, pileNr - 1, coinsToTake);
        for (int currentCoins = 1; currentCoins <= Math.min(piles.get(pileNr - 1).size(), coinsToTake); currentCoins++) {
            currentSum += piles.get(pileNr - 1).get(currentCoins - 1);
            max = Math.max(max, f(piles, pileNr - 1, coinsToTake - currentCoins) + currentSum);
        }
        dp[pileNr][coinsToTake]=max;
        return dp[pileNr][coinsToTake];
    }

    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        dp = new int[n + 1][k + 1];
        return f(piles, n, k);
    }
}
