package PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long div = 1;

        while (x >= div * 10)
            div *= 10;

        while (x > 0) {
            if (x % 10 != x / div)
                return false;

            x = (int) ((x % div) / 10);
            div /= 100;
        }
        return true;

    }
}
