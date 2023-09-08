package PascalsTriangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.generate(5);
        assertEquals(List.of(List.of(1),List.of(1,1),List.of(1,2,1),List.of(1,3,3,1), List.of(1,4,6,4,1)),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.generate(1);
        assertEquals(List.of(List.of(1)),res);
    }

}