package MaximumLengthofPairChain;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(p -> p[0]));
        int[] dp = new int[pairs.length];

        for (int i = 0; i < pairs.length-1; i++) {
            int e1 = pairs[i][1];
            for (int j = i+1; j < pairs.length; j++) {
                if (pairs[j][0]>e1) {
                    dp[j]=dp[i]+1;
                }
            }
        }

        int max=0;
        for (int i = 0; i < dp.length; i++) {
            max=Math.max(max,dp[i]);
        }
        return max+1;
    }
}
