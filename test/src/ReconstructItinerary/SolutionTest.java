package ReconstructItinerary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();
        List<List<String>> tickets = List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO"));
        var res = solution.findItinerary(tickets);
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), res);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        List<List<String>> tickets = List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO"));
        var res = solution.findItinerary(tickets);
        assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), res);
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        List<List<String>> tickets = List.of(List.of("EZE", "AXA"), List.of("TIA", "ANU"), List.of("ANU", "JFK"), List.of("JFK", "ANU"), List.of("ANU", "EZE"), List.of("TIA", "ANU"), List.of("AXA", "TIA"), List.of("TIA", "JFK"), List.of("ANU", "TIA"), List.of("JFK", "TIA"));
        var res = solution.findItinerary(tickets);
        assertEquals(List.of("JFK", "ANU", "EZE", "AXA", "TIA", "ANU", "JFK", "TIA", "ANU", "TIA", "JFK"), res);
    }


}