package MaximumSubsequenceScore;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    /**
     * Calculates the maximum score for a given number of pairs of scores
     * @param scores1 an array of scores when the sum is taken
     * @param scores2 an array of scores when the minimum is taken
     * @param k the number of pairs to choose
     * @return the maximum score
     */
    public long maxScore(int[] scores1, int[] scores2, int k) {
        // The number of pairs of scores
        final int numberOfPairs = scores1.length;
        // An array of pairs of scores
        int[][] scorePairs = new int[numberOfPairs][2];
        // Populate the array with the scores
        for (int i = 0; i < numberOfPairs; i++) {
            scorePairs[i][0] = scores1[i];
            scorePairs[i][1] = scores2[i];
        }
        // A comparator that compares pairs by their second score
        Comparator<int[]> score2Comparator = (a, b) -> Integer.compare(b[1], a[1]);
        // Sort the array by the second score in descending order
        Arrays.sort(scorePairs, score2Comparator);
        // A priority queue that stores the first scores in ascending order
        PriorityQueue<Integer> score1Queue = new PriorityQueue<>();
        // The sum of the first scores in the queue
        long score1Sum = 0;
        // Add the first k pairs to the queue and update the sum
        for (int i = 0; i < k; i++) {
            score1Queue.add(scorePairs[i][0]);
            score1Sum += scorePairs[i][0];
        }

        // The maximum score so far
        long maxScore = scorePairs[k - 1][1] * score1Sum;
        // Iterate over the remaining pairs and update the queue and the max score if possible
        for (int i = k; i < numberOfPairs; i++) {
            // If the current pair has a higher first score than the smallest one in the queue
            if (score1Queue.peek() < scorePairs[i][0]) {
                // Remove the smallest one from the queue and subtract it from the sum
                var elem = score1Queue.poll();
                score1Sum -= elem;
                // Add the current pair's first score to the queue and add it to the sum
                score1Queue.offer(scorePairs[i][0]);
                score1Sum += scorePairs[i][0];
                // Update the max score if it's higher than before
                maxScore = Math.max(maxScore, score1Sum * scorePairs[i][1]);
            }
        }
        return maxScore;
    }
}
