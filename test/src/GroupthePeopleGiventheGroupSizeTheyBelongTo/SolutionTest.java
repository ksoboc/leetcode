package GroupthePeopleGiventheGroupSizeTheyBelongTo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.groupThePeople(new int[]{3,3,3,3,3,1,3});
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.groupThePeople(new int[]{2,1,3,3,3,2});
        System.out.println("res = " + res);
    }

}