package TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (var num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (var entry : freq.entrySet()) {
            if (buckets[entry.getValue()] == null)
                buckets[entry.getValue()] = new ArrayList<>();
            buckets[entry.getValue()].add(entry.getKey());
        }

        List<Integer> list = new ArrayList<>();
        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] == null) continue;
            for (var num : buckets[i]) {
                if (list.size() >= k)
                    return list.stream().mapToInt(Integer::intValue).toArray();
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
