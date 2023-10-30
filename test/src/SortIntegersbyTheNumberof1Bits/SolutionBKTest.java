package SortIntegersbyTheNumberof1Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionBKTest {
    @Test
    void test1() {
        SolutionBK solution=new SolutionBK();
        var ans = solution.sortByBits(new int[]{0,1,2,3,4,5,6,7,8});
        assertArrayEquals(new int[]{0,1,2,4,8,3,5,6,7},ans);
    }
    @Test
    void test2() {
        SolutionBK solution=new SolutionBK();
        var ans = solution.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1});
        assertArrayEquals(new int[]{1,2,4,8,16,32,64,128,256,512,1024},ans);
    }

}