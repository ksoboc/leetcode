package OutofBoundaryPaths;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> dp = new HashMap<>();

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        if (startRow < 0 || startColumn < 0 || startRow >= m || startColumn >= n || maxMove <= 0)
            return 0;

        int key = maxMove * m * n + startRow * n + startColumn;
        if (dp.containsKey(key))
            return dp.get(key);

        int res = 0;
        if (startRow == 0)
            ++res;
        if (startRow == m - 1)
            ++res;
        if (startColumn == 0)
            ++res;
        if (startColumn == n - 1)
            ++res;

        for (int[] move : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
            res += findPaths(m, n, maxMove - 1, startRow + move[0], startColumn + move[1]);
            res %= 1_000_000_007;
        }
        dp.put(key, res);
        return res;
    }
}
