package AddtoArrayFormofInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{1,2,3,4}, solution.addToArrayForm(new int[]{1,2,0,0},34).stream().mapToInt(Integer::intValue).toArray());
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{4,5,5}, solution.addToArrayForm(new int[]{2,7,4},181).stream().mapToInt(Integer::intValue).toArray());
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{1,0,2,1}, solution.addToArrayForm(new int[]{2,1,5},806).stream().mapToInt(Integer::intValue).toArray());
    }

}