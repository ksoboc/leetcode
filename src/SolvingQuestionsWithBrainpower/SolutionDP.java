package SolvingQuestionsWithBrainpower;

public class SolutionDP {

    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length + 1];
        for (int i = questions.length - 1; i >= 0; --i) {
            int nextPos = i + questions[i][1] + 1;
            nextPos = nextPos> questions.length? questions.length : nextPos;
            dp[i] = Math.max(dp[i + 1], dp[nextPos] + questions[i][0]);
        }
        return dp[0];
    }

}
