package NumberofSubmatricesThatSumtoTarget;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        if (matrix.length == 0) return 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                matrix[r][c] += matrix[r][c - 1];

            }

        }

        int count = 0;
        for (int startCol = 0; startCol < cols; startCol++) {
            for (int currCol = startCol; currCol < cols; currCol++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;
                for (int r = 0; r < rows; r++) {
                    sum += matrix[r][currCol] - (startCol > 0 ? matrix[r][startCol - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }

            }

        }
        return count;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            res = solution.numSubmatrixSumTarget(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0);
        }
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Time in sec=" + (double)elapsed / 1_000 + ", res=" + res);
    }
}
