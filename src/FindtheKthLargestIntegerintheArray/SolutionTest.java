package FindtheKthLargestIntegerintheArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test() {
        assertEquals("3", solution.kthLargestNumber(new String[]{"3","6","7","10"},4));
    }

    @Test
    void test2() {
        assertEquals("2", solution.kthLargestNumber(new String[]{"2","21","12","1"},3));
    }

    @Test
    void kthLargestNumberQSel() {
        assertEquals("3", solution.kthLargestNumberQSel(new String[]{"3","6","7","10"},4) );
    }

    @Test
    void kthLargestNumberQSel2() {
        assertEquals("2", solution.kthLargestNumberQSel(new String[]{"2","21","12","1"},3) );
    }
}