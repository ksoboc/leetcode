package ValidPerfectSquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;

        while (l <= r) {
            long mid = (l + r) / 2;
            long val = mid * mid;
            if (val < num) {
                l = mid + 1;
            } else if (val > num) {
                r = mid - 1;
            } else return true;
        }

        return false;
    }
}
