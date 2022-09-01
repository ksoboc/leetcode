package PartitionLabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> partitionLabels(String s) {
        var res = new ArrayList<Integer>();
        Map<Character, Integer> lastPos = new HashMap<>();

        for (var i = 0; i < s.length(); ++i) {
            lastPos.put(s.charAt(i), i);
        }

        var size = 0;
        var end = 0;

        for (var i = 0; i < s.length(); ++i) {
            ++size;
            end = Math.max(end, lastPos.get(s.charAt(i)));
            if (i == end) {
                res.add(size);
                size = 0;
            }
        }
        return res;

    }
}
