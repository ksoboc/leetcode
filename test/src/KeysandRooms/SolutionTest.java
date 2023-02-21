package KeysandRooms;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        //[[1],[2],[3],[]]
        var res = solution.canVisitAllRooms(List.of(List.of(1),List.of(2),List.of(3), Collections.emptyList()));
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        //[[1,3],[3,0,1],[2],[0]]
        var res = solution.canVisitAllRooms(List.of(List.of(1,3),List.of(3,0,1),List.of(2), List.of(0)));
        assertFalse(res);
    }

}