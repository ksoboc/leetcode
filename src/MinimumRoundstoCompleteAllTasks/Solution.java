package MinimumRoundstoCompleteAllTasks;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (var task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }
        int minRounds = 0;
        for (var f : freq.values()) {
            if (f == 1)
                return -1;
            if (f % 3 == 0) {
                minRounds += f / 3;
            } else {
                minRounds += f / 3 + 1;
            }
        }
        return minRounds;
    }
}
