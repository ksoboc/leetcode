package MinimumNumberofTapstoOpentoWateraGarden;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionDP {
    public int minTaps(int n, int[] ranges) {
        int[] dp=new int[n+1];
        final int INF = 1_000_000_000;
        Arrays.fill(dp,INF);
        dp[0]=0;

        for (int i = 0; i < n+1; i++) {
            int left = Math.max(0,i-ranges[i]);
            int right = Math.min(n,i+ranges[i]);
            for (int j = left; j <= right; j++) {
                dp[right] = Math.min(dp[right], dp[j]+1);
            }
        }

        if (dp[n]==INF)
            return -1;
        return dp[n];
    }
}
