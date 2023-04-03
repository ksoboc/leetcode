package BoatstoSavePeople;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int r = people.length - 1;
        int l = 0;
        int nrBoats = 0;
        while (l <= r) {
            int remain = limit - people[r];
            if (l < r && remain >= people[l]) {
                ++l;
            }
            ++nrBoats;
            r--;
        }
        return nrBoats;
    }
}
