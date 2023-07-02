package MaximumNumberofAchievableTransferRequests;

public class SolutionBitmap {

    public int maximumRequests(int n, int[][] requests) {

        int res = 0;
        for (int mask = 0; mask < (1 << requests.length); mask++) {
            int[] houseIn = new int[n];
            int bitCount = Integer.bitCount(mask);
            if (bitCount <= res)
                continue;
            int bit = 1;
            for (int pos = 0; pos < requests.length; pos++, bit <<= 1) {
                if ((bit & mask) == bit) {
                    --houseIn[requests[pos][0]];
                    ++houseIn[requests[pos][1]];
                }
            }
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                if (houseIn[i] != 0) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                res = bitCount;
        }
        return res;
    }

}
