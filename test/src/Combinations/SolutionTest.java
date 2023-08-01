package Combinations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.combine(4,2);
        assertEquals(List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4)),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.combine(1,1);
        assertEquals(List.of(List.of(1)),res);
    }

}