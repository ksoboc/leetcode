package DesignGraphWithShortestPathCalculator.floydWarshall;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    @Test
    void test1() {
        Graph g = new Graph(4, new int[][]{{0, 2, 5}, {0, 1, 2}, {1, 2, 1}, {3, 0, 3}});
        var res = g.shortestPath(3, 2); // return 6. The shortest path from 3 to 2 in the first diagram above is 3 -> 0 -> 1 -> 2 with a total cost of 3 + 2 + 1 = 6.
        assertEquals(6,res);
        res=g.shortestPath(0, 3); // return -1. There is no path from 0 to 3.
        assertEquals(-1,res);
        g.addEdge(new int[]{1, 3, 4}); // We add an edge from node 1 to node 3, and we get the second diagram above.
        res=g.shortestPath(0, 3);
        assertEquals(6,res);
    }

}