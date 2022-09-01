package RepeatedDNASequences;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        var s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Solution solution = new Solution();
        var expected = List.of("AAAAACCCCC", "CCCCCAAAAA");
        var res = solution.findRepeatedDnaSequences(s);
        System.out.println("solution.findRepeatedDnaSequences(s) = " + solution.findRepeatedDnaSequences(s));

        assertTrue(expected.size() == res.size() && expected.containsAll(res) && res.containsAll(expected));
    }

}