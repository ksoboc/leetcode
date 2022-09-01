package WallsAndGates;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    private static final int INF = 2147483647;

    public void wallsAndGates(int[][] rooms) {
        // write your code here
        int nrRows = rooms.length;
        int nrCols = rooms[0].length;
        Deque<Pair> deque = new ArrayDeque<>();
        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < rooms[r].length; c++) {
                if (rooms[r][c] == 0) {
                    deque.offer(new Pair(r, c));
                }
            }
        }
        Set<Pair> visited = new HashSet<>();
        int dist = 0;
        while (!deque.isEmpty()) {
            int sz = deque.size();
            for (int i = 0; i < sz; i++) {
                Pair pair = deque.poll();
                if (visited.contains(pair))
                    continue;
                visited.add(pair);

                int row = pair.row;
                int col = pair.col;

                rooms[row][col] = Math.min(dist,rooms[row][col]);

                if (row + 1 < nrRows && rooms[row + 1][col] == INF) {
                    deque.offer(new Pair(row + 1, col));
                }
                if (row - 1 >= 0 && rooms[row - 1][col] == INF) {
                    deque.offer(new Pair(row - 1, col));
                }
                if (col + 1 < nrCols && rooms[row][col + 1] == INF) {
                    deque.offer(new Pair(row, col + 1));
                }
                if (col - 1 >= 0 && rooms[row][col - 1] == INF) {
                    deque.offer(new Pair(row, col - 1));
                }

            }
            dist += 1;
        }
    }


}
