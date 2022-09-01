package NumberofIslands;

import java.util.Stack;

public class Solution {
    private int nrRows;
    private int nrCols;

    public int numIslands(char[][] grid) {
        nrRows = grid.length;
        nrCols = grid[0].length;

        int nrIslands = 0;
        for (int r = 0; r < nrRows; r++) {
            for (int c = 0; c < nrCols; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    ++nrIslands;
                }

            }

        }
        return nrIslands;

    }

    private static final int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private void dfs(char[][] grid, int r, int c) {
        Stack<Integer> stack = new Stack<>();
        stack.push(r);
        stack.push(c);

        while (!stack.isEmpty()) {

            int cc = stack.pop();
            int cr = stack.pop();

            grid[cr][cc] = 'x';



            for (var dir:directions) {
                int dr = dir[0];
                int dc = dir[1];
                int nr=cr+dr;
                int nc=cc+dc;
                if (nr>=0 && nr < nrRows && nc>=0 && nc<nrCols /*&& !visit[nr][nc]*/ && grid[nr][nc]=='1') {
                    stack.push(nr);
                    stack.push(nc);


                }
            }
        }
    }
}
