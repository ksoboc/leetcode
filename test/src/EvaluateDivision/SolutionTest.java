package EvaluateDivision;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        List<List<String>> equations = List.of(List.of("a","b"),List.of("b","c"));
        double[] values = {2.0,3.0};
        List<List<String>> queries = List.of(List.of("a","c"),List.of("b","a"),List.of("a","e"),List.of("a","a"),List.of("x","x"));
        var res = solution.calcEquation(equations,values,queries);
        assertArrayEquals(new double[]{6.00000,0.50000,-1.00000,1.00000,-1.00000}, res, 0.001);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        List<List<String>> equations = List.of(List.of("a","b"),List.of("b","c"),List.of("bc","cd"));
        double[] values = {1.5,2.5,5.0};
        List<List<String>> queries = List.of(List.of("a","c"),List.of("c","b"),List.of("bc","cd"),List.of("cd","bc"));
        var res = solution.calcEquation(equations,values,queries);
        assertArrayEquals(new double[]{3.75000,0.40000,5.00000,0.20000}, res, 0.001);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        List<List<String>> equations = List.of(List.of("a","b"));
        double[] values = {0.5};
        List<List<String>> queries = List.of(List.of("a","b"),List.of("b","a"),List.of("a","c"),List.of("x","y"));
        var res = solution.calcEquation(equations,values,queries);
        assertArrayEquals(new double[]{0.50000,2.00000,-1.00000,-1.00000}, res, 0.001);
    }

}