package NearestExitfromEntranceinMaze;

import java.util.*;

public class Solution {

    private int nrRows;
    private int nrCols;
    private char[][] maze;

    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] neighbours = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        this.maze=maze;
        nrRows = maze.length;
        nrCols = maze[0].length;

        Set<Integer> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        int steps = 0;
        queue.add(entrance);

        while (!queue.isEmpty()) {
            var qsize = queue.size();
            for (int i = 0; i < qsize; i++) {
                var pos = queue.poll();
                var idx = pos[0] * nrCols + pos[1];
                if (visited.contains(idx))
                    continue;
                if (steps != 0 &&
                        (pos[0] == 0 || pos[0] == nrRows - 1 || pos[1] == 0 || pos[1] == nrCols - 1))
                    return steps;
                visited.add(idx);
                for (var nei : neighbours) {
                    var nx = pos[0] + nei[0];
                    var ny = pos[1] + nei[1];
                    if (movePossible(nx, ny))
                        queue.offer(new int[]{nx, ny});
                }

            }
            steps += 1;
        }
        return -1;
    }

    private boolean movePossible(int nx, int ny) {
        return nx >= 0 && nx < nrRows && ny >= 0 && ny < nrCols &&
                maze[nx][ny] == '.';
    }
}