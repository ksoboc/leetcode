package BestTeamWithNoConflicts;

import java.util.Arrays;
import java.util.Comparator;

// Solution using fenwick tree
public class SolutionFT {
    public int bestTeamScore(int[] scores, int[] ages) {
        int N = ages.length;
        int[][] scoreAgePair = new int[N][2];

        for (int i = 0; i < N; i++) {
            scoreAgePair[i][0] = scores[i];
            scoreAgePair[i][1] = ages[i];
        }

        // Sort in ascending order of score and then by age.
        Arrays.sort(scoreAgePair, (a, b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);

        int highestAge = 0;
        for (int i : ages) {
            highestAge = Math.max(highestAge, i);
        }
        int[] BIT = new int[highestAge + 1];

        int answer = Integer.MIN_VALUE;
        for (int[] ageScore : scoreAgePair) {
            // Maximum score up to this age might not have all the players of this age.
            int currentBest = ageScore[0] + queryBIT(BIT, ageScore[1]);
            // Update the tree with the current age and its best score.
            updateBIT(BIT, ageScore[1], currentBest);

            answer = Math.max(answer, currentBest);
        }

        return answer;
    }

    // Query tree to get the maximum score up to this age.
    private int queryBIT(int[] BIT, int age) {
        int maxScore = Integer.MIN_VALUE;
        for (int i = age; i > 0; i -= i & (-i)) {
            maxScore = Math.max(maxScore, BIT[i]);
        }
        return maxScore;
    }

    // Update the maximum score for all the nodes with an age greater than the given age.
    private void updateBIT(int[] BIT, int age, int currentBest) {
        for (int i = age; i < BIT.length; i += i & (-i)) {
            BIT[i] = Math.max(BIT[i], currentBest);
        }
    }
}
