package NumberofMusicPlaylists;

import java.util.Arrays;

public class SolutionDP {

    public int numMusicPlaylists(int n, int goal, int k) {
        final int mod = 1_000_000_007;
        long[][] dp = new long[goal+1][n+1];
        dp[0][0]=1;

        for (int g = 1; g <= goal ; g++) {
            for (int usedSongs = 1; usedSongs <= Math.min(n,g); usedSongs++) {
                dp[g][usedSongs] = dp[g-1][usedSongs-1] * (n-usedSongs+1) % mod;
                if (usedSongs>k) {
                    dp[g][usedSongs] += dp[g-1][usedSongs] * (usedSongs-k) % mod;
                }
                dp[g][usedSongs] %= mod;
            }

        }
        return (int) (dp[goal][n]);
    }


}
