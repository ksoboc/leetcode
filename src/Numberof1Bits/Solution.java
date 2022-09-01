package Numberof1Bits;

public class Solution {
    public int hammingWeight(int n) {
        var res = 0;
        while (n != 0) {
            n &= n - 1;
            ++res;
        }
        return res;
    }
}
