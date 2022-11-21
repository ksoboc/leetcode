package FrogJump;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolutionDP {
    public boolean canCross(int[] stones) {

        if (stones[1]>1)
            return false;

        boolean [][]dp=new boolean[stones.length][stones.length+1];
        Map<Integer,Integer> stonesSet = new HashMap<>();
        for (var i=0;i< stones.length;++i)
            stonesSet.put(stones[i],i);

        for (int c = 0; c < stones.length+1; c++) {
            dp[stones.length-1][c]=true;
        }
        for (int r = 0; r < stones.length; r++) {
            dp[r][stones.length]=true;

        }

        for (int r = stones.length-2; r >0 ; --r) {
            for (int c = r-1; c >=0 ; --c) {
                int dist = stones[r]-stones[c];
                boolean res = false;
                for (int d = Math.max(1,dist-1); d <= dist+1; d++) {
                    if (stonesSet.containsKey(stones[r]+d) && dp[stonesSet.get(stones[r]+d)][r]) {
                        res=true;
                        break;
                    }
                }
                dp[r][c] = res;
            }

        }
        return dp[1][0];
    }
}
