package MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for (var i=1;i<intervals.length;++i) {
            var prevEnd = list.get(list.size()-1)[1];
            if (prevEnd>=intervals[i][0]) {
                list.get(list.size()-1)[1] = Math.max(prevEnd,intervals[i][1]);
            } else {
                list.add(intervals[i]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}