package ShuffletheArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionInPlaceTest {
    @Test
    void test1() {
        SolutionInPlace solution = new SolutionInPlace();

        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }

}