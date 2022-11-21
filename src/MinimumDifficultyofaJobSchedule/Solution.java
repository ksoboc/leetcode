package MinimumDifficultyofaJobSchedule;

public class Solution {
    Integer[][] dp;

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (d > jobDifficulty.length)
            return -1;
        dp = new Integer[jobDifficulty.length + 1][d];
        return minDifficulty(0, 0, jobDifficulty, d);

    }

    private int minDifficulty(int i, int day, int[] jobDifficulty, int d) {
        if (day >= d )
            return 0;

        if (dp[i][day] != null)
            return dp[i][day];

        int minD = Integer.MAX_VALUE;
        int maxV = Integer.MIN_VALUE;
        if (day < d - 1) {
            for (int j = i; j < Math.min(jobDifficulty.length - (d - day) + 1, jobDifficulty.length); j++) {
                maxV = Math.max(maxV, jobDifficulty[j]);
                int diff = maxV + minDifficulty(j + 1, day + 1, jobDifficulty, d);
                minD = Math.min(minD, diff);

            }
        } else {
            for (int j = i; j < jobDifficulty.length; j++) {
                maxV = Math.max(maxV, jobDifficulty[j]);
            }
            minD = maxV;
        }
        dp[i][day] = minD;
        return minD;
    }
}
