package ReorderedPowerOf2;

public class Solution {
    private long getSignature(int n) {
        long sign = 0;

        while (n > 0) {
            int d = n % 10;
            sign += 1L <<  d << 2;
            n /= 10;

        }
        return sign;
    }

    private int numDigits(int n) {
        int d = 0;
        while (n > 0) {
            ++d;
            n /= 10;
        }
        return d;
    }

    public boolean reorderedPowerOf2(int n) {
        long numStr = getSignature(n);
        int len = numDigits(n);
        int m1 = (len - 1) * 3 + (len + 1) / 3;
        int m2 = len * 3 + (len + 2) / 3;
        for (int i = m1; i < m2; i++) {
            if (numStr == getSignature(1 << i))
                return true;
        }
        return false;
    }

}
