package CountWaysToBuildGoodStrings;

public class SolutionDP {


    public int countGoodStrings(int low, int high, int zero, int one) {
        final int mod = 1_000_000_007;
        int[] dp = new int[high + 1];
        int res = 0;
        for (int l = high; l >= 0; l--) {
            res = l < low ? 0 : 1;
            if (l + zero <= high)
                res += dp[l + zero];
            if (l + one <= high)
                res += dp[l + one];
            dp[l] = res % mod;

        }
        return dp[0];
    }


}
