package GroupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for (var str:strs) {
            int[] counts = new int[26];

            for (int i = 0; i < str.length(); i++) {
                var ch=str.charAt(i);
                ++counts[ch-'a'];

            }
            var idx = "";
            for (var i=0;i<counts.length;++i) {
                char ch =(char)('a' + i);
                idx += counts[i]>0?ch + "" + counts[i]:"";
            }
            var list=map.getOrDefault(idx,new ArrayList<>());
            list.add(str);
            map.put(idx, list);
        }

        List<List<String>> res = new ArrayList<>();
        for (var val:map.values()) {
            res.add(val);
        }

        return res;
    }
}
