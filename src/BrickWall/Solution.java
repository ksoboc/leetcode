package BrickWall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> gapsMap = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            var total = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                total += wall.get(i).get(j);
                gapsMap.merge(total, 1, (old, one) -> old + one);
            }

        }
        var maxGaps = 0;
        for (var gap : gapsMap.values()
        ) {
            maxGaps = Math.max(maxGaps, gap);
        }
        return wall.size() - maxGaps;
    }
}
