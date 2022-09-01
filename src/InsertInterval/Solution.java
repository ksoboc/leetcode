package InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[1] < intervals[i][0]) {
                res.add(newInterval);
                int[][] arr = new int[res.size() + intervals.length - i][2];
                for (int j = i; j < intervals.length; j++) {
                    res.add(intervals[j]);
                }
                res.toArray(arr);
                return arr;
            } else if (newInterval[0] > intervals[i][1]) {
                res.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }

        }
        res.add(newInterval);
        int[][] arr = new int[res.size()][2];
        res.toArray(arr);
        return arr;

    }
}
