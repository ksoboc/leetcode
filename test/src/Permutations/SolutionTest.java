package Permutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.permute(new int[]{1,2,3});
        assertEquals(List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 2, 1), List.of(3, 1, 2)),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.permute(new int[]{0,1});
        assertEquals(List.of(List.of(0,1),List.of(1,0)),res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.permute(new int[]{1});
        assertEquals(List.of(List.of(1)),res);
    }

}