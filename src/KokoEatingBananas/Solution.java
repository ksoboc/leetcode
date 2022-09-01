package KokoEatingBananas;

import java.util.Arrays;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        var l = 1;
        var r = Arrays.stream(piles).max().orElse(1);
        var res = r;

        while (l <= r) {
            var mid = (l + r) / 2;
            var hours = 0;
            for (var p : piles) {
                hours += Math.ceil((double)p / mid);
            }
            if (hours <= h) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
