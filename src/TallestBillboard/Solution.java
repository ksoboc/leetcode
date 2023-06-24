package TallestBillboard;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public int tallestBillboard(int[] rods) {

        Map<Integer,Integer> dp = new HashMap<>();
        dp.put(0,0);

        for (var r:rods) {
            var newDp = new HashMap<>(dp);

            for (var entry:dp.entrySet()) {
                int diff = entry.getKey();
                int taller = entry.getValue();
                int shorter = taller - diff;

                int newTaller = newDp.getOrDefault(diff+r,0);
                newDp.put(diff+r, Math.max(newTaller,taller+r));

                int newDiff = Math.abs(taller-(shorter+r));
                int taller2 = Math.max(shorter+r,taller);
                newDp.put(newDiff, Math.max(taller2, newDp.getOrDefault(newDiff,0)));
            }
            dp = newDp;

        }
        return dp.getOrDefault(0,0);
    }

}
