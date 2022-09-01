package ReorganizeString;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    private class Pair implements Comparable<Pair> {
        private Integer count;
        private Character ch;

        public Pair(Integer count, Character ch) {
            this.count = count;
            this.ch = ch;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(o.count, this.count);
        }
    }

    public String reorganizeString(String s) {
        StringBuilder res = new StringBuilder();

        Map<Character, Integer> counts = new HashMap<>();
        for (var i = 0; i < s.length(); ++i) {
            var ch = s.charAt(i);
            counts.merge(ch, 1, (old, one) -> old + one);

        }
        PriorityQueue<Pair> heap = new PriorityQueue<Pair>();
        for (Map.Entry<Character,Integer> entry:counts.entrySet()) {
            heap.add(new Pair(entry.getValue(),entry.getKey()));
        }

        Pair prev = null;
        while (!heap.isEmpty() || prev !=null) {
            if (heap.isEmpty() && prev!=null)
                return "";
            Pair pair = heap.poll();
            --pair.count;

            if (prev!=null)
                heap.add(prev);

            if (pair.count!=0)
                prev = pair;
            else
                prev = null;

            res.append(pair.ch);
        }

        return res.toString();
    }
}
