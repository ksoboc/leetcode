package FindtheWinnerofanArrayGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] arr = {2,1,3,5,4,6,7};
        var res = solution.getWinner(arr,2);
        assertEquals(5,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] arr = {3,2,1};
        var res = solution.getWinner(arr,10);
        assertEquals(3,res);
    }
}