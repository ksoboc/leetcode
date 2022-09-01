package GasStation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        assertEquals(3,solution.canCompleteCircuit(gas,cost));
    }

    @Test
    void test2() {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        assertEquals(-1,solution.canCompleteCircuit(gas,cost));
    }

}