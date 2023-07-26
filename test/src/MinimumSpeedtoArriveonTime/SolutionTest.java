package MinimumSpeedtoArriveonTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.minSpeedOnTime(new int[]{1,3,2},6);
        assertEquals(1,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.minSpeedOnTime(new int[]{1,3,2},2.7);
        assertEquals(3,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.minSpeedOnTime(new int[]{1,3,2},1.9);
        assertEquals(-1,res);
    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.minSpeedOnTime(new int[]{90,94,72,85,92,63,20,25,38,28,8,75,95,70,8,96,41,8,7,75,62,65,68,21,8,66,11,24,9,77,9,87,31,52,16,73,32,75,77,6,80,11,54,85,75,73,67,41,34,27,86,92,41,31,34,51,17,86,83,39,59,41,97,10,2,59,80,73,13,10,69,28,65,34,17,45,9},393.18);
        assertEquals(11,res);
    }

}