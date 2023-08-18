package MaximalNetworkRank;

public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] rank = new int[n];
        boolean[][] isConnected = new boolean[n][n];
        for (var road:roads) {
            ++rank[road[0]];
            ++rank[road[1]];
            isConnected[road[0]][road[1]] = true;
            isConnected[road[1]][road[0]] = true;
        }

        int max=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int rankSum = rank[i] + rank[j];
                if (isConnected[i][j])
                    --rankSum;
                max = Math.max(max,rankSum);
            }
        }
        return max;
    }
}
