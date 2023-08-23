package ReorganizeString;

import java.util.PriorityQueue;

public class Solution {
    private class Pair {
        char ch;
        int count;

        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String reorganizeString(String s) {
        final int[] freq = new int[26];
        for (var ch:s.toCharArray()) {
            ++freq[ch-'a'];
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->Integer.compare(p2.count,p1.count));
        for (char i=0;i< freq.length;++i) {
            if (freq[i]>0) {
                if (freq[i]>s.length()/2+1)
                    return "";
                pq.offer(new Pair((char) (i + 'a'), freq[i]));
            }
        }
        StringBuilder sb=new StringBuilder();
        Pair p2=null;
        while (!pq.isEmpty()) {
            Pair p1 = pq.poll();
            --p1.count;
            sb.append(p1.ch);
            if (p2!=null && p2.count>0) {
                pq.offer(p2);
                p2=null;
            }
            if (pq.isEmpty() && p1.count>0)
                return "";

            if (!pq.isEmpty()) {
                p2= pq.poll();
                --p2.count;
                sb.append(p2.ch);
            }
            if (p1.count>0)
                pq.offer(p1);
        }
        if (p2!=null && p2.count>0) {
            sb.append(p2.ch);
        }
        return sb.toString();
    }
}
