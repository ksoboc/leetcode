package MinimumFlipstoMakeaORbEqualtoc;

public class Solution {
    public int minFlips(int a, int b, int c) {
        int nrFLips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int cbit = c & 1;
            int abit = a & 1;
            int bbit = b & 1;
            if (cbit != (abit | bbit)) {
                if (cbit == 1) {
                    ++nrFLips;
                } else {
                    nrFLips += abit + bbit;
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return nrFLips;
    }
}
