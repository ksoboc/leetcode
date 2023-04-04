package OptimalPartitionofString;

import java.util.Arrays;

public class Solution {
    public int partitionString(String s) {
        int[] lastSeenPos = new int[26];
        Arrays.fill(lastSeenPos, -1);
        int count = 1;
        int lastPartBeginPos = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (lastSeenPos[index] >= lastPartBeginPos) {
                ++count;
                lastPartBeginPos = i;
            }
            lastSeenPos[index] = i;
        }
        return count;
    }
}
