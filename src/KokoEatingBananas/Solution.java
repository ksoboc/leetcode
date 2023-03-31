package KokoEatingBananas;

import java.util.Arrays;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        var l = 1;
        var r = 1;
        for (var pile : piles) {
            r = Math.max(r, pile);
        }


        while (l <= r) {
            var mid = l + (r - l) / 2;
            var hours = 0;
            for (var p : piles) {
                hours += Math.ceil((double) p / mid);
            }
            if (hours <= h) {

                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
