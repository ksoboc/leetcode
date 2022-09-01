package StampingTheSequence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution=new Solution();

        var res = solution.movesToStamp("abc", "ababc");
        System.out.println("res = " + Arrays.toString(res));
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.movesToStamp("abca", "aabcaca");
        System.out.println("res = " + Arrays.toString(res));
    }

}