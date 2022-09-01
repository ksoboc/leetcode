package RepeatedDNASequences;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> visited = new HashSet<>();
        Set<String> accum = new HashSet<>();

        for (var i=0;i<s.length()-9;++i) {
            var seq = s.substring(i,i+10);
            if (visited.contains(seq))
                accum.add(seq);
            else
                visited.add(seq);
        }
        return List.copyOf(accum);
    }
}
