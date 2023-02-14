package FindAllAnagramsinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertArrayEquals(new int[]{0,6}, solution.findAnagrams("cbaebabacd", "abc").stream().mapToInt(Integer::intValue).toArray());

    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertArrayEquals(new int[]{0,1,2}, solution.findAnagrams("abab", "ab").stream().mapToInt(Integer::intValue).toArray());

    }

}