package NamingaCompany;

import java.util.*;

public class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String>[] suffixes;
        suffixes = new HashSet[26];
        for (int i = 0; i < suffixes.length; i++) {
            suffixes[i]=new HashSet<>();
        }
        for (var idea : ideas) {
            char ch = idea.charAt(0);
            String suff = idea.substring(1);
            suffixes[ch - 'a'].add(suff);
        }

        long res = 0;
        for (var i = 0; i < suffixes.length - 1; ++i) {
            for (int j = i + 1; j < suffixes.length; j++) {
                int common = 0;
                for (var k1 : suffixes[i]) {
                    if (suffixes[j].contains(k1))
                        ++common;
                }
                res += 2L * (suffixes[i].size() - common) * (suffixes[j].size() - common);
            }

        }
        return res;
    }
}
