package NumberofWaystoStayintheSamePlaceAfterSomeSteps;

import java.util.Arrays;

public class SolutionDP {


    public int numWays(int steps, int arrLen) {
        final int mod = 1_000_000_007;
        long[][] dp = new long[steps + 1][Math.min(arrLen, steps) + 1];
        dp[0][0] = 1;

        for (int stepsLeft = 1; stepsLeft <= steps; ++stepsLeft) {
            for (int pos = 0; pos <= Math.min(arrLen, steps); ++pos) {
                long res = 0;
                if (pos > 0) {
                    res += dp[stepsLeft - 1][pos - 1];
                }
                if (pos < arrLen - 1 && pos < steps) {
                    res += dp[stepsLeft - 1][pos + 1];
                }
                res += dp[stepsLeft - 1][pos];
                res %= mod;
                dp[stepsLeft][pos] = res;
            }

        }

        return (int) dp[steps][0];
    }

}
