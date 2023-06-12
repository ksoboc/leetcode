package SummaryRanges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(List.of("0->2","4->5","7"), solution.summaryRanges(new int[]{0,1,2,4,5,7}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(List.of("0","2->4","6","8->9"), solution.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(List.of("0"), solution.summaryRanges(new int[]{0}));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals(List.of(), solution.summaryRanges(new int[]{}));
    }

}