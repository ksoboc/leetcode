package SortItemsbyGroupsRespectingDependencies;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] group = {-1,-1,1,0,0,1,0,-1};
        List<List<Integer>> beforeItems = List.of(List.of(),List.of(6),List.of(5),List.of(6),List.of(3,6),List.of(),List.of(),List.of());

        var res = solution.sortItems(8,2,group,beforeItems);
        System.out.println("res = " + Arrays.toString(res));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] group = {-1,-1,1,0,0,1,0,-1};
        List<List<Integer>> beforeItems = List.of(List.of(),List.of(6),List.of(5),List.of(6),List.of(3),List.of(),List.of(4),List.of());

        var res = solution.sortItems(8,2,group,beforeItems);
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[0],res);
    }

}