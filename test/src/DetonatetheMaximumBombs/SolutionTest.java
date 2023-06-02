package DetonatetheMaximumBombs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] bombs = {{2,1,3},{6,1,4}};

        assertEquals(2, solution.maximumDetonation(bombs));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] bombs = {{1,1,5},{10,10,5}};

        assertEquals(1, solution.maximumDetonation(bombs));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] bombs = {{1,2,3},{2,3,1},{3,4,2},{4,5,3},{5,6,4}};

        assertEquals(5, solution.maximumDetonation(bombs));
    }

}