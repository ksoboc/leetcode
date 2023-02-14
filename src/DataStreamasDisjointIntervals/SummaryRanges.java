package DataStreamasDisjointIntervals;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SummaryRanges {
    private NavigableMap<Integer, Integer> intervals;

    public SummaryRanges() {
        intervals = new TreeMap<>();
    }

    public void addNum(int value) {
        final Map.Entry<Integer, Integer> smallEntry = intervals.floorEntry(value);
        int left = value, right = value;
        if (smallEntry != null) {
            int previous = smallEntry.getValue();
            if (previous >= value)
                return;
            if (previous == value - 1) {
                left = smallEntry.getKey();
            }
        }
        final Map.Entry<Integer, Integer> maxEntry = intervals.higherEntry(value);
        if (maxEntry != null && maxEntry.getKey() == value + 1) {
            right = maxEntry.getValue();
            intervals.remove(value + 1);
        }
        intervals.put(left, right);
    }

    public int[][] getIntervals() {
        final int[][] answer = new int[intervals.size()][2];
        int index = 0;
        for (var interval : intervals.entrySet()) {
            answer[index++] = new int[]{interval.getKey(), interval.getValue()};
        }
        return answer;
    }
}
