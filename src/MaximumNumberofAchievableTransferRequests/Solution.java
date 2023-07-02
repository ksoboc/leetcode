package MaximumNumberofAchievableTransferRequests;

public class Solution {
    private int nrReq;
    private int[] houseIn;

    public int maximumRequests(int n, int[][] requests) {
        houseIn = new int[n];
        nrReq = 0;
        return backtrack(n, requests, 0);
    }

    private int backtrack(int n, int[][] requests, int i) {
        if (i >= requests.length) {
            for (int j = 0; j < n; j++) {
                if (houseIn[j] != 0)
                    return -1;
            }
            return nrReq;
        }
        --houseIn[requests[i][0]];
        ++houseIn[requests[i][1]];
        ++nrReq;
        int max = backtrack(n, requests, i + 1);
        ++houseIn[requests[i][0]];
        --houseIn[requests[i][1]];
        --nrReq;
        max = Math.max(max, backtrack(n, requests, i + 1));
        return max;
    }
}
