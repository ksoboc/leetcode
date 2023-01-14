package MaxPointsonaLine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1) {
            return 1;
        }
        int result = 2;
        for (int[] point1 : points) {
            Map<Double, Integer> cnt = new HashMap<>();
            for (int[] point2 : points) {
                cnt.merge(Math.atan2((double) point2[0] - point1[0], (double) point2[1] - point1[1]), 1, Integer::sum);
            }
            result = Math.max(result, Collections.max(cnt.values()) + 1);
        }
        return result;
    }
}
