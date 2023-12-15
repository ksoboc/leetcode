package DestinationCity;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var paths = List.of(List.of("London","New York"),List.of("New York","Lima"), List.of("Lima","Sao Paulo"));
        String dest = solution.destCity(paths);
        assertEquals("Sao Paulo",dest);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var paths = List.of(List.of("B","C"),List.of("D","B"),List.of("C","A"));
        String dest = solution.destCity(paths);
        assertEquals("A",dest);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var paths = List.of(List.of("A","Z"));
        String dest = solution.destCity(paths);
        assertEquals("Z",dest);
    }

}