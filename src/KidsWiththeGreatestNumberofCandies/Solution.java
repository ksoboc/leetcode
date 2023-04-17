package KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> list = new ArrayList<>(candies.length);
        for (var candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }
}
