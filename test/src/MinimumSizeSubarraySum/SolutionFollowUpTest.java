package MinimumSizeSubarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionFollowUpFollowUpTest {
    @Test
    void test1() {
        SolutionFollowUp SolutionFollowUp=new SolutionFollowUp();
        assertEquals(2,SolutionFollowUp.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
    @Test
    void test2() {
        SolutionFollowUp SolutionFollowUp=new SolutionFollowUp();
        assertEquals(1,SolutionFollowUp.minSubArrayLen(4,new int[]{1,4,4}));
    }
    @Test
    void test3() {
        SolutionFollowUp SolutionFollowUp=new SolutionFollowUp();
        assertEquals(0,SolutionFollowUp.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
    }

}