package NumberofMusicPlaylists;

import java.util.Arrays;

public class Solution {
    private final int mod = 1_000_000_007;
    long[][] dp;

    public int numMusicPlaylists(int n, int goal, int k) {

        dp = new long[goal+1][n+1];
        for (var r:dp)
            Arrays.fill(r,-1);
        return (int) (helper(n, goal, 0, k) % mod);
    }

    private long helper(int n, int goal, int usedSongs, int k) {
        if (usedSongs==n && goal==0)
            return 1;

        if (usedSongs>n || goal<=0)
            return 0;

        if (dp[goal][usedSongs]!=-1)
            return dp[goal][usedSongs];

        long sum = (n-usedSongs) * helper(n,goal-1,usedSongs+1, k);
        sum %= mod;

        if (usedSongs>k) {
            sum += (usedSongs-k) * helper(n,goal-1,usedSongs,k);
        }

        sum %= mod;
        dp[goal][usedSongs]=sum;
        return sum;
    }
}
