package SolvingQuestionsWithBrainpower;

public class Solution {
    private long[] dp;

    public long mostPoints(int[][] questions) {
        dp = new long[questions.length];

        return mostPoints(questions, 0);
    }

    private long mostPoints(int[][] questions, int i) {
        if (i >= questions.length)
            return 0;
        if (dp[i] != 0)
            return dp[i];
        long res = mostPoints(questions, i + 1);
        res = Math.max(res, questions[i][0] + mostPoints(questions, i + questions[i][1] + 1));
        dp[i] = res;
        return res;
    }
}
