package TopKFrequentWords;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},2);
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"},4);
        System.out.println("res = " + res);
    }

}