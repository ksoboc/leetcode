package AsFarfromLandasPossible;

import java.util.ArrayDeque;
import java.util.Queue;

public class SolutionDP {
    public int maxDistance(int[][] grid) {
        final int n = grid.length;
        final int m = grid[0].length;

        int[][] dist = new int[n][m];
        final int MAX_DIST = n + m + 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0)
                    dist[i][j] = MAX_DIST;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = Math.min(dist[i][j],
                        Math.min(i > 0 ? dist[i - 1][j] + 1 : MAX_DIST,
                                j > 0 ? dist[i][j - 1] + 1 : MAX_DIST));
            }
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                dist[i][j] = Math.min(dist[i][j],
                        Math.min(i < n - 1 ? dist[i + 1][j] + 1 : MAX_DIST,
                                j < m - 1 ? dist[i][j + 1] + 1 : MAX_DIST));
            }
        }

        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxDist = Math.max(maxDist, dist[i][j]);
            }

        }

        return maxDist == 0 || maxDist == MAX_DIST ? -1 : maxDist;
    }
}
