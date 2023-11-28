package NumberofWaystoDivideaLongCorridor;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numberOfWays(String corridor) {
        int nrSeats = 0;
        int nrPlants=0;
        int totalSeats=0;
        List<Integer> nrPlantsBetweenSeats = new ArrayList<>();
        for (var ch:corridor.toCharArray()) {
            if (ch=='S') {
                ++nrSeats;
                ++totalSeats;
                if (nrSeats>2) {

                    nrSeats=1;
                    nrPlantsBetweenSeats.add(nrPlants);
                    nrPlants=0;
                }
            }
            if (nrSeats==2&&ch=='P') {
                ++nrPlants;
            }
        }

        if (totalSeats%2==1||totalSeats==0)
            return 0;

        final int mod = 1_000_000_007;
        long product = 1;
        for (var fact:nrPlantsBetweenSeats) {
            product *= fact + 1;
            product %= mod;
        }
        return (int)product;
    }
}
