package powxn;

public class Solution {
    public double myPow(double x, int n) {
        var r = pow(x, Math.abs((long)n));

        if (n < 0)
            r = 1.0 / r;

        return r;

    }

    private double pow(double x, long n) {

        var r = 1.0;

        while (n > 0) {
            if ((n & 1) == 0) {
                x *= x;
                n >>= 1;
            } else {
                r *= x;
                --n;
            }
        }

        return r;
    }
}
