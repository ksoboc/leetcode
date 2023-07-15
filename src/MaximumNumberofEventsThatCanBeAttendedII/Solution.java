package MaximumNumberofEventsThatCanBeAttendedII;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    private int [][] dp;
    private int[] nextIndices;
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        dp=new int[events.length][k+1];
        nextIndices=new int[events.length];
        for (int curIndex = 0; curIndex < nextIndices.length; ++curIndex) {
            nextIndices[curIndex] = bisectRight(events, events[curIndex][1]);
        }
        for (var row:dp)
            Arrays.fill(row,-1);
        return maxValue(events,k,0);
    }

    private int maxValue(int[][] events, int k, int i) {
        if (k==0 || i>=events.length)
            return 0;

        if (dp[i][k]!=-1)
            return dp[i][k];

        int l=nextIndices[i];
        int res = maxValue(events,k,i+1);
        if (l< events.length) {
            res = Math.max(res, events[i][2] + maxValue(events,k-1,l));
        } else {
            res = Math.max(res,events[i][2]);
        }
        dp[i][k]=res;
        return res;
    }

    private int bisectRight(int[][] events, int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
