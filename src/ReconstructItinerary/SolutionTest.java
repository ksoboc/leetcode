package ReconstructItinerary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test2() {
        // [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        var res = solution.findItinerary(new ArrayList<>(List.of(List.of("JFK","SFO"),List.of("JFK","ATL"),List.of("SFO","ATL"),
                List.of("ATL","JFK"),List.of("ATL","SFO"))));
        System.out.println("res = " + res);
        assertEquals(6,res.size());
    }

}