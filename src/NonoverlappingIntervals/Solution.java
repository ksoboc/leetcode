package NonoverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int prevEnd = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                if (intervals[i][1] < prevEnd) {
                    prevEnd = intervals[i][1];
                }
                ++count;
            } else prevEnd = intervals[i][1];
        }
        return count;
    }
}
