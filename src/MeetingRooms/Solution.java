package MeetingRooms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, (i1, i2) -> Integer.valueOf(i1.start).compareTo(i2.start));

        for (int i = 1; i < intervals.size(); i++) {
            var i1 = intervals.get(i - 1);
            var i2 = intervals.get(i);

            if (i2.start < i1.end)
                return false;

        }
        return true;

    }
}

class Interval {


    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
