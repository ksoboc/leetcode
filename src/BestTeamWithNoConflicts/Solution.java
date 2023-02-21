package BestTeamWithNoConflicts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[][] agesScores;
    private Integer[][] dp;

    public int bestTeamScore(int[] scores, int[] ages) {
        final int n = ages.length;
        agesScores = new int[n][2];
        for (int i = 0; i < ages.length; i++) {
            agesScores[i] = new int[]{ages[i], scores[i]};
        }
        dp = new Integer[n][n];
        Arrays.sort(agesScores, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        return bts(agesScores, -1, 0);
    }

    private int bts(int[][] agesScores, int prev, int i) {
        if (i >= agesScores.length)
            return 0;

        if (dp[prev+1][i]!=null)
            return dp[prev+1][i];

        if (prev == -1 || agesScores[i][1] >= agesScores[prev][1]) {
            dp[prev + 1][i] = Math.max(agesScores[i][1] + bts(agesScores, i, i + 1), bts(agesScores, prev, i + 1));
        } else
            dp[prev + 1][i] = bts(agesScores, prev, i+1);
        return dp[prev+1][i];
    }

}
