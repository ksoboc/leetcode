package MaximumValueataGivenIndexinaBoundedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
    @Test
    void test1() {
        Solution2 solution = new Solution2();
        var res =  solution.maxValue(3,0,815094800);
        System.out.println("res = " + res);
        assertEquals(271698267,res);

    }

}