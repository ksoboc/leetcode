package EarliestPossibleDayofFullBloom;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {

        int[][] times = new int[growTime.length][2];
        for (int i = 0; i < growTime.length; i++) {
            times[i][0] = plantTime[i];
            times[i][1] = growTime[i];
        }

        Arrays.sort(times, (a,b)-> Integer.compare(b[1], a[1]));

        int totalTime = 0;
        int totalPlantTime = 0;
        for (int[] time : times) {
            totalPlantTime += time[0];
            totalTime = Math.max(totalPlantTime + time[1], totalTime);
        }
        return totalTime;
    }
}
