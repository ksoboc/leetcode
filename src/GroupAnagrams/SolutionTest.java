package GroupAnagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        System.out.println("res = " + res);
    }

}