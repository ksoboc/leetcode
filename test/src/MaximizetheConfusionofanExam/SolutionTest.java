package MaximizetheConfusionofanExam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.maxConsecutiveAnswers("TTFF",2);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.maxConsecutiveAnswers("TFFT",1);
        assertEquals(3,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.maxConsecutiveAnswers("TTFTTFTT",1);
        assertEquals(5,res);
    }

}