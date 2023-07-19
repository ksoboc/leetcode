package NonoverlappingIntervals;

import java.util.Arrays;
import java.util.Comparator;

// Sortowanie po końcu interwału i liczenie nie nachodzących następnych interwałow
public class SolutionFaster {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prevEnd = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= prevEnd) {
                prevEnd = intervals[i][1];
            } else ++count;
        }
        return count;
    }
}
