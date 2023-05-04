package Dota2Senate;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {

        int rCount = 0, dCount = 0;
        Queue<Character> queue = new LinkedList<>();
        for (var ch : senate.toCharArray()) {
            if (ch == 'R') {
                ++rCount;
            } else {
                ++dCount;
            }
            queue.offer(ch);
        }

        int rBanned = 0, dBanned = 0;
        while (rCount > 0 && dCount > 0) {
            char nextSen = queue.poll();
            if (nextSen == 'R') {
                if (rBanned > 0) {
                    --rBanned;
                    --rCount;
                } else {
                    ++dBanned;
                    queue.offer(nextSen);
                }
            } else {
                if (dBanned > 0) {
                    --dBanned;
                    --dCount;
                } else {
                    ++rBanned;
                    queue.offer(nextSen);
                }
            }
        }
        return rCount > 0 ? "Radiant" : "Dire";

    }
}
