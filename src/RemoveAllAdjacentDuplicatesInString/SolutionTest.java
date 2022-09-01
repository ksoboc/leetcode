package RemoveAllAdjacentDuplicatesInString;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({"abbaca,ca","azxxzy,ay"})
    void test(String input, String expected) {
        assertEquals(expected, solution.removeDuplicates(input));
    }

}