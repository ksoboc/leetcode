package MinimumNumberofRefuelingStops;

import java.util.*;

public class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int prev = 0;
        int nrStations=0;
        int fuel=startFuel;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());


        for (var station:stations) {
            fuel-=station[0]-prev;
            while (!pq.isEmpty() && fuel<0) {
                fuel+=pq.poll();
                ++nrStations;
            }
            if (fuel<0)
                return -1;
            pq.offer(station[1]);
            prev=station[0];
        }
        fuel-=target-prev;
        while (!pq.isEmpty() && fuel<0) {
            fuel+=pq.poll();
            ++nrStations;
        }
        if (fuel<0)
            return -1;

        return nrStations;
    }
}
