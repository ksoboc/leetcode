package FindinMountainArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        MountainArrayImpl array = new MountainArrayImpl(new int[]{1,2,3,4,5,3,1});
        var res = solution.findInMountainArray(3,array);
        assertEquals(2,res);
        assertTrue(array.getCnt()<=100);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        MountainArrayImpl array = new MountainArrayImpl(new int[]{0,1,2,4,2,1});
        var res = solution.findInMountainArray(3,array);
        assertEquals(-1,res);
        assertTrue(array.getCnt()<=100);
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        MountainArrayImpl array = new MountainArrayImpl(new int[]{0,5,3,1});
        var res = solution.findInMountainArray(1,array);
        assertEquals(3,res);
        assertTrue(array.getCnt()<=100);
    }

}