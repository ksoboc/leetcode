package MinimumDifficultyofaJobSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();

        var res=solution.minDifficulty(new int[]{6,5,4,3,2,1},2);
        assertEquals(7,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res=solution.minDifficulty(new int[]{9,9,9},4);
        assertEquals(-1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res=solution.minDifficulty(new int[]{1,1,1},3);
        assertEquals(3,res);
    }
    //7,1,7,1,7,1
    @Test
    void test4() {
        Solution solution=new Solution();

        var res=solution.minDifficulty(new int[]{7,1,7,1,7,1},3);
        assertEquals(15,res);
    }
    @Test
    void test5() {
        Solution solution=new Solution();

        var res=solution.minDifficulty(new int[]{11,111,22,222,33,333,44,444},6);
        assertEquals(843,res);
    }

}