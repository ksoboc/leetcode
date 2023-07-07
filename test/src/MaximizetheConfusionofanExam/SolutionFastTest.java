package MaximizetheConfusionofanExam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionFasterTest {
    @Test
    void test1() {
        SolutionFaster SolutionFaster=new SolutionFaster();
        var res = SolutionFaster.maxConsecutiveAnswers("TTFF",2);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        SolutionFaster SolutionFaster=new SolutionFaster();
        var res = SolutionFaster.maxConsecutiveAnswers("TFFT",1);
        assertEquals(3,res);
    }
    @Test
    void test3() {
        SolutionFaster SolutionFaster=new SolutionFaster();
        var res = SolutionFaster.maxConsecutiveAnswers("TTFTTFTT",1);
        assertEquals(5,res);
    }

}