package MajorityElementII;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.majorityElement(new int[]{3,2,3});
        assertEquals(List.of(3),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.majorityElement(new int[]{1});
        assertEquals(List.of(1),res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.majorityElement(new int[]{1,2});
        assertEquals(List.of(1,2),res);
    }

}