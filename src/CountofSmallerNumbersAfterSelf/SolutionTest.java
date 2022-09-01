package CountofSmallerNumbersAfterSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        int[] nums = {5,2,6,1};
        var res = solution.countSmaller(nums);

        var arr = res.stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(new int[]{2,1,1,0}, arr);
    }

    @Test
    void test2() {
        Solution2 solution2=new Solution2();
        int[] nums = {5,2,6,1};
        var res = solution2.countSmaller(nums);

        System.out.println("res = " + res);

        var arr = res.stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(new int[]{2,1,1,0}, arr);
    }

}