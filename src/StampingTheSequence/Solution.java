package StampingTheSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private char[] targetChars;
    private char[] stampChars;

    public int[] movesToStamp(String stamp, String target) {
        int n = target.length();
        int m=stamp.length();

        targetChars=target.toCharArray();
        stampChars=stamp.toCharArray();

        boolean[] visited = new boolean[n-m+1];
        int nrStars = 0;
        List<Integer> pos = new ArrayList<>();

        while (nrStars<n) {
            boolean replaced=false;
            for (int i = 0; i <= n-m; i++) {
                if (!visited[i] && canStamp(i)) {
                    replaced=true;
                    nrStars+=stampPos(i);
                    pos.add(i);
                    visited[i]=true;
                }
            }
            if (!replaced)
                return new int[0];
        }

        int[] res = new int[pos.size()];

        for (int i = 0;i< pos.size();++i) {
            res[pos.size() - i-1] = pos.get(i);
        }

        return res;

    }

    private int stampPos(int i) {
        int count=0;
        for (int j = 0; j < stampChars.length; j++) {
            if (targetChars[i+j]!='*') {
                targetChars[i + j] = '*';
                ++count;
            }
        }
        return count;
    }

    private boolean canStamp(int i) {
        for (int j = 0; j < stampChars.length; j++) {
            if (targetChars[i+j]!='*' && targetChars[i+j]!=stampChars[j])
                return false;

        }
        return true;
    }


}
