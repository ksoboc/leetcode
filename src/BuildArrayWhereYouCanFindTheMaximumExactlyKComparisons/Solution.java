package BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons;

public class Solution {
    private Integer[][][] dp;
    private final int mod = 1_000_000_007;
    public int numOfArrays(int n, int m, int k) {
        dp = new Integer[n+1][m+1][k+1];
        return helper(0,-1,0,n,m,k);
    }

    private int helper(int in, int maxSoFar, int ik, int n, int m, int k) {
        if (in==n) {
            return ik==k?1:0;
        }
        if (ik>k)
            return 0;
        if (n-in<k-ik)
            return 0;
        if (m-maxSoFar<k-ik)
            return 0;

        if (maxSoFar>=0 && dp[in][maxSoFar][ik]!=null)
            return dp[in][maxSoFar][ik];

        int cnt=0;

        for (int i=1;i<=m;++i) {
            int nik=1;

            nik = i > maxSoFar ? ik + 1 : ik;

            int nim = Math.max(maxSoFar,i);
            cnt += helper(in+1,nim,nik,n,m,k);
            cnt %= mod;
        }
        if (maxSoFar>=0)
            dp[in][maxSoFar][ik]=cnt;
        return cnt;
    }
}
