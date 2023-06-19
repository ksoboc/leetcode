package FindtheHighestAltitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxAlt = 0;
        for (var diff : gain) {
            alt += diff;
            if (alt > maxAlt)
                maxAlt = alt;
        }
        return maxAlt;
    }
}
