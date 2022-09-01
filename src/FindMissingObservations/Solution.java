package FindMissingObservations;

public class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sumRolls = 0;
        for (int roll : rolls
        ) {
            sumRolls += roll;
        }
        int nTotal = (n + m) * mean - sumRolls;

        if (nTotal < n || nTotal > 6 * n)
            return new int[]{};

        int[] res = new int[n];

        int left = n;
        while (nTotal > 0) {
            int dice = Math.min(6, nTotal - left + 1);
            nTotal -= dice;
            res[n - left] = dice;
            --left;

        }
        return res;
    }
}
