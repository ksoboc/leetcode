package FrogJump;

import java.util.*;

public class Solution {
    private class Pair implements Comparable<Pair> {
        int stone;
        int jump;

        public Pair(int stone, int jump) {
            this.stone = stone;
            this.jump = jump;
        }


        @Override
        public int compareTo(Pair o) {
            if  (stone == o.stone)
                return Integer.valueOf(jump).compareTo(o.jump);
            return Integer.valueOf(stone).compareTo(o.stone);
        }
    }
    Set<Pair> dp = new TreeSet<>();
    Set<Integer> stonesPos = new HashSet<>();
    public boolean canCross(int[] stones) {
        for (int i = 2; i < stones.length; i++) {
            if (stones[i] - stones[i-1] > 2*stones[i-1])
                return false;
        }
        for (var pos :
                stones) {
            stonesPos.add(pos);
        }
        return canCross(stones,stones[0],0);
    }

    private boolean canCross(int[] stones, int stone, int jump) {
        if (stone==stones[stones.length-1])
            return true;
        if (dp.contains(new Pair(stone,jump)))
            return false;
        for (int i = Math.max(1, jump-1); i <= jump+1; i++) {
            if (stonesPos.contains(stone+i) && canCross(stones,stone+i,i))
                return true;
        }
        dp.add(new Pair(stone,jump));
        return false;
    }
}
