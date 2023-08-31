package MinimumNumberofTapstoOpentoWateraGarden;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int minTaps(int n, int[] ranges) {
        int[][] interval = new int[n + 1][2];
        for (int i = 0; i < n + 1; i++) {
            interval[i][0] = i - ranges[i];
            interval[i][1] = i + ranges[i];
        }
        Arrays.sort(interval, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        int i = 0;
        int pos = 0;
        int maxRight = 0;
        while (maxRight < n) {
            int j = i;

            int max = -1;
            while (j<n+1&&interval[j][0] <= pos) {
                if (interval[j][1] > maxRight) {
                    max = j;
                    maxRight = interval[j][1];
                }
                ++j;
            }
            if (max == -1) { // gap
                return -1;
            }
            ++count;
            pos = maxRight;
            i = max + 1;
        }
        return count;
    }
}
