package ArrangingCoins;

public class Solution {
    public int arrangeCoins2(int n) {
        var l = 0;
        var r = n;

        var res = 0;

        while (l <= r) {
            var mid = (l + r) / 2;

            var val = (mid * (mid + 1)) / 2;
            if (val > n) {
                r = mid - 1;
            } else {
                res = Math.max(res, mid);
                l = mid + 1;
            }

        }
        return res;

    }

    public int arrangeCoins(int n) {
        var delta = Math.sqrt(8L * n + 1L);
        var res = (int) ((delta - 1.0) / 2.0);
        return res;

    }
}
