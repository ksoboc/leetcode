package Combinations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution=new Solution();

    @Test
    void comb2_from_4() {
        var res = solution.combine(4,2);

        System.out.println("res = " + res);
    }

    @Test
    void comb1_from_1() {
        var res = solution.combine(1,1);
        System.out.println("res = " + res);
    }

    @Test
    void comb2_from_4iter() {
        var res = solution.combineIter(4,2);

        System.out.println("res = " + res);
    }


}