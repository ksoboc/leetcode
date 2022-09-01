package RangeSumQueryMutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumArrayTest {
    @Test
    void test() {
        NumArray numArray = new NumArray(new int[]{1,3,5});
        var res = numArray.sumRange(0,2);
        assertEquals(9, res);
        numArray.update(1,2);
        res = numArray.sumRange(0,2);
        assertEquals(8,res);
    }

    @Test
    void test2() {
        NumArray numArray = new NumArray(new int[]{-1});
        var res = numArray.sumRange(0,0);
        assertEquals(-1, res);
        numArray.update(0,1);
        res = numArray.sumRange(0,0);
        assertEquals(1,res);
    }
}