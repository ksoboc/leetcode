package ReverseBits;

public class Solution {
    public int reverseBits(int n) {

        var res = 0;
        for (var i=0;i<31;++i) {
            res <<= 1;
            res += n&1;
            n >>= 1;

        }
        return res;
    }
}
