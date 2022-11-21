package MinimumTimetoMakeRopeColorful;

public class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalCost = 0;
        int maxCost=0;
        int i = 0;

        while (i < colors.length() - 1) {

            if (colors.charAt(i) == colors.charAt(i + 1)) {
                maxCost=Math.max(neededTime[i],maxCost);
                if (maxCost<=neededTime[i+1]) {
                    totalCost+=maxCost;
                } else {
                    totalCost+=neededTime[i+1];

                }
            } else maxCost=0;
            ++i;
        }
        return totalCost;
    }
}
