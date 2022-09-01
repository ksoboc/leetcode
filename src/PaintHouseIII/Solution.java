package PaintHouseIII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int nrHouses;
    private int nrColors;
    private int nrTarget;
    private int[] houses;
    private int[][] cost;

    private final int VERY_LARGE_NR = 10_000_000;

    private Integer[][][] cache;

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        nrHouses = m;
        nrColors = n;
        nrTarget = target;
        this.houses = houses;
        this.cost = cost;
        cache = new Integer[m][n][target];

        int res = minCost(0, 1, target - 1);
        return res == VERY_LARGE_NR ? -1 : res;

    }

    private int minCost(int houseNr, int colorNr, int target) {
        if (target < 0)
            return VERY_LARGE_NR;

        if (target > nrHouses - houseNr)
            return VERY_LARGE_NR;

        if (houseNr >= nrHouses)
            return 0;


        if (houses[houseNr] != 0) {
            int newTarget = target;
            if (houseNr > 0 && houses[houseNr] != houses[houseNr - 1])
                --newTarget;
            return minCost(houseNr + 1, 1, newTarget);
        }

        int min = VERY_LARGE_NR;

        for (int i = colorNr; i <= nrColors; ++i) {

            int newTarget = target;
            if (houseNr > 0 && i != houses[houseNr - 1])
                --newTarget;

            if (newTarget < 0)
                continue;

            houses[houseNr] = i;

            int val;
            if (cache[houseNr][i - 1][newTarget] != null)
                val = cache[houseNr][i - 1][newTarget];
            else
                val = minCost(houseNr + 1, 1, newTarget);

            cache[houseNr][i - 1][newTarget] = val;

            min = Math.min(min, cost[houseNr][i - 1] + val);

            houses[houseNr] = 0;
        }

        return min;
    }


}
