package GreatestCommonDivisorofStrings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if they have non-zero GCD string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int n, int m) {
        if (n==0) return m;
        if (m==0) return n;
        while (m!=0) {
            int r = n%m;
            n=m;
            m=r;
        }
        return n;
    }
}
