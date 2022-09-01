package UglyNumber;

public class Solution {
    public boolean isUgly(int n) {
        if (n <= 0)
            return false;

        for (var p : new int[]{5, 3, 2}) {
            while (n % p == 0) {
                n /= p;
            }
        }
        return n == 1;
    }
}
