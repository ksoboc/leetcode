package BoatstoSavePeople;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        var l = 0;
        var r = people.length - 1;

        Arrays.sort(people);

        var res = 0;
        while (l <= r) {
            var remain = limit - people[r];
            r -= 1;
            res += 1;
            if ((l <= r) && remain >= people[l]) {
                l += 1;
            }
        }
        return res;
    }
}
