package MinimumInsertionStepstoMakeaStringPalindrome;

public class SolutionDP {


    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];

        for (int l = n - 1; l >= 0; --l) {
            for (int r = l+1; r < n; ++r) {
                dp[l][r] = s.charAt(l) != s.charAt(r) ? 1 + Math.min(dp[l][r - 1], dp[l + 1][r]) :
                        dp[l + 1][r - 1];
            }
        }

        return dp[0][n-1];
    }


}
