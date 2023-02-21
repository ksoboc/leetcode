package UniqueNumberofOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var elem : arr) {
            map.merge(elem, 1, (a, b) -> a + b);
        }

        Set<Integer> set=new HashSet<>();
        for (var cnt:map.values()) {
            if (set.contains(cnt))
                return false;
            set.add(cnt);
        }
        return true;
    }
}
