package countVowelPermutation;

public class Solution {
    public int countVowelPermutation(int n) {
        final long mod = 1_000_000_007;
        long[] dp = new long[5];

        for (int i = 0; i < 5; i++) {
            dp[i]=1;
        }

        long[] newDp = new long[5];
        int a=0,e=1,i=2,o=3,u=4;
        for (int j = n-2; j >= 0; j--) {

            newDp[a] = dp[e] ;
            newDp[e] = (dp[a] + dp[i]) % mod;
            newDp[i] = (dp[a] + dp[e] + dp[o] + dp[u]) % mod;
            newDp[o] = (dp[i] + dp[u]) % mod;
            newDp[u] = dp[a];

            long[] tmp=newDp;
            newDp = dp;
            dp=tmp;
        }

        long count = 0;
        for (int j = 0; j < 5; j++) {
            count = (count+dp[j]) % mod;
        }
        return (int)count;
    }
}
