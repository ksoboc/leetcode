package DataStreamasDisjointIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {
    @Test
    void test1() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);      // arr = [1]
        summaryRanges.getIntervals(); // return [[1, 1]]
        summaryRanges.addNum(3);      // arr = [1, 3]
        summaryRanges.getIntervals(); // return [[1, 1], [3, 3]]
        summaryRanges.addNum(7);      // arr = [1, 3, 7]
        summaryRanges.getIntervals(); // return [[1, 1], [3, 3], [7, 7]]
        summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
        summaryRanges.getIntervals(); // return [[1, 3], [7, 7]]
        summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
        assertArrayEquals(new int[][]{{1,3},{6,7}}, summaryRanges.getIntervals()); // return [[1, 3], [6, 7]]
    }
    @Test
    void test2() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);      // arr = [1]
        summaryRanges.getIntervals(); // return [[1, 1]]
        summaryRanges.addNum(2);      // arr = [1, 2]
        summaryRanges.getIntervals(); // return [[1, 1], [3, 3]]
              // arr = [1, 2, 3, 6, 7]
        assertArrayEquals(new int[][]{{1,2}}, summaryRanges.getIntervals()); // return [[1, 3], [6, 7]]
    }

}