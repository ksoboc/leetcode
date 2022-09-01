package WallsAndGates;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test1() {
        int[][] rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        solution.wallsAndGates(rooms);

        for (int i = 0; i < rooms.length; i++) {
            System.out.println(Arrays.toString(rooms[i]));
        }

        int[][] expected = {{3, -1, 0, 1},
                {2, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4}};

        assertArrayEquals(expected,rooms);


    }

    @Test
    void test2() {
        int[][] rooms = {{0,-1},{2147483647,2147483647}};
        solution.wallsAndGates(rooms);

        for (int i = 0; i < rooms.length; i++) {
            System.out.println(Arrays.toString(rooms[i]));
        }

        int[][] expected = {{0,-1},{1,2}};

        assertArrayEquals(expected,rooms);


    }

}