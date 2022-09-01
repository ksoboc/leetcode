package MaximumPointsYouCanObtainfromCards;

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        var n = cardPoints.length;
        var l = 0;
        var r = n - k;

        var sum = 0;
        for (var i = r; i < n; ++i)
            sum += cardPoints[i];
        var max = sum;
        while (r < n) {
            sum += cardPoints[l] - cardPoints[r];

            max = Math.max(max, sum);

            r += 1;
            l += 1;

        }
        return max;
    }
}
